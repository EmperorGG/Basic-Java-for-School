package Java;

class primeno

{
    static boolean isPrime()
    {
        int i=3;
        do
        {
            boolean prime=true;
            for (int j=2;j<i;j++)
            {

                if ((i%j)==0) { 
                    prime=false;
                     break;
                }

            }

            if(prime)
            System.out.println(i);
            i++;
        }
        while (i<100);
        return true;
    }
}

public class CheckingPrimeNumber {

    public static void main(String[] args)
    {
        primeno.isPrime();
    }
}
