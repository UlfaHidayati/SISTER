/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M03;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LAB_TI
 */
public class serializationApp {
    public static void main(String[] args) {
        List<Participant> participante=new ArrayList<Participant>();
        participante.add(new Participant("Dee", "Aja", 22));
        participante.add(new Participant("Ami", "Fahmi", 21));
        participante.add(new Participant("Haya", "Hayati", 20));
        participante.add(new Participant("Aya", "Hayati", 19));
        System.out.println("Participants : "+participante);
        
        SerializationDemo demo=new SerializationDemo();
        demo.serialize(participante, "participantdata.ser");
        System.out.println("serialization is done");
        
        System.out.println("Deserialize object...");
        List<Participant> newList=demo.desertalize("participantdata.ser");
        System.out.println("New List : "+ newList);
    }
}
