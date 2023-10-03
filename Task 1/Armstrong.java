public class Armstrong {
    public static void main(String args[])
    {
        System.out.println(is_Armstrong_number(153));
        System.out.println(is_Armstrong_number(370));
        System.out.println(is_Armstrong_number(371));
        System.out.println(is_Armstrong_number(407));
        System.out.println(is_Armstrong_number(1634));
        
        System.out.println(is_Armstrong_number(369));
        System.out.println(is_Armstrong_number(1635));
    }
    static int get_count(int number)
    {
        int ans =0;
        while(number != 0)
        {
            number  = number / 10;
            ans++;
        }
        return ans;
    }
    static boolean is_Armstrong_number(int number)
    {
        int sum =0;
        int rem;
        int temp = number;
        int count  = get_count(number);
        while(number != 0)
        {
            rem = number % 10;
            sum += Math.pow(rem,count);
            number = number /10;
        }
        if(sum == temp) 
            return true;
        else
             return false;
    }
}
