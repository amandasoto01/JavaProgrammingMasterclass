public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        //megabytes and remaining in kilobytes from the parameter
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
            //1mb son 1024 kb
            int megaBytes = (kiloBytes / 1024);
            int remaining = (kiloBytes % 1024);

            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and "+ remaining + " KB");
        }





    }
}
