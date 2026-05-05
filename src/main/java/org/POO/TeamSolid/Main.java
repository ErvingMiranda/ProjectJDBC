package org.POO.TeamSolid;

import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final String URL = "jdbc:postgresql://localhost:5432/POO";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Ezone2106";


    public static void main(String[] args) throws SQLException {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM \"Estudiante\"");            while (rs.next()) {
                Integer id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String cif = rs.getString("cif");
                System.out.println(id + "," + nombre + "," + cif);
            }
        }
    }
}