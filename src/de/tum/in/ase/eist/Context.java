package de.tum.in.ase.eist;

import java.util.Date;
import java.util.List;

public class Context {
    private List<Date> dates;
    private SortStrategy sortAlgorithm;

    public Context(){
    }

    public void sort(){
        sortAlgorithm.performSort(dates);
    }


    public List<Date> getDates() {
        return dates;
    }

    public void setDates(List<Date> dates) {
        this.dates = dates;
    }

    public void setSortAlgorithm(SortStrategy sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public SortStrategy getSortAlgorithm() {
        return sortAlgorithm;
    }
}
