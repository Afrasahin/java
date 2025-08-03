import java.sql.*;

import java.util.Scanner;

public class Sqlwithjava{

    static final String DB_URL = "jdbc:mysql://localhost:3306/";

    static final String DB_USER = "system";

    static final String DB_PASSWORD = "livewire";

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        try(Connection conn = DriverManager.getConnection(DB_URL ,DB_USER ,DB_PASSWORD)){
            Class.forName("oracle,jdpc,driver,OracleDriver");

            while(true){
                System.out.println("\n1.Insert\n2.View All\n3.View by ID\n4.Update\n5.Delete\n6.Exit");

                System.out.println("choose Option");

                int choice = sc.nextInt();

                sc.nextLine();

                switch(choice){
                    case1 :
                    System.out.println("Enter name :");
                    String name = sc.nextLine();

                    System.out.println("Enter email:");

                    String email = sc.nextLine();

                    System.out.println("Enter salary:");

                    double salary = sc.nextDouble();
                    insertEmployee(conn, name,email,salary);

                    break;

                    case2 :
                    viewAllEmployees(conn);

                    break;

                    case 3:
                    System.out.println("Enter Employee ID :");
                    int id = sc.nextInt();
                    viewEmployeeById(conn,viewId);
                    break;

                    case4:

                    System.out.println("Enter ID to update:");

                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.println("Enter new name");

                    String newName = sc.nextLine();

                    System.out.println("enter new email");

                    String newEmail = sc.nextLine();

                    



                }
            }
        }
        }
    }
}