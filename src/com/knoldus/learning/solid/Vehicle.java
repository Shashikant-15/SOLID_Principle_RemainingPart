package com.knoldus.learning.solid;
     /**
     * Represents a Vehicle having different  types.
     */
public class Vehicle {
    public void startEngine() throws Exception {
        System.out.println("Engine started");
    }
     /**
     * main method called from here
     * @param a reperesents arguments in main class
     */
    public static void main(String [] a) throws Exception {
        Vehicle veh = new Maruti400();
        veh.startEngine();

        Vehicle tst =new JCB();
        tst.startEngine();

        Vehicle boxer = new Bicycle();
        boxer.startEngine();

    }
}
    /**
     * Represents a Maruti400 having Engine type Vehicle
     */
class Maruti400 extends EngineVehicle{
    @Override
    public void startEngine() throws Exception{
        super.startEngine();
    }
}
    /**
     * Represents a JCB having Engine type Vehicle
     */
class JCB extends EngineVehicle{
    @Override
    public void startEngine() throws Exception{
        super.startEngine();
    }
}

//*****************************  Note ********************************************************
// we can apply Interface Segregation Principle here but i did't
// Because in this assignment the code is already given as throwing exception that's why i confused
// that i have to remove this code or just run this.

//  Note:  Hence if we want to apply ISP principle then i created two classes one for Engine vehicle
//  and the another one for non-engine vehicle.

// I have created another package named solidExample where i have applied five solid principles
// in this problem please check.

class Bicycle extends NonEngineVehicle{
    @Override
    public void startEngine() throws Exception{
        throw new Exception("Start Engine not supported in a Bicycle");
    }
}
