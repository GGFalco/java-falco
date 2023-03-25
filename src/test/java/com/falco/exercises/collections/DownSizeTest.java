package com.falco.exercises.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DownSizeTest {

    @Test
    void downSize() {
        List<String> list = new ArrayList<>(List.of("A","B","C","D", "E"));
        DownSize.downSize(list,2);
        assertTrue(list.equals(new ArrayList<>(List.of("A","C","E"))));

    }
}