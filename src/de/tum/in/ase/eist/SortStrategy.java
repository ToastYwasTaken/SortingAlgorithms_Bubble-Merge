package de.tum.in.ase.eist;

import javax.naming.Context;
import java.util.Date;
import java.util.List;

public interface SortStrategy {
    void performSort(List<Date> date);
}
