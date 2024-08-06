public class TranProjDriver
{
    public static void main (String[] args)
    {
        //testing the StickyCabinet class
        //testing the constructors and toString method
        TranStickyCabinet sc1 = new TranStickyCabinet();
        System.out.println("sc1 = " + sc1);
        
        TranStickyCabinet sc2 = new TranStickyCabinet(true, false);
        System.out.println("sc2 = " + sc2);
        
        TranStickyCabinet sc3 = new TranStickyCabinet(false, false);
        System.out.println("sc3 = " + sc3);
        
        TranStickyCabinet sc4 = new TranStickyCabinet();
        System.out.println("sc4 = " + sc4);
        
        //testing the examine method
        System.out.println(" ");
        sc1.examine();
        sc2.examine();
        sc3.examine();
        
        //testing the look method
        System.out.println(" ");
        sc1.look();
        sc2.look();
                 
        
        //testing the washCabinet method
        System.out.println(" ");
        sc1.cleanCabinet(true);
        System.out.println("sc1 = " + sc1);
        sc4.cleanCabinet(false);
        System.out.println("sc4 = " + sc4);
        
        //testing the unlockCabinet method
        System.out.println(" ");
        sc1.unlockCabinet(true);
        System.out.println("sc1 = " + sc1);
        sc3.unlockCabinet(true);
        
        //==========================================================
        System.out.println("===================================================================================== ");
        //testing the VendingMachine class
        //testing the constructors and toString method
        TranVendingMachine vm1 = new TranVendingMachine();
        System.out.println("vm1 = " + vm1);
        
        TranVendingMachine vm2 = new TranVendingMachine(true, false, new CombinationLock("apple"), true);
        System.out.println("vm2 = " + vm2);
        
        TranVendingMachine vm3 = new TranVendingMachine(true, true, new CombinationLock("peas"), false);
        System.out.println("vm3 = " + vm3);
        
        TranVendingMachine vm4 = new TranVendingMachine(true, false, new CombinationLock("tags"), false);
        System.out.println("vm4 = " + vm4);
        
        TranVendingMachine vm5 = new TranVendingMachine(true, true, new CombinationLock("hehe"), false);
        System.out.println("vm5 = " + vm5);
        
        TranVendingMachine vm6 = new TranVendingMachine(false, false, new CombinationLock("lol"), true);
        System.out.println("vm6 = " + vm6);
        
        TranVendingMachine vm7 = new TranVendingMachine();
        
        //testing the look method
        System.out.println(" ");
        vm1.look();
        vm2.look();
        
        //testing the examine method
        System.out.println(" ");
        vm1.examine();
        vm2.examine();
        vm3.examine();
        
        //testing the openDoor method
        System.out.println(" ");
        vm1.openDoor();
        vm1.examine();
        vm1.openDoor();
        vm2.openDoor();
        
        //testing the takeEquipment method
        System.out.println(" ");
        boolean tookEquip = vm1.takeEquipment();
        System.out.println("tookEquip = " + tookEquip);
        boolean tookEquip2 = vm1.takeEquipment();
        System.out.println("tookEquip2 = " + tookEquip2);
        boolean tookEquip3 = vm2.takeEquipment();
        System.out.println("tookEquip3 = " + tookEquip3);
        
        //testing the enterPin method
        System.out.println(" ");
        //uncomment when testing
        //vm1.enterPin(); //enter correct pin "Taiwan"
        //vm7.enterPin(); //enter wrong pin 
        
        //testing the drink boba method
        boolean db1 = vm1.drinkBoba();
        System.out.println("db1 = " + db1);
        boolean db2 = vm7.drinkBoba();
        System.out.println("db2 = " + db2);
        //==========================================================
        System.out.println("===============================================");
        //testing the Blender class
        //testing the constructors and toString method
        TranBlender b1  = new TranBlender();
        System.out.println("b1 = " + b1);
        
        TranBlender b2 = new TranBlender(false, 1, 1);
        System.out.println("b2 = " + b2);
        
        TranBlender b3 = new TranBlender();
        System.out.println("b3 = " + b3);
        
        //testing the examine method
        System.out.println(" ");
        b1.examine();
        b2.examine();
        
        //testing the look method
        System.out.println(" ");
        b1.look();
        b2.look();
        
        //testing the takeKey method
        System.out.println(" ");
        boolean tk1 = b1.takeKey();
        System.out.println("tk1 = " + tk1);
        boolean tk2 = b2.takeKey();
        System.out.println("tk2 = " + tk2);
        
        //testing the pressButtons method :(
        System.out.println(" ");
        boolean button1 = b1.pressButtons("chunky");
        System.out.println("button1 = " + button1);
        System.out.println("b1 = " + b1);
        boolean button2 = b1.pressButtons("smooth");
        System.out.println("button2 = " + button2);
        System.out.println("b1 = " + b1);
        boolean button3 = b1.pressButtons("hot");
        System.out.println("button3 = " + button3);
        System.out.println("b1 = " + b1);
        boolean button4 = b1.pressButtons("cold");
        System.out.println("button4 = " + button4);
        System.out.println("b1 = " + b1);
        b1.examine();
        boolean tk3 = b1.takeKey();
        System.out.println("tk3 = " + tk3);
        boolean tk4 = b1.takeKey();
        System.out.println("tk4 = " + tk4);
        b1.examine();
       
        System.out.println(" ");
        boolean button5 = b3.pressButtons("chunky");
        System.out.println("button5 = " + button5);
        System.out.println("b3 = " + b3);
        boolean button6 = b3.pressButtons("cold");
        System.out.println("button6 = " + button6);
        System.out.println("b3 = " + b3);
        boolean button7 = b3.pressButtons("hot");
        System.out.println("button7 = " + button7);
        System.out.println("b3 = " + b3);
        boolean button8 = b3.pressButtons("cold");
        System.out.println("button8 = " + button8);
        System.out.println("b3 = " + b3);
        b3.examine();
        boolean tk5 = b3.takeKey();
        System.out.println("tk5 = " + tk5);
        
        System.out.println(" ");
        System.out.println("b2 = " + b2);
        boolean button9 = b2.pressButtons("breakdown");
        System.out.println("b2 = " + b2);
        boolean button10 = b2.pressButtons("cold");
        boolean button11 = b3.pressButtons("breakdown");
        boolean button12 = b3.pressButtons("bob");
        
        //=============================================================
        System.out.println("=====================================================================================");
        //testing the Coupon class
        //testing the constructors and toString method
        TranCoupon c1 = new TranCoupon();
        System.out.println("c1 = " + c1);
        
        TranCoupon c2 = new TranCoupon(true);
        System.out.println("c2 = " + c2);
        
        TranCoupon c3 = new TranCoupon();
        System.out.println("c3 = " + c3);
        
        //testing the look method
        System.out.println(" ");
        c1.look();
        c2.look();  
        
        //testing the clean method
        System.out.println("");
        c1.cleanCoupon(false);
        c1.cleanCoupon(true);
        System.out.println("c1 = " + c1);
        
        //testing the examine method
        System.out.println(" ");
        TranBlender b4 = new TranBlender();
        c1.examine(b4);
        c3.examine(b4);
        
        System.out.println("b4 = " + b4);
        boolean button13 = b4.pressButtons("chunky");
        c1.examine(b4);
        c3.examine(b4);
        System.out.println("b4 = " + b4);
        boolean button14 = b4.pressButtons("smooth");
        c1.examine(b4);
        c3.examine(b4);
        System.out.println("b4 = " + b4);
        boolean button15 = b4.pressButtons("hot");
        c1.examine(b4);
        c3.examine(b4);
        System.out.println("b4 = " + b4);
        boolean button16 = b4.pressButtons("cold");
        
        System.out.println(" ");
        TranBlender b5 = new TranBlender();
        System.out.println("b5 = " + b5);
        c1.examine(b5);
        c3.examine(b5);
        boolean button17 = b5.pressButtons("smooth");
        System.out.println("b5 = " + b5);
        c1.examine(b5);
        c3.examine(b5);
        boolean button18 = b5.pressButtons("chunky");
        c1.examine(b5);
        c3.examine(b5);
        boolean button19 = b5.pressButtons("hot");
        c1.examine(b5);
        c3.examine(b5);
        boolean button20 = b5.pressButtons("cold");
        boolean button21 = b5.pressButtons("hehe");
        
        System.out.println(" ");
        TranBlender b6 = new TranBlender();
        System.out.println("b6 = " + b6);
        TranCoupon c4 = new TranCoupon();
        c4.examine(b6);
        boolean button22 = b6. pressButtons("chunky");
        c4.cleanCoupon(true);//cleaning coupon in the middle of pressing buttons
        c4.examine(b6);
        boolean button24 = b6.pressButtons("smooth");
        c4.examine(b6);
        boolean button25 = b6.pressButtons("hot");
        c4.examine(b6);
        b6.takeKey();
        
        
    }
}
