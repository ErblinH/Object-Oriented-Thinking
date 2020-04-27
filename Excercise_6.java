import javax.swing.*;

public class Excercise_6{

/*
10.6 (Displaying the prime numbers) Write a program that displays all the prime
numbers less than 120 in decreasing order. Use the StackOfIntegers class
to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and display them in
reverse order.
*/
   
   public static boolean isPrime(int a){
      for(int i =2;i<a;i++){
         if(a%i==0) 
            return false;
      }
      return true;
   }

   public static void main(String[] args){
      int num = 0;
      StackOfIntegers stack = new StackOfIntegers();
      try{
         String input = JOptionPane.showInputDialog("Enter a number");
         num = new Integer(input).intValue();
      }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Enter e proper number");
      }
      
      for(int i = 2;i<=num;i++){
         if(isPrime(i)) stack.push(i);  
      }
      
      while(!stack.empty()){
         System.out.print(stack.pop()+" ");
      }
     
   }
}