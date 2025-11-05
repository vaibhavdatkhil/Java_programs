abstract class Base
{
   public int i,j;

   public int Addition(int A,int B) 
      {
        return A+B;
      }

   abstract public int Substraction(int A,int B); 
}

class Derived extends Base    
{
   public int x; 
    
    public int Substraction(int A,int B) //concrete
       {
        return A-B;
       }

    public int Multiplication(int A,int B) //concrete
       {
        return A*B;
       }
       
       
};



class AbstractDemo3
{
    public static void main(String A[])
    {
      Base bp=new Derived(); //upcatsing

      int iret=0;
   

   iret=bp.Addition(11,10); //21
   System.out.println("Addition is:"+iret);

   iret=bp.Substraction(11,10); //1
   System.out.println("Subraction is:"+iret);

   // iret=bp.Multiplication(11,10); error
    }
}