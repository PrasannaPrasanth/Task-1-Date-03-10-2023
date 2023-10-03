public class Leap_year
{
    public static void main(String args[])
    {
        System.out.println(is_leap_year(16));
        System.out.println(is_leap_year(400));
        
        System.out.println(is_leap_year(100));
        System.out.println(is_leap_year(17));
    }
    static boolean is_leap_year(int year)
    {
       if( (year % 400 ==0) || (year % 4 ==0 && year % 100 !=0) )
        return true;
       else 
       return false;
    }
}