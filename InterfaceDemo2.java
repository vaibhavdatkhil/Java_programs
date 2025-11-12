interface Demo
{
    int no=11;

    void Display();
}

abstract class Hello implements Demo
{

}

class InterfaceDem2 
{
    public static void main(String[] args)
    {
        Hello hobj=new Hello(); //error
        
    }
}