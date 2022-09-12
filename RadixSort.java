import java.util.LinkedList;
import java.util.Queue;

public class RadixSort {
    private Queue<Integer> fullBin = new LinkedList<Integer>();
    private Queue<Integer> digitBin0 = new LinkedList<Integer>();
    private Queue<Integer> digitBin1 = new LinkedList<Integer>();
    private Queue<Integer> digitBin2 = new LinkedList<Integer>();
    private Queue<Integer> digitBin3 = new LinkedList<Integer>();
    private Queue<Integer> digitBin4 = new LinkedList<Integer>();
    private Queue<Integer> digitBin5 = new LinkedList<Integer>();
    private Queue<Integer> digitBin6 = new LinkedList<Integer>();
    private Queue<Integer> digitBin7 = new LinkedList<Integer>();
    private Queue<Integer> digitBin8 = new LinkedList<Integer>();
    private Queue<Integer> digitBin9 = new LinkedList<Integer>();

    public int findModulo(Integer currNumber, int passNumber){
        double florDiv = (currNumber / Math.pow(10, passNumber));
        int mod = (int) florDiv % 10;
        return mod;
    }

    public void startSorting(int pass){
        //int i = 0;
        while (!fullBin.isEmpty()){
            int currNum = fullBin.remove();
            //System.out.println("Sorting Pass #" + i);
            //System.out.println(currNum);
            int mod = findModulo(currNum, pass);
            sortIntoBin(currNum, mod);
            //i++;
        }
    }

    public void setBin(int curGeneratedRandomNum){
        fullBin.add(curGeneratedRandomNum);
    }

    public void sortIntoBin(Integer numToBeSorted, int modNumber){
        //System.out.println("Sorted");
        if (modNumber == 0){digitBin0.add(numToBeSorted);}
        if (modNumber == 1){digitBin1.add(numToBeSorted);}
        if (modNumber == 2){digitBin2.add(numToBeSorted);}
        if (modNumber == 3){digitBin3.add(numToBeSorted);}
        if (modNumber == 4){digitBin4.add(numToBeSorted);}
        if (modNumber == 5){digitBin5.add(numToBeSorted);}
        if (modNumber == 6){digitBin6.add(numToBeSorted);}
        if (modNumber == 7){digitBin7.add(numToBeSorted);}
        if (modNumber == 8){digitBin8.add(numToBeSorted);}
        if (modNumber == 9){digitBin9.add(numToBeSorted);}
    }

    public void combineAllBins(){
        while (!digitBin0.isEmpty()) {
            int removedNumber = digitBin0.remove();
            fullBin.add(removedNumber);
            //System.out.println("# of 0: " + removedNumber); 
        }
        while (!digitBin1.isEmpty()) {
            int removedNumber = digitBin1.remove();
            fullBin.add(removedNumber); 
            //System.out.println("# of 1: " + removedNumber); 
        }
        while (!digitBin2.isEmpty()) {
            int removedNumber = digitBin2.remove();
            fullBin.add(removedNumber); 
            //System.out.println("# of 2: " + removedNumber); 
        }
        while (!digitBin3.isEmpty()) {
            int removedNumber = digitBin3.remove();
            fullBin.add(removedNumber); 
            //System.out.println("# of 3: " + removedNumber); 
        }
        while (!digitBin4.isEmpty()) {
            int removedNumber = digitBin4.remove();
            fullBin.add(removedNumber); 
            //System.out.println("# of 4: " + removedNumber); 
        }
        while (!digitBin5.isEmpty()) {
            int removedNumber = digitBin5.remove();
            fullBin.add(removedNumber); 
            //System.out.println("# of 5: " + removedNumber); 
        }
        while (!digitBin6.isEmpty()) {
            int removedNumber = digitBin6.remove();
            fullBin.add(removedNumber); 
            //System.out.println("# of 6: " + removedNumber); 
        }
        while (!digitBin7.isEmpty()) {
            int removedNumber = digitBin7.remove();
            fullBin.add(removedNumber); 
            //System.out.println("# of 7: " + removedNumber); 
        }
        while (!digitBin8.isEmpty()) {
            int removedNumber = digitBin8.remove();
            fullBin.add(removedNumber); 
            //System.out.println("# of 8: " + removedNumber); 
        }
        while (!digitBin9.isEmpty()) {
            int removedNumber = digitBin9.remove();
            fullBin.add(removedNumber); 
            //System.out.println("# of 9: " + removedNumber); 
        }
    }

    public void emptyFullBin(){
        while (!fullBin.isEmpty()) {
            fullBin.remove();
        }
    }

    public void printAndEmptyFullBin(){
        while (!fullBin.isEmpty()) {
            int removedNumber = fullBin.remove();
            System.out.println(removedNumber); 
        }
    }
}
