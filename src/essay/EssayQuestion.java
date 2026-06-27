package essay;

import question.Question;

public class EssayQuestion implements Question {

    private String type;
    private String text;
    private int points;
    private String difficulty;

    public EssayQuestion(String text, int points, String difficulty) {
        this.type = "Essay";
        this.text = text;
        this.points = points;
        this.difficulty = difficulty;
    }

    @Override
    public String getType() {
        return type;
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
}
