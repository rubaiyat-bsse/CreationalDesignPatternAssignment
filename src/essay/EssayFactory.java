package essay;

import question.Question;
import question.QuestionEvaluator;
import question.QuestionFactory;
import question.QuestionRenderer;
import source.QuestionSource;

public class EssayFactory implements QuestionFactory {

    private QuestionSource source;

    public EssayFactory(QuestionSource source) {
        this.source = source;
    }

    @Override
    public Question createQuestion() {
        Question base = source.getQuestion();
        return new EssayQuestion(base.getText(), base.getPoints(), base.getDifficulty());
    }

    @Override
    public QuestionRenderer createRenderer() {
        return new EssayRenderer();
    }

    @Override
    public QuestionEvaluator createEvaluator() {
        return new EssayEvaluator();
    }
}
