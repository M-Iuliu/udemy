package org.example;

import java.util.*;

public class Score {

    private HashMap<String,Integer> scoreMap = new HashMap<>();

    public Score(HashMap<String, Integer> scoreMap) {
        this.scoreMap = scoreMap;
    }

    public LinkedHashMap<String, Integer> orderByHighScore(HashMap <String, Integer> scoreList){
        // Sort method needs a List, so let's first convert Set to List in Java
        Set<Map.Entry<String, Integer>> entries = scoreList.entrySet();
        List<Map.Entry<String, Integer>> listOfEntries = new ArrayList<Map.Entry<String, Integer>>(entries);
        // Invoking the comparator
        listOfEntries.sort(valueComparator);
        // Copying entries from List to Map
       LinkedHashMap<String, Integer> sortedByValueMap = new LinkedHashMap<String, Integer>(listOfEntries.size());
        for(Map.Entry<String, Integer> entry : listOfEntries){
            sortedByValueMap.put(entry.getKey(), entry.getValue());
        }

        return sortedByValueMap;
    }

    public HashMap <String, Integer> calculateHighScore(HashMap<String, Integer>  sortedHighScoreMap){
        HashMap <String, Integer> calculatedHighScoreMap = new HashMap<>();
        String key;
        int value;

        for (Map.Entry<String, Integer> entry : sortedHighScoreMap.entrySet()){
            key = entry.getKey();

            if(entry.getValue() >= 1000){
                value = 1;
            } else if (entry.getValue() >= 500){
                value = 2;
            } else if(entry.getValue() >= 100){
                value = 3;
            } else {
                value = 4;
            }

            calculatedHighScoreMap.put(key, value);
        }

        return calculatedHighScoreMap;
    }

    public String findPosition(String name,HashMap<String, Integer>  calculatedHighScoreMap){
        String position;
        if (calculatedHighScoreMap.containsKey(name)) {
            position = name + " managed to get into the "+ calculatedHighScoreMap.get(name) +
            " tier on the high score list";
        } else {
            position = "User not found: " + name;
        }

        return position;
    }

   Comparator<Map.Entry<String, Integer>> valueComparator
            = new Comparator<Map.Entry<String, Integer>>() {

       @Override
        public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
            Integer v1 = e1.getValue();
            Integer v2 = e2.getValue();
            return v1.compareTo(v2);
        }
   };

    public HashMap<String, Integer> getScoreMap() {
        return scoreMap;
    }

    public void setScoreMap(HashMap<String, Integer> scoreMap) {
        this.scoreMap = scoreMap;
    }
}
