package ru.mskorotkov.spring.domain;

import java.util.List;
import java.util.stream.IntStream;

public class Question {
    /**
     * qNumber - number of question
     * answerList - list of answers to question
     * descText = text of question
     */
    private final int qNumber;

    private final String descText;

    private final List<String> answerList;

    public Question(List<String> list ) {
        this.qNumber = Integer.parseInt(list.get(0));
        this.descText = list.get(1);
        this.answerList = list.subList(2,list.size());
    }

    public String getDescText() {
        return descText;
    }

    public int getqNumber() {
        return qNumber;
    }

    public List<String> getAnswerList(){
        return answerList;
    }

    public void showQuestion(){
        System.out.println(this.qNumber+". " + this.descText);
        IntStream.range(0,this.answerList.size())
                .forEach(i->System.out.println("\t"+this.qNumber+"."+(i+1) + " " + this.answerList.get(i)));
        System.out.println("\n");
    }
}
