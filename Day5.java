
class AddString
{
    public void stringadd()
    {
        String vinay = "2 add 4";

        int sum = 0;
        String c = "";

        for(int i = 0;  i <vinay.length(); i++)
        {
            if(Character.isDigit(vinay.charAt(i)))
            {
                c = c + vinay.charAt(i);
                sum = 
                Integer.parseInt(c);
            }
        }
        System.out.println(sum);
    }
}


// class MultiThread extends Thread
// {
//     public void diplay()
//     {
//         for(int i= 0; i<5; i++ )
//        {

//         System.out.println(this.getName()+"Thread is Running..." + i);
//         try 
//         {
//             Thread.sleep(10000);
            
//         }
//         catch (InterruptedException e) 
//         {

//         }
//       }

//     }
    
// }

// public class Day5
// { 
//     public static void main(String[] args)
//     {
        
//     MultiThread mt1 = new MultiThread();
//     MultiThread mt2 = new MultiThread();

//     mt1.start();
//     mt2.start();
       
    
//     }
// }
class A
{
    String A="hello";
    public void A()
    {
    System.out.println(A);
    }

}
class Day5
{
    public static void main(String args[])
    {
        System.out.println("hi");

        A obj = new A();
        obj.A();
       
    }
}