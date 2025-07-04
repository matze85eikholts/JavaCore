import java.util.Scanner;

public class Field {
    private String playerMove;
    private String computerMove;

    public String getPlayerMove() {
        return playerMove;
    }

    public String getComputerMove() {
        return computerMove;
    }

    // Получает ход игрока с клавиатуры
    public void readPlayerMove(Scanner scanner) {
        System.out.print("Введите ваш ход (камень/ножницы/бумага): ");
        playerMove = scanner.nextLine().trim().toLowerCase();
    }

    // Устанавливает случайный ход компьютера
    public void setRandomComputerMove() {
        String[] moves = {"камень", "ножницы", "бумага"};
        int index = (int)(Math.random() * 3);
        computerMove = moves[index];
    }
}