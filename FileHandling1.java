
import java.io.*;

import java.nio.file.*;

class FileHandling1{

                    public static void main(String args[])
                    {
                        
                    
                    //create file
                    
                
                    String fileName = "jesmina";

                    int age = 22;

                    String degree = "BCA";




                    //createFile(fileName);

                   
                writeFile(fileName,"my name is jesmina");

                writeFile(fileName,"my age is 22");
                    
                    //readFile(fileName);

                    }

                    public static void createFile(String fileName)
                    {
                        try{
                            File file = new File(fileName);
                            if(file.createNewFile())
                            {
                                System.out.println(file.getName());
                            }
                            else{
                                System.out.println("file is already exists");
                            }
                        }catch(IOException e){
                            System.out.println("an error occured while reading the file");
                        
                            e.printStackTrace();
                    }
                }
            public static void writeFile(String fileName,String content)
            {
                try(FileWriter writer = new FileWriter(fileName,true)){
                    writer.write(content);

                    System.out.println("file succesfully wrote the content");
                }catch(IOException e){

                    System.out.println("an error occured while reading the file");
                    e.printStackTrace();
                }
            }
            public static void readFile(String fileName)
            {
                System.out.println("read file contentds:");
                try(BufferedReader reader = new BufferedReader(new FileReader(fileName)))
                {
                    String line;

                    while((line = reader.readLine()) !=null)
                    {
                        System.out.println(line);
                    }
                }
            catch(IOException e)
            {
                System.out.println("an error occured while reading the file");

                e.printStackTrace();
            }
        }
}