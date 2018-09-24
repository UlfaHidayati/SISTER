/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ucil
 */
public class tugas2_serialization {
    public void Serialize(ArrayList<tugas2_participant
            > pList, String fileName){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))){
            out.writeObject(pList);
        }catch(IOException ex){
            System.out.println("a problem assured during serialization\n"+ex.getMessage());
        }
    }
    public void save(ArrayList<tugas2_participant
            > pList, String fileBaru){
        try(FileOutputStream fou = new FileOutputStream(fileBaru)){
            String v = String.valueOf(pList);
            for(int i=0; i<v.length(); i++){
                fou.write(v.charAt(i));
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    public ArrayList<tugas2_participant
        > print(String fileName){
        List<tugas2_participant
                > pList = null;
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))){
            pList = (List<tugas2_participant
                    >) in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.printf("a problem accured deserializing %s%n", fileName);
            System.out.println(ex.getMessage());
        }
        return (ArrayList<tugas2_participant
                >) pList;
    }
}
