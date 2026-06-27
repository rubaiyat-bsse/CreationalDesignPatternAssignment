package truefalse;

import question.Question;
import question.QuestionRenderer;

public class TrueFalseRenderer implements QuestionRenderer {

    @Override
    public void render(Question question) {
        System.out.println("---- True/False ----");
        System.out.println("Question: " + question.getText());
        System.out.println("Points: " + question.getPoints());
        System.out.println("Difficulty: " + question.getDifficulty());
    }
}
