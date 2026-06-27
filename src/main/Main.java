package main;

import exam.Exam;
import exam.PracticeQuiz;
import exam.MidtermExam;
import exam.FinalExam;
import factory.ExamFactory;
import factory.MidtermExamFactory;
import config.ExamConfiguration;
import config.ExamBuilder;
import question.Question;
import question.QuestionRenderer;
import question.QuestionEvaluator;
import question.QuestionFactory;
import source.QuestionSource;
import source.BankQuestionSource;
import mcq.MCQFactory;
import essay.EssayFactory;
import programming.ProgrammingFactory;
import truefalse.TrueFalseFactory;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // ===== STEP 1: Factory Method =====
        ExamFactory examFactory = new MidtermExamFactory();
        Exam exam = examFactory.createExam();
//        exam.displayInfo();
//        System.out.println();

        // ===== STEP 2: Builder Pattern =====
        ExamConfiguration config = new ExamBuilder()
                .setTitle("OOP Midterm Exam")
                .setDuration(60)
                .setPassingScore(50)
                .enableNegativeMarking()
                .enableShuffle()
                .enableAutoSubmit()
                .build();

        ((MidtermExam) exam).setConfiguration(config);
//        System.out.println("Configuration built and assigned.");
//        System.out.println();

        // ===== STEP 3: Question Source (Dependency Injection) =====
        QuestionSource source = new BankQuestionSource();
//        System.out.println("BankQuestionSource created.");
//        System.out.println();

        // ===== STEP 4: Abstract Factory =====
        List<QuestionFactory> factories = new ArrayList<>();
        factories.add(new MCQFactory(source));
        factories.add(new MCQFactory(source));
        factories.add(new EssayFactory(source));
        factories.add(new ProgrammingFactory(source));
        factories.add(new TrueFalseFactory(source));
//        System.out.println("5 question factories created.");
//        System.out.println();

        // ===== STEP 5: Create, Render, Evaluate =====
//        System.out.println();
//
        String[] sampleAnswers = {"A", "A", "Anything", "Code", "True"};

        for (int i = 0; i < factories.size(); i++) {
            QuestionFactory factory = factories.get(i);
            Question question = factory.createQuestion();
            QuestionRenderer renderer = factory.createRenderer();
            QuestionEvaluator evaluator = factory.createEvaluator();

            ((MidtermExam) exam).addQuestion(question);

//            renderer.render(question);
            int marks = evaluator.evaluate(question, sampleAnswers[i]);
//            System.out.println("Answer: " + sampleAnswers[i] + " | Marks: " + marks + "/" + question.getPoints());
//            System.out.println();
        }

        // ===== STEP 6: Dashboard =====
        System.out.println("Type            : " + exam.getType());
        System.out.println("Title           : " + config.getTitle());
        System.out.println("Duration        : " + config.getDuration() + " minutes");
        System.out.println("Passing Score   : " + config.getPassingScore());
        System.out.println();
        System.out.println("Negative Marking : " + config.isNegativeMarking());
        System.out.println("Question Shuffle : " + config.isQuestionShuffle());
        System.out.println("Auto Submit      : " + config.isAutoSubmit());
        System.out.println("Calculator       : " + config.isCalculatorAllowed());
        System.out.println();
        System.out.println("Question Source  : BankQuestionSource");
        System.out.println();
        System.out.println("--- Questions ---");
        List<Question> questions = ((MidtermExam) exam).getQuestions();
        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("  Q" + (i + 1) + ":");
            System.out.println("    Type       : " + q.getType());
            System.out.println("    Text       : " + q.getText());
            System.out.println("    Points     : " + q.getPoints());
            System.out.println("    Difficulty : " + q.getDifficulty());
        }
        System.out.println();
        System.out.println("===================================================");
    }
}
