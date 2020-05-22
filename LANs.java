/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.SecureRandom;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Latoofi
 */
public class LANs 
{
    public static Formatter output50,output100,output150,output200,output250,output5;
    
    /*public static void main(String[] args) throws IOException 
    {
        
        openFile();
        writeFile(50,output50);
        closeFile(output50);
        
        writeFile(100,output100);
        closeFile(output100);
       
        writeFile(150,output150);
        closeFile(output150);
        
        writeFile(200,output200);
        closeFile(output200);
        
        writeFile(250,output250);
        closeFile(output250);
        
    }*/

    public LANs( Formatter output50 , Formatter output100,Formatter output150,Formatter output200,Formatter output250) 
    {
        
        this.output50=output50;
        this.output100=output100;
        this.output150=output150;
        this.output200=output200;
        this.output250=output250;
   }

    LANs() {
       //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public  void openFile()
    {
        try
        {
            output5=new Formatter("LAN0");
            output50 = new Formatter("LAN1");
            output100 = new Formatter("LAN2");
            output150 = new Formatter("LAN3");
            output200 = new Formatter("LAN4");
            output250 = new Formatter("LAN5");
            
        }  
        catch(IOException ioException)
        {
            System.err.println("Error ");
            System.exit(1);
        }
            
    }
    
    public  void writeFile(int num,Formatter output ) throws IOException

    {
        Scanner input=new Scanner(System.in);
        SecureRandom rand=new SecureRandom();
        try
            {
                
                for (int i = 1; i <= num; i++) {
                    output.format("%s%d ","241.12.31.",i);
                    
                    int counter=1+rand.nextInt(5);
                    for(int j=1;j<=counter;j++)
                    {
                       
                         int A = 1+rand.nextInt(num);
                    
                    while(i==A)
                    {
                         A = 1+rand.nextInt(num);
                    }
                   output.format("%s%d ","241.12.31.",A);
                    }
                    if(i!=num)
                        output.format("%n");
               }
                   
                }
                
            catch(FormatterClosedException element)
            {
                System.err.println("Invaild");
                input.nextLine();
            }
        
    }
    
    public  void closeFile(Formatter output)
    {
        try
        {
            if(output!=null)
                output.close();
        }catch(NoSuchElementException ioException)
        {
            System.err.println("");
        }
    }
    
    public static void clear(String filename) throws FileNotFoundException
    {
        PrintWriter pw = new PrintWriter(filename);
        pw.close();
    }

}
 
    
 