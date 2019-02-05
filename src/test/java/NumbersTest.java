import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class NumbersTest {

    @Test
    public void printing_list_range() {

        Numbers numbers3 = new Numbers(1, 9);
        List<Integer> firstList = numbers3.displayListRange();

        List<Integer> listTest = new ArrayList<Integer>();
        for (int l = 1; l <= 9; l++) {
            listTest.add(l);
        }

        Assert.assertThat(firstList, is(listTest));

    }

}