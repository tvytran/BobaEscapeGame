/*
Vending Machine Class
Attributes:
boolean containsEquipment: indicates if the vending machine has the washing equipment
boolean open: indicates if the vending machine side door is opened
CombinationLock pin: The CombinationLock class will be used here
boolean containsBoba: indicates if the boba has been dispensed for the to take
Methods
void examine(): If the vending machine has dispensed a boba drink, it will tell the player to drink it, if not this will tell the player that there is a closed or open  door on the side of the vending machine and the vending machine is filled with boba drinks. There’s also a six letter pin that needs to be entered to receive a boba drink. If the door is open and has the cleaning equipment, then it will also tell the player that there is cleaning equipment inside.
void look(): This will state that the player is looking at the vending machine.
void openDoor(): The player will be able to open the door if the vending machine door is closed. If it is open, then the player won’t be able to open the door again.
boolean takeEquipment(): If the door is open and there is cleaning equipment inside, the player will be able to take it.  	
boolean enterPin(): The pin will be entered here and a boba will dispense.
boolean drinkBoba(): After the boba dispenses the player can drink it and get teleported back home


*/
public class TranVendingMachine
{
    //step 1: instance variables
    private boolean containsEquipment;
    private boolean open;
    private CombinationLock pin;
    private boolean containsBoba;
    
    
    //step 2: constructors
    public TranVendingMachine()
    {
        containsEquipment = true;
        open = false;
        pin = new CombinationLock("Taiwan");
        containsBoba = false;
    }
    public TranVendingMachine(boolean o, boolean ce, CombinationLock p, boolean cb)
    {
        open = o;
        containsEquipment = ce;
        pin = p;
        containsBoba = cb;
    }
    
    //step 3: toString method
    public String toString()
    {
        String output;
        if(open == false)
        {
            if(containsBoba == true)
                output = "Closed side door with a pin and has boba dispensed.";
            else
                output = "Closed side door with a pin and has no boba dispensed.";//
        }
        else if(containsEquipment == true && open == true)
        {
            if(containsBoba == true)
                output = "Open side door with cleaning equipment inside with a pin and has boba dispensed.";//
            else
                output = "Open side door with cleaning equipment inside with a pin and has no boba dispensed.";//
        }
        else
        {
            if(containsBoba == true)
                output = "Open side door with no cleaning equipment inside with a pin and has boba dispensed.";//
            else
                output = "Open side door with no cleaning equipment inside with a pin and has no boba dispensed.";//
            
        }
        return output;
        
        
    }
    
    //step 4: Accessor and Mutator methods
    public boolean getContainsEquipment()
    {
        return containsEquipment;
    }
    public boolean getOpen()
    {
        return open;
    }
    public CombinationLock getPin()
    {
        return pin;
    }
    public boolean getContainsBoba()
    {
        return containsBoba;
    }
    
    //step 5: interesting methods
    public void look()
    {
        System.out.println("- vending machine");
    }
    public void examine()
    {
        if(containsBoba == true)//other information isn't neccessary since player got the pin and could just get out now
            System.out.println("A boba was dispensed, you should drink it to get out of here.");
        else if(open == false)
            System.out.println("There is a vending machine filled with various boba drinks that needs a pin to receive a drink and a closed door on the side of it.");
        else if(open == true && containsEquipment == true)
            System.out.println("There is a vending machine filled with various boba drinks that needs a pin to receive a drink and an open door on the side of it. You see cleaning equipment inside.");
        else
            System.out.println("There is a vending machine filled with various boba drinks that needs a pin to receive a drink and an open door on the side of it. There is nothing inside.");
    }
    public void openDoor()
    {
        if(open == false)
        {
            System.out.println("You have successfully opened the side door of the vending machine!!!");
            open = true;
        }
        else
            System.out.println("The door is already open silly.");
    }
    public boolean takeEquipment()
    {
        if(open == true && containsEquipment == true)
        {
            System.out.println("You have successfully taken the cleaning equipment. Now you can make things shiny!");
            containsEquipment = false;
            return true;
        }
        else if(open == true && containsEquipment == false)
        {
            System.out.println("Sadly there is no cleaning equipment in here.");
            return false;
        }
        else
        {
            System.out.println("The vending machine door is closed and you could not take the cleaning equipment.");
            return false;
        }
    }
    public boolean enterPin()
    {
        boolean success = pin.unlock();
        if(success == true)
        {
            System.out.println("Yaayyyy you entered the correct pin and a boba dispenses!!!");
            containsBoba = true;
            return true;
        }
        else
        {
            System.out.println("Lol you suck, you entered the wrong pin, smh.");
            containsBoba = false;
            return false;
        }
    }
    public boolean drinkBoba()
    {
        if(containsBoba == true)
        {
            System.out.println("Yaaassssss you drank the boba and got teleported home!!!");
            containsBoba = false;
            return true;
        }
        else
        {
            System.out.println("There's no boba anywhere dummy.");
            return false;
        }
        
    }
}