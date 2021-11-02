package s03enum;

public enum GameLevel {

    EASY("easy"),
    MEDIUM("medium"),
    HARD("hard");

    private String name;

    GameLevel(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
