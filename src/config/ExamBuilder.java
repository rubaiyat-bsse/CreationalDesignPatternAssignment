package config;

public class ExamBuilder {

    private ExamConfiguration configuration;

    public ExamBuilder() {
        this.configuration = new ExamConfiguration();
    }

    public ExamBuilder setTitle(String title) {
        configuration.title = title;
        return this;
    }

    public ExamBuilder setDuration(int duration) {
        configuration.duration = duration;
        return this;
    }

    public ExamBuilder setPassingScore(int passingScore) {
        configuration.passingScore = passingScore;
        return this;
    }

    public ExamBuilder enableNegativeMarking() {
        configuration.negativeMarking = true;
        return this;
    }

    public ExamBuilder enableShuffle() {
        configuration.questionShuffle = true;
        return this;
    }

    public ExamBuilder enableAutoSubmit() {
        configuration.autoSubmit = true;
        return this;
    }

    public ExamBuilder allowCalculator() {
        configuration.calculatorAllowed = true;
        return this;
    }

    public ExamConfiguration build() {
        return configuration;
    }
}
