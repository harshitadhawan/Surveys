/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package surveys;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Harshita
 */

public class Surveys {
    public static java.sql.Connection conn = null;
    public static String qry="";
    public static Statement statement;
    public static ResultSet rs;
    public static String userid;
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/survey","root","");
        statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        new Chart().setVisible(true);
    }
}
