interface Demo
{
    int no=11;

    void Display();
}

class Hello implements Demo
{
   //error
}

class InterfaceDem1 {
    public static void main(String[] args)
    {
        Hello hobj=new Hello();
        
    }
}