package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Question {
    /**
     * Class for each question in the quiz.
     * Stores a question and an array of answers, and the int of the correct answer.
     */

    private final String question;
    private final ArrayList<String> answers;
    private final String correctAnswer;

    /**
     * Compiler for objects of the Question class. S
     * ets the question, answer amount, and correct answer and then runs method to set up answers.
     * @param questionInfo Question, Answer, and Incorrect Choices.
     */
    public Question(String...questionInfo){
        question = questionInfo[0];
        correctAnswer = questionInfo[1];
        answers = new ArrayList<>();
        this.answers.addAll(Arrays.asList(questionInfo).subList(1, questionInfo.length));
        Collections.shuffle(this.answers);
    }

    /**
     * Accessor for the field questions.
     * @return The field question.
     */
    public String getQuestion(){
        return question;
    }

    /**
     * Accessor for the field answers.
     * @return The field answers.
     */
    public ArrayList<String> getAnswers(){
        return answers;
    }

    /**
     * Accessor for the field correctAnswer.
     */
    public String getCorrectAnswer(){
        return correctAnswer;
    }

    /**
     * Prints out the question and all answers.
     * @param questionNumber The number question the problem is.
     */

}
