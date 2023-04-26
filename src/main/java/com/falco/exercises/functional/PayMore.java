package com.falco.exercises.functional;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class PayMore {
    public static void payMore(Map<String, Double> fees, String numberFamily, double costDelta) {
        fees.replaceAll((a, b) -> a.startsWith(numberFamily) ? b + costDelta : b);
    }
}
