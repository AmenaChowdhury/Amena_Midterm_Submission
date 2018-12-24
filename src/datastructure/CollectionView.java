package datastructure;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CollectionView {

        public static void main(String[] args) {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */
                HashMap<Integer, String> map = new HashMap<Integer, String>();
                map.put(1, "Fl");
                map.put(2, "CA");
                map.put(3, "MI");
                map.put(4, "WI");
                map.put(5, "PA");
                map.put(6, "NJ");

                for(Map.Entry<Integer,String> USA:map.entrySet()){
                        System.out.println("COllection View is-"+USA.getKey()+":"+USA.getValue());
                }


        }

}
