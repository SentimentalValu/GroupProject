/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groupProjectv2.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Josh
 */
public class Main {
    
    //basic lauch class, this could be combined to storeDeck() to form StoreDecks()
    //however I think it makes more sense for these deck instantiations to be made in the RunGame() method
    //and to put storeDeck code in StoreDecks (i suggest changing StoreDecks method name to storeDeck just for convention)
    //NOTE: I have changed some class and variable names to coincide with java conventions (lower case method names, lower case object names) 
    //so i suggest these are changed, but if not be careful to change the names back
    public static void main(String args[]){
         Deck basic  = new Deck();
        basic.setDecktype("Basic");
        basic = storeDeck(basic);
        
        
        Deck advanced = new Deck();
        advanced.setDecktype("Advanced");
        //advanced = addToDeck(advanced);
        
      String question = basic.getQuestions().get(1).getQuestion();
      showQuestion(question);
         
    }
    
    //csv file is read into the program and assigned to question attributes
    //csv is in the format: question number, question, option1, option2, option3, correct answer number
    //the question is appended to the Deck question list attribute
    //NOTE: for this to work i had to changed the Deck class to create an empty arrayList upon instanciation
    //by changing the attribute to: private List<Question> Questions = new ArrayList<>();
    public static Deck storeDeck(Deck deck){
        try (BufferedReader csvReader = new BufferedReader(new FileReader("csv path name"))){
        String row;
        while ((row = csvReader.readLine()) != null) {
           String[] data = row.split(",");
           Question q = new Question();
           int num = Integer.parseInt(data[0]);
           q.setQuestionNo(num);
           q.setQuestion(data[1]);
           q.setOption1(data[2]);
           q.setOption2(data[3]);
           q.setOption3(data[4]);
           int correct = Integer.parseInt(data[5]);
           q.setCorrectAnswer(correct);
           deck.getQuestions().add(q);
        }
        csvReader.close();
        }catch(IOException e){
           e.printStackTrace();
        }
        return deck;
    }
    
    //this is an extra method to convert the question from csv format into
    //a nice displayable format for the UI
    //it takes the question and splits the String up into different lines of text on the /n delimiter
    //NOTE: for this to work /n must also be placed at the end of the question
    //NOTE: this prints to the screen, im not sure how the UI works but the print statements will probably need
    //to be replaced by return statements e.g return ""; and  return c1; respectively
    public static void showQuestion(String question){
        int counter = 0;
        while(counter < question.length()-1){
            char c1 = question.charAt(counter);
            char c2 = question.charAt(counter+1);

            if(c1 == '/' && c2 == 'n'){
              System.out.println();
             counter+=2;
            }
            else{
               System.out.print(c1);
               counter+=1;
            } 
       }
    }
}
