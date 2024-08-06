/*
Coupon
Attributes:
boolean clean: this will indicate if the coupon is wet or not.
Methods:
void examine(TranBlender b): The coupon will appear a message based on what step they are on in the blender. If they are on step 1 the message will read “buy one get chunky boba 50% off”, if they are on step 2 the message will read “buy one get one smooth boba 50% off”, if they are on step 3 the message will read “buy one get one hot boba 50% off”, and if they’ve completed all the steps the coupon will read there are no more offers. If the coupon was wet, the coupon will display the same messages, but upside down.
void look(): This will tell the player that there is a coupon.
void cleanCoupon(boolean hasEquipment): If the player has the equipment, it will wet the coupon and make the words upside down
*/
public class TranCoupon
{
    //step 1: instance variables
    private boolean clean;
    
    //step 2: constructors
    public TranCoupon()
    {
        clean = false;
    }
    public TranCoupon(boolean c)
    {
        clean = c;
    }
    
    //step 3: toString method
    public String toString()
    {
        String output;
        if(clean == true)
            output = "The coupon is wet.";
        else
            output = "The coupon is not wet.";
        return output;
    }
    //step 4: accessor methods
    public boolean getClean()
    {
        return clean;
    }
    //step 5: interesting methods
    public void examine(TranBlender b)
    {
        if(b.getStep() == 1)
        {
            if(clean == true)
            {
                System.out.println("This coupon reads: ɟɟo %0ϛ ɐqoq ʎʞunɥɔ ǝuo ʇǝƃ ǝuo ʎnq");
            }
            else
                System.out.println("This coupon reads: buy one get one chunky boba 50% off.");
        }
        else if(b.getStep() == 2)
        {
            if(clean == true)
                System.out.println("This coupon reads: ɟɟo %0ϛ ɐqoq ɥʇooɯs ǝuo ʇǝƃ ǝuo ʎnq");
            else
                System.out.println("This coupon reads: buy one get one smooth boba 50% off");
        }
        else if(b.getStep() == 3)
        {
            if(clean == true)
                System.out.println("This coupon reads: ɟɟo %0ϛ ɐqoq ʇoɥ ǝuo ʇǝƃ ǝuo ʎnq");
            else
                System.out.println("This coupon reads: buy one get one hot boba 50% off");
        }
        else
        {
            if(clean == true)
                System.out.println("sɹǝɟɟo ǝɹoɯ ou ǝɹɐ ǝɹǝɥ┴");
            else
                System.out.println("There are no more offers");
        }
            
    }
    public void look()
    {
        System.out.println("- coupon");
    }
    public void cleanCoupon(boolean hasEquipment)
    {
        if(hasEquipment == true)
        {
            System.out.println("Why would you do that? Now the words on the coupon are messed up >:(");
            clean = true;
        }
        else
        {
            System.out.println("You don't have the cleaning equipment to clean the coupon.");
        }
            
    }
}