package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        String[] questions = {
                "가장 좋아하는 가수는?",
                "가장 좋아하는 배우는?",
                "가장 좋아하는 과목은?"
        };
        String[] answers = {
                "김찬형",
                "찬형김",
                "중국어"
        };
        int menu = 0;
        int num = 7;
        Scanner scanner = new Scanner(System.in);
        // String answer = scanner.next();    // next()는 단어 입력, nextLine()은 한 라인 입력
        do {
            menu = 0;
            System.out.println("--------------------");
            System.out.println("1. 질문 선택1");
            System.out.println("2. 정답 공개");
            System.out.println("9. 프로그램 종료");
            System.out.println("--------------------");
            System.out.println("");
            System.out.println("메뉴 입력 => ");
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    num = new Random().nextInt(3);
                    System.out.println(questions[num]);
                    String answer = scanner.next();
                    if (answer.equals(answers[num])) {
                        System.out.println("정답입니다!");
                    } else {
                        System.out.println("틀렸습니다!");
                    }
                    break;
                case 2:
                    System.out.println("<< 정답 출력 >>");
                    StringBuilder sb = new StringBuilder();
                    for(int i=0; i<3; i++) {
                        sb.append(questions[i]).append(" ").append(answers[i]).append("입니다.\n");
                    }
                    System.out.println(sb);
                    break;
                case 9:
                    System.out.println("Bye~");
                    break;
                default:
                    System.out.println("없는 메뉴입니다.");
                    break;
            }
        } while (menu != 9);
    }
}


