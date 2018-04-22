package org.solutions;

import java.io.Serializable;
import java.util.Objects;

public class WaitingCount implements Serializable {
    int nb;
    int sb;
    int eb;
    int wb;

    public WaitingCount() {

    }

    public WaitingCount(int nb, int sb, int eb, int wb) {
        this.nb = nb;
        this.sb = sb;
        this.eb = eb;
        this.wb = wb;
    }

    public String toString() {
        return new StringBuilder()
                .append("N = ").append(nb)
                .append("; S = ").append(sb)
                .append("; E = ").append(eb)
                .append("; W = ").append(wb)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WaitingCount stats = (WaitingCount) o;
        return nb == stats.nb &&
                sb == stats.sb &&
                eb == stats.eb &&
                wb == stats.wb;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nb, sb, eb, wb);
    }

}