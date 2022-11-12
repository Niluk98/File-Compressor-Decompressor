/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.io.*;

import java.util.zip.*;

/**
 *
 * @author nilpa
 */
public class Compress {
    public static void method(File file)throws IOException{
        String fileDirectory=file.getParent();
        System.out.println(fileDirectory);
        
        FileInputStream fis=new FileInputStream(file);
        FileOutputStream fos=new FileOutputStream(fileDirectory + "/Compressedfile.gz");
        
        DeflaterOutputStream gzipOS=new DeflaterOutputStream(fos);
        byte[] buffer =new byte[1024];
        int len;
        while((len=fis.read())!=-1){
            gzipOS.write(len);
        }
        gzipOS.close();
        fos.close();
        fis.close();
        
    }
    public static void main(String[] args) throws IOException{
        File path=new File("C:\\Users\\nilpa\\OneDrive\\Documents\\NetBeansProjects\\CompressDecompressFile\\checkit.txt");
        
        method(path);
    }
}
