package Java;

public class SimpleInterest {

    public static void main(String[] args) {
        
        double p;
        double r;
        double n;
        double m;
        double i;


        p = 1000;
        r = 9.5;
        n = 3;

        i = (n*p*r);

        m = p+i;

        System.out.println("Interst= "+i);
        System.out.println("Maturity="+m);



    }
    
}
