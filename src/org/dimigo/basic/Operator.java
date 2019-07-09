package org.dimigo.basic;

public class Operator {
    public static void main(String[] args) {
        long salary = 1700000, staff = 3, market = 1500;
        String.format("%,d",market);
        System.out.println("<< 디미벅스 연간 인건비 >>");
        System.out.println("월 평균 급여 : " + String.format("%,d",salary));
        System.out.println("점포 내 직원 수 : " + staff);
        System.out.println("점포 수 : " + String.format("%,d",market));
        long l =salary*12*staff*market;
        System.out.println();
        System.out.println("연간 인건비 : "+   String.format("%,d",l));
    }
}
