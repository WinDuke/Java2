package Lesson1.Obstacles;

import Lesson1.Marathon.Competitors;

public class Cross extends Obstacle {

    int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    String doit(Competitors competitors) {
        return competitors.run(length);
    }
}
