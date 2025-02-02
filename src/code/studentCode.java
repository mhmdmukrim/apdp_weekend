/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

/**
 *
 * @author MHMD MUKRIM
 */
public class studentCode {
    private String name;
    private String teacher;
    private String date;
    private String time;
    private float fees;

    public studentCode(String name, String teacher, String date, String time, float fees) {
        this.name = name;
        this.teacher = teacher;
        this.date = date;
        this.time = time;
        this.fees = fees;
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public float getFees() {
        return fees;
    }

    public void setFees(float fees) {
        this.fees = fees;
    }
    
    
}
