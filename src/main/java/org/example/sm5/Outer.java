package org.example.sm5;

public class Outer {

    public Outer(int outerValue) {
        this.outerValue = outerValue;
    }

    class Inner {
        int innerValue;

        public void innerMethod(){

        }
    }
    int outerValue;

    public void outerMethod(){

    }


//    public static void main(String[] args) {
//        Animal animal = new Animal() {
//            @Override
//            public void voice() {
//                System.out.println("Звук");
//            }
//        };
////org.example.z5.Outer$1
////Animal animal = new Outer();
////Outer extends Animal
//// имплементируем метод (полиморфизм)
//// Outer animal = new Outer();
//        System.out.println(animal.getClass().getName());
//    }
}
