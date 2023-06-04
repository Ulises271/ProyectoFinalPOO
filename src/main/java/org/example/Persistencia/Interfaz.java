package org.example.Persistencia;

import java.sql.SQLException;
import java.util.ArrayList;

public interface Interfaz {
    boolean insertar(Object var1) throws SQLException;

    boolean update(Object var1) throws SQLException;

    boolean delete(String var1) throws SQLException;

    ArrayList obtenerTodo() throws SQLException;

    Object buscarPorId(String var1) throws SQLException;
}
