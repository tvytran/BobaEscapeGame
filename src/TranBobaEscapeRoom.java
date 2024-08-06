/*
    I have accomplished making the game user friendly by allowing the player to 
    - wash or clean the cabinet/coupon
    - unlock or open the cabinet/door
    - take or grab the key /equipment
    - take, drink, or grab the boba to end the game
    - enter or type the pin 
    - push or press the buttons on the blender
*/
import java.util.Scanner;

public class TranBobaEscapeRoom
{
    //step 1: instance variables
    private TranBlender theBlender;
    private TranCoupon theCoupon;
    private TranStickyCabinet theCabinet;
    private TranVendingMachine theVendingMachine;
    private boolean hasKey;
    private boolean hasBoba;
    private boolean hasCleaningEquipment;
    private boolean gameOver;
    private int endMessage;
    
    //step 2: constructors
    public TranBobaEscapeRoom()
    {
        theBlender = new TranBlender();
        theCoupon = new TranCoupon();
        theCabinet = new TranStickyCabinet();
        theVendingMachine = new TranVendingMachine();
        hasKey = false;
        hasBoba = false;
        hasCleaningEquipment = false;
        gameOver = false;
        endMessage = 0;
                
    }
    
    //step 5:
    
    public void start()
    {
        Scanner inScanner = new Scanner(System.in);
        String nextLine;
        String verb;
        String noun;
        int spacePos;
        
        System.out.println("Welcome to the Boba Room!!!");
        System.out.println("You were kidnapped and put in a boba shaped room with tapioca balls on the walls and sticky brown liquid on the floor.");
        System.out.println("There is a vending machine with boba drinks.");
        System.out.println("When you enter the correct pin, you will receive a boba drink that will teleport you back to home when you drink it.");
        System.out.println("You can type one or two word commands to figure out how to get out.");
        System.out.println("Type \"help\" if you would like to know what commands you can give.");
        
        while(!gameOver)
        {
            System.out.println("============================================================");
            System.out.print("Please enter a command: ");
            
            nextLine = inScanner.nextLine();
            spacePos = nextLine.indexOf(" ");
            if(spacePos < 0)
            {
                verb = nextLine;
                noun = ""; 
            }
            else
            {
                verb = nextLine.substring(0, spacePos);
                noun = nextLine.substring(spacePos + 1);
                
            }
            
            if(verb.equalsIgnoreCase("quit"))
            {
                gameOver= true;
                endMessage++;
            }
            else if(verb.equalsIgnoreCase("help"))
            {
                System.out.println("Commands that may be used: help, look, quit, examine, enter, type, open, take, grab, press, push, unlock, drink, wash, and clean.");
                                                               //     //   //     //       //     //    //      //     //   //          //
            }
            else if(verb.equalsIgnoreCase("look"))
            {
                this.lookAround();
            }
            else if(verb.equalsIgnoreCase("open") || verb.equalsIgnoreCase("unlock"))
            {
                if(noun.equalsIgnoreCase("door"))
                    theVendingMachine.openDoor();
                else if(noun.equalsIgnoreCase("cabinet"))
                    theCabinet.unlockCabinet(hasKey);
                else if(noun.equalsIgnoreCase("machine"))
                {
                    System.out.print("Type \"pin\" to enter the pin or type \"door\" to open the side door: ");
                    String word;
                    Scanner anotherScanner = new Scanner(System.in);
                    word = anotherScanner.nextLine(); 
                    if(word.equals("pin"))
                    {
                        if(theCabinet.getLocked() == false)
                            theVendingMachine.enterPin();
                        else 
                            System.out.println("You haven't opened the cabinet, how do you know the pin already?");
                    }
                    else if(word.equals("door"))
                        theVendingMachine.openDoor();
                    else
                        System.out.println("You typed an invalid word, just follow the directions very simple.");
                }
                else
                    System.out.println("You can't open or unlock the " + noun);
            }
            else if(verb.equalsIgnoreCase("examine"))
            {
                if(noun.equalsIgnoreCase("machine"))
                    theVendingMachine.examine();
                else if(noun.equalsIgnoreCase("cabinet"))
                    theCabinet.examine();
                else if(noun.equalsIgnoreCase("blender"))
                    theBlender.examine();
                else if(noun.equalsIgnoreCase("coupon"))
                    theCoupon.examine(theBlender); 
                else
                    System.out.println("You can't examine the " + noun);
            }
            else if(verb.equalsIgnoreCase("take") || verb.equalsIgnoreCase("grab"))
            {
                if(noun.equalsIgnoreCase("key"))
                {
                    if(theBlender.takeKey() == true)
                        hasKey = true;
                }
                else if(noun.equalsIgnoreCase("equipment"))
                {
                    if(theVendingMachine.takeEquipment() == true)
                        hasCleaningEquipment = true;
                }
                else if(noun.equalsIgnoreCase("boba"))
                {
                    if(theVendingMachine.drinkBoba() == true)
                    {
                        hasBoba = true;
                        gameOver = true;
                    }
                }
                else if(noun.equalsIgnoreCase("machine"))
                {
                    System.out.println("You weakling, this vending machine is too heavy for you.");
                }
                else if(noun.equalsIgnoreCase("blender"))
                {
                    System.out.println("You attempt to take the blender, but it instantly teleports back to the same spot haha.");
                }
                else if(noun.equalsIgnoreCase("cabinet"))
                {
                    System.out.println("Why are you trying to take a cabinet for? You failed anyway dumbo.");
                }
                else if(noun.equalsIgnoreCase("coupon"))
                    System.out.println("Are you that blind that you need to move it closer to read it?");
                else
                    System.out.println("You can't take the " + noun);
            }
            else if(verb.equalsIgnoreCase("clean") || verb.equalsIgnoreCase("wash"))
            {
                if(noun.equalsIgnoreCase("coupon"))
                {
                    theCoupon.cleanCoupon(hasCleaningEquipment);
                }
                else if(noun.equalsIgnoreCase("cabinet"))
                    theCabinet.cleanCabinet(hasCleaningEquipment);
                else
                    System.out.println("You can't clean the " + noun + ".");
            }
            else if(verb.equalsIgnoreCase("drink"))
            {
                if(noun.equalsIgnoreCase("boba"))
                {
                    if(theVendingMachine.drinkBoba() == true)
                    {
                        hasBoba = true;
                        gameOver = true;
                    }
                }
                else
                    System.out.println("You can't drink the " + noun);
            }
            else if(verb.equalsIgnoreCase("enter") || verb.equalsIgnoreCase("type"))
            {
                if(noun.equalsIgnoreCase("pin"))
                {
                    if(theCabinet.getLocked() == false)
                        theVendingMachine.enterPin();
                    else 
                        System.out.println("You haven't opened the cabinet, how do you know the pin already?");
                }
                else if(noun.equalsIgnoreCase("door"))
                {
                    System.out.println("You're too big to go in here. You is funny.");
                }
                else
                    System.out.println("You can't enter the " + noun);
                
            }
            else if(verb.equalsIgnoreCase("press") || verb.equalsIgnoreCase("push"))
            {
                if(theBlender.getStep() <= 3 && noun.equalsIgnoreCase("breakdown"))
                {
                    theBlender.pressButtons(noun);
                    gameOver = true;
                    endMessage++;
                }
                else if(theBlender.getStep() > 3 && noun.equalsIgnoreCase("breakdown"))
                {
                    theBlender.pressButtons(noun);
                    System.out.println("But you may continue...");
                }
                else if(theBlender.getStep() == 3 && theBlender.getTries() == 3)
                {
                    gameOver = true;
                    endMessage++;
                    System.out.println("You didn't press the correct order of buttons, so disappointing.");
                }
                else if(theBlender.getStep() < 3 && theBlender.getTries() >=  2)
                {
                    System.out.println("You didn't press the correct order of buttons, so disappointing.");
                    gameOver = true;
                    endMessage++;
                }
                else
                    theBlender.pressButtons(noun);
            }
            else
                System.out.println("That command isn't valid dummy.");
        }
       if(endMessage == 0)
            System.out.println("You won!!! Thanks for playing :)");
       else
            System.out.println("Haha, you lost. Take the L.");
    }
    
    public void lookAround()
    {
        System.out.println("In this room, there is a...");
        theCoupon.look();
        theBlender.look();
        theCabinet.look();
        theVendingMachine.look();
        
    }
    
}