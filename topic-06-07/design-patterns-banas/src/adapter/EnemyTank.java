package adapter;

// EnemyTank implements EnemyAttacker perfectly
// Our job is to make classes with different methods
// from EnemyAttacker to work with the EnemyAttacker interface

import java.util.Random;

public class EnemyTank implements EnemyAttacker {

    Random generator = new Random();

    @Override
    public void fireWeapon() {

        final int attackDamage = generator.nextInt(10) + 1;

        System.out.println("Enemy Tank Does " + attackDamage + " Damage");

    }

    @Override
    public void driveForward() {

        final int movement = generator.nextInt(5) + 1;

        System.out.println("Enemy Tank moves " + movement + " spaces");

    }

    @Override
    public void assignDriver(String driverName) {

        System.out.println(driverName + " is driving the tank");

    }

}