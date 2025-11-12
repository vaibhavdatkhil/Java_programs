class Base
{
   public int i,j;

   public void fun()
   {
      System.out.println("inside base fun");
   }

   public void gun()
   {
      System.out.println("inside base gun");
   }

   public void sun()
   {
      System.out.println("inside base sun");
   }

   public void bun()
   {
      System.out.println("inside base bun");
   }
}

class Derived extends Base
{
  public int x;

  public void gun()
   {
      System.out.println("inside Derived gun");
   }

   public void sun()
   {
      System.out.println("inside Derived sun");
   }

   public void run()
   {
      System.out.println("inside Derived run");
   }

   public void mun()
   {
      System.out.println("inside Derived mun");
   }

}

class RMDDemo2
{
    public static void main(String A[])
    {
      Base bp=new Derived(); //Upcasting

      bp.fun(); //base fun
      bp.gun(); //Derived gun
      bp.sun(); //Derived sun 
      //bp.run(); //error
      //bp.mun(); //error
      bp.bun(); //base bun
       
    }
}