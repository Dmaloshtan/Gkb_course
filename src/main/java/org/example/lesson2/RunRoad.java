package org.example.lesson2;

public class RunRoad extends Obstacle{

    private int length;

    public RunRoad(int length) {
        this.length = length;
    }

    @Override
    boolean contest(Contestant contestant) {
        if (contestant.run(length)) {
            System.out.println(contestant.toString() + " Пробежал дистанцию");
            return true;
        } else {
            System.out.println(contestant.toString() + " Не смог пробежать дистанцию");
            return false;
        }
    }
}
