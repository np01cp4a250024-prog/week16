package week;


/**
 * Write a description of class t2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class t2
{
     public static void main (String[] args)
     {
        String word = "  Hello, World!   ";
        
        String trimmedString = word.trim();

        System.out.println("Original String: '" + word + "'");
        System.out.println("Trimmed String: '" + trimmedString + "'");
        System.out.println(word.substring(0,10));
        
        String[] splitArray= word.split(" ");
        for(String x: splitArray){
        System.out.println(x);
        }
    }
}   
     