public class Main {

    public static void main(String[] args) {

        double miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(10.5);

        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);

        System.out.println(BarkingDog.shouldWakeUp(true,-1));

        System.out.println(LeapYear.isLeapYear(-1600));

        System.out.println((int)(3.0* 1000));

        System.out.println(EqualSumChecker.hasEqualSum(1,-1,0));
    }
}
