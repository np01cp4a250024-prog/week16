package week;
import java.util.Scanner;


/**
 * Write a description of class t5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class t5
{
     public static void main (String[] args)
    {
        StringBuilder sb=new StringBuilder();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        
        String txt= "Haha i am aryan";
        
        sb.append(str1).append(txt).append(" ");
        System.out.print(sb);
}
}