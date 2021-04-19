package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Siemens s = new Siemens();
	s.brand = "Siemens";
	s.maxvolumeCoffee = 20;
	s.maxvolumeWater = 1000;
	s.volw =150;
	s.volc = 5;

	Philips p = new Philips();
	p.brand = "Philips";
	p.maxvolumeCoffee = 30;
	p.maxvolumeWater = 1300;
	p.volw =150;
	p.volc = 1;

	Sony sony = new Sony();
	sony.brand = "Sony";
	sony.maxvolumeCoffee = 50;
	sony.maxvolumeWater = 1500;
	sony.volw =1500;
	sony.volc = 50;

	Scanner marka = new Scanner(System.in);
	int i = 0;
	while (i !=3){
		System.out.println("1. Siemens");
		System.out.println("2. Philips");
		System.out.println("3. Sony");
		System.out.println("Выберите марку");
		i = marka.nextInt();
		switch (i) {
			case 1:
				Scanner menu =new Scanner(System.in);
				int n = 0;
				while (n !=8) {
					System.out.println("1. Показать текущий объем воды");
					System.out.println("2. Приготовить Американо");
					System.out.println("3. Приготовить Эспрессо");
					System.out.println("4. Приготовить Двойной эспрессо");
					System.out.println("5. Заполнить бак с водой");
					System.out.println("6. Заполнить бак с кофе");
					System.out.println("7. Информация");
					System.out.println("8. Выключить машину");
					System.out.println("Выберите пункт меню");
					n = menu.nextInt();
					switch (n) {
						case 1:
							s.p1();
							break;
						case 2:
							s.americano();
							break;
						case 3:
							s.espresso();
							break;
						case 4:
							s.espressoduo();
							break;
						case 5:
							s.p5();
							break;
						case 6:
							s.p6();
							break;
						case 7:
							s.p7();
							break;
						case 8:
							s.end();
							break;
					}
				}
				break;
			case 2:
				Scanner menu1 =new Scanner(System.in);
				int j = 0;
				while (j !=8) {
					System.out.println("1. Показать текущий объем воды");
					System.out.println("2. Приготовить Американо");
					System.out.println("3. Приготовить Эспрессо");
					System.out.println("4. Приготовить Двойной эспрессо");
					System.out.println("5. Заполнить бак с водой");
					System.out.println("6. Заполнить бак с кофе");
					System.out.println("7. Информация");
					System.out.println("8. Выключить машину");
					System.out.println("Выберите пункт меню");
					j = menu1.nextInt();
					switch (j) {
						case 1:
							p.p1();
							break;
						case 2:
							p.americano();
							break;
						case 3:
							p.espresso();
							break;
						case 4:
							p.espressoduo();
							break;
						case 5:
							p.p5();
							break;
						case 6:
							p.p6();
							break;
						case 7:
							p.p7();
							break;
						case 8:
							p.end();
							break;
					}

				}
				break;

			case 3:
				Scanner menu2 =new Scanner(System.in);
				int m = 0;
				while (m !=8) {
					System.out.println("1. Показать текущий объем воды");
					System.out.println("2. Приготовить Американо");
					System.out.println("3. Приготовить Эспрессо");
					System.out.println("4. Приготовить Двойной эспрессо");
					System.out.println("5. Заполнить бак с водой");
					System.out.println("6. Заполнить бак с кофе");
					System.out.println("7. Информация");
					System.out.println("8. Выключить машину");
					System.out.println("Выберите пункт меню");
					m = menu2.nextInt();
					switch (m) {
						case 1:
							sony.p1();
							break;
						case 2:
							sony.americano();
							break;
						case 3:
							sony.espresso();
							break;
						case 4:
							sony.espressoduo();
							break;
						case 5:
							sony.p5();
							break;
						case 6:
							sony.p6();
							break;
						case 7:
							sony.p7();
							break;
						case 8:
							sony.end();
							break;
					}
				}
				break;



		}
		break;


		}

    }
}
