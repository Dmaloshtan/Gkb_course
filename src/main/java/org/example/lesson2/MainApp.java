package org.example.lesson2;

import java.util.LinkedList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        List<Contestant> contestants = new LinkedList<>();
        contestants.add(new Robot(500, 50));
        contestants.add(new Cat(50, 6));
        contestants.add(new Human(500, 7));

        List<Obstacle> obstacles = new LinkedList<>();
        obstacles.add(new Wall(5));
        obstacles.add(new RunRoad(400));
        obstacles.add(new RunRoad(1000));

        for (Contestant contestant : contestants){
            for (Obstacle obstacle : obstacles){
                if (!obstacle.contest(contestant)){
                    break;
                }
            }
        }

    }
}
