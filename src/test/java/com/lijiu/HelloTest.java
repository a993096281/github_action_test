package com.lijiu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloTest {

    @Test
    void helloTest() {
        Hello he = new Hello();
        he.setA(100);
        System.out.println("Hello! a = " + he.getA() + ";");
    }

    @Test
    void hello2Test() {
        Hello he = new Hello();
        he.setA(200);
        System.out.println("Hello lijiu! a = " + he.getA() + ";");
    }

    @Test
    void helloErrTest() {
        int a = 10;
        assertEquals(10, a);
    }

}
