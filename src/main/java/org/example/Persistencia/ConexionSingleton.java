package org.example.Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSingleton {
    private String baseDatos;
    public static ConexionSingleton _instance;
    private Connection connection;

    public ConexionSingleton(String database) {
        this.baseDatos = database;

        try {
            Class.forName("org.sqlite.JDBC");
            this.connection = DriverManager.getConnection("jdbc:sqlite:" + this.baseDatos);
        } catch (SQLException var3) {
            var3.printStackTrace();
        } catch (Exception var4) {
            var4.printStackTrace();
        }

    }

    public static ConexionSingleton getInstance(String baseDatos) {
        if (_instance == null) {
            _instance = new ConexionSingleton(baseDatos);
        } else {
            System.out.println("Ya fue creada.");
        }

        return _instance;
    }

    public Connection getConnection() {
        return this.connection;
    }

}
