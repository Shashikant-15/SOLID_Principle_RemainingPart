package com.knoldus.learning.SOLID_Principle_Explain;

 /**
 *Here I am implementing all the five principles of SOLID using MainVehicleClass
 */
class MainVehicleClass {
    /**
     *  main method called to implement Vehicle  associated with Vehicle Types.
     * @param args arguments passes to method
     */
    public static void main(String[] args) {
        Vehicle car = new Maruti400();
        car.start();
        Vehicle bicycle =new Bicycle();
        bicycle.start();
    }
}

public interface Vehicle {
    void start();
}


 /** 
 * interface  For engine vehicles
 */
 interface EngineVehicle extends Vehicle{
    void start();
}


/** 
 * interface For non engine vehicle
 */
interface NonEngineVehicle extends Vehicle{
    void start();
}

class Maruti400 implements EngineVehicle{
    @Override
    public void start() {
        System.out.println("Engine has been Started");
    }
}

class Bicycle implements NonEngineVehicle{

    @Override
    public void start() {
        System.out.println("Cycle is running");
    }
}
