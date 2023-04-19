package ru.olegivanov;

public class Goods {
    private String name;
    private double price;
    private String category;
    private int availableN;
    final StringFormatter formatter = () -> " - Category: " + this.category + "; Product: " + this.name + "; has price " + this.price + "." ;

    public Goods(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.availableN =0;

    }

    public Goods(String name, double price, String category, int availableN) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.availableN = availableN;
    }


    public boolean isAvailable() {
        return (availableN > 0);
    }

    public boolean isAlcohol() {
        return (category.toLowerCase() == "alcohol");
    }


        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public double getPrice () {
            return price;
        }

        public void setPrice ( double price){
            this.price = price;
        }

        public String getCategory () {
            return category;
        }

        public void setCategory (String category){
            this.category = category;
        }

        public int getAvailableN () {
            return availableN;
        }

        public void setAvailableN ( int availableN){
            this.availableN = availableN;
        }

        @Override
        public String toString () {
            return formatter.formatToString();
        }
    }