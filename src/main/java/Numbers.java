import java.util.ArrayList;
import java.util.List;

public class Numbers {

    private int min;
    private int max;


    public Numbers(int min, int max) {
        this.min = min;
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

    public void displayMintoMax() {

        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }

    }

    public List<Integer> displayListRange() {

        List<Integer> listrange = new ArrayList<Integer>();
        for (int i = min; i <= max; i++) {
            listrange.add(i);
        }
        return listrange;

    }
}

