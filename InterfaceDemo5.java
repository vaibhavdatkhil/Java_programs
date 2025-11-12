interface A
{
    void fun();
}

interface B
{
    void fun();
}

class Demo implements A,B  // Multiple inheritance
{
    public void fun()
    {
        System.out.println("inside fun");
    }
}

class InterfaceDemo5
{
    public static void main(String[] args)
    {
        Demo dobj=new Demo();

        dobj.fun();
    }
}