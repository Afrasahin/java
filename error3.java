
import java.util.Scanner;

class error3{

            public static void main(String args[])
            {
                try{
                Scanner scr = new Scanner(System.in);

                System.out.println("enter integer num1:");

                int num1 = scr.nextInt();

                System.out.println("enter integer num2:");

                int num2 = scr.nextInt();

                int result =num1/num2;

                System.out.println(result);

                   
                }catch(Exception e){
                    System.out.println(e.getMessage());

                    throw new RuntimeException(e);

                }finally{

                    System.out.println("finally block is continued after execution");
                }

            }
}
