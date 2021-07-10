package com.company;

public class Main {

    public static void main(String[] args) {
	int numberOfMinutes = 3456789;
	converter(numberOfMinutes);
    }
    public static void converter(int n){
        int yrs = n/(365*24*60);
        int days = (n/(24*60))%365;
        System.out.println(yrs+" years and "+ days + " days");
    }
}
