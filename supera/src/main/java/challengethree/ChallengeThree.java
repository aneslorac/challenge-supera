package challengethree;


import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ChallengeThree {

    public static void solveChallenge(List<Integer> arr, Integer k) {

        int pairCount = 0;

        for (Integer elem : arr) {
            if (arr.contains(elem - k))
                pairCount++;
        }

        System.out.println(pairCount);
    }

    /*
        Takes into consideration that the array can have repeated items,
        so first it creates a HashMap with each item and its frequency in
        the original array as key/value pairs
    */
    public static void solveChallengeV2(List<Integer> arr, Integer k) {

        Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();

        for (Integer item : arr) {
            if (freqMap.containsKey(item)) {
                freqMap.put(item, freqMap.get(item) + 1);
            }
            else {
                freqMap.put(item, 1);
            }
        }

        int pairCount = 0;

        for (Integer elem : arr) {
            if (freqMap.containsKey(elem - k))
                pairCount += freqMap.get(elem - k);
        }

        System.out.println(pairCount);
    }
}
