package com.lijiu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class H2Test {

    @Test
    void h2aTest() {
        Hello he = new Hello();
        he.setA(100);
        System.out.println("Hello! a = " + he.getA() + ";");
    }

    @Test
    void h2bTest() {
        Hello he = new Hello();
        he.setA(200);
        System.out.println("Hello lijiu! a = " + he.getA() + ";");
    }

    @Test
    void h2ErrTest() {
        int a = 100;
        assertEquals(10, a);
    }

    @Test
    void hcTest() {
        int a = 10;
        assertEquals(10, a);
    }

    @Disabled
    @Test
    void hello4Test() {
        int a = 10;
        assertEquals(10, a);
    }

}
