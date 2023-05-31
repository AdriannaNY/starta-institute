//package SeaBattleHomework;
//
//import java.util.Scanner;
//
//public class Players {
//    String name;
//    final static Players[] players = new Players[2];
//    public Players(String name) {
//        this.name = name;
//    }
//
//    public static void playersInitial() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input player's name:");
//        for (int i = 0; i < players.length; i++) {  //foreach loop can't use for changing array
//            System.out.println("Player " + (i+1) + ": " + scanner.nextLine());
//        }
//    }
//}