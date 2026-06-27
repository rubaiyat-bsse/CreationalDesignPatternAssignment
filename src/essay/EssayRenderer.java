package essay;

import question.Question;
import question.QuestionRenderer;

public class EssayRenderer implements QuestionRenderer {

    @Override
    public void render(Question question) {
        System.out.println("---- Essay ----");
        System.out.println("Question: " + question.getText());
        System.out.println("Points: " + question.getPoints());
        System.out.println("Difficulty: " + question.getDifficulty());
    }
}
