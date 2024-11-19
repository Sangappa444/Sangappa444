class Shapes
{
    void draw()
    {
        System.out.println("this is drawing function");
    }
    void erase()
    {
        System.out.println("this is the erase function");
    }
}

class Triangle extends Shapes
{
    @Override
    void draw()
    {
        System.out.println("This the traingle method it's work drawing ");
    }
    @Override
    void erase()
    {
        System.out.println("This Triagle erase");
    }
}


// Triangle obj =new Triangle();
//        obj.draw();
//        obj.erase();





// class Sheff
// {
//     String name;
//     private String name1;   

//     String getValue()
//     {
//        return  name1;
//     }
//     void  setValue()
//     {
//         this.name1 = name1; 
//         name1 = "Vinay ";
//         name = "Shrusti ";
//         System.out.println( name1);
//         System.out.println(name);
//     }

// }



// // public static void main(String[] args) 
// // {
     
// //    Sheff obj = new Sheff();
// //    obj.setValue();
   
// // }




// // Scanner scanner = new Scanner(System.in);


// // System.out.println("Enter the value of A : ");
// // int A = scanner.nextInt();

// // System.out.println("Enter the value of B : ");
// // int B = scanner.nextInt();




// // try 

// // {
// //     int div = A / B;
// //     System.out.println("Division of Two number is : " + div);
// // }

// // catch (Exception e)
// // {
// //     System.out.print("You can not divid by Zero...");
// // }


// // class Day4
// // {

// //     public static void main(String[] args) 
// //     {
       

// //     }

// // }




// public class Day4 {

//     public static int evaluate(String expression) {
//         // Replace implied multiplication: "3(4+10/5)" becomes "3*(4+10/5)"
//         expression = expression.replaceAll("(\\d)\\(", "$1*(");

//         // Stack for numbers and operators
//         Stack<Integer> numbers = new Stack<>();
//         Stack<Character> operators = new Stack<>();

//         int i = 0;
//         while (i < expression.length()) {
//             char c = expression.charAt(i);

//             if (Character.isDigit(c)) {
//                 // Parse number and push it onto the numbers stack
//                 int num = 0;
//                 while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
//                     num = num * 10 + (expression.charAt(i) - '0');
//                     i++;
//                 }
//                 numbers.push(num);
//                 i--; // Move back one character because of the for-loop increment
//             } else if (c == '(') {
//                 operators.push(c);
//             } else if (c == ')') {
//                 // Evaluate until matching '(' is found
//                 while (operators.peek() != '(') {
//                     numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
//                 }
//                 operators.pop(); // Pop '('
//             } else if (c == '+' || c == '-' || c == '*' || c == '/') {
//                 // While top of 'operators' has the same or greater precedence, apply it to top two numbers
//                 while (!operators.isEmpty() && precedence(c) <= precedence(operators.peek())) {
//                     numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
//                 }
//                 operators.push(c);
//             }
//             i++;
//         }

//         // Apply remaining operators to remaining numbers
//         while (!operators.isEmpty()) {
//             numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
//         }

//         // Final result
//         return numbers.pop();
//     }

//     // Helper method to return precedence of operators
//     public static int precedence(char op) {
//         if (op == '+' || op == '-') return 1;
//         if (op == '*' || op == '/') return 2;
//         return 0;
//     }

//     // Helper method to apply an operation and return the result
//     public static int applyOperation(char op, int b, int a) {
//         switch (op) {
//             case '+': return a + b;
//             case '-': return a - b;
//             case '*': return a * b;
//             case '/': return a / b; // Assume b != 0
//         }
//         return 0;
//     }

//     public static void main(String[] args) {
//         String expression = "5 + 3*(4 + 10/5) - 2";
//         int result = evaluate(expression);
//         System.out.println("Result: " + result);
//     }
// }

class Kaaali
{

static void validation(int age) throws Exception
    {
        if(age < 18 )
        {
        throw new Exception (" You can not Vote");
        }
        else
        {
            System.out.println("You can Vote easy becasue your age " + age);
            int[] ages = {1,3,4,3,5,45,78,76,76,7,6,76,76,76,67,78,8,9,78,89};
            for(int i = 0 ; i <ages.length; i++)
            {
             try
             {
                 validation(ages[i]);
     
             }
             catch (Exception s)
             {
                 System.out.println(s);
             }
     
            }
        }
    }
}


// ClassA obj = new ClassA();
//         obj.display1();
        
//         ClasssB obj1 = new ClasssB();
//         obj1.display2();

//         ClassC obj2  =  new ClassC();
//         obj2.display3();

// for(int i = 0;  i<lenght; i++)
//        {

//         String newString = Vinay;


//         System.out.println(newString);
//        }

//    // Character s = 'a';
//         // s = 'b';

//         String Shreyash ="Shreyash";
//         System.out.println(Shreyash);



// System.out.println(lenght);
// System.out.println(Vinay.endsWith("boy"));
// System.out.println(Vinay.charAt(Integer.BYTES));
// System.out.println(Vinay.concat(Vinay));
// System.out.println(Vinay.startsWith("Vinay"));
// System.out.println(Vinay.contains("is"));
// System.out.println(Vinay.charAt(5));
// System.out.println(Vinay.indexOf("w"));

class WordC
{
    public static int WordCountget(String Vinay)
    {
            
        int WordCount = 0;

        for(int index = 0; index<Vinay.length(); index++)
        {
            char oneChar = Vinay.charAt(index);
            if(oneChar == ' ')
            {
               WordCount +=1;
              
            }
            else
            {
            
            }
        
        }
//        System.out.println(WordCount);
                return WordCount;
    }
}




public class Day4
{

    public static void main(String[] args)
    {
    //    StringBuffer sb1 = new StringBuffer("Modertimes");


      // System.out.println(sb1);
       String Vinay ="Vinay is boy ";

      int A = WordC.WordCountget(Vinay);
      System.out.println(A);
       
    }
}


