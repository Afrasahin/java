import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class serializJava{
    public static void main(String args[])
    {
        Students student = new Students(1,"John Doe");

        try{
            FileOutputStream fileOut = new FileOutputStream("students.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(student);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in students.ser");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

                    
