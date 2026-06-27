package programming;

import question.Question;
import question.QuestionEvaluator;

public class ProgrammingEvaluator implements QuestionEvaluator {

    @Override
    public int evaluate(Question question, String answer) {
        return question.getPoints();
    }
}
