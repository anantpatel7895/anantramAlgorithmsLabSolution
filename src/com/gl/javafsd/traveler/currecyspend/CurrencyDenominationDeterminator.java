package com.gl.javafsd.traveler.currecyspend;

public class CurrencyDenominationDeterminator {
    private int[] denominations;
    private int payAmount;
    private int[] resultDenominationArray;
    private int[] resultDenominationCountArray;

    public CurrencyDenominationDeterminator(int[] denominations, int payAmount){
        this.denominations = denominations;
        this.payAmount = payAmount;
        this.resultDenominationArray = new int[this.denominations.length];
        this.resultDenominationCountArray = new int[this.denominations.length];
    }

    public void determine(){
//        Sort();
    }



}
