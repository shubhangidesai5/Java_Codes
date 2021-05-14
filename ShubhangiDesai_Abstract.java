abstract class Shape
{
    abstract void calculateArea();
    public void setColor(String s)
    {
        String a=s;
        System.out.println(a);
    }
}
class Rectangle extends Shape
{
    public void calculateArea()
    {
        double length=3.0;
        double breadth=3.0;
        System.out.println("Circle Area ="+length*breadth);
    }
}
class Square extends Shape
{
    public void calculateArea()
    {
        double length=4.0;
        double breadth=4.0;
        System.out.println("Square Area ="+length*breadth);
    }
}
public class ShubhangiDesai_Abstract
{
    public static void main(String[] args)
    {
        Rectangle c=new Rectangle();
        c.calculateArea();
        c.setColor("Red");
        Square d=new Square();
        d.calculateArea();
        d.setColor("Orange");
    }
}