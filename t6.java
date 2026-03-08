package week;
import java.util.Scanner;


/**
 * Write a description of class t6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class t6
{
    public static void main(String[] args)
    {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first string: ");
    String str1 = sc.nextLine();
    
    StringBuilder sb=new StringBuilder(str1);
    sb.reverse();
    
    String reversedString= sb.toString();
    System.out.println(reversedString);
    }
}