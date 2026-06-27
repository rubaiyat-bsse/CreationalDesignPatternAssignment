package source;

import question.Question;

public class ManualQuestionSource implements QuestionSource {

    @Override
    public Question getQuestion() {
        return new Question() {
            @Override
            public String getType() {
                return "General";
            }

            @Override
            public String getText() {
                return "Manual Question";
            }

            @Override
            public int getPoints() {
                return 2;
            }

            @Override
            public String getDifficulty() {
                return "Easy";
            }
        };
    }
}
