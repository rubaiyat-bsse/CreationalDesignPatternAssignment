package source;

import question.Question;
import java.util.Random;

public class FakerQuestionSource implements QuestionSource {

    private int counter;
    private Random random;
    private String[] difficulties = {"Easy", "Medium", "Hard"};

    public FakerQuestionSource() {
        this.counter = 0;
        this.random = new Random();
    }

    @Override
    public Question getQuestion() {
        counter++;
        String text = "Generated Question " + counter;
        int points = random.nextInt(5) + 1;
        String difficulty = difficulties[random.nextInt(difficulties.length)];

        return new Question() {
            @Override
            public String getType() {
                return "Generated";
            }

            @Override
            public String getText() {
                return text;
            }

            @Override
            public int getPoints() {
                return points;
            }

            @Override
            public String getDifficulty() {
                return difficulty;
            }
        };
    }
}
