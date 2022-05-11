package Practice;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        System.out.println("->0 means Rock.\n->1 means Scissor.\n->2 means Paper.\n");
        System.out.println("SELECT ANY NUMBER \n");
        Scanner sc=new Scanner(System.in);
        Random ran=new Random();
        int c;
        int c1=0;
        int u1=0;
        int i=1;
        while(i<=5){
            System.out.println("Match "+i);
            System.out.println("Your Turn!");
            int u=sc.nextInt();
            System.out.println("Player Second's Turn");
            c=ran.nextInt(3);
            System.out.println(c);
            System.out.println("   ");
            switch (c){
                case 0:
                    switch (u){
                        case 0:
                            System.out.println("TIE!");
                            break;
                        case 1:
                            System.out.println("Player Second wond this match.");
                            c1++;
                            break;
                        case 2:
                            System.out.println("You wn this match.");
                            u1++;
                            break;
                        default:
                            System.out.println("Invalid Input, Try Again! ");
                            i--;
                    }
                    break;
                case 1:
                    switch (u){
                        case 0:
                            System.out.println("Congrates! You WON this match.");
                            u1++;
                            break;
                        case 1:
                            System.out.println("This match is TIE!");
                            break;
                        case 2:
                            System.out.println("Player Second WON this match.");
                            c1++;
                            break;
                        default:
                            System.out.println("Invalid Input, Try Again!");
                            i--;
                    }
                    break;
                case 2:
                    switch (u){
                        case 0:
                            System.out.println("Computer WON this match.");
                            c1++;
                            break;
                        case 1:
                            System.out.println("Congrates! You WON this match.");
                            u1++;
                            break;
                        case 2:
                            System.out.println("This match is TIE!");
                            break;
                        default:
                            System.out.println("Invalid Input, Try Again!");
                            i--;
                    }
                    break;
            }
            i++;
            System.out.println("\n\n\n");
        }
        System.out.printf("\nYou won %d matches.\nSecond Player won %d matches.", u1 , c1);
        System.out.println("");
        if(c1<u1){
            System.out.println("\nYou are a WINNER of this game");
        }
        else if(c1>u1){
            System.out.println("\nSecond Player is a WINNER of this game");
        }
        else if(c1==u1){
            System.out.println("\nThis game is TIE");
        }
    }
}

