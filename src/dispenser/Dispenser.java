package dispenser;
import java.util.Scanner;
public class Dispenser {
   public static void main(String[] args) {
       int d;
               int a,e;
               int c;
Scanner dispenser =new Scanner (System.in);
System.out.println("Welcome to Rolls n Roylce snacks dispenser  ");
System.out.println("The first african fully digital dispenser");
System.out.println("Special notice:The machine doesn't take nylon money and money greater than #200 note \nAnd it only takes a single note \nIt takes your account number in cases of outstanding balances ");
System.out.println("In order to transfer the Balance into it ");
System.out.println("Once again it is \'R\' n 'R' dispensing machine\nA single trial will do the convincing words  ");
System.out.println("Without delay slide in your money :  ");
 a=dispenser.nextInt();
switch(a){
    case 100:
System.out.println("You just slid in #" + a );
System.out.println("The following are the goods that can be purchased with #"+ a );
System.out.println("minimie@#50\nCoke and Fanta(solo)@#100\nBeef roll@#50\n ");
        System.out.println("Kindly press 1 for minimie\n2 for Coke or Fanta\n3 for Beef roll ");
        d=dispenser.nextInt();
        if (d==1){
            System.out.println("Please wait... ");
            System.out.println("Kindly pick your minimie  ");
System.out.println("please input your account number?  ");
c=dispenser.nextInt();
System.out.println("Your #50 balance has been sent to the account number " + c );
System.out.println("Transaction completed  ");

System.out.println("Hoping to seeing you some other time ");
        }
        else if(d==2){System.out.println("Please wait... ");
            System.out.println("Kindly pick your whether it is Fanta or Coke\n 1 for Fanta and 2 for Coke   ");
         c=dispenser.nextInt();
if(c==1){System.out.println("Take your Fanta");
    System.out.println("Transaction completed  ");
   System.out.println("Do you wish to perform another transaction ?\n1.Yes\n2.No ");
   e=dispenser.nextInt();
   switch(e){
       case 1:
           System.out.println(" once again elcome to Rolls n Roylce snacks dispenser  ");
System.out.println("The first african fully digital dispenser");
System.out.println("Special notice:The machine doesn't take nylon money and money greater than #200 note \nAnd it only takes a single note \nIt takes your account number in cases of outstanding balances ");
System.out.println("In order to transfer the Balance into it ");
System.out.println("Once again it is \'R\' n 'R' dispensing machine\nA single trial will do the convincing words  ");
System.out.println("Without delay slide in your money :  ");
 a=dispenser.nextInt();
   
    if(a==100){
System.out.println("You just slid in #" + a );
System.out.println("The following are the goods that can be purchased with #"+ a );
System.out.println("minimie@#50\nCoke and Fanta(solo)@#100\nBeef roll@#50\n ");
        System.out.println("Kindly press 1 for minimie\n2 for Coke or Fanta\n3 for Beef roll ");
        d=dispenser.nextInt();
        if (d==1){
            System.out.println("Please wait... ");
            System.out.println("Kindly pick your minimie  ");
System.out.println("please input your account number?  ");
c=dispenser.nextInt();
System.out.println("Your #50 balance has been sent to the account number " + c );
System.out.println("Transaction completed  ");
   System.out.println("Hoping to seeing you some other time ");}
        else if (d==2){
        System.out.println("Please wait... ");
            System.out.println("Choose between fanta and coke\n1.Fanta\n2.Coke   ");
            e=dispenser.nextInt();
            if(e==1){
            System.out.println("Take your fanta");
               System.out.println("Transaction completed  ");
   System.out.println("Hoping to seeing you some other time ");}
            else {
                    System.out.println("Take your coke");
               System.out.println("Transaction completed  ");
   System.out.println("Hoping to seeing you some other time ");}
          
            }
    }
    
        case 200:
        System.out.println("You just slid in #" + a );
    
System.out.println("The following are the goods that can be purchased with #"+ 200 );
System.out.println("minimie@#50\nCoke and Fanta(solo)@#100\nBeef roll@#50\nLa casera @120\n Bigger boy @#150 ");
        System.out.println("1.minimie\n2.Coke or Fanta\n3.Beef roll\n4.La casera\n5.Bigger boy ");
        d=dispenser.nextInt();
        if (d==1){
            System.out.println("Please wait... ");
            System.out.println("Kindly pick your minimie  ");
System.out.println("please input your account number?  ");
c=dispenser.nextInt();
System.out.println("Your #150 balance has been sent to the account number " + c );
System.out.println("Transaction completed  ");
   System.out.println("Hoping to seeing you some other time ");}
        else if (d==2){System.out.println("Please wait... ");
           System.out.println("Choose between fanta and coke\n1.Fanta\n2.Coke   ");
            e=dispenser.nextInt();
            if(e==1){
            System.out.println("Take your fanta");
               System.out.println("Transaction completed  ");
               System.out.println("please input your account number?  ");
c=dispenser.nextInt();
System.out.println("Your #100 balance has been sent to the account number " + c );

   System.out.println("Hoping to seeing you some other time ");}
            else {
                    System.out.println("Take your coke");
               System.out.println("Transaction completed  ");
               System.out.println("please input your account number?  ");
c=dispenser.nextInt();
System.out.println("Your #100 balance has been sent to the account number " + c );

   System.out.println("Hoping to seeing you some other time ");}
          
        }            
        else if(d==3){}
            
            
            
        }}}}}}
        
 