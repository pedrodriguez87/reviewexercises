import java.util.ArrayList;
import java.util.List;

public class Numbers {

    private int min;
    private int max;
    private int nextmin;


    public Numbers(int min, int max) {
        this.min = min;
        this.max = max;
        this.nextmin = min + 1;

    }

    // Setting min as 0, would let us to print any range of numbers between 0 and x.
    public Numbers(int max) {
        this.min = 0;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void displayMinToMax() {

        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }

    }

    public List<Integer> displayListRange() {

        List<Integer> listRange = new ArrayList<Integer>();
        for (int i = min; i <= max; i++) {
            listRange.add(i);
        }
        return listRange;

    }

    public List<Integer> displayListExcludingValues() {

        List<Integer> listRange = new ArrayList<Integer>();
        for (int i = nextmin; i < max; i++) {
            listRange.add(i);
        }
        return listRange;

    }
}

