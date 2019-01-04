package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {

        String s= "Bangladesh beautiful country";
        Map<Integer, String> wordNLength = findTheLargestWord(s);


        int largest = 0;
        String largeValue = "";
        for(Map.Entry<Integer, String> checkLength : wordNLength.entrySet()){
            if(largest< checkLength.getKey()) {
                largest = checkLength.getKey();
                largeValue = checkLength.getValue();
            }
        }
        System.out.println("Largest word: "+largeValue+" length: "+largest);

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        String[] split = wordGiven.split(" ");

        for(int i=0;i<split.length;i++){
            map.put(split[i].length(),split[i]);
        }
        return map;
    }
}
