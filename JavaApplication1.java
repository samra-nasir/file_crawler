/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;											// importing packages

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ftahir.bese13seecs
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
   static Map<String, String> map = new HashMap<>();
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        File parent = new File("C:\\Users\\snasir.bese13seecs\\Desktop\\Crawler\\");
        createMap(parent);	
        
        System.out.println("Enter a keyword to search files:\n");
        String name = in.next();
       // Iterator it = map.entrySet().iterator();
      for (Map.Entry<String, String> entry : map.entrySet())
        {
            if((entry.getKey().toLowerCase()).contains(name.toLowerCase()))
            System.out.println(entry.getValue());
        }
    }
    
    
    public static boolean createMap(File f1) throws IOException {
        
        if(f1.exists()){
		
		File child[] = f1.listFiles();						
		
		if(child==null)							
			return false;


		for(File f : child){							

			if(f.isDirectory()){
                           
                            map.put(f.getName(),f.getAbsolutePath());
                            createMap(f);
                        }
			else if (f.isFile()){						
					
				
                                map.put(f.getName(),f.getAbsolutePath());
                                String place = f.getAbsolutePath();
                                if((f.getAbsolutePath()).contains(".txt")){
                                    String k = "";
                                    byte b[] = new byte[(int) new File(place).length()];		// making a byte array
                                    FileInputStream fin = new FileInputStream(new File(place));	// saving file into a file stream

                                    fin.read(b);				// reading the file
                                    for(int i =0; i<b.length; i++){
                                        if(((char)b[i]) == ' '){
                                            map.put(k,f.getAbsolutePath());
                                            k = "";
                                        }
                                        k = k + (char)b[i];	// appending textfield
                                    }
                                    map.put(k,f.getAbsolutePath());
                                  
                                }
                        }

		}

		
               return true;
	}
    
    else
        return false;
    }
}
