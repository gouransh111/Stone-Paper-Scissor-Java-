package com.company;
import java.util.Scanner;
import java.util.Random;

public class GG_04_literals {
    public static void main(String[] args) {
        int i = 0;
        Random rand = new Random();
        int user_point = 0;
        int comp_point = 0;
        while( i< 5)
        {
            i++;
            int comp = rand.nextInt(3);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr 0 for Scissor , 1 for Stone , 2 for Paper");
            int user = sc.nextInt();

            if (user==0 && comp == 0)
                System.out.println("It's a  tie");
            else if(user==1 && comp == 1)
                System.out.println("It's a tie");
            else if(user == 2 && comp == 2)
                System.out.println("It's a tie");
            else if(user == 0 && comp == 1){
                System.out.println("Computer won");
                comp_point++;}
            else if(user == 0 && comp == 2){
                System.out.println("You won");
                user_point++;}
            else if(user == 1 && comp == 0){
                System.out.println("You won");
                user_point++;}
            else if(user == 2 && comp == 0){
                System.out.println("Computer won");
                comp_point++;}
            else if(user == 2 && comp == 1){
                System.out.println("You won");
                user_point++;}
            else if(user == 1 && comp == 2){
                System.out.println("Computer won");
                comp_point++;}
        }
        System.out.println("Computer points "+ comp_point + "User points "+ user_point);
        if (comp_point > user_point)
            System.out.println("Computer wons");
        else if(comp_point<user_point)
            System.out.println("User wons");
        else
            System.out.println("It's a Tie");

        }

        }

