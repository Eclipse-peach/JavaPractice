package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        String[] character= {"마법사", "농민", "영주", "기사"};
        int[] atk = {100, 100, 100, 100};
        int menu = 0;
        int num = 7;
        Scanner scanner = new Scanner(System.in);
        do {
            menu = 0;
            System.out.println("--------------------");
            System.out.println("<< 게임 메뉴 >>");
            System.out.println("1. 캐릭터 설정");
            System.out.println("2. 공격력 증가");
            System.out.println("3. 공격력 감소");
            System.out.println("9. 종료");
            System.out.println("--------------------");
            System.out.println("");
            System.out.println("메뉴 입력 => ");
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    num = new Random().nextInt(4);
                    System.out.println(character[num] + "(으)로 설정되었습니다.");
                    break;
                case 2:
                    if (num == 7) {
                        System.out.println("먼저 캐릭터를 설정하세요!!");
                        break;
                    } else {
                         atk[num]+= 10;
                        System.out.println(character[num] + " 공격력이 증가하였습니다. 현재 공격력 : " + atk[num]);
                        break;
                    }
                case 3:
                    if (num == 7) {
                        System.out.println("먼저 캐릭터를 설정하세요!!");
                        break;
                    } else {
                        atk[num] -= 10;
                        System.out.println(character[num]+ " 공격력이 감소하였습니다. 현재 공격력 : " + atk[num]);
                        break;
                    }
                case 9:
                    System.out.println("이제 공부하세요!");
                    break;
                default :
                    System.out.println("없는 메뉴입니다!");
                    break;
            }
        }while(menu!=9);
    }
}

