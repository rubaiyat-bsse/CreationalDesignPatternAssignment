package truefalse;

import question.Question;
import question.QuestionEvaluator;
import question.QuestionFactory;
import question.QuestionRenderer;
import source.QuestionSource;

public class TrueFalseFactory implements QuestionFactory {

    private QuestionSource source;

    public TrueFalseFactory(QuestionSource source) {
        this.source = source;
    }

    @Override
    public Question createQuestion() {
        Question base = source.getQuestion();
        return new TrueFalseQuestion(base.getText(), base.getPoints(), base.getDifficulty());
    }

    @Override
    public QuestionRenderer createRenderer() {
        return new TrueFalseRenderer();
    }

    @Override
    public QuestionEvaluator createEvaluator() {
        return new TrueFalseEvaluator();
    }
}
