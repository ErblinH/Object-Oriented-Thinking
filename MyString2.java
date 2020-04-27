public class MyString2{
/*
10.23 (Implement the String class) The String class is provided in the Java library.
Provide your own implementation for the following methods (name the new
class MyString2):
public MyString2(String s);
public int compare(String s);
public MyString2 substring(int begin);
public MyString2 toUpperCase();
public char[] toChars();
public static MyString2 valueOf(boolean b);
*/
   private String s;
   
   public MyString2(String s){
      this.s = s;
   }
   
   public int compare(String s){
      int index = 0;
      if(this.s.length() < s.length()) index = -1;
      if(s.length() < this.s.length()) index = 1;
      
      for(int i =0;i<this.s.length();i++){
         if(this.s.charAt(i) < s.charAt(i)) index = -(i+1);
         if(this.s.charAt(i) > s.charAt(i)) index =i+1;
      }
      return index;
   }
   
}