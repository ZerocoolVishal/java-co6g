package exp13;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created by vishal on 21-03-2017.
 */
public class Exp13 extends JFrame {

    public static void main(String[] args) throws Exception {

        Class.forName("org.sqlite.JDBC");

        Connection c = DriverManager.getConnection("jdbc:sqlite:Exp13.db");
        System.out.println("Connection established..");

        Statement s = c.createStatement();
        s.execute("create table employee(emp_id INTEGER, emp_name STRING)");
        System.out.println("Table created..");
    }
}
