package org.supera;
import challengefour.ChallengeFour;
import challengeone.ChallengeOne;
import challengethree.ChallengeThree;
import challengetwo.ChallengeTwo;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ChallengeOne.solveChallenge(Arrays.asList(4, 32, 34, 543, 3456, 654, 567, 87, 6789, 98));

        ChallengeTwo.solveChallenge(new BigDecimal(576.73));

        ChallengeThree.solveChallenge(Arrays.asList(1, 5, 3, 4, 2), 2);
        ChallengeThree.solveChallenge(Arrays.asList(1, 2, 3, 4), 2);
        ChallengeThree.solveChallenge(Arrays.asList(1, 2, 2, 3, 4), 2);
        ChallengeThree.solveChallengeV2(Arrays.asList(1, 2, 2, 3, 4), 2);

        ChallengeFour.solveChallenge(
                Arrays.asList(
                        "I ENIL SIHTHSIREBBIG S",
                        "LEVELKAYAK",
                        "H YPPAHSYADILO",
                        "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
                        "VOD OWT SNEH HCNERF EGDIRTRAP A DNA SE")
        );
    }
}