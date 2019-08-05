package Lesson1.Obstacles;

import Lesson1.Marathon.Competitors;

public class Wall extends Obstacle {

    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    String doit(Competitors competitors) {
        return competitors.jump(height);
    }
}
