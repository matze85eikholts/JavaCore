public class GameLogic {

    // Определяет результат игры
    public String determineResult(String playerMove, String computerMove) {
        if (playerMove.equals(computerMove)) {
            return "Ничья!";
        }

        switch (playerMove) {
            case "камень":
                return (computerMove.equals("ножницы")) ? "Вы выиграли!" : "Вы проиграли.";
            case "ножницы":
                return (computerMove.equals("бумага")) ? "Вы выиграли!" : "Вы проиграли.";
            case "бумага":
                return (computerMove.equals("камень")) ? "Вы выиграли!" : "Вы проиграли.";
            default:
                return "Неверный ход!";
        }
    }
}