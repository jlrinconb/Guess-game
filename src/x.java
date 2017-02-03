/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class x {
    public static void main(String[] args){
        java.util.Scanner lectura=
                new java.util.Scanner(System.in);
        int answer = (int) Math.floor((Math.random()*100)+1);
        int guess;
        int numguesses;
        for (guess=0, numguesses=1;numguesses<=7 && guess != answer;numguesses= numguesses+1){
            System.out.println("Guess a number");
            guess = lectura.nextInt();
            if (guess<answer) {
            System.out.println("Higher");   
            }
            if (guess>answer){
            System.out.println("lower");
            }
            
    }
        if (guess==answer) {
            System.out.println("you win");
            }
        else
            System.out.println("you lose");}
}
