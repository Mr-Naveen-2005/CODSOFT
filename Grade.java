import java.util.Scanner;
import java.io.*;
class Grade{
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        int sub1,sub2,sub3,sub4,sub5;
        int total;
        int avg;
        System.out.println("Enter Maths Mark:");
        sub1=s.nextInt();
        System.out.println("Enter English Mark:");
        sub2=s.nextInt();
        System.out.println("Enter Science Mark:");
        sub3=s.nextInt();
        System.out.println("Enter Social Mark:");
        sub4=s.nextInt();
        System.out.println("Enter Computer Science Mark:");
        sub5=s.nextInt();
        total = sub1 + sub2 + sub3 + sub4 + sub5;
        avg = total / 5;
        System.out.println("Total Marks: " + total+"/500");
        System.out.println("Average " + avg);
        if(avg==100)
        {
            System.out.println("Grade: O");
        }
        else if(avg>=90)
        {
            System.out.println("Grade: A+");
        }
        else if(avg>=80)
        {
            System.out.println("Grade: A");
        }
        else if(avg>=70)
        {
            System.out.println("Grade: B+");
        }
        else if(avg>=60)
        {
            System.out.println("Grade: B");
        }
        else if(avg>=50)
        {
            System.out.println("Grade: C");
        }
       
        else
        {
            System.out.println("Grade: UR");
        }
    }
}