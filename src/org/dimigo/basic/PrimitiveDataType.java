package org.dimigo.basic;

public class PrimitiveDataType {
    public static void main(String[] args) {
        String name = "아이유";
        boolean isMale = true;
        int age = 25;
        double height = 161.8;
        float weight = 44.3f;
        char bloodType = 'A';
        String titleSong = "삐삐";
        System.out.println("<< 아이유 프로필 >>");
        System.out.printf("이름 : %s\n", name);
        if (isMale) {
            System.out.printf("성별 : 여자\n");
        }
        System.out.printf("나이 : %d\n",age);
        System.out.println("키 : "+ height);
        System.out.println("몸무게 : "+ weight);
        System.out.println("혈액형 : "+ bloodType);
        System.out.println("대표곡 : "+ titleSong);
    }
}
