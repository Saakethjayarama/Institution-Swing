/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.ac.jyothyit.students.dao;

import java.util.List;
import in.ac.jyothyit.students.dom.Student;

/**
 *
 * @author saaketh
 */
public interface StudentDao {
    public List<Student> getStudents();
    public void addStudent(Student student);
}
