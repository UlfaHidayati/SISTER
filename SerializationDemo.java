package M03;


import M03.Participant;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAB_TI
 */
public class SerializationDemo {
    public void serialize(List<Participant> pList,String fileName){
        try (ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(fileName))){
            out.writeObject(pList);
        } catch (IOException e) {
            System.out.println("a problem occured during serialization.\n"+e.getMessage());
        }
    }
    public List<Participant> desertalize(String fileName){
        List<Participant> pList=null;
        try {
            ObjectInputStream in=new ObjectInputStream(new FileInputStream(fileName));
            pList=(List<Participant>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.printf("a problem occured deserializing %s%n",fileName);
            System.out.println(e.getMessage());
        }
        return pList;
    }
}
