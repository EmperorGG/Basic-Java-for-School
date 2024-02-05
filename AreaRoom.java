package Java;
class Room
{
    float breadth;
    float length;
    float height;
    byte nWindows;

    double area()
    {
        return(length*breadth);
    }
    void display()
    {
        System.out.println("Length"+ length);
        System.out.println("Breadth"+ breadth);
        System.out.println("Height"+ height);
        System.out.println("Number of Windows"+ nWindows);
    }
    public void setAttr(float f, float g, float h, byte b) {
    }
}
public class AreaRoom
{
   public static void main(String[] args) {
    {
        Room r1=new Room();
        Room r2=new Room();

        r1.setAttr(18f, 12.5f, 10f,(byte) 2);
        r1.display();
        System.out.println("\n Area with Length"+r1.length+"and Width"+r1.breadth+"and height"+r1.height+"is "+r1.area());


        r2.setAttr(4f, 11.5f, 12f,(byte) 1);
        r2.display();
        System.out.println("\n Area with Length"+r2.length+"and Width"+r2.breadth+"and height"+r2.height+"is "+r2.area());

    }
   } 
}