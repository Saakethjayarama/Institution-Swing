package in.ac.jyothyit.students.dao.impl;


import in.ac.jyothyit.students.Utilities.JdbcUtil;
import in.ac.jyothyit.students.dao.StudentDao;
import in.ac.jyothyit.students.dom.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saaketh
 */
public class StudentDaoImpl implements StudentDao {

    public List<Student> getStudents() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        List<Student> students = new ArrayList<Student>();
        Student student = null;
        
        String sql = "select * from students";
        
        try {
            connection = JdbcUtil.getConnection("institution");
            
            if(connection != null) {
                System.out.println("Connection Established Successfully");
            }
            
            statement = connection.createStatement();
            
            resultSet = statement.executeQuery(sql);
                while(resultSet.next()) {
                    student = (new Student(
                                resultSet.getInt("id"),
                                resultSet.getString("name"),
                                resultSet.getString("usn"),
                                resultSet.getDate("added_at").toString()
                        ));
                    students.add(student);
                }
        } catch(SQLException sqle) {
            System.out.println(sqle);
        }finally {
            JdbcUtil.closeConnection(connection);
            JdbcUtil.closeStatement(statement);
        }
        System.out.println("Entered");
        return students;
    }

    @Override
    public void addStudent(Student student) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        
        String sql = "insert into students(name, usn) values(?, ?)";
        
        try {
            connection = JdbcUtil.getConnection("institution");
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getUsn());
            preparedStatement.execute();
        } catch (SQLException sqle) {
            System.out.println(sqle);
        } finally {
            JdbcUtil.closeConnection(connection);
            JdbcUtil.closeStatement(preparedStatement);
        }
    }

}
