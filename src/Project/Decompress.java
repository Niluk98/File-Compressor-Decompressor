/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;


/**
 *
 * @author nilpa
 */
public class Decompress {
    public static void method(File file) throws IOException{
        String fileDirectory=file.getParent();
        System.out.println(fileDirectory);
        FileInputStream fis=new FileInputStream(file);
        FileOutputStream fos=new FileOutputStream(fileDirectory+"/Decompressed.txt");
        InflaterInputStream gis=new InflaterInputStream(fis);
        byte [] buffer=new byte[1024];
        int len=0;
        while((len=gis.read())!=-1){
            fos.write(len);
        }
        fis.close();
        fos.close();
        gis.close();
    }
    
    public static void main(String[] args) throws IOException{
        File file=new File("C:\\Users\\nilpa\\OneDrive\\Documents\\NetBeansProjects\\CompressDecompressFile\\Compressedfile.gz");
        method(file);
    }
}
