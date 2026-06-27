package truefalse;

import question.Question;
import question.QuestionEvaluator;

public class TrueFalseEvaluator implements QuestionEvaluator {

    @Override
    public int evaluate(Question question, String answer) {
        if ("True".equals(answer)) {
            return question.getPoints();
        }
        return 0;
    }
}
