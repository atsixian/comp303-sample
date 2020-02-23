package cad;

public class Driver {

    public static void main(String[] args) {

        Part door = new Door(1, 1);
        Part wheel = new Wheel(2, 2);
        Assembly assembly = new Assembly(door, wheel);
//        Or one by one if you like
//        assembly.addPart(door);
//        assembly.addPart(wheel);
        assembly.move(2, 2);
    }
}
