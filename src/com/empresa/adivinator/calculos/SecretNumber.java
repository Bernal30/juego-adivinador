package com.empresa.adivinator.calculos;
import java.util.Random;

public class SecretNumber {
    //instar objeto de la clase Random
    Random random = new Random();

    //generar número pseudoaleatorio entre 1 y 100
    private final int randomNumber = (int) random.nextFloat(10) + 1;

    public int getRandomNumber() {
        return randomNumber;
    }

}
