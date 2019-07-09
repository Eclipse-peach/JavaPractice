package org.dimigo.oop;

public class Snack {
    private String name;
    private String company;
    private int price;
    private int num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Snack(String name, String company, int price, int num) {
        this.name = name;
        this.company = company;
        this.price = price;
        this.num = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("이름 : ").append(name).append("\n").append("제조사 : ").append(company).append("\n").append("가격 : ").append(String.format("%,d원",price)).append("\n").append("개수 : ").append(num).append("개").append("\n");
        return sb.toString();
    }
    public int calcPrice(){
        return (this.price *  this.num);
    }
}


