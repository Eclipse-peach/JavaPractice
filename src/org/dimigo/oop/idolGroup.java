package org.dimigo.oop;

public class idolGroup {
    public static void main(String[] args) {
        String[] groupname = {"방탄","2NE1","걸스데이"};
        String[][] memberName={
                {"정국","지민","뷔","슈가","진"},
                {"CL","산다라박","박봄","민지"},
                {"유라","혜리","소진","민아"}
        };
        for(int i=0; i<groupname.length; i++){
            System.out.println("<< " +groupname[i]+" >>");
            for(int j=0; j<memberName[i].length; j++){
                System.out.println(memberName[i][j]);
            }
            System.out.println();
        }
    }
}
