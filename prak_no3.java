/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LAB_TI
 */
public class prak_no3 {
    public static void main(String[] args) throws IOException{
        List<Participant> participants=new ArrayList<Participant>();
        SerializationDemo demo= new SerializationDemo();
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        for(;;){
            System.out.println("Masukkan Nama Depan : ");
            String c=buf.readLine();
            System.out.println("Masukkan Nama Belakang : ");
            String d=buf.readLine();
            System.out.println("Masukkan Umur : ");
            int e=Integer.parseInt(buf.readLine());
            if(c.equalsIgnoreCase("exit")||e==0){
                System.out.println("System Close !");
                break;
                
            }else{
                participants.add(new Participant(c, d, e));
                System.out.println("Participants : "+participants);
                demo.serialize(participants, "tugas1.ser");
                System.out.println("Serialization is done ");
            }
        }
        System.out.println("Deserealize object..");
        List<Participant> newList=demo.desertalize("tugas1.ser");
        System.out.println("New List : "+newList);
    }
}
