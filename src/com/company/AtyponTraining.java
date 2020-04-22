package com.company;

import java.util.ArrayList;

public class AtyponTraining {
    private int numberOfTrainees;
    ArrayList<String>trainees;
    private String instructor;
    public void AtyponTrain(){
        numberOfTrainees=0;
        instructor=" ";
    }
    public void AtyponTrain(int num,String ins){
        this.numberOfTrainees=num;
        this.instructor=ins;
    }
    public void addStudent(String name){
        trainees.add(name);
    }
    public void removeTrainee(String name){
        trainees.remove(name);
    }

}
