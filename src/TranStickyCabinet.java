/* 
Sticky Cabinet Class
Attributes:	
boolean clean: indicates if the cabinet is clean or not
boolean locked: indicates if the cabinet is locked or not
Methods:
void examine(): This will describe the cabinet. It will state if it is sticky  and if it is locked. If it is unlocked, it will read the writing in the cabinet.
void look(): This will tell the player that they are looking at the cabinet.
void cleanCabinet(boolean hasEquipment): If the player has the washing equipment, it will be able to wash the cabinet. It will then turn true that the cabinet is clean.
void unlockCabinet(boolean hasKey): If the player has the key and if the cabinet is clean, the cabinet will be unlocked.
*/
public class TranStickyCabinet
{
    //step 1: instance variables
    private boolean clean;
    private boolean locked;
    
    //step 2: constructors
    public TranStickyCabinet()
    {
        clean = false;
        locked = true;
    }
    public TranStickyCabinet(boolean c, boolean l)
    {
        clean = c;
        locked = l;
    }
    
    //step 3: toString method
    public String toString()
    {
        String output;
        if(clean == false && locked == true)
        {
            output = "Locked dirty cabinet";
        }
        else if(clean == true && locked == true)
        {
            output = "Locked clean cabinet";
        }
        else if(clean == true && locked == false)
        {
            output = "Unlocked clean cabinet";
        }
        else
            output = "It is not possible to have a dirty unlocked cabinet.";
        return output;
    }
    
    //step 4: Accessor and Mutator Methods
    public boolean getClean()
    {
        return clean;
    }
    public boolean getLocked()
    {
        return locked;
    }
    
    //step 5: Interesting Methods
    public void examine()
    {
        if(clean == false && locked == true)
        {
            System.out.println("There is a sticky, dirty cabinet that is locked.");
        }
        else if(clean == true && locked == true)
        {
            System.out.println("There is a shiny, clean cabinet that is locked.");
        }
        else if(clean == true && locked == false)
        {
            System.out.println("There is a shiny, clean cabinet that is unlocked with a message that reads: ");
            System.out.println("Enter the pin into the vending machine based on this question - What six-letter country creatd boba?");
        }
        else
            System.out.println("You cannot have a sticky, dirty cabinet that is unlocked.");
    }
    public void look()
    {
        System.out.println("- sticky cabinet");
    }
    public void cleanCabinet(boolean hasEquipment)
    {
        if(hasEquipment == true)
        {
            System.out.println("You have made the cabinet nice and shiny.");
            clean = true;
        }
        else
            System.out.println("You can't clean the cabinet with your spit and your bare hands, get some cleaning equipment ya nasty.");
            
    }
    public void unlockCabinet(boolean hasKey)
    {
        if(clean == true && hasKey == true)
        {
            System.out.println("You have successfully unlocked the cabinet!!!");
            locked = false;
        }
        else if(clean == false && hasKey == true)
            System.out.println("The cabinet is too sticky to unlock the cabinet. Try cleaning it!");
        else if(clean == true && hasKey == false)
            System.out.println("You don't have the key to open the cabinet.");
        else
            System.out.println("You don't have the key and the cabinet is too sticky.");
    }
    
    
}