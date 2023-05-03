package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)){
            ArrayList<Integer> numeroArray = new ArrayList<>();

            System.out.println("Quantidade de numero que vai ter no array: ");
            int quantDeNum = scn.nextInt();

            System.out.println("Quantidade que foi selecionado é " + quantDeNum);

            for(int i = 0; i < quantDeNum; i++) {
                numeroArray.add(scn.nextInt());


            }
            Collections.sort(numeroArray);
            System.out.println("O Array sao: " + numeroArray);
        }
    }
}