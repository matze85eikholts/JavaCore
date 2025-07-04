import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Field field = new Field();
        GameLogic logic = new GameLogic();

        boolean playAgain = true;

        while (playAgain) {
            // Игрок делает ход
            field.readPlayerMove(scanner);

            // Компьютер делает ход
            field.setRandomComputerMove();

            // Выводим ходы
            System.out.println("Ваш ход: " + field.getPlayerMove());
            System.out.println("Ход компьютера: " + field.getComputerMove());

            // Определяем результат
            String result = logic.determineResult(field.getPlayerMove(), field.getComputerMove());
            System.out.println("Результат: " + result);

            // Предлагаем сыграть ещё раз
            System.out.print("Хотите сыграть ещё раз? (да/нет): ");
            String answer = scanner.nextLine().trim().toLowerCase();
            playAgain = answer.equals("да");
        }

        scanner.close();
        System.out.println("Спасибо за игру!");
    }
}