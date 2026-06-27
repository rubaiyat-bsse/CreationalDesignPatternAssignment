package config;

public class ExamConfiguration {

    String title;
    int duration;
    int passingScore;
    boolean negativeMarking;
    boolean questionShuffle;
    boolean autoSubmit;
    boolean calculatorAllowed;

    public ExamConfiguration() {
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public int getPassingScore() {
        return passingScore;
    }

    public boolean isNegativeMarking() {
        return negativeMarking;
    }

    public boolean isQuestionShuffle() {
        return questionShuffle;
    }

    public boolean isAutoSubmit() {
        return autoSubmit;
    }

    public boolean isCalculatorAllowed() {
        return calculatorAllowed;
    }
}
