import java.util.Scanner;

public class MohammadAldawaghrehProblemSet1
{
    static Scanner sc;

    public static void orderChecker()
    {
      int bolts;
      int nuts;
      int washers;
      final int boltsPrice = 5;
      final int nutsPrice = 3;
      final int washersPrice = 1;
      int total = 0;

      System.out.print("Number of bolts: ");
      bolts = sc.nextInt();
      
      System.out.print("Number of nuts: ");
      nuts = sc.nextInt();
      
      System.out.print("Number of washers: ");
      washers = sc.nextInt();
      
      System.out.println();
      
      //checks the order of the bolts, nuts, and washers and outputs the result based on the criteria given
      //checks if there are more bolts than nuts
      if(nuts < bolts )
        System.out.println("Check the Order: too few nuts");
      
      //checks if there are twice as many washers as bolts
      if(washers < 2 * bolts)
        System.out.println("Check the Order: too few washers");
      
      if ( nuts >= bolts && washers >= 2 * bolts )
        System.out.println("Order is OK.");
      
      //calculates total price of order  
      total = (bolts*boltsPrice)+(nuts*nutsPrice)+(washers*washersPrice);
      System.out.println();
      System.out.println ("Total Cost: " + total);
      System.out.println ("");
      
    }

    
        public static void fantasyGame()
    {
        
        Scanner sc = new Scanner ( System.in );
        
        int strength, health, luck, total;
        String name;
        
        System.out.println ("Welcome to Yertle's Quest");
        System.out.println ("Enter the name of your character:");
        name = sc.nextLine();
        
        System.out.println ("Enter stength (1-10):");
        strength = sc.nextInt();
        
        System.out.println ("Enter health (1-10):");
        health = sc.nextInt();
        
        System.out.println ("Enter luck (1-10):");
        luck = sc.nextInt();
        
        //calculates total value for stats
        total = strength + luck + health;
        
        //checks if the total stats are more than 15 
        if ( total > 15 )
        {
        System.out.println ("You have given your character too many points! Default values have been assigned: \nName " + name + ", strength: 5, health: 5, luck: 5");
        System.out.println("");
        }
        else {
        System.out.println ("--Characters Stats:--");
        System.out.println ("You have given your character the following: \nName: " + name + ", strength: " + strength + ", health: " + health + ", luck: " + luck);
        }
        System.out.println("");
    }

    
        public static void moreTirePressure()
    {
      
       boolean pressureCheck = true;
       
       int rightFront, leftFront, leftRear, rightRear;
       
       System.out.println ("Input right front pressure");
       rightFront = sc.nextInt();
       //checks tire pressure range
       if ( rightFront < 35 || rightFront > 45 )
       {
       pressureCheck = false;
       System.out.println ("Warning: pressure is out of range");
      }
     
       
       System.out.println ("Input left front pressure");
       leftFront = sc.nextInt();
       //checks tire pressure range
       if ( leftFront < 35 || leftFront > 45 )
       {
       pressureCheck = false;
       System.out.println ("Warning: pressure is out of range");
       }
 
       System.out.println ("Input right rear pressure");
       rightRear = sc.nextInt();
       //checks tire pressure range
       if ( rightRear < 35 || rightRear > 45 )
       {
       pressureCheck = false;
       System.out.println ("Warning: pressure is out of range");}
      
       System.out.println ("Input left rear pressure");
       leftRear = sc.nextInt();
       //checks tire pressure range
       if ( leftRear < 35 || leftRear > 45 )
       {
       pressureCheck = false;
       System.out.println ("Warning: pressure is out of range");
       }
       System.out.println("");
       //checks if tires match pressures in the front and rear and if pressure is within range
       if ( pressureCheck && rightFront == leftFront && leftRear == rightRear )
       {
       System.out.println ("Inflation is OK");
       }
       else
       {
       System.out.println ("Inflation is BAD");
       }   
       System.out.println("");
    }
    
 public static void main (String[] args)
    {
        sc = new Scanner (System.in); 
        int choice;
        do
        {
            System.out.println ("Problem Set #1");
            System.out.println ("--------------");
            System.out.println ("1. Order Checker");
            System.out.println ("2. Fantasy Game");
            System.out.println ("3. More Tire Pressure");
            System.out.println ("0. Quit");
            choice = sc.nextInt();

            if (choice == 1)
                orderChecker(); 
            else if (choice == 2)
                 fantasyGame(); 
            else if (choice == 3)
                moreTirePressure();

        }
        while (choice != 0); // exit when 0       
    } // main method
} // ProblemSet4 class
