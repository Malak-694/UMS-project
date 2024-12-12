package com.example.demo.models;
import com.example.demo.models.ConnectDB;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;


public class ConnectDB {

    private Connection connection;


    public ConnectDB() {

        String ur1l ="jdbc:sqlite:mydb.db"; // Specify your database URL

        try {

            connection = DriverManager.getConnection(ur1l);

            System.out.println("Connection Successful");

        } catch (SQLException e) {

            System.out.println("Error Connecting to Database");

            e.printStackTrace();

        }

    }


    public Connection getConnection() {

        return connection;

    }


    public void closeConnection() {

        try {

            if (connection != null) {

                System.out.println("Connection Closed");

                connection.close();

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

}



