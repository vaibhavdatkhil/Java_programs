interface A
{
    int no=11;
    void fun();

    private void Display()
    {
        System.out.println("inside private display");
    }
    
    default void gun()
    {
        System.out.println("Inside gun");
        Display();
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
       // dobj.Display(); error
    }
}