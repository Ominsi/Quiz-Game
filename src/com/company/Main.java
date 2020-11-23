package com.company;

public class Main {

    public static void main(String[] args) {
        Question testQuestion = new Question("What is the capital of England", "London", "New York", "New London", "York");
        System.out.println(testQuestion.getQuestion());
        System.out.println(testQuestion.getCorrectAnswer());
        for (String answer: testQuestion.getAnswers()){
            System.out.println(answer);
        }
    }
}
