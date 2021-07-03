package com.karthic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //10th mark input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st best mark you get in 10th : ");
        long inp1_10 = input.nextInt();
        System.out.print("Enter the 2nd best mark you get in 10th : ");
        long inp2_10 = input.nextInt();
        System.out.print("Enter the 3rd best mark you get in 10th : ");
        long inp3_10 = input.nextInt();

        //11th mark input from user
        System.out.print("Enter the Tamil theory mark you get in 11th : ");
        long inp1_11 = input.nextInt();
        System.out.print("Enter the English theory mark you get in 11th : ");
        long inp2_11 = input.nextInt();
        System.out.print("Enter the Maths theory mark you get in 11th : ");
        long inp3_11 = input.nextInt();
        System.out.print("Enter the Physics theory mark you get in 11th : ");
        long inp4_11 = input.nextInt();
        System.out.print("Enter the Chemistry theory mark you get in 11th : ");
        long inp5_11 = input.nextInt();
        System.out.print("Enter the Computer Science theory mark you get in 11th : ");
        long inp6_11 = input.nextInt();

        //10th marks ref
        long mark_10_1 = inp1_10;
        long mark_10_2 = inp2_10;
        long mark_10_3 = inp3_10;
        int mark_10_total = (int) final_10(mark_10_1,mark_10_2,mark_10_3);
        System.out.println("The Total 10th mark in all subjects " + mark_10_total);

        //11th mark ref
        long tam_11 = inp1_11;
        long eng_11 = inp2_11;
        long mat_11 = inp3_11;
        long phy_11 = inp4_11;
        long che_11 = inp5_11;
        long cs_11 = inp6_11;

        System.out.println((int) final_11_90(tam_11));
        System.out.println((int) final_11_90(eng_11));
        System.out.println((int) final_11_90(mat_11));
        System.out.println((int) final_11_70(phy_11));
        System.out.println((int) final_11_70(che_11));
        System.out.println((int) final_11_70(cs_11));

        int total_11 = (int) final_11_90(tam_11)+(int) final_11_90(eng_11)+(int) final_11_90(mat_11)+(int) final_11_70(phy_11)+(int) final_11_70(che_11)+
                (int) final_11_70(cs_11);

        System.out.println("The Total mark in 11th is " + total_11);

        //12th ref

        long tot_12 = 30*6;

        System.out.println("The default 12th mark is " + tot_12);

        //full total

        long total_12th_mark = mark_10_total * 6L +total_11 + tot_12;
        System.out.println(total_12th_mark);

    }
    //cal 10th mark
    static double final_10(long mark1,long mark2,long mark3) {
        long mark_tot = mark1 + mark2 +mark3;
        return (double) mark_tot/ 300 * 50;
    }
    //cal 11th mark 90
    static double final_11_90(long mark){
        return (double) mark/90 * 20;
    }
    //cal 11th mark 70
    static double final_11_70(long mark){
        return (double) mark/70 * 20;
    }
}
