import java.util.Scanner;
// class Second
// {
//     public void second_lagrest()
//     {
//         int[] ar = {3,8,5,6,3,9};
//         int bucket1 = 0, bucket2 = 0;
//         int arlength =ar.length;
//         for(int index = 0 ; index  < arlength; index++)
//         {
//           if( index == 0)
//           {
//              if(ar[index] > ar[index+1])
//              {
//                 bucket1 = ar[index];
//                 bucket2 = ar[index + 1];
//              }
//              else
//              {
//                 bucket1 = ar[index + 1];
//                 bucket2 = ar[index];
//              }
//           }
//         if( index > 1)
//         {
//             if(ar[index] > bucket1)
//             {
//                 bucket2 = bucket1;
//                 bucket1 = ar[index];
//             }
//             else if(ar[index] < bucket2)
//             {
//                 bucket2  = ar[index];
//             }
//         }

//         }

//         System.out.println(bucket1);
//         System.out.println(bucket2);
//     }
// }

// class Bird
// {
//     String name;
//     int beak;
//     int legs;
//     int wings;
//     String flymode;
    
//     void fly()
//     {
//         System.out.println(this.name + " Flies " + this.flymode);
//     }
// }


 
//     //   Bird obj = new Bird();
//     //   obj.name = "Vinay";
//     //   obj.flymode = "malkondu "; 
//     //   obj.fly();
//     //   Bird obj1 = new Bird();
//     //   obj1.name = "Sai ";
//     //   obj1.flymode = " Nintkondu";
//     //   obj1.fly();

// class A
// {
//     A()
//     {
//         System.out.println("I am coming first constructor");
//     }
    
//     A(String name)
//     {
//        System.out.println("I am coming from Second constructor!.." + name); 
//     }
// }


class A1
{
    static int add( int a, int b)
    {
       //int c = a + b;
       System.out.println("c value is c : " + (a + b));
       return  0;

    }

    static int add(int a, int b, int c)
    {
        int d = a + b + c;
        System.out.println("d value is  : " + d);
        return  0;
    }


    static int add(int a , int b , int c, int d )
    {
        int e = a + b + c + d;
        System.out.println("e value is :  " + e);
        return 0;
    }

}

 // //    A obj1 = new A();
    // //    A obj2 = new A("vinay");
    // // A1 obj = new A1();
    // // obj.add(1, 2);
    // // obj.add(1, 2, 3);
    // // obj.add(1,2,4,5); 
    // A1.add(1,2 );
    // A1.add(2, 3,4);
    // A1.add(1,2,3,4 );

class Cricket
{
    int teams;
    int players;

    Scanner scanner = new Scanner(System.in);

    void ipl()
    {
        System.out.println("How Many Team is there in ipl : " );
        teams = scanner.nextInt();
        System.out.println("Every Year Ipl Teams Sholud be More Than : " + teams);
    }
    void Mumbai()
    {
        System.out.println("How Many Player compulsory is ther in team : " );
        players = scanner.nextInt();
        System.out.println("Yes defentely : " + players + " because is rules");
    }
}

class Wc extends Cricket
{
    @Override
    void ipl()
    {
        System.out.println("IN The World India The Best Team \n ");
    }
    void SouthAfrica()
    {
        System.out.println("In The World South Africa Most Emotional Team \n ");
    }
}

// Wc obj = new Wc();
// // obj.teams = 8;
// // obj.players = 11;  
// obj.ipl();
// obj.Mumbai();
// //obj.India();
// obj.SouthAfrica();  



abstract class Meals
{
    abstract void lunch();
    abstract void dinner();
    void Fasting()
    {
        System.out.println("Todauy i am Fasting....\nBeause vinay kuda uta madalla adke nanu madalla...");
    }
    
}
class UttarKarnataka extends Meals
{
    void lunch()
    {
        System.out.println("\nToday I am Eat Anna and Sambar!\n");
    }
    void dinner()
    {
        System.out.println("I Think I am Eat Dinner is Roti\n");
    }
}

// UttarKarnataka obj = new UttarKarnataka();
//      obj.lunch();
//      obj.dinner();
//      obj.Fasting();


interface Shapes
{
    void area();
    void volume();
}


class Triangle implements Shapes
{
   public void area()
    {
        System.out.println("In Triangle Area = 1/2 * (b * h)");
    }
    public void volume()
    {
        System.out.println("Triangle Volume is= b * h");
    }
    
}

class Square extends Triangle
{
    public void area()
    {
        System.out.println("In Triangle Area = 1/2 * (b * h)");
    }
    public void volume()
    {
        System.out.println("Triangle Volume is= b * h");
    }
    public void say()
    {
        System.out.println("Hi");
    }

}


// Square obj = new Square();
// obj.area();
// obj.volume();




public class Day3
{
    public static void main(String[] args) 
    {
        
       

    }
}


