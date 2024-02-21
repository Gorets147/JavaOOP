package org.example.sm4;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        1)	Создать класс - коробку (SimpleBox), которая может хранить любые объекты.
//        Посмотреть с какими ошибками можно столкнуться и исправить данное решение на более подходящее(GenBox).
        SimpleBox intBox1 = new SimpleBox(10);
        SimpleBox intBox2 = new SimpleBox(20);

        int sum = (Integer) intBox1.getObj() + (Integer) intBox2.getObj();
        System.out.println("sum = " + sum);

        intBox1.setObj("java");
        int sum2 = 0;
        if (intBox1.getObj() instanceof Integer && intBox2.getObj() instanceof Integer) {
            sum2 = (Integer) intBox1.getObj() + (Integer) intBox2.getObj();
        }
        System.out.println("sum2 = " + sum2);

        GenBox<Integer> genIntBox1 = new GenBox<>(20);
        GenBox<Integer> genIntBox2 = new GenBox<>(30);
        int sum3 = genIntBox1.getObj() + genIntBox2.getObj();

        Double[] array1 = {1.0, 10.0, 2.0, 10.0};
        BoxWithNumber<Double> boxWithNumber = new BoxWithNumber<>(array1);
        System.out.println("boxWithNumber.average() = " + boxWithNumber.average());

    }
}
