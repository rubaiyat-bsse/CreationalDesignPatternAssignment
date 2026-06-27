package programming;

import question.Question;
import question.QuestionEvaluator;
import question.QuestionFactory;
import question.QuestionRenderer;
import source.QuestionSource;

public class ProgrammingFactory implements QuestionFactory {

    private QuestionSource source;

    public ProgrammingFactory(QuestionSource source) {
        this.source = source;
    }

    @Override
    public Question createQuestion() {
        Question base = source.getQuestion();
        return new ProgrammingQuestion(base.getText(), base.getPoints(), base.getDifficulty());
    }

    @Override
    public QuestionRenderer createRenderer() {
        return new ProgrammingRenderer();
    }

    @Override
    public QuestionEvaluator createEvaluator() {
        return new ProgrammingEvaluator();
    }
}
