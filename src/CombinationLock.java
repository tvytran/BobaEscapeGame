/*
This must be used somewhere in your project.  You can decide to use it in Part 1 or Part 2.  
Create CombinationLock.java and copy and paste the code below into it.
*/




import java.util.Scanner;


// required - must use this class at least once
public class CombinationLock
{
    private String combination,hint;
    private boolean openFlag;
    
    // Constructor
    // The combination is required when creating this object
    // The hint is also required.  This can be something like the format for what should be entered.
    //    For example:  (format: ##-##-##)
    //    Leave the hint blank if you don't want to use this.
    public CombinationLock(String argCombination)
    {
        // Set the combination.
        combination = argCombination;
        
        // Set the hint
        hint = "";
        
        // This starts out being locked.
        openFlag = false;
    } // end constructor
    // The combination is required when creating this object
    // The hint is also required.  This can be something like the format for what should be entered.
    //    For example:  (format: ##-##-##)
    //    Leave the hint blank if you don't want to use this.
    public CombinationLock(String argCombination, String argHint)
    {
        // Set the combination.
        combination = argCombination;
        
        // Set the hint
        hint = argHint;
        
        // This starts out being locked.
        openFlag = false;
    } // end constructor
    
    // This method will prompt the player for the combination and possibly unlock the combination lock.
    // It will return true if successful, false if not.
    public boolean unlock()
    {
        // If the lock is already open, nothing should be done.
        if (openFlag) return openFlag;
        
        // Prompt the player for the combination
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the combination " + hint + ":  ");
        String enteredCombination = in.nextLine();
        
        // Check if the combination is correct
        if (enteredCombination.equals(combination))
        {
            // The combination is correct.
            openFlag = true;
        }
        
        // Return the status of the lock.
        return openFlag;
    } // end unlock
    
    // This method will return the status of the lock.
    // TRUE if unlocked, FALSE if locked.
    public boolean isUnlocked()
    {
        return openFlag;
    } // end isUnlocked
       //accessor method for the hint
    public String getHint()
    {
        return hint;
    }   
} // end class CombinationLock