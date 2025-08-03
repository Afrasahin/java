import java.io.Serializable;

public class Students implements Serializable{

    private static final long serialVersionUID = 1L;  // Recommended for Serializable classes
    
    private int id;
    private String name;

    public students(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}