interface I_Vechicle
{
    void drive();
    void turnLeft();
    void brake();
}
interface I_PublicTransport
{
    void getNumberOfPeople();
}
class MotorisedVechicle
{
    void checkMotor()
    {
        System.out.println("The motor of the vechicle is in good comndition");
    }
}
class Car extends MotorisedVechicle implements I_Vechicle
{
    public void drive(){
        System.out.println("The car is in drive mode");
    }
    public void turnLeft(){
        System.out.println("The car is in turnLeft mode");
    }
    public void brake(){
        System.out.println("The car is in brake mode");
    }
}
class Train implements I_Vechicle,I_PublicTransport
{
    public void drive(){
        System.out.println("The train is in drive mode");
    }
    public void turnLeft(){
        System.out.println("The train is in turnLeft mode");
    }
    public void brake(){
        System.out.println("The train is in brake mode");
    }
    public void getNumberOfPeople(){
        System.out.println("train has some 200 people");
    }
}
class ShubhangiDesai_Interface{
    public static void main(String[] args)
    {
        I_Vechicle c=new Car();
        c.drive();
        c.turnLeft();
        c.brake();
        I_Vechicle t=new Train();
        t.drive();
        t.turnLeft();
        t.brake();
        I_PublicTransport a=new Train();
        a.getNumberOfPeople();
    }
}

 