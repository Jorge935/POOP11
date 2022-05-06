 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class POOP11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*System.out.println("######File######");
        File archivo = new File("archivo.txt");
        System.out.println(archivo.exists());
        if(!archivo.exists()){
            try {
                boolean seCreo = archivo.createNewFile();
                System.out.println(seCreo);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("######FileOutputStream######");
        FileOutputStream fos = null;
        byte[] buffer = new byte[81];
        int nBytes;
        System.out.println("Escriba texto a guardar en el archivo");
        try{
            nBytes = System.in.read(buffer);
            fos = new FileOutputStream("fos.txt");
            fos.write(buffer, 0, nBytes);    
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }finally{
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        System.out.println("######FileInputStream#######");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("fos.txt");
            nBytes = fis.read(buffer,0,buffer.length);
            String texto = new String(buffer,0,nBytes);
            System.out.println("El texto del archivo es: ");
            System.out.println(texto);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }finally{
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        
        System.out.println("######FileWriter#######");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe el texto para el archivo");
        try {
            String texto2 = br.readLine();
            //System.out.println(texto2);
            FileWriter fw = new FileWriter("fw.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            salida.println(texto2);
            for (int i = 0; i < 10; i++) {
                salida.println("Linea " + i);
            }
            for (int i = 0; i < 10; i++) {
                salida.println("Jorch,Méndez,Maldonado,318045344"+i+",2"+i);
            }
            salida.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("######FileReader#######");
        
        try {
            FileReader fr = new FileReader("fw.csv");
            br = new BufferedReader(fr);
            System.out.println("El texto del archivo es:");
            String linea = br.readLine();
            while(linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("#######StringTokenizer######");
        String cadena = "Jorch,Méndez,Maldonado,3180453440,20";
        StringTokenizer  tokenizador = new StringTokenizer(cadena, ",");
        while(tokenizador.hasMoreTokens()){
            System.out.println(tokenizador.nextToken());
        }
        
        System.out.println("#######StringTokenizer en FileReader######");
        try{
            FileReader fr = new FileReader("a.txt");
            br = new BufferedReader(fr);
            String linea2 = br.readLine();
            
            StringTokenizer tokenizer2 = new StringTokenizer(linea2,",");
                while(tokenizer2.hasMoreTokens()){
                    System.out.println(tokenizer2.nextToken());
                }
        }catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }*/
        
        /*System.out.println("#######Arreglo de Alumnos######");
        Alumno[ ] arr = new  Alumno[10];
        
        for (int i = 0; i < 10; i++) {
            Alumno alumno = new Alumno();
            alumno.setApMat("ApeMat "+(i+1));
            alumno.setApPat("ApePat "+(i+1));
            alumno.setEdad(i+20);
            alumno.setNombre("Nombre "+(i+1));
            alumno.setNumCuenta(318045340+i);
            arr[i] = alumno;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            FileWriter fw = new FileWriter("fw.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            salida.println("Nombre,ApPat,ApMat,NumCuenta,Edad");
            for (int i = 0; i < 10; i++) {
                salida.println(arr[i]);
            }
            salida.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }*/
        
        System.out.println("#######StringTokenizer en FileReader######");
        Alumno[ ] arr = new  Alumno[10];
        int i = 0;
        try{
            FileReader fr = new FileReader("a.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea2 = br.readLine();
            
            StringTokenizer tokenizer2 = new StringTokenizer(linea2,",");
            while(tokenizer2.hasMoreTokens()){
                Alumno alumno = new Alumno();
                alumno.setNombre(tokenizer2.nextToken());
                alumno.setApPat(tokenizer2.nextToken());
                alumno.setApMat(tokenizer2.nextToken());
                int cuenta = Integer.parseInt(tokenizer2.nextToken());
                alumno.setNumCuenta(cuenta);
                int edad = Integer.parseInt(tokenizer2.nextToken());
                alumno.setEdad(edad);
                arr[i] = alumno;
                i++;
            }
            for (int j = 0; j < 10; j++) {
                System.out.println(arr[j]);
            }
        }catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
