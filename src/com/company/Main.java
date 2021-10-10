package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
// b)  Scanner для ввода 5 имен для списков listA & listB.
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter male name # " + i  + " for List A: ");
            listA.add(i, scanner.next());
        }
        System.out.println("List A has the following names: " + listA);
        ArrayList<String> listB = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter female name # " + i +  " for List B: ");
            listB.add(i, scanner.next());
        }
        System.out.println("List A has the following names: " + listA);
        System.out.println("List B has the following names: " + listB);

// e)  Объединение двух списков через "Дедовский метод". Через цикл не смог
        ArrayList<String> listC = new ArrayList<>();
        listC.add(0,listA.get(0));
        listC.add(1,listB.get(4));
        listC.add(2,listA.get(1));
        listC.add(3,listB.get(3));
        listC.add(4,listA.get(2));
        listC.add(5,listB.get(2));
        listC.add(6,listA.get(3));
        listC.add(7,listB.get(1));
        listC.add(8,listA.get(4));
        listC.add(9,listB.get(0));

// f)   List С после слияния listA & listB
        System.out.println("List C sorted out as per task looks as follows: " + listC);

// g)   List С, отсортированный по длине слова:
        listC.sort(Comparator.comparing(String::length));
        System.out.println("List C sorted out by string length looks as follows: " + listC);
    }
}
