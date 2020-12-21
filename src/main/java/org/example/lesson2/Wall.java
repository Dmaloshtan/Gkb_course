package org.example.lesson2;

public class Wall extends Obstacle{

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    boolean contest(Contestant contestant) {
        if (contestant.jump(height)) {
            System.out.println(contestant.toString() + " Перепрыгнул");
            return true;
        } else {
            System.out.println(contestant.toString() + " Не смог перепрыгнуть");
            return false;
        }
    }
}
