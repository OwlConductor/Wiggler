package p1;

import java.util.Random;

public class P1_main {
    public static void main(String[] args) {
        int qube = new Random().nextInt(6)+1; // 1,4 Won | 2 Lose | 5 Draw | x Unclear
        System.out.println(String.valueOf(qube)+ " " + ((qube==1 || qube==4) ? "Won" : (qube==2) ? "Lose" : (qube==5) ? "Draw" : ""));
    }
}
