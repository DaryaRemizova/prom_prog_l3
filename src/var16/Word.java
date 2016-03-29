package var16;

/**
 * Created by Дарья on 29.03.2016.
 */
public class Word {
    private String spelling;
    private Mood mood;
    private int ratio;

    Word() {
        this.spelling = "unset";
        this.mood = new Mood();
        this.ratio = 0;
    }

}
