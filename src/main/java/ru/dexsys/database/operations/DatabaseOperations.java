package ru.dexsys.database.operations;

import ru.dexsys.connection.DatabaseConnector;
import ru.dexsys.student.Student;
import ru.dexsys.student.StudentController;

import java.io.IOException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class DatabaseOperations {
    private static String sqlStatement;
    private static Connection connection;
    private static Statement statement;
    private static ArrayList<Student> students = StudentController.CreateListOfStudents();
    private static ResultSet rs;

    public static void createStudentsTable() throws SQLException, IOException {
        connection = DatabaseConnector.getConnection();
        sqlStatement = "CREATE TABLE students24 ("
                + "    STUDENT_ID integer NOT NULL AUTO_INCREMENT PRIMARY KEY,"
                + "    FIRST_NAME varchar(255),"
                + "    LAST_NAME varchar(255),"
                + "    AGE varchar(255),"
                + "    PHONE varchar(255)"
                + ");";
        statement = connection.createStatement();
        statement.execute(sqlStatement);
        System.out.println("Table \"students24\" is created");
        connection.close();
    }


    public static void fillStudentsTable() throws IOException, SQLException {
        connection = DatabaseConnector.getConnection();
        for (Student s : students) {
            sqlStatement = "INSERT INTO Students"
                    + "( firstName, lastName, age, phone)" + "VALUES"
                    + "(\'" + s.getFirstName() + "\',\'"
                    + s.getLastName() + "\',"
                    + s.getAge() + ","
                    + s.getPhone() + ");";

            statement = connection.createStatement();
            statement.execute(sqlStatement);
        }
        connection.close();
    }

    public static void showStudentsTable() throws IOException, SQLException {
        connection = DatabaseConnector.getConnection();
        long currentStudentPhone ;
        statement = connection.createStatement();
        
        for (Student s: students) {
            currentStudentPhone = s.getPhone();
            sqlStatement = "SELECT * FROM Students WHERE phone =" + currentStudentPhone;
            rs = statement.executeQuery(sqlStatement);
            while (rs.next()) {
                int id = rs.getInt(1);
                String firstName = rs.getString(2);
                String lastName = rs.getString(3);
                int age = rs.getInt(4);
                long phone = rs.getLong(5);
                System.out.format("Student id: %d, First Name: %s, Last Name: %s, Age: %d, Phone: %d\n",
                        id, firstName, lastName, age, phone);
            }
        }
        connection.close();
    }
}
