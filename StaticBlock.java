class Demo
{
   public int i; //instanse variable
   static public int j; //class variable

   static
   {
      j=21;
   }

   public Demo()
   {
      this.i=1;
   }

   public void fun() //instance method
   {
      System.out.println("fun i:"+this.i);
      System.out.println("fun j:"+Demo.j);
   }

    public static void gun() //class method
   {
      // System.out.println("gun i:"+this.i); //NA
      System.out.println("gun i:"+Demo.j);
   }
}
class StaticBlock
{
    public static void main(String A[])
    {
         Demo.gun();
         System.out.println(Demo.j);
         Demo dobj=new Demo();
         System.out.println(dobj.i);
         dobj.fun();
    }
}