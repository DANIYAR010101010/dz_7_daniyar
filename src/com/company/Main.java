package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Magic Magic= new Magic();
        Warrior Warrior= new Warrior();
        Medic Medic= new Medic();
        HavingSuperAbility[] Heroes={Magic,Warrior,Medic};
        for (int i = 0; i < Heroes.length; i++) {
            Heroes[i].applySuperAbility();
        }

    }
}
