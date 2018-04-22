package org.solutions;

import java.util.List;

class Solution {

    public static void main(String[] args) {
        TrafficSignals o = new TrafficSignals();
        int limit = args.length > 1 ? Integer.parseInt(args[0]) : 20;
        List<WaitingCount> result = o.countWaiting(limit);
        int i = 0;
        for (WaitingCount stat : result)
            System.out.println(String.format("%d: %s", i++, stat));
    }

}