package com.company.quanlysanpham;

public class Product {
//    id, tên sản phẩm , mô tả, số lượng, giá bán, đơn vị tính
    private  String id,name,describe;
    double amount,price;
    String  unit;

    public Product() {

    }

    public Product(String id, String name, String describe, double amount, double price, String unit) {
        this.id = id;
        this.name = name;
        this.describe = describe;
        this.amount = amount;
        this.price = price;
        this.unit = unit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", describe='" + describe + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                ", unit=" + unit +
                '}';
    }
}
