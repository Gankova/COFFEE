package com.company;

public class Coffe implements Americano, Espresso, Espressoduo, p1, p5, p6, p7, End{

    public String brand;
    public int maxvolumeWater;
    public int maxvolumeCoffee;
    public int volw;
    public int volc;

    @Override
    public void americano() {
        if (volw < 200 && volc < 5) {
            System.out.println("Заполните бак с водой");
            System.out.println("Заполните бак с кофе");
        }
        if (volw >= 200 && volc < 5 ){
            System.out.println("Заполните бак с водой");
        }
        if (volw < 200 && volc >= 5 ){
            System.out.println("Заполните бак с водой");
        }
        if (volw >= 200 && volc >=5) {
            System.out.println("Американо : 5г кофе и 200 г воды");
            System.out.println("Кофе готов");
        }

    }

    @Override
    public void espresso() {
        if (volw < 120 && volc < 5) {
            System.out.println("Заполните бак с водой");
            System.out.println("Заполните бак с кофе");
        }
        if (volw >= 120 && volc < 5 ){
            System.out.println("Заполните бак с водой");
        }
        if (volw < 120 && volc >= 5 ){
            System.out.println("Заполните бак с водой");
        }
        if (volw >= 120 && volc >=5) {
            System.out.println("Эспрессо : 5г кофе и 120 г воды");
            System.out.println("Кофе готов");
        }

    }

    @Override
    public void espressoduo() {
        if (volw < 100 && volc < 5) {
            System.out.println("Заполните бак с водой");
            System.out.println("Заполните бак с кофе");
        }
        if (volw >= 100 && volc < 5 ){
            System.out.println("Заполните бак с водой");
        }
        if (volw < 100 && volc >= 5 ){
            System.out.println("Заполните бак с водой");
        }
        if (volw >= 100 && volc >=5) {
            System.out.println("Двойной Эспрессо : 5г кофе и 100 г воды");
            System.out.println("Кофе готов");
        }
    }

    @Override
    public void p1() {

        System.out.print("Текщий объем воды : ");
        System.out.print(volw);
        System.out.print(" , Текущий объем кофе :");
        System.out.print(volc);
        System.out.println();
    }

    @Override
    public void p5() {
        if (volw >= maxvolumeWater) {
            System.out.println("Бак c водой заполнен");
        } else {
            System.out.println("Бак заполняется водой");
            volw = maxvolumeWater;
        }
    }

    @Override
    public void p6() {
        if (volc >= maxvolumeCoffee){
            System.out.println("Бак с кофе заполнен");
        } else {
            System.out.println("Бак с кофе заполняется");
            volc = maxvolumeCoffee;
        }
    }

    @Override
    public void p7() {
        System.out.print("Производитель : ");
        System.out.print(brand);
        System.out.println();
        System.out.print("Объем бака с водой гр. : ");
        System.out.print(maxvolumeWater);
        System.out.println();
        System.out.print("Объем бака с кофе гр. : ");
        System.out.print(maxvolumeCoffee);
        System.out.println();
    }

    @Override
    public void end() {
        System.out.println("Машина выключена");
    }
}
