package week;


/**
 * Write a description of class t4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class t4
{
    public static void main (String[] args)
    {
        String text= "  hello WoRLD ";
        String trimmedString= text.trim();
        String[] words=trimmedString.split("\\s+");
        StringBuilder sb=new StringBuilder();
        
        for(int i=0; i<words.length; i++){
        String first=words[i].substring(0,1).toUpperCase();
        String rest=words[i].substring(1).toLowerCase();
        sb.append(first).append(rest).append(" ");
        
        }
        System.out.println(sb.toString());
    }
}