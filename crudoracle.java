import java.sql.*;
import java.util.Scanner;

public class crudoracle{

                    static final String  DB_URL = "jbdc:oracle:localhost:1521:orcl";

                    static final String DB_USER = "system";

                    static final String DB_PASSWORD ="livewire";

            try(Connection conn = DriverManager.getConnection(DB_URL , DB_USER , DB_PASSWORD);

                    Scanner sc = new Scanner(System.in)){

                        class.forName("oracle.jbdc.driver.oracleDriver");

                        while(true){

                            System.out.println("\n1. Insert");
                            System.out.println("2. View All");
                            System.out.println("3.View By ID");
                            System.out.println("4.update");
                            System.out.println("5.Delete");
                            System.out.println("6.Delete");
                            System.out.println("Choose option");

                            int choice = sc.nextInt();
                            sc.nextLine();

                            switch(choice)
                            {
                                System.out.println("Enter a name");
                                String name = sc.nextLine();
                                System.out.println("enter a email");
                                String email = sc.nextLine();
                                System.out.println("enter salary");
                                double salary = sc.nextInt();

                                insertEmployee(conn , name , email, salary);

                                break;

                                case 2:
                                    ViewAllEmployee(conn);
                                    break;

                                case 3:

                                    System.out.println("enter employee ID");
                                    int id = sc.nextInt();
                                    ViewEmployeeById(conn,id);
                                    break;

                                case 4:
                                    System.out.println("Enter ID to update");

                                    String updateID = sc.nextLine();

                                    System.out.println("enter new name");

                                    String newName = sc.nextLine();

                                    System.out.println("Enter new email");

                                    String newEmail = sc.nextLine();

                                    System.out.println("enter new salary");

                                    int newSalary = sc.nextDouble();

                                    updateEmployee(conn, updateId , newName , newEmail , newSalary);

                                    break;

                                case 5:

                                    System.out.println("Enter ID to delete");

                                    String deleteId = sc.nextLine();

                                    deleteEmployee(conn,deleteId);

                                    break;
                                
                                case 6:

                                    System.out.println("Existing");

                                    return;

                                    default:
                                        System.out.println("Invalid choice");

                            }
                        }
                    }catch(Exception e){
                        e.printStackTrace();
                        
                    }
                }
                public static void insertEmployee(Connection conn, STring name , String email, double salary) throw SQLException{
                    String sql = "INSERT INTO EMPLOYEE (NAME , EMAIL , SALARY) VALUES (? , ? ,?)";
                    try(PreparedStatement ps = conn.prepareStatement(sql)){
                        ps.setString(1 , name);
                         
                        ps.setString(2 , email);

                        ps.setString(3, salary);

                        int rows = ps.executeUpdate();

                        System.out.println(rows + " row inserted");
                    }
                    }
                    public static void ViewAllEmployee(Connection conn) throws SQLException{
                        String sql = "SELECT * FROM EMPLOYEE";
                        try(Statement st = conn.createStatement();
                         ResultSet rs = st.executeQuery(sql))
                         {
                            System.out.println("ID |Name| Email| Salary");
                            while(rs.next()){
                                System.out.println(
                                rs.getInt("ID") + " | " +
                                rs.getString("NAME") + " | " +
                                rs.getString("EMAIL") + " | " +
                                rs.getDouble("SALARY"));

                             }
                        }
                    }
                    public static void viewEmployeeById(Connection conn , int id) throws SQLException{
                        String sql = "SELECT * FROM EMPLOYEE WHERE ID = ?";
                        try(PreparedStatement ps = conn.prepareStatement(sql)){
                            ps.setInt(1, id);
                            ResultSet rs = ps.executeQuery(); 
                            if(rs.next())
                            {
                                System.out.println("ID : " + rs.getInt("ID"));
                                System.out.println("Name : " + rs.getString("NAME"));
                                System.out.println("Email : " + rs.getString("EMAIL"));
                                System.out.println("Salary : " + rs.getDouble("SALARY"));
                            }else{
                                System.out.println("Employee not found");
                            }
                            }
                            }
                            public static void deleteEmployee(Connection conn , int id) throws SQLException{
                                String sql = "DELETE FROM EMPLOYEE WHERE ID = ?";
                                try(PreparedStatement ps = conn.prepareStatement(sql)){
                                    ps.setString(1, name);
                                    ps.setString(2 , email);
                                    ps.setString(3, salary);
                                    ps.setString(4, id);
                                    int rows = ps.executeUpdate();
                                    System.out.println(rows + "employees update");

                                }
                            }

                            public static void updateEmployee(Connection conn , int id , String name , String email , double salary) throws SQLException{
                                String sql = "UPDATE EMPLOYEE SET NAME = ?, EMAIL = ?, SALARY = ? WHERE
                                try(PreparedStatement ps = conn.prepareStatement(sql)){
                                ps.setString(1, name)
                                    

 