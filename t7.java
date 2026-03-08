package week;


/**
 * Write a description of class t7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class t7
{
    public static void main(String[] args)
    {
        
        String ph="9763337373";
        
        String regex="9[78][0-9]{8}";
        if(ph.matches(regex))
        {
            System.out.println(ph+ " is valid phone number");
        }
        else
        {
            System.out.println(ph+ " is'nt valid phone number");
        }
    }

}