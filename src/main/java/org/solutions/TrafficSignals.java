package org.solutions;

import java.util.ArrayList;
import java.util.List;

class TrafficSignals {
    public static void main(String[] args) {
        TrafficSignals o = new TrafficSignals();
        int limit = args.length > 1 ? Integer.parseInt(args[0]) : 20;
        List<WaitingCount> result = o.countWaiting(limit);
        int i = 0;
        for (WaitingCount stat : result)
            System.out.println(String.format("%d: %s", i++, stat));
    }

    public List<WaitingCount> countWaiting(int limit) {
        return countWaiting(limit, 3, 1, 2);
    }

    public List<WaitingCount> countWaiting(int limit, int greenSec, int redSec, int delaySec) {
        List<WaitingCount> result = new ArrayList<>();
        int ew = 0, ns = 0;
        int sidetime = greenSec + redSec;
        int cycle = sidetime * 2;
        for (int i = 0; i <= limit; i++) {
            if (i > 0) {
                if (i % sidetime == 0) {
                    ns++;
                    ew++;
                } else {
                    int k = i % cycle;
                    if (k == 1) {
                        ew++;
                        if (i > greenSec)
                            ns++;
                    } else if (k <= greenSec) {
                        ew++;
                    } else if (k == sidetime + delaySec - 1) {
                        ns++;
                        ew++;
                    } else if (k <= greenSec * 2 + delaySec)
                        ns++;
                }
            }
            result.add(new WaitingCount(ns, ns, ew, ew));
        }
        return result;
    }


}