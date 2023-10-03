public class prime {
    public static void main(String args[])
    {
        System.out.println(is_prime(11));
        System.out.println(is_prime(19));
        System.out.println(is_prime(79));
        System.out.println(is_prime(83));
        System.out.println(is_prime(97));

        System.out.println(is_prime(12));
        System.out.println(is_prime(250));
        System.out.println(is_prime(120));


    }
    static boolean is_prime(int number)
    {
        if(number<2) return false;
        if(number ==2) return true;
        if(number % 2 == 2) return false;
        else
        {
            for(int i =3;i*2 <= number;i=i+2)
            {
                if(number % i ==0)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
