import java.util.*;

class AgeInavlidException extends Exception
{
    AgeInavlidException(String str)
    {
      super(str);
    }
}

class ThrowDemo 
{
  public static void main(String A[]) 
  {
      Scanner sc =new Scanner(System.in);
      
      int iage=0;
      System.out.println("Enter your age:");
      iage=sc.nextInt();

      try{
      if(iage < 18)
      {
         throw new AgeInavlidException("Your age is below 18");
      }
      }

      catch(AgeInavlidException aobj)
      {
         System.out.println(aobj);
      }


  }
}
