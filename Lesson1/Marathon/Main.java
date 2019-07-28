package Lesson1.Marathon;

import Lesson1.Obstacles.Cross;
import Lesson1.Obstacles.Wall;
import Lesson1.Obstacles.Water;
import Lesson1.Obstacles.Course;

public class Main {

    public static void main(String[] args) {

        Course c = new Course(new Cross(80), new Wall(5), new Water(100));
        Team team = new Team("Простоквашино", new Human("Дядя Федя"), new Cat("Матроскин"), new Dog("Шарик"));
        c.doIt(team);
        team.showResults();
    }
}
