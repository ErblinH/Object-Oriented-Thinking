public class MyString1{

/*
10.22 (Implement the String class) The String class is provided in the Java library.
Provide your own implementation for the following methods (name the new
class MyString1):
public MyString1(char[] chars);
public char charAt(int index);
public int length();
public MyString1 substring(int begin, int end);
public MyString1 toLowerCase();
public boolean equals(MyString1 s);
public static MyString1 valueOf(int i);
*/

   private static char[] ch;
   
   public MyString1(char[] chars){
      ch = new char[chars.length];
      
      for(int i =0;i<ch.length;i++){
         ch[i] = chars[i];
      }
   }
   
   public char charAt(int index){
      return ch[index];
   }
   
   public int length(){
      return ch.length;
   }
   
   public MyString1 substring(int begin, int end){
      char[] cha = new char[end-begin];
      for(int i =0;i<cha.length;i++){
         cha[i] = ch[begin+i];
      }
      return new MyString1(cha);
   }
   
   public MyString1 toLowerCase(){
      char[] chars = new char[ch.length];
      for(int i =0; i<chars.length;i++){
         if(ch[i]>='A' && ch[i]<='Z')
            chars[i] = (char)(ch[i]+32);
         else chars[i] = ch[i];
      }
      return new MyString1(chars);
   }
   
   public boolean equals(MyString1 s){
      if(ch.length != s.length()) 
         return false;
      
      for(int i =0;i<ch.length;i++){
         if(ch[i] != s.charAt(i)) 
            return false;
      }
      
      return true;
   }
   
   public static MyString1 valueOf(int i){
      String a = ""+i; int length = a.length();
      
      char[] chars = new char[length];
      
      for(int j =0, k=(int)Math.pow(10,length-1);j<chars.length;j++, k/=10){
         ch[j] = Character.forDigit((i/k),10);
         i%=k;
      } 
      return new MyString1(chars);     
   }
     
}