package day01;

public class Actor {
    private String name;
    private int birthDate;

    public Actor(String name, int birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public int getBirthDate() {
        return birthDate;
    }
}
