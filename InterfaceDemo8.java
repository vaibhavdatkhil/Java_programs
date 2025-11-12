interface A
{
    int no=11;
    void fun();
    default void gun()
    {
        System.out.println("Inside gun");
    }
}



class Demo implements A  // Multiple inheritance
{
    public void fun()
    {
        System.out.println("inside fun");
    }
}

class InterfaceDemo8
{
    public static void main(String[] args)
    {
        Demo dobj=new Demo();

        dobj.fun();
        dobj.gun();
    }
}