package org.example.Controlador;

import org.example.Modelo.Magos;
import org.example.Modelo.Tabla;
import org.example.Vista.Ventana;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;

public class Controlador extends MouseAdapter {

    private Ventana view;
    private Tabla modelo;

    public Controlador(Ventana view) {
        this.view = view;
        this.modelo = new Tabla();
        this.view.getTblMagos().setModel(this.modelo);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);
        this.view.getTblMagos().addMouseListener(this);
        this.view.getBtnActualizar().addMouseListener(this);
        this.view.getBtnBorrar().addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getBtnCargar()) {
            this.modelo.cargarDatos();
            this.view.getTblMagos().setModel(this.modelo);
            this.view.getTblMagos().updateUI();
        }

        if (e.getSource() == this.view.getBtnAgregar()) {
            Magos mago = new Magos();
            mago.setId(0);
            mago.setNombre(this.view.getTxtNombre().getText());
            mago.setCasa(this.view.getTxtCasa().getText());
            mago.setTipoMago(this.view.getTxtTipoMago().getText());
            mago.setVocacion(this.view.getTxtVocacion().getText());
            mago.setUrl(this.view.getTxtUrl().getText());
            if (this.modelo.agregarMago(mago)) {
                JOptionPane.showMessageDialog(this.view, "Se agrego correctamente el mago", "Aviso", 1);
                this.view.getTblMagos().updateUI();
            } else {
                JOptionPane.showMessageDialog(this.view, "No se pudo agregar el mago a la base", "Error al insertar mago", 0);
            }

            this.view.limpiar();
        }

        int row;
        if (e.getSource() == this.view.getTblMagos()) {
            System.out.println("Evento sobre la tabla");
            row = this.view.getTblMagos().getSelectedRow();
            Magos tmp = this.modelo.getMagosAtIndex(row);

            try {
                this.view.getImagenMagos().setIcon(tmp.getImagen());
            } catch (MalformedURLException var5) {
                System.out.println(e.toString());
            }
        }

        String index;
        if (e.getSource() == this.view.getBtnBorrar()) {
            row = this.view.getTblMagos().getSelectedRow();
            index = String.valueOf(this.modelo.getValueAt(row, 0));
            System.out.println(index);
            int respuesta = JOptionPane.showConfirmDialog(this.view, "Estas seguro de borrar este mago?", "Selecione un mago", 0);
            if (respuesta == 0) {
                this.modelo.borrarMago(index);
                JOptionPane.showMessageDialog(this.view, "El mago fue borrado", "Aviso", 1);
            } else {
                JOptionPane.showMessageDialog(this.view, "El mago no fue eliminado", "Error al borrar el mago", 0);
            }

            this.modelo.cargarDatos();
            this.view.getTblMagos().setModel(this.modelo);
            this.view.getTblMagos().updateUI();
            this.view.limpiar();
        }

        if (e.getSource() == this.view.getBtnActualizar()) {
            row = this.view.getTblMagos().getSelectedRow();
            index = String.valueOf(this.modelo.getValueAt(row, 0));
            Magos mago = new Magos();
            mago.setNombre(this.view.getTxtNwNombre().getText());
            mago.setCasa(this.view.getTxtNwCasa().getText());
            mago.setTipoMago(this.view.getTxtNwTipoMago().getText());
            mago.setVocacion(this.view.getTxtNwVocacion().getText());
            mago.setUrl(this.view.getTxtNwUrl().getText());
            mago.setId(Integer.parseInt(index));
            if (this.modelo.actualizarMago(mago)) {
                JOptionPane.showMessageDialog(this.view, "Se ha modificado el mago", "Aviso", 1);
                this.view.getTblMagos().updateUI();
            } else {
                JOptionPane.showMessageDialog(this.view, "No se pudo modificar el mago", "Error", 0);
                this.view.getTblMagos().updateUI();
            }

            this.modelo.cargarDatos();
            this.view.getTblMagos().setModel(this.modelo);
            this.view.getTblMagos().updateUI();
        }

        this.view.getTblMagos().updateUI();
    }


}
