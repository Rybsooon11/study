package com.mgr.badanie.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Service1 {

    public int[] method1() {
        int[] result = new int[10000000];
        for (int i = 0; i < 10000000; i++) {
            result[i] = i;
        }
        return result;
    }
}
