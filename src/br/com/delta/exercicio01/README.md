# Exercício 01

Given the code. What is the result?
class Vehicle {
    public void printSound() {
        System.out.print("vehicle");
    }
}

class Car extends Vehicle {
    public void printSound() {
        System.out.print("car");
    }
}

class Bike extends Vehicle {
    public void printSound() {
        System.out.print("bike");
    }
}

public class Test {
    public static void main(String[] args) {
        Vehicle v = new Car();
        Bike b = (Bike) v;
        
        v.printSound();
        b.printSound();
    }   
}
 A) Compilation fails.
 B) An exception is thrown at runtime.
 C) "vehiclecar" is printed.
 D) "vehiclebike" is printed.
 E) "carcar" is printed.
 F) "bikebike" is printed