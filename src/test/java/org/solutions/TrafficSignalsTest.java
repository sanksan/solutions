package org.solutions;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TrafficSignalsTest {

    @Test
    public void countWaiting() throws Exception {
        TrafficSignals o = new TrafficSignals();
        List<WaitingCount> stats = o.countWaiting(20);
        List<WaitingCount> expStats = loadStats("/20seconds.csv");
        assertEquals(expStats, stats);
    }

    private List<WaitingCount> loadStats(String resName) throws IOException {
        List<WaitingCount> expStats = new ArrayList<>();
        URL url = this.getClass().getResource(resName);//"/20seconds.csv");
        List<String> lines = FileUtils.readLines(new File(url.getFile()), "UTF-8");
        for(String line : lines) {
            String[] vals = line.split(",");
            expStats.add(new WaitingCount(Integer.parseInt(vals[0]),
                    Integer.parseInt(vals[1]),
                    Integer.parseInt(vals[2]),
                    Integer.parseInt(vals[3])));
        }
        return expStats;
    }

    @Test
    public void countWaitingInvalidLimit() throws Exception {
        TrafficSignals o = new TrafficSignals();
        List<WaitingCount> stats = o.countWaiting(-1);
        assertTrue(stats.isEmpty());
    }

}