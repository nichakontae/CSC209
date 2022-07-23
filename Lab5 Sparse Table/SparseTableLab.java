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
public class SparseTableLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SparseTable registerTable = new SparseTable(8000, 300);
        registerTable.addRegistration(405, 35);     
        System.out.println(registerTable.student[405].classes); // print 35
        // print the first one!
        registerTable.addRegistration(405, 30);
        System.out.println(registerTable.student[405].classes); // print 30
        registerTable.addRegistration(405, 60);
        System.out.println(registerTable.student[405].classes); // print 30
        System.out.println(registerTable.classes[35].studentId);
        registerTable.listAllClasses(405);
        registerTable.addRegistration(305, 30);
        registerTable.listAllStudent(30);
    }
    
}
