
// Exercise Two
abstract class Vehicle {
    // Write a program that exemplifies the concept of inheritance.
   // Comment the program accordingly to describe your example.

    // declare attributes for our car
    double speed = 2;
    double acceleration = 6;
    double deceleration = 2.2;

    // Constructer
    Vehicle (double speed, double acceleration, double deceleration) {
        this.speed = speed;
        this.acceleration = acceleration;
        this.deceleration = deceleration;
    }

    // Methods
    public void accelerate (){
        speed += acceleration;
    }

    public void deceleration (){
        speed *= deceleration;
    }
// This subclass inherit the attributes and method from vehicle. it also has two  more attributes
    public class carOne extends Vehicle {
        private String colourOfCar = "blue";
        private String licens = "HP 50 009";
        public carOne (double speed, double acceleration, double deceleration){
            super (speed, acceleration, deceleration);
            this.speed = speed;
            this.acceleration = acceleration;
            this.deceleration = deceleration;
        }

    public class carTwo extends Vehicle {
        private String colourOfCar = "Pink";
        private String licens = "XD 20 876";

        public carTwo(double speed, double acceleration, double deceleration) {
            super(speed, acceleration, deceleration);
            this.speed = speed;
            this.acceleration = acceleration;
            this.deceleration = deceleration;


        }

      }

    }

}
