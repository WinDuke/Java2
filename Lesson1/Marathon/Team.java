package Lesson1.Marathon;

public class Team {
    String name;
    Competitors[] competitors;
    StringBuilder results;

    public Team(String name, Competitors... competitors) {
        this.name = name;
        this.competitors = competitors;
        this.results = new StringBuilder();
    }

    public void setResult(String result) {
        results.append(result).append("\n");
    }

    public String getName() {
        return name;
    }

    public Competitors[] getCompetitors() {
        return competitors;
    }

    public void showResults() {
        System.out.println("Результаты команды: " + name);
        System.out.println("----------------------------------");
        System.out.print(results);
    }
}
