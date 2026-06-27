package factory;

import exam.Exam;
import exam.FinalExam;

public class FinalExamFactory extends ExamFactory {

    @Override
    public Exam createExam() {
        return new FinalExam();
    }
}
