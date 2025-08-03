import java.util.Scanner;

class test7{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=scan.nextLine();

        for(int i=0;i<str.length();i++)
        {
            System.out.println(str.charAt(i));
        }
        System.out.println(str.concat("sahin"));
    }
    }
