package Java;

public class BlockStatement {

    public static void main(String[] args) {

        int x = 10;

        {
            int y = 50;
            System.out.println("block1:");
            System.out.println("x:" + x);
            System.out.println("y:" + y);
        }

        {
            int y = 20;
            System.out.println("block2:");
            System.out.println("x:" + x);
            System.out.println("y:" + y);
        }

        System.out.println("outside" + x);
    }
}
