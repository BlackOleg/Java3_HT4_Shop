package ru.olegivanov;

public class GoodsBuilder {
    private String name;
    private double price;
    private String category;
    private int availableN;

    public GoodsBuilder () {}

    public GoodsBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public GoodsBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public GoodsBuilder setCategory(String category) {
        this.category = category;
        return this;
    }

    public GoodsBuilder setAvailableN(int availableN) {
        this.availableN = availableN;
        return this;
    }

    public Goods build() throws IllegalArgumentException, IllegalStateException {
        if (this.name == null || this.category == null) {
            throw new IllegalStateException("You didn't set all parameters!!!");
        }

        if (this.price<= 0 ) {
            throw new IllegalArgumentException("You set incorrect price!!!");
        }
        if (this.availableN>0) {
            return new Goods(this.name, this.price, this.category, this.availableN);
        } else {
            return new Goods(this.name, this.price, this.category);
        }
        }
    }

