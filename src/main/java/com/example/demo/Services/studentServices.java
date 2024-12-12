package com.example.demo.Services;

import com.example.demo.models.Student;
import org.springframework.stereotype.Service;

import java.sql.*;

@Service
public class studentServices {
    private static final String DB_URL = "jdbc:sqlite:mydb.db";
//mqlkq
    public Student getStudentById(String id) {
        Student student = null;
        String query = "SELECT * FROM Student WHERE sid = ?";

        try (Connection connection = DriverManager.getConnection(DB_URL);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, id); // Use parameterized query
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    student = new Student();
                    student.setId(resultSet.getInt("sid"));
                    student.setName(resultSet.getString("name"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return student;
    }//*
}