package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();
        Bird bird = new Bird();

        pollObj(queen);
        pollObj(worker);
        pollObj(drone);
        pollObj(bird);

        output("---------------------");

        // // -- Das geht nicht mehr --//
        // HoneyBee bee = new HoneyBee();
        // pollObj(bee);

    }

    //--- 3. Iteration :: Polymorphie ----- //

    private static void pollObj(HoneyBee obj) {
        output(obj.doYourJob());
        output(obj.fly());
        output("---------------------");
    }


    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

