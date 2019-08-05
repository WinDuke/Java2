package Lesson1.Obstacles;

import Lesson1.Marathon.Competitors;
import Lesson1.Marathon.Team;

public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        Competitors[] competitors = team.getCompetitors();
        if(competitors.length == 0) {
            System.out.println("В команде нет никого");
            return;
        }
        for (Competitors c: competitors) {
            for (Obstacle o:obstacles) {
                team.setResult(o.doit(c));
                if(!c.isOnDistance()) {
                    break;
                }
            }
        }
    }
}
