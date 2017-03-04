/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author educacionit
 */
public class Streams {

  
    public static void main(String[] args) {
        FileWriter writer = null;
        FileReader reader = null;
        try {
            int unCaracter = -1;
            File archivo = new File("C:\\Users\\educacionit\\Desktop\\info.txt");
            reader = new FileReader(archivo);
            File archivo2 = new File("C:\\Users\\educacionit\\Desktop\\infocopiada.txt");
            writer = new FileWriter(archivo2);
            while ((unCaracter = reader.read()) != -1) {
                System.out.print((char) unCaracter);
                writer.write((char) unCaracter);
            }

        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");

        } catch (IOException e) {
            System.out.println("IO Exception");
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException ex) {
                    Logger.getLogger(Streams.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException ex) {

                }
            }
        }
    }

}
