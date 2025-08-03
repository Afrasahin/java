import java.io.*;
import java.nio.file.*;

class FileHandling{

		public static void main(String args[])
{
	String filename = "example.text";
	

	createFile(filename);

	writeFile(filename,"this is the first line of the file");

	readFile(filename);

	appendToFile(filename,"this line is append");

	readFile(filename);
}

public static void createFile(String filename)
{
	try{
		File file = new File(filename);
		if(file.createNewFile())
		{
			System.out.println("File created:"+file.getName());
		}
		else{
			System.out.println("file already exists");
		}
	
}catch(IOException e)
{
		System.out.println("an error occured while creating the file.");
		e.printStackTrace();
	}
}

//write to file

public static void writeFile(String filename,String content)
{
	
		try(FileWriter writer = new FileWriter(filename)){
		writer.write(content);

		System.out.println("file successfully wrote the content");

	}catch(IOException e){
	
		System.out.println("an error occured while writing the file");

		e.printStackTrace();
	}
	}
	//read a file
	public static void readFile(String filename){

		System.out.println("reading fiel contents:");
		try(BufferedReader reader = new BufferedReader(new FileReader(filename)))
		{

			String line;

			while((line = reader.readLine()) != null)
			{
				System.out.println(" " + line);
			}
	}
	catch (IOException e)
	{
		System.out.println("an error occured while reading the file");

		
	}
}
//append to file
public static void appendToFile(String filename , String content)
{
	
		try(FileWriter writer = new FileWriter(filename,true)){

		writer.write(content);
		System.out.println("content successfully appended to the file");
	}catch(IOException e)
	{
		System.out.println("an error occured while appending to the file");
		e.printStackTrace();
	}
	}

//deleting te file

public static void deleteFile(String filename)
{
	try{
		Files.deleteIfExists(Paths.get(filename));
		System.out.println("file successfully deleted");
	}
	catch(IOException e){                                 
		
		System.out.println("an error occured while deleting the file");

		e.printStackTrace();

	}
	}
}
