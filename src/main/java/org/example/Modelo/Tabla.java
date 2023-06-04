package org.example.Modelo;

import org.example.Persistencia.MagosDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class Tabla implements TableModel {
    public static final int COLS = 6;
    private ArrayList<Magos> datos;
    private MagosDAO mdao;

    public Tabla() {
        this.mdao = new MagosDAO();
        this.datos = new ArrayList();
    }

    public Tabla(ArrayList<Magos> datos, MagosDAO mdao) {
        this.datos = datos;
        this.mdao = mdao;
    }

    @Override
    public int getRowCount() {
        return this.datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String nombreCol = "";
        switch (columnIndex) {
            case 0:
                nombreCol = "id";
                break;
            case 1:
                nombreCol = "Nombre";
                break;
            case 2:
                nombreCol = "Tipo de Mago";
                break;
            case 3:
                nombreCol = "Casa";
                break;
            case 4:
                nombreCol = "Tipo de Ancestros";
                break;
            case 5:
                nombreCol = "Url foto";
                break;
            default:
                nombreCol = "";
        }
        return nombreCol;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return int.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
            default:
                return String.class;

        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Magos tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getNombre();
            case 2:
                return tmp.getCasa();
            case 3:
                return tmp.getTipoMago();
            case 4:
                return tmp.getVocacion();
            case 5:
                return tmp.getUrl();

        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                break;
            case 1:
                ((Magos)this.datos.get(rowIndex)).setNombre((String)aValue);
                break;
            case 2:
                ((Magos)this.datos.get(rowIndex)).setCasa((String)aValue);
                break;
            case 3:
                ((Magos)this.datos.get(rowIndex)).setTipoMago((String) aValue);
                break;
            case 4:
                ((Magos)this.datos.get(rowIndex)).setVocacion((String)aValue);
                break;
            case 5:
                ((Magos)this.datos.get(rowIndex)).setUrl((String)aValue);
                break;
            default:
                System.out.println("No se modifico nada");
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    public void cargarDatos() {
        try {
            ArrayList<Magos> tirar = this.mdao.obtenerTodo();
            System.out.println(tirar);
            this.datos = this.mdao.obtenerTodo();
        } catch (SQLException var2) {
            System.out.println(var2.getMessage());
        }
    }
    public boolean agregarMago(Magos mago) {
        boolean resultado = false;
        try {
            if (this.mdao.insertar(mago)) {
                this.datos.add(mago);
                resultado = true;
            } else {
                resultado = false;
            }
        } catch (SQLException var4) {
            System.out.println(var4.getMessage());
        }
        return resultado;
    }
    public boolean borrarMago(String index) {
        boolean resultado = false;

        try {
            if (this.mdao.delete(index)) {
                System.out.println("Se elimino el mago");
                resultado = true;
            } else {
                System.out.println("El mago no se pudo borrar");
                System.out.println(index);
                resultado = false;
            }
        } catch (SQLException var4) {
            System.out.println(var4.getMessage());
        }

        return resultado;
    }
    public Magos getMagosAtIndex(int idx) {
        return (Magos) this.datos.get(idx);
    }
    public boolean actualizarMago(Magos mago) {
        boolean resultado = false;

        try {
            if (this.mdao.update(mago)) {
                System.out.println("Se modifico el volcan");
                resultado = true;
            } else {
                resultado = false;
                System.out.println("No se pudo modificar el volcan");
            }
        } catch (SQLException var4) {
            System.out.println(var4.getMessage());
        }

        return resultado;
    }


}