/*
 * Copyright (c) 2023.
 * This code is part of course material for the course PRRPRR02.
 * Only authorized usage is allowed. Please contact the author if you want to use it.
 *
 * @author LivNTI
 */

import java.util.Scanner;

public class BamMain {
    public static void main(String[] args) {
        System.out.println("Hello BAM!");
        Scanner myScan = new Scanner(System.in);

        Hero myHero = new Hero("Goood Guy");
        Enemy myEnemy = new Enemy();

        System.out.println("A hero called " + myHero.name + "has appeared");
        System.out.println("A enemy called " + myEnemy.name + "has appeared");

        myEnemy.hp -= 10;
        System.out.println(myHero.name + " has hit " + myEnemy.name + " with 10 pts of damage");

        System.out.println(myEnemy.name + " now has " + myEnemy.hp + " hp");

    }
}