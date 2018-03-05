package com.company;


import java.sql.*;

/**
 * Created by burak on 2/21/2018.
 */
public class Test {


    public static void main(String[] args) {

        try {


         //   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://C://Users//burak//Desktop//StudentDatas.mdb");
            Statement st = con.createStatement();
            ResultSet output = st.executeQuery("SELECT *FROM StudentDatas");

            while (output.next()) {

                System.out.println(output.getString("number") + output.getString("name"));
            }

            output.close();
            con.close();


        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}



