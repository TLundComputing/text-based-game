package game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Player user = new Player(gatherInformation("Enter your name"));

    }

    public static String gatherInformation(String message){
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        System.out.print("> ");
        return scan.nextLine();
    }

}
