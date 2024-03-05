package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SharedDigit {

    public static boolean hasSharedDigit(int first, int last){

        List<Integer> firstNumberDigitList = new ArrayList<>();
        List<Integer> lastNumberDigitList = new ArrayList<>();

        if (!(first >= 10 && first <= 99) || !(last >= 10 && last <= 99)){
            return false;
        }

        while (first != 0){
            firstNumberDigitList.add(first % 10);
            first= first / 10;
        }

        while (last != 0){
            lastNumberDigitList.add(last % 10);
            last= last / 10;
        }

        List<Integer> firstListNoDuplicates = firstNumberDigitList.stream().distinct().collect(Collectors.toList());
        List<Integer> secondListNoDuplicates = lastNumberDigitList.stream().distinct().collect(Collectors.toList());

        List<Integer> common = firstListNoDuplicates.stream()
                .filter(secondListNoDuplicates::contains)
                .collect(Collectors.toList());

       return common.size() != 0;

    }

}
