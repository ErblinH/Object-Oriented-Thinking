public class MyInteger{
/*
10.3 (The MyInteger class) Design a class named MyInteger. The class contains:
 An int data field named value that stores the int value represented by this
object.
 A constructor that creates a MyInteger object for the specified int value.
 A getter method that returns the int value.
 The methods isEven(), isOdd(), and isPrime() that return true if the
value in this object is even, odd, or prime, respectively.
 The static methods isEven(int), isOdd(int), and isPrime(int) that
return true if the specified value is even, odd, or prime, respectively.
 The static methods isEven(MyInteger), isOdd(MyInteger), and
isPrime(MyInteger) that return true if the specified value is even, odd,
or prime, respectively.
 The methods equals(int) and equals(MyInteger) that return true if
the value in this object is equal to the specified value.
A static method parseInt(char[]) that converts an array of numeric
characters to an int value.
 A static method parseInt(String) that converts a string into an int
value.

*/
   private int value;
   
   public MyInteger(int value){
      this.value = value;
   }
   public int getInt(){
      return value;
   }
   public boolean isEven(){
      if(value%2==0)
         return true;
      else 
         return false;
   }
   public boolean isOdd(){
      return !isEven();
   }
   public boolean isPrime(){
      boolean success = true;;
      for(int i =2;i<value;i++){
         if(value%i == 0) 
            return false;
      }
      return success;
   }
   public static boolean isEven(int a){
      if(a%2==0)
         return true;
      else 
         return false;
   }
   public static boolean isOdd(int a){
      return !isEven(a);
   }
   public static boolean isPrime(int a){
      for(int i =2;i<a;i++){
         if(a%i==0)
            return false;
      }
      
      return true;
   }
   public static boolean isEven(MyInteger a){
      return a.isEven();
   }
   public static boolean isOdd(MyInteger a){
      return a.isOdd();
   }
   public static boolean isPrime(MyInteger a){
      return a.isPrime();
   }
   public boolean equals(int a){
      return value==a;
   }
   public boolean equals(MyInteger a){
      return value == a.getInt();
   }
   public static int parseInt(char[] a){
      double res = 0;
      int length = a.length-1;
      for(int i = 0;i<a.length;i++){
         res += Math.pow(10,length--)*(a[i]-'0');
      } 
      return (int)res;
   }
   public static int parseInt(String a){
      return MyInteger.parseInt(a.toCharArray());
   }
}