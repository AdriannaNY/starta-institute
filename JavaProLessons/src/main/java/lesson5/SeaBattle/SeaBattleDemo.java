package lesson5.SeaBattle;

//This tasks must be in separate methods:
//create players
//create field
//put units(ships) on field
//game process.........
//show winner

import java.util.Scanner;

public class SeaBattleDemo {
    final static Players[] players = new Players[2];
    public static void main(String[] args) {
        playersInitial();
        System.out.println();
    }

    private static void playersInitial() {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Input player's name:");
        for (int i = 0; i < players.length; i++) {  //foreach loop can't use for changing array

        }

    }
}
