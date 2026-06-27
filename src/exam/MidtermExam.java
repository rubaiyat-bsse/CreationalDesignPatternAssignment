package exam;

import config.ExamConfiguration;
import question.Question;
import java.util.ArrayList;
import java.util.List;

public class MidtermExam implements Exam {

    private ExamConfiguration configuration;
    private List<Question> questions = new ArrayList<>();

    public MidtermExam() {
    }

    public void setConfiguration(ExamConfiguration configuration) {
        this.configuration = configuration;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public List<Question> getQuestions() {
        return questions;
    }

    @Override
    public String getType() {
        return "Midterm Exam";
    }

    @Override
    public void displayInfo() {
        System.out.println("Exam Type: Midterm Exam");
    }
}
