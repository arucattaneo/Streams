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
import java.io.IOException;

/**
 *
 * @author educacionit
 */
public class BufferedReaderejercicio {

    static FileReader reader = null;
    static BufferedReader buffer = null;

    public static void main(String[] args) {
        try {

            File archivo = new File("C:\\Users\\educacionit\\Desktop\\info.txt");
            String linea = null;
            reader = new FileReader(archivo);
            buffer = new BufferedReader(reader);

            while ((linea = buffer.readLine()) != null) {
                System.out.println(linea);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");

        } catch (IOException ex) {
            System.out.println("IO Exception");

        } finally {

            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException ex) {

                }
            }
        }
    }
}
