package factory;

import exam.Exam;
import exam.MidtermExam;

public class MidtermExamFactory extends ExamFactory {

    @Override
    public Exam createExam() {
        return new MidtermExam();
    }
}
