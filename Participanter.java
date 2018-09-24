/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author LAB_TI
 */
public class Participanter implements Serializable{
    private String firstname;
    private String lastname;
    private int age;
    public Participanter(String firstName,String lastName,int age){
        this.firstname=firstName;
        this.lastname=lastName;
        this.age=age;
    }
    public void printData(){
        System.out.println("Nama\t: "+firstname+" "+ lastname);
        System.out.println("Usia\t: "+age);
    }
    public void saveObject(Participanter Obj){
        try {
            FileOutputStream fos=new FileOutputStream("data.ser");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(Obj);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            System.out.println("a problem occured during serialize.\n"+e.getMessage());
        }
    }
    public void readObject(Participanter Obj){
        try {
            FileInputStream fis=new FileInputStream("data.ser");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Obj=(Participanter) ois.readObject();
            Obj.printData();
            fis.close();
        } catch (Exception e) {
            System.out.println("a problem occured during deserialize.\n"+e.getMessage());
        }
    }
    public static void main(String[] args) {
        Participanter is=new Participanter("dee", "aja", 22);
        is.saveObject(is);
        is.readObject(is);
    }
}
