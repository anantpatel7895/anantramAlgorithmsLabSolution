package com.gl.javafsd.payment.transaction;

import java.util.Arrays;

public class TargetAchievementCalculator {
    private int[] transaction;
    private int dailyTarget;
    private  boolean dailyTargetAchieved;
    private int transactionCounter;

    public TargetAchievementCalculator (
            int[] transaction, int dailyTarget){
        this.transaction = transaction;
        this.dailyTarget = dailyTarget;
        this.dailyTargetAchieved = false;
        this.transactionCounter = 0;
    }

    public void calculate (){
        int tempCounter = 0;

        for (int index = 0; index < transaction.length; index++){
            int targetValue = transaction[index];
            tempCounter = tempCounter + targetValue;
            transactionCounter++;

            if (tempCounter >= dailyTarget){
                dailyTargetAchieved = true;
                break;
            }
        }
    }

    public void printOutcome (){
        if (dailyTargetAchieved){
            System.out.println("Daily target of ["
             + dailyTarget + "] achieved after [" + transactionCounter
            + "] transaction(s)");
        }else{
            System.out.println("daily target of [" + dailyTarget + " ] is yet to be acheved..");
        }
    }

    public static void main(String[] args) {

        test(new int[] {75, 54, 23, 14}, 175);
        test(new int[] {20, 12, 31}, 21);
        test(new int[] {20, 12, 31}, 19);
        test(new int[] {100}, 101);

    }

    public static void test(int[] transactions, int dailyTarget){

        System.out.println("------------------------------------------------------------");
        System.out.println(Arrays.toString(transactions));

        TargetAchievementCalculator calculator = new TargetAchievementCalculator(transactions, dailyTarget);

        calculator.calculate();
        calculator.printOutcome();
        System.out.println(); // new line
        System.out.println();  // new line

    }
}
