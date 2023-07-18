package challengeone;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ChallengeOne {
    public static void solveChallenge(List<Integer> values) {

        List oddValues = new ArrayList();
        List evenValues = new ArrayList();

        for (Integer v : values) {
            if (v % 2 == 0)
                evenValues.add(v);
            else
                oddValues.add(v);
        }

        Collections.sort(oddValues, Collections.reverseOrder());
        Collections.sort(evenValues);

        evenValues.addAll(oddValues);

        System.out.println(evenValues);
    }
}