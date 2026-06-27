package truefalse;

import question.Question;

public class TrueFalseQuestion implements Question {

    private String type;
    private String text;
    private int points;
    private String difficulty;

    public TrueFalseQuestion(String text, int points, String difficulty) {
        this.type = "True/False";
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
