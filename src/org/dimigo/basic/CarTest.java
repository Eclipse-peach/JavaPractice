package org.dimigo.basic;

public class CarTest {
    public static void main(String[] args) {
        System.out.println("<< 자동차 목록 >>");
        Car hyundai = new Car();
        Car kia = new Car();
        Car samsung = new Car();

        hyundai.setCompany("현대자동차");
        hyundai.setModel("제네시스");
        hyundai.setColor("검정색");
        hyundai.setMaxSpeed(225);
        hyundai.setPrice(50000000);

        kia.setCompany("기아자동차");
        kia.setModel("K7");
        kia.setColor("흰색");
        kia.setMaxSpeed(246);
        kia.setPrice(40000000);

        samsung.setCompany("삼성자동차");
        samsung.setModel("SM7");
        samsung.setColor("회색");
        samsung.setMaxSpeed(200);
        samsung.setPrice(38000000);

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
