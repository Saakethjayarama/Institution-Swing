/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.ac.jyothyit.students.tests;

import in.ac.jyothyit.students.dao.StudentDao;
import in.ac.jyothyit.students.dao.impl.StudentDaoImpl;


/**
 *
 * @author saaketh
 */
public class test {
    public static void main(String[] args) {
        StudentDaoImpl sdi = new StudentDaoImpl();
        sdi.getStudents();
        
    }
}
