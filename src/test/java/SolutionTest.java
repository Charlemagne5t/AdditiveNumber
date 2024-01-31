import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1(){
        String num = "112358";
        boolean expected = true;
        boolean actual = new Solution().isAdditiveNumber(num);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2(){
        String num = "199100199";
        boolean expected = true;
        boolean actual = new Solution().isAdditiveNumber(num);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test3(){
        String num = "101";
        boolean expected = true;
        boolean actual = new Solution().isAdditiveNumber(num);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test4(){
        String num = "1023";
        boolean expected = false;
        boolean actual = new Solution().isAdditiveNumber(num);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test5(){
        String num = "1203";
        boolean expected = false;
        boolean actual = new Solution().isAdditiveNumber(num);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test6(){
        String num = "199111992";
        boolean expected = true;
        boolean actual = new Solution().isAdditiveNumber(num);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test7(){
        String num = "211738";
        boolean expected = true;
        boolean actual = new Solution().isAdditiveNumber(num);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test8(){
        String num = "0235813";
        boolean expected = false;
        boolean actual = new Solution().isAdditiveNumber(num);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test9(){
        String num = "101020305080130210";
        boolean expected = true;
        boolean actual = new Solution().isAdditiveNumber(num);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test10(){
        String num = "221474836472147483649";
        boolean expected = true;
        boolean actual = new Solution().isAdditiveNumber(num);

        Assert.assertEquals(expected, actual);
    }
}

