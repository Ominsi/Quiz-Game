package com.company;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Class for the quiz.
 * Controls the question set, the tracking of correct answers.
 */
public class Quiz {

    private ArrayList<Question> questions;
    private int answersCorrect;

    /**
     * Compiler for Quiz objects.
     * Sets answersCorrect to 0 and
     * Adds questions then shuffles them.
     */
    public Quiz(){
        answersCorrect = 0;
        questions = new ArrayList<Question>();
        setQuestions();
        }
    }

    /**
     * Accessor for the questions field.
     * @return The list of questions as an ArrayList.
     */
    public ArrayList<Question> getQuestions(){
        return questions;
    }

    /**
     * Accessor for the answersCorrect field.
     * @return The amount of correct answers.
     */
    public int getAnswersCorrect(){
        return answersCorrect;
    }

    /**
     * Setter for questions fields.
     * Adds all questions to setQuestions.
     * Shuffles the questions after being added.
     */
    private void setQuestions(){
        questions.add(new Question("What is the capital of London", "London", "New York", "New London", "York"));
        questions.add(new Question("Who was the fifth president of the US", "James Monroe", "James Madison"));
        Collections.shuffle(questions);
    }
}
