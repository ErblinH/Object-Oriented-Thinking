import java.util.*;
import javax.swing.*;
public class Account{

/*
(Game: ATM machine) Use the Account class created in Programming Exercise
9.7 to simulate an ATM machine. Create ten accounts in an array with id
0, 1, . . . , 9, and initial balance $100. The system prompts the user to enter an
id. If the id is entered incorrectly, ask the user to enter a correct id. Once an id
is accepted, the main menu is displayed as shown in the sample run. You can
enter a choice 1 for viewing the current balance, 2 for withdrawing money, 3 for
depositing money, and 4 for exiting the main menu. Once you exit, the system
will prompt for an id again. Thus, once the system starts, it will not stop.
*/

   private int id;
   private double balance;
   private double annualInterestRate;
   private Date dateCreated;
   
   public Account(){
      this(0,0,0);
   }
   public Account(int id, double balance, double rate){
      this.id = id;
      this.balance = balance;
      annualInterestRate = rate;
      dateCreated = new Date();
   } 
   public int getId(){
      return id;}
   public void setId(int id){this.id = id;}
   public double getBalance(){
      return balance;}
   public void setBalance(double balance){this.balance = balance;}
   public double getRate(){
      return annualInterestRate;}
   public void setRate(double rate){annualInterestRate = rate;}
   
   public Date getDate(){
      return dateCreated;}
   
   public double getMonthlyInterestRate(){
      return (annualInterestRate/100.0)/12;
   }
   
   public double getMonthlyInterest(){
      double b = getMonthlyInterestRate();
      return balance*b;
   }
   
   public void withdraw(int amount){
      if(amount<0 || amount>balance){
      
         JOptionPane.showMessageDialog(null,"Invalid amount to withdraw"); 
      
         try{
            String input = JOptionPane.showInputDialog("Write the amount you want to withdraw");
            amount = new Integer(input).intValue();
            withdraw(amount);
         }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Enter a proper number");
         }
      
         
      }else{
         balance -= amount;
         JOptionPane.showMessageDialog(null,"Succuesful withdraw");
      }
   }
   
   public void deposit(int amount){
      if(amount<0){
         JOptionPane.showMessageDialog(null,"Invalid amount"); 
      
         try{
            String input = JOptionPane.showInputDialog("Write the amount you want to deposit");
            amount = new Integer(input).intValue();
            deposit(amount);
         }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Enter a proper number");
         }
      
      }
      else {balance += amount;
         JOptionPane.showMessageDialog(null,"Succuesful deposit");
      }
   }
   
   public void withdraw(String a){
      int s = 0;
      try{
         s = new Integer(a).intValue();
      }catch(Exception e){
         String input = JOptionPane.showInputDialog("Enter an proper amount");
         withdraw(input);   
      }
      withdraw(s);
   }
   
   public void deposit(String a){
      int s = 0;
      try{
         s = new Integer(a).intValue();
      }catch(Exception e){
         String input = JOptionPane.showInputDialog("Enter an proper amount");
         deposit(input);   
      }
      deposit(s);
   }
   public int menyja(){
      int id = 0;
      try{
         String input = JOptionPane.showInputDialog("Main meny \n1: check balance \n2: withdraw \n3: deposit \n4: exit \nEnter your choice");
         id = new Integer(input).intValue();
      }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Choose correctly");
         menyja();
      }
      return id;
   }
   public void menyja(int a){
      switch(a){
         case 1: 
            {
               JOptionPane.showMessageDialog(null,"The balance is "+getBalance());
               ATM(); 
               break;
            }
         case 2: 
            {
               String g = JOptionPane.showInputDialog("Enter an amount to withdraw");
               withdraw(g); ATM(); 
               break;
            }
         case 3: 
            {
               String g = JOptionPane.showInputDialog("Enter an amount to deposit");
               deposit(g); ATM(); 
               break;
            }
         case 4:
            {
               ATM(); 
               break;
            }
      }
   }
   public void ATM(){
      int id, op = 0;
      try{
         String in = JOptionPane.showInputDialog("Enter an id");
         id = new Integer(in).intValue();
      }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Enter an proper id");
         ATM();
      }
      
      menyja(menyja());
      
   }
   
   public static void main(String[] args){
      Account account = new Account(1122,20000,4.5);
      //account.withdraw(-2500);
      //account.deposit(3000);
      account.menyja(account.menyja());
      
      //System.out.println("Total balance "+account.getBalance()+
         //"\nTotal monthly interest "+account.getMonthlyInterest()+
         //"\nDate created "+account.getDate());
   } 
   
}
