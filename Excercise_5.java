import javax.swing.JOptionPane;

public class Excercise_5{

/*
10.5 (Displaying the prime factors) Write a program that prompts the user to enter
a positive integer and displays all its smallest factors in decreasing order. For
example, if the integer is 120, the smallest factors are displayed as 5, 3, 2, 2,
2. Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and
retrieve and display them in reverse order.
*/

   public static void main(String[] args){
      int num = 0;
      try{
         String input = JOptionPane.showInputDialog(null, "df");
         num = new Integer(input).intValue();
      }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Please enter a proper number");
      }
      
      StackOfIntegers stack = new StackOfIntegers();
      int factor = 2;
      while(factor<=num){
         if(num%factor == 0){
            stack.push(factor);
            num /=factor;
         }else{factor++;}
      }
      while(!stack.empty()){
         System.out.print(stack.pop()+" ");
      }
   }
}