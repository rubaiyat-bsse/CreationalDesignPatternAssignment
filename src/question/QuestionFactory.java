package question;

public interface QuestionFactory {
    Question createQuestion();
    QuestionRenderer createRenderer();
    QuestionEvaluator createEvaluator();
}
