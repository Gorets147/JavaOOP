package org.example.sm4;

import java.util.Arrays;

public class BoxWithNumber<B> {
    private B[] numbers;

    public BoxWithNumber(B[] numbers) {
        this.numbers = numbers;
    }


    @Override
    public String toString() {
        return "BoxWithNumber{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }

    public double average() {
        double sum = 0;
        for (B number : numbers) {
            sum += (Double) number;
        }
        return sum / numbers.length;
    }

//    public boolean compare(BoxWithNumber<B> boxWithNumber){
//
//    }
}
