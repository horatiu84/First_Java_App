public class GameStatusesExample {
    public static void main(String[] args) {
        for (GameStatus gameStatus:GameStatus.values()){
            System.out.println(gameStatus);
        }

        GameStatus game = GameStatus.PAUSED;
        System.out.println(game);
    }
}
