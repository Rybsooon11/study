package com.mgr.badanie.recounting;

import com.mgr.badanie.service.Service1;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Service1Test {

    @Autowired
    Service1 service1;

    long start;
    long end;

    @BeforeEach
    void startTimer() {
        start = System.currentTimeMillis();
    }

    @AfterEach
    void endTimer() {
        end = System.currentTimeMillis();
        System.out.println("Result " + (end - start));
    }

    @Test
    void grossToNetTest() {

        // given
        int [] tab = new int[10000000];
        for (int i = 0; i < 10000000; i++) {
            tab[i] = i;
        }

        // when
        int[] result = service1.method1();

        // then
        for (int i = 0; i < result.length - 1; i++) {
            assertEquals(i, result[i]);
            if(i > 0) assertTrue(result[i] > result[i-1]);
        }
        assertArrayEquals(tab, result);
    }
}