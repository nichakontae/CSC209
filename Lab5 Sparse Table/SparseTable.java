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
public class SparseTable {
    RegisterNode [] student; // list of student pointers to nodes
    RegisterNode [] classes; // list of classes  pointers to nodes

    public SparseTable(int amountOfStudent,int amountOfClasses) {
        student = new RegisterNode[amountOfStudent];
        classes = new RegisterNode[amountOfClasses];
    }
    // student[405] = new RegisterNode(...); add more classes for student 405
    // search class bigger than = tempClass
    // search prev class = prevClass
    // prev.next= next node
    
    // seach student bigger than = tempStudent
    // seach prev student = prevStudent
    // prev.next= new node
    
    public void addRegistration(int studentID,int classID){
        RegisterNode newRegist = new RegisterNode(studentID,classID,-1,null,null); // -1 it means have no grade
        // student dimesion -> add new course to student
        if(student[studentID] == null || classID < student[studentID].classes){ // pointer null or first class
        // register fist time && new  class will be the first class in the list of this student (add to head)
            newRegist.nextClasses=student[studentID]; // point to null or original first class
            student[studentID] = newRegist;
        }else {
            RegisterNode c;
            for(c=student[studentID];c.nextClasses !=null && c.nextClasses.classes<classID ;c=c.nextClasses); // prev class
            newRegist.nextClasses=c.nextClasses;
            c.nextClasses= newRegist;
        }
        
        // course dimesion -> add new student to the course
        if(classes[classID]==null || studentID < classes[classID].studentId){
            newRegist.nextStudent=classes[classID];
            classes[classID] = newRegist;
        }else {
            RegisterNode s;
            for(s=classes[classID];s.nextStudent!=null && s.nextStudent.studentId<studentID;s=s.nextStudent);
            newRegist.nextStudent=s.nextStudent;
            s.nextStudent=newRegist;
        }        
    }
    public void listAllClasses(int studentID){
      
        for(RegisterNode c = student[studentID];c!=null;c=c.nextClasses){
            System.out.print(c.classes+" "); // class ID
        }System.out.println("");
    }
    // add method print all student of class 
    public void listAllStudent(int classID){
        for(RegisterNode s=classes[classID];s!=null;s=s.nextStudent){
            System.out.print(s.studentId+" ");
        }System.out.println("");
    }
    
    
    
    
}
