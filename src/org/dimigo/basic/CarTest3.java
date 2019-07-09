package org.dimigo.basic;

public class CarTest3 {
    public static void main(String[] args) {
        Car3 hyundai = new Car3("현대자동차","제네시스","검정색",225,50000000);
        Car3 kia = new Car3("기아자동차","K7","흰색",246);
        Car3 samsung = new Car3("삼성자동차","SM7","회색");
        System.out.println("<< 자동차 목록 >>");
        System.out.println("제조사명 : "+ hyundai.getCompany());
        System.out.println("모델명 : "+hyundai.getModel());
        System.out.println("색상 : "+hyundai.getColor());
        System.out.println("최대 속도 : "+hyundai.getMaxSpeed());
        System.out.println("가격 : "+String.format("%,d",hyundai.getPrice()));
        System.out.println();

        System.out.println("제조사명 : "+ kia.getCompany());
        System.out.println("모델명 : "+kia.getModel());
        System.out.println("색상 : "+kia.getColor());
        System.out.println("최대 속도 : "+kia.getMaxSpeed());
        System.out.println("가격 : "+String.format("%,d",kia.getPrice()));
        System.out.println();

        System.out.println("제조사명 : "+ samsung.getCompany());
        System.out.println("모델명 : "+samsung.getModel());
        System.out.println("색상 : "+samsung.getColor());
        System.out.println("최대 속도 : "+samsung.getMaxSpeed());
        System.out.println("가격 : "+String.format("%,d",samsung.getPrice()));
    }
}
