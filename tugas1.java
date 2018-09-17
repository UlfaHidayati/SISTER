/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author Ucil
 */
public class tugas1 {
     public static void main(String[] args) throws FileNotFoundException, IOException {

        File file = new File("D:/dok.txt");
            if(!file.exists()){
                file.createNewFile();
            }
        OutputStream out = new FileOutputStream(file);
        InputStream in = new FileInputStream("D:/ucil.txt");
        int data = in.read();
        while(data!=-1){
            out.write(data);
            data = in.read();
        }  
        out.flush();
        out.close();
        in.close();
    } 
    
}
