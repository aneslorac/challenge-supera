package challengefour;

import java.util.List;

public class ChallengeFour {

    public static void solveChallenge(List<String> sentences) {

        for (String s : sentences) {

            String correctSentence = "";

            for (int i = 0; i < s.length(); i++) {

                int index = (s.length()/2 - 1 - i) >= 0  ? s.length()/2 - 1 - i : s.length() + s.length()/2 - i - 1;
                correctSentence += s.charAt(index);
            }

            System.out.println(correctSentence);
        }
    }
}
