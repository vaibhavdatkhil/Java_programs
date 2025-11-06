class Demo
{
   public int Divsion(int No1,int No2) throws ArithmeticException
   {
      int Ans=0;
      Ans=No1/No2;
      return Ans;
   }
}

class ThrowsDemo 
{
  public static void main(String A[])
  {
      Demo dobj=new Demo();
      int Ret=0;

      try
      {
      Ret=dobj.Divsion(11,0);
      }

      catch(ArithmeticException aobj)
      {
         System.out.println("Inside catch"+aobj);
      }
      
      System.out.println("Division is:"+Ret);
  }    
}
