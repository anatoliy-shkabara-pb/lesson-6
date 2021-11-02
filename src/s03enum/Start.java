package s03enum;

public class Start {
    public static void main(String[] args) {
        Game game = new Game(GameLevel.HARD);
        game.start();

        GameLevel[] levels = GameLevel.values();
        System.out.println("Game levels: ");
        for (GameLevel level: levels) {
            System.out.println(level);
        }


        GameLevel level = game.getGameLevel();
        switch (level) {
            case EASY:
            case MEDIUM:
                System.out.println("Игра началась");
                break;
            case HARD:
                System.out.println("Ого! Желаем удачи!");
        }
    }
}
