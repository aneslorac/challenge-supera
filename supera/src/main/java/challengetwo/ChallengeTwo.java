package challengetwo;

import java.lang.invoke.LambdaMetafactory;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

/*
SEGUNDO DESAFIO

Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor
monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor
pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas
possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas
necessárias.
Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).
Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial,
conforme exemplo fornecido.
 */

public class ChallengeTwo {


    public static void solveChallenge(BigDecimal price) {

        List<BigDecimal> cells = Arrays.asList(new BigDecimal("100"), new BigDecimal("50"), new BigDecimal("20"), new BigDecimal("10"), new BigDecimal("5"), new BigDecimal("2"));
        List<BigDecimal> coins = Arrays.asList(new BigDecimal("1.00"), new BigDecimal("0.50"), new BigDecimal("0.25"), new BigDecimal("0.10"), new BigDecimal("0.05"), new BigDecimal("0.01"));

        BigDecimal remainingAmount = price;

        while (!remainingAmount.equals(new BigDecimal(0.0))) {

            if (remainingAmount.compareTo(new BigDecimal(2.0)) != -1) {

                for (BigDecimal v : cells) {

                    BigDecimal amount = remainingAmount.divide(v,0, RoundingMode.FLOOR);

                    if (!amount.equals(new BigDecimal(0))) {

                        remainingAmount = remainingAmount.subtract(amount.multiply(v));
                    }

                    System.out.println(String.format("%s nota(s) de R$ %s", amount.toString(), v.toString()));
                }
            }
            else {

                for (BigDecimal v : coins) {
                    BigDecimal amount = remainingAmount.divide(v, 0, RoundingMode.FLOOR);

                    if (!amount.equals(new BigDecimal(0.0))) {
                        remainingAmount = remainingAmount.subtract(amount.multiply(v));
                    }

                    System.out.println(String.format("%s moedas(s) de R$ %s", amount.toString(), v.toString()));
                }

                if (remainingAmount.compareTo(new BigDecimal(0.01)) == -1) {
                    break;
                }
            }
        }

    }

}
