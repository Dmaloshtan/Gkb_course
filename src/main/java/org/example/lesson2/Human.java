package org.example.lesson2;

public class Human implements Contestant {

    private int maxDistanceRun;
    private int maxHeightJump;

    public Human(int maxDistanceRun, int maxHeightJump) {
        this.maxDistanceRun = maxDistanceRun;
        this.maxHeightJump = maxHeightJump;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= 0) {
            System.out.println("Некорректное значение");
            return false;
        } else if (distance > maxDistanceRun) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= 0) {
            System.out.println("Некорректное значение");
            return false;
        } else if (height > maxHeightJump) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "Человек";
    }
}
