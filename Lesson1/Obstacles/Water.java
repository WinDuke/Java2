package Lesson1.Obstacles;

import Lesson1.Marathon.Competitors;

public class Water extends Obstacle {

    int length;

    public Water(int length) {
        this.length = length;
    }

    @Override
    String doit(Competitors competitors) {
        return competitors.swim(length);
    }
}
