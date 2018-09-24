/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M03;

import java.io.Serializable;

/**
 *
 * @author LAB_TI
 */
public class Participant implements Serializable{
    private final String firstname;
    private final String lastname;
    private int age;
    public Participant(String firstName,String lastName,int age){
        this.firstname=firstName;
        this.lastname=lastName;
        this.age=age;
    }
    public String getFirstName(){
        return firstname;
    }
    public String getLastName(){
        return lastname;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String toString(){
        return firstname+" "+lastname+" ("+age+")";
    }
    
    
    
}
