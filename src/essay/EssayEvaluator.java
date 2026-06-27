package essay;

import question.Question;
import question.QuestionEvaluator;

public class EssayEvaluator implements QuestionEvaluator {

    @Override
    public int evaluate(Question question, String answer) {
        return question.getPoints() / 2;
    }
}
