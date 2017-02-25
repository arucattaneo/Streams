/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author educacionit
 */
public class BufferedReaderejercicio {
    FileReader reader=null;
    BufferedReader reader2 = null;
        
try {
     File archivo = new File("C:\\Users\\educacionit\\Desktop\\info.txt");
     
    reader = new FileReader(archivo);
    reader2=new BufferedReader(reader);
    
    while ((linea=buffered.readLine()!=null)){
        
    }
    } catch (FileNotFoundException e){
    System.out.println("No se encontró el archivo");
    
}
    
}
