/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.ac.jyothyit.students.dom;

/**
 *
 * @author saaketh
 */
public class Student {
    
    private int id;
    private String name;
    private String usn;
    private String addedAt;

    public Student(int id, String name, String usn, String addedAt) {
        this.id = id;
        this.name = name;
        this.usn = usn;
        this.addedAt = addedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsn() {
        return usn;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

    public String getAddedAt() {
        return addedAt;
    }

    public void setAddedAt(String addedAt) {
        this.addedAt = addedAt;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", usn=" + usn + ", addedAt=" + addedAt + '}';
    }
    
    
}
