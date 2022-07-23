/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sparsetablelab;

/**
 *
 * @author Student
 */
public class RegisterNode {
    int studentId;
    int classes;
    double grade; // A:4.00 B+:3.50 B:3.00
    RegisterNode nextStudent;
    RegisterNode nextClasses;
    public RegisterNode (int s,int c,double g,RegisterNode nS,RegisterNode nC){
        this.studentId=s;
        this.classes=c;
        this.grade=g;
        this.nextStudent=nS;
        this.nextClasses=nC;
    }

    public RegisterNode() {
        this(0,0,4.0,null,null);
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if(grade >=0 && grade <=4.0){
            this.grade = grade;
        }
        
    }
    
}
