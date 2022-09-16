package de.tum.in.ase.eist;

import java.util.*;

public class BubbleSort implements SortStrategy{

    public void performSort(List<Date> input) {
        Date temp;
        for(int i = 0; i < input.size() - 1; i++){
            Date inputAtI = input.get(i);
            Date inputAtIPlusOne = input.get(i+1);
            if(inputAtI.compareTo(inputAtIPlusOne) < 0 || inputAtI.compareTo(inputAtIPlusOne) == 0){   //== 0 -> is equal | < 0 -> Date inputAtI is less than Date inputAtIPlusOne
                continue;
            }
            temp = input.get(i);
            inputAtI = inputAtIPlusOne;
            inputAtIPlusOne = temp;
            performSort(input);
        }
    }

}
