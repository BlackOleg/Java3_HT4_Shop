package ru.olegivanov;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final boolean CYCLE = true;
        String selectedCat= "Alcohol";
        final String PROMPT = "1. Print all goods" + "\n"
                + "2. Print available goods" + "\n"
                + "3. Print only " + selectedCat +  " category" + "\n";
        List<Goods> shop = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        shop = ShopMaker(shop);
        while (CYCLE) {
            System.out.println("Please choose (1-3) the action or write `end` for exit");
            System.out.println(PROMPT);
            String inputline = scan.nextLine();
            if ("end".equals(inputline)) break;
            int input = Integer.parseInt(inputline);
            switch (input) {
                case (1):
                    shop.stream().forEach(System.out::println);
                    System.out.println();
                    break;
                case (2):
                    shop.stream()
                            .filter(x -> x.isAvailable() == true)
                            .forEach(System.out::println);
                    System.out.println();
                    break;
                case (3):
                    shop.stream()
                            .filter(x -> x.getCategory() == selectedCat)
                            .forEach(System.out::println);
                    System.out.println();
                    break;
                default:
                    System.out.println("Oooops, something wrong !");
                    break;
            }
        }
        scan.close();

        System.out.println("HOME TASK IS READY!!!");
    }

    public static List<Goods> ShopMaker(List<Goods> shop) {
        shop.add(new GoodsBuilder()
                .setName("Remy Martini")
                .setCategory("Alcohol")
                .setPrice(40.50)
                .setAvailableN(10)
                .build());
        shop.add(new GoodsBuilder()
                .setName("Nemiroff")
                .setCategory("Alcohol")
                .setPrice(15.50)
                .build());
        shop.add(new GoodsBuilder()
                .setName("Red semi sweet wine")
                .setCategory("Alcohol")
                .setPrice(11.00)
                .build());
        shop.add(new GoodsBuilder()
                .setName("Milk")
                .setCategory("Dairy")
                .setPrice(11.00)
                .build());
        shop.add(new GoodsBuilder()
                .setName("Yogurt")
                .setCategory("Dairy")
                .setPrice(2.00)
                .build());
        shop.add(new GoodsBuilder()
                .setName("Cocoa cocktail")
                .setCategory("Dairy")
                .setPrice(3.60)
                .setAvailableN(5)
                .build());
        return shop;
    }

}