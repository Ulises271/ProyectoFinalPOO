package org.example.Persistencia;

import org.example.Modelo.Magos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MagosDAO implements Interfaz {
    public MagosDAO() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO Magos(Nombre,Casa,TipoMago,Vocacion,UrlImagen) VALUES(?,?,?,?,?)";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("MagosDB.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1, ((Magos)obj).getNombre());
        pstm.setString(2, ((Magos)obj).getCasa());
        pstm.setString(3, ((Magos)obj).getTipoMago());
        pstm.setString(4, ((Magos)obj).getVocacion());
        pstm.setString(5, ((Magos)obj).getUrl());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE Magos SET Nombre = ?,Casa = ?, TipoMago = ?, Vocacion = ?, UrlImagen = ? WHERE id = ?; ";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("MagosDB.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1, ((Magos)obj).getNombre());
        pstm.setString(2, ((Magos)obj).getCasa());
        pstm.setString(3, ((Magos)obj).getTipoMago());
        pstm.setString(4, ((Magos)obj).getVocacion());
        pstm.setString(5, ((Magos)obj).getUrl());
        pstm.setInt(6, ((Magos)obj).getId());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM Magos WHERE id = ?;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("MagosDB.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1, Integer.parseInt(id));
        rowCount = pstm.executeUpdate();
        return rowCount > 0;    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM MAgos";
        ArrayList<Magos> resultado = new ArrayList();
        Statement stm = ConexionSingleton.getInstance("MagosDB.db").getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);

        while(rst.next()) {
            resultado.add(new Magos(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6)));
        }

        return resultado;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sql = "SELECT * FROM Magos WHERE id;";
        Magos mago = null;
        PreparedStatement pstm = ConexionSingleton.getInstance("MagosDB.db").getConnection().prepareStatement(sql);
        pstm.setInt(1, Integer.parseInt(id));
        ResultSet rst = pstm.executeQuery();
        if (rst.next()) {
            mago = new Magos(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6));
            return mago;
        } else {
            return null;
        }    }
}
