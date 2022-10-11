package codewars.kyu6.hidden_cubic_numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CubesTest {

    @Test
    public void test0() {
        String s = "0 9026315 -827&()";
        Cubes c = new Cubes();
        assertEquals("0 0 Lucky", c.isSumOfCubes(s));
    }

    @Test
    public void test1() {
        String s = "Once upon a midnight dreary, while100 I pondered, 9026315weak and weary -827&()";
        Cubes c = new Cubes();
        assertEquals("Unlucky", c.isSumOfCubes(s));
    }

    @Test
    public void test2() {
        String s = "Once upon a midnight dreary, while100 I pondered, 9026315weak and weary -827&()";
        Cubes c = new Cubes();
        assertEquals("Unlucky", c.isSumOfCubes(s));
    }

    @Test
    public void test3() {
        String s = "&z _upon 407298a --- ???ry, ww/100 I thought, 631str*ng and w===y -721&()";
        Cubes c = new Cubes();
        assertEquals("407 407 Lucky", c.isSumOfCubes(s));
    }

    @Test
    public void test4() {
        String s = "&z371 upon 407298a --- dreary, ###100.153 I thought, 9926315strong and weary -127&() 1";
        Cubes c = new Cubes();
        assertEquals("371 407 153 1 932 Lucky", c.isSumOfCubes(s));
    }

    @Test
    public void test5() {
        String s = "&&[[[ 298.298a --- ;;;, ###100.163 mouse, querty and tired 567";
        Cubes c = new Cubes();
        assertEquals("Unlucky", c.isSumOfCubes(s));
    }

}
