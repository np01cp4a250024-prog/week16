package week;
import java.util.Scanner;


/**
 * Write a description of class t1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class t1
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        
        System.out.println("Enter second string: ");
        String str2 = sc.nextLine();
        
        String combined = str1.concat(str2);
        System.out.println(combined);
        
        System.out.println("Enter third string: ");
        String str3 = sc.nextLine();
        
        boolean str4= combined.equals(str3);
        
        System.out.println(str4);
        
    }
}