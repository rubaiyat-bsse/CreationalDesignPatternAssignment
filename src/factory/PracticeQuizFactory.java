package factory;

import exam.Exam;
import exam.PracticeQuiz;

public class PracticeQuizFactory extends ExamFactory {

    @Override
    public Exam createExam() {
        return new PracticeQuiz();
    }
}
