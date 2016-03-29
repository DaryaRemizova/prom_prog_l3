package var16;

/**
 * Created by Дарья on 29.03.2016.
 */

import java.util.ArrayList;
import java.io.*;
import java.util.regex.*;

public class TextAnalyzer {
    public static void main(String[] args) {

        //Создаём настороения
        Mood positive = new Mood("Positive");
        Mood negative = new Mood("Negative");

        //Создаём банк слов
        ArrayList<Word> wordList = new ArrayList<Word>();

        //Считываем текст из файла
        String fileName = "C://Users//Дарья//IdeaProjects//prom_prog_l3//data.txt";
        File file = new File(fileName);
        StringBuilder sb = new StringBuilder();

    }
}
