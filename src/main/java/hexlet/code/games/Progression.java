package hexlet.code.games;


import java.util.Random;

public class Progression {
    public static String[] progression() {
        Random random = new Random();
        String quest = "";
        int randomPoint = 100;

//          Создаем массив чисел
        int[] array = new int[random.nextInt(randomPoint) + 5];
        int step = random.nextInt(randomPoint) + 1;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                array[i] = random.nextInt(randomPoint) + 1;
            } else {
                array[i] = array[i - 1] + step;
            }
        }

//          прячем число
        int hiddemNum = random.nextInt(array.length);
        for (int i = 0; i < array.length; i++) {
            if (i == hiddemNum) {
                quest += ".. ";
            } else {
                quest += array[i] + " ";
            }
        }

        int realAnswer = array[hiddemNum];
        String[] gameKey = {quest, Integer.toString(realAnswer)};
        return gameKey;
    }
}
