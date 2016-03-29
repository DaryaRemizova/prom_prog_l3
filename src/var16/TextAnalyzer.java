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

        wordList.add(new Word("recommend", positive, +1));
        wordList.add(new Word("verified", positive, +1));
        wordList.add(new Word("verifying", positive, +1));
        wordList.add(new Word("verification", positive, +1));
        wordList.add(new Word("support", positive, +4));
        wordList.add(new Word("ok", positive, +2));
        wordList.add(new Word("yes", positive, +1));

        wordList.add(new Word("don't", negative, -1));
        wordList.add(new Word("never", negative, -1));
        wordList.add(new Word("stupid", negative, -3));
        wordList.add(new Word("lose", negative, -2));
        wordList.add(new Word("storm", negative, -2));

        //Считываем текст из файла
        String fileName = "C://Users//Дарья//IdeaProjects//prom_prog_l3//data.txt";
        File file = new File(fileName);
        StringBuilder sb = new StringBuilder();

    }
}
