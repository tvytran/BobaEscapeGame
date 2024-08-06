/*
Blender
Attributes:
int step: indicates which step the player is on to determine when they have successfully removed the juice in the blender.
int tries: The player is only allowed to press the buttons total of three. After three tries the room will fill up with the sticky liquid and the player will drown. 
boolean containsKey: indicates if the key is in the blender
Methods
void examine(): This will state that there is some green juice in the blender and there are six buttons that the player can press: chunky, smooth, hot, cold, and breakdown. Also that the player should press the buttons in a specific order
void look(): This will tell the player that there is a blender.
boolean pressButtons(String button): This will allow the player to press the buttons. The player has six tries. The number of tries will increase after every button pressed. It won’t tell you if the button you pressed was wrong. If the order of the buttons the player presses is correct, the step number will increase and containsKey will be true. The buttons allowed to be pressed are chunky, smooth, hot, cold, and breakdown. If breakdown is pressed, the room will break down and the game is over. However, if the breakdown button is pressed, but there’s a key inside, the game won’t be over
boolean takeKey(): After the player has pressed the correct order of button on the blender, the hasKey will turn true and if that is true, the player can use this method and take the key.

*/
public class TranBlender
{
    //step 1: instance variables
    private boolean containsKey;
    private int step;
    private int tries;
    
    //step 2: constructors
    public TranBlender()
    {
        containsKey = false;
        step = 1;
        tries = 0;
    }
    public TranBlender(boolean c, int s, int t)
    {
        containsKey = c;
        step = s;
        tries = t;
    }
    //step 3: toString method
    public String toString()
    {
        String output;
        if(containsKey == true)
            output = "The blender does have the key, the player is on step " + step + ", the player is on " + tries + " tries.";
        else
            output = "The blender does not have the key, the player is on step " + step + ", and the player is on " + tries + " tries.";
        return output;
    }
    
    //step 4: accessor methods
    public boolean getContainsKey()
    {
        return containsKey;
    }
    public int getStep()
    {
        return step;
    }
    public int getTries()
    {
        return tries;
    }
    
    //step 5: interesting methods
    public void examine()
    {
        if(containsKey == false && tries >= 3)
            System.out.println("The blender is broken.");
        else if(containsKey == false)
        {
            System.out.println("There are six buttons on the blender: hot, cold, chunky, smooth, and breakdown. You can press any button to mess with the purple goo in the blender.");
            System.out.println("However, you have to press the buttons in a certain order or the blender will break.");
        }
        else
            System.out.println("There's a key inside the blender.");
    }
    public void look()
    {
        System.out.println("- blender");
    }
    public boolean pressButtons(String button)
    {
        if(button.equals("smooth")|| button.equals("chunky") || button.equals("hot") || button.equals("cold") || button.equals("breakdown"))
        {
            if(button.equals("breakdown"))
            {
                if(tries < 3 && step < 3)
                {
                    System.out.println("KABOOM!!! The boba room explodes and you are smashed into little pieces. RIP hehe.");
                    tries = 3;
                    return false;
                }
                else
                {
                    System.out.println("You have broken the blender.");
                    return false;
                }
            }
            else if(step == 1 && tries < 3)
            {
                if(button.equals("chunky"))
                {
                    step++;
                    tries++;
                    System.out.println("You pressed " + button + ".");
                    return true;
                }
                else
                {
                    tries++;
                    System.out.println("You pressed " + button + ".");
                    return false;
                }
            }
            else if(step == 2 && tries < 3)
            {
                if(button.equals("smooth"))
                {
                    step++;
                    tries++;
                    System.out.println("You pressed " + button + ".");
                    return true;
                }
                else
                {
                    tries++;
                    System.out.println("You pressed " + button + ".");
                    return false;
                }
            }
            else if(step == 3 && tries < 3)
            {
                if(button.equals("hot"))
                {
                    step++;
                    tries++;
                    System.out.println("You have boiled all the purple goo out.");
                    containsKey = true;
                    return true;
                }
                else
                {
                    tries++;
                    System.out.println("You pressed " + button + ".");
                    return false;
                }
            }
            else if(tries >= 3)
            {
                System.out.println("Welp, you ran out of buttons to press smh.");
                return false;
            }
            else
            {
                System.out.println("You pressed " + button + ".");
                return false;
            }
        }
        else
        {
            System.out.println("This button doesn't exist dummy.");
            return false;
        }
            
        
    }
    public boolean takeKey()
    {
        if(containsKey == true)
        {
            System.out.println("You have successfully taken the key!!!");
            containsKey = false;
            return true;
        }
        else
        {
            System.out.println("What key are you talking about?");
            return false;
        }
    }
}