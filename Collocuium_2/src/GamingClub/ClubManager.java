package GamingClub;

import java.util.Scanner;

public class ClubManager {
    private static int countFreeComputers = 5;
    private static int time1= 30;
    private static int time2= 60;
    public static void main (String [] args) throws  Exception{
        Scanner in = new Scanner(System.in);
        System.out.println("Take your place");
        countFreeComputers--;
        System.out.println("Enter name of Game");
        System.out.println("Enter time of Game");

        while(countFreeComputers != 0) {
            String ComputerClient = in.next();
        }
        int time;
        switch (ComputerClient){
            case "1" :
                time = time1;
            case "2" :
                teime = time2;
    }

}
