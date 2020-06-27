package com.company;

public class Main {
    static class Car{
        private String name;
        private boolean engine;
        private int cylinders;
        private int wheels;

        public Car(String name, int cylinders) {
            this.name = name;
            this.engine = true;
            this.cylinders = cylinders;
            this.wheels = 4;
        }

        public String getName() {
            return name;
        }

        public boolean isEngine() {
            return engine;
        }

        public int getCylinders() {
            return cylinders;
        }

        public int getWheels() {
            return wheels;
        }

        public String startEngine(){
            return "Starting engine";
        }

        public String accelerate(){
            return "Accelerating";
        }

        public String brake(){
            return "Brake";
        }
    }

    static class Mazda extends Car{

        public Mazda(String name, int cylinders) {
            super(name, cylinders);
        }

        @Override
        public String startEngine() {
            return getClass().getSimpleName() + "Starting mazda";
        }

        @Override
        public String accelerate() {
            return getClass().getSimpleName() + "Accelerating mazda";
        }

        @Override
        public String brake() {
            return getClass().getSimpleName() +"stopping mazda";
        }
    }

    static class Mercedes extends Car{

        public Mercedes(String name, int cylinders) {
            super(name, cylinders);
        }

        @Override
        public String startEngine() {
            return getClass().getSimpleName() + "Starting mercedes";
        }

        @Override
        public String accelerate() {
            return getClass().getSimpleName() + "Accelerating Mercedes";
        }

        @Override
        public String brake() {
            return getClass().getSimpleName() + "Stopping Mercedes";
        }
    }

    static class Toyota extends Car{

        public Toyota(String name, int cylinders) {
            super(name, cylinders);
        }

        @Override
        public String startEngine() {
            return getClass().getSimpleName() + "Starting toyota";
        }

        @Override
        public String accelerate() {
            return getClass().getSimpleName() +" AcceleratingToyota";
        }

        @Override
        public String brake() {
            return getClass().getSimpleName() + " Stopping Toyota";
        }
    }
    public static void main(String[] args) {
	// write your code here

        Car car = new Car("Base car",8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mazda mazda = new Mazda("Mazda 3", 3);
        System.out.println(mazda.startEngine());
        System.out.println(mazda.accelerate());
        System.out.println(mazda.brake());
    }
}
