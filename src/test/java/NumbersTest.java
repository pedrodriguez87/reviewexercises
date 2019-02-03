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
        List<Integer> firstlist = numbers3.displayListRange();

        List<Integer> listtest = new ArrayList<Integer>();
        for (int l = 1; l <= 9; l++) {
            listtest.add(l);
        }

        Assert.assertThat(firstlist, is(listtest));

    }

}