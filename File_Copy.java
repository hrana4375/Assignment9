
package assignment9;

import java.io.*;


public class File_Copy {

    public static void main(String[] args) {
        
        File file = new File("C:\\Users\\Hims Rana\\Desktop\\abc.txt");
        File file2= new File("C:\\Users\\Hims Rana\\Desktop\\xyz.txt");
        
        try {
        FileReader in = new  FileReader(file);
        FileWriter out=new FileWriter(file2);       
        
            int i;
            while((i=in.read())!=-1)
                out.write((char)i);
            in.close();
            out.close();
            
         }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
