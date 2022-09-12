import java.util.Random;
import java.time.Instant;			
//import java.time.temporal.Temporal;
import java.time.temporal.ChronoUnit; 

/*
 * 
 * This program utilizes Radix to sort arrays of various sizes
 * 
 */

public class Main {
    public static void main(String[] args) {
        RadixSort rx = new RadixSort();
        Random randGen = new Random();
        int rand8DigitNum;
        Instant beg, end;
        
        System.out.println("TEST: Before Sorting");
        for (int i = 0; i < 10; i++) 
        {
            rand8DigitNum = randGen.nextInt(90000000)+10000000;
            System.out.println(rand8DigitNum);
            rx.setBin(rand8DigitNum);
        }

        for (int pass = 0; pass < 10; pass++) 
        {
            rx.startSorting(pass);
            rx.combineAllBins();
        }
        System.out.println("TEST: After Sorting");
        rx.printAndEmptyFullBin(); //sorted
///////////////////////////////////////////////////////////////////

        for (int sizeToBeOrdered = 100000; sizeToBeOrdered < 1000001; sizeToBeOrdered += 100000)
        {
            for (int randNum = 0; randNum < sizeToBeOrdered; randNum++)
            {
                rand8DigitNum = randGen.nextInt(90000000)+10000000;
                rx.setBin(rand8DigitNum);
            }
            System.out.println("Queue of Size: " + sizeToBeOrdered);

            beg = Instant.now();
            for (int pass = 0; pass < 10; pass++) 
            {
                rx.startSorting(pass);
                rx.combineAllBins();
            }
            end = Instant.now();
            Long totalTimeToSort = ChronoUnit.MILLIS.between(beg,end);
            System.out.println("Time to Sort: " + totalTimeToSort + " Micro Seconds.");
            rx.emptyFullBin();

        }    
    }
}