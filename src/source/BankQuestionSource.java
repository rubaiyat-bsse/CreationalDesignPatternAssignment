package source;

import question.Question;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BankQuestionSource implements QuestionSource {

    private List<Question> bank;
    private Random random;

    public BankQuestionSource() {
        this.random = new Random();
        this.bank = new ArrayList<>();

        bank.add(createQuestion("What is polymorphism?", 3, "Medium"));
        bank.add(createQuestion("Explain inheritance", 4, "Medium"));
        bank.add(createQuestion("What is encapsulation?", 2, "Easy"));
        bank.add(createQuestion("Define abstraction", 2, "Easy"));
        bank.add(createQuestion("What is a design pattern?", 3, "Medium"));
        bank.add(createQuestion("Explain the Factory pattern", 5, "Hard"));
        bank.add(createQuestion("What is the Builder pattern?", 5, "Hard"));
        bank.add(createQuestion("Define coupling and cohesion", 4, "Hard"));
        bank.add(createQuestion("What is SOLID?", 3, "Medium"));
        bank.add(createQuestion("Explain DRY principle", 1, "Easy"));
    }

    private Question createQuestion(String text, int points, String difficulty) {
        return new Question() {
            @Override
            public String getType() {
                return "Bank";
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
        };
    }

    @Override
    public Question getQuestion() {
        int index = random.nextInt(bank.size());
        return bank.get(index);
    }
}
