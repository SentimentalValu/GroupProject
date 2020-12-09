package com.groupProjectv2.model;

import com.groupProjectv2.UI.Menu;
import java.util.List;
//mport com.groupproject2.UI.QuestionScreen;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author jackf
 * @author Josh
 */
public class Controller {
    private static List<Deck> Decks = new ArrayList<>();
    private static int Score;
    private static int Time; 
    //private int Score = 0;
            
    
    public static void storeDeck(){
        // ToDo Create method to store decks outside of java and load them at initialisation
        // This method will create a list containing both decks with each deck having questions in and will assign them to the Decks attribute
        // This method will be called from the main class inside the Menu UI element
        // Test code below
        Deck basic  = new Deck();
        basic.setDecktype("Basic");
        basic = addQuestions(basic, "basicList.csv");
        
        Deck Advanced = new Deck();
        Advanced.setDecktype("Advanced");
        
        Decks.add(basic);
        //Decks.add(Advanced);
        
    }
    public static Deck getDeck(String DeckType){
        // ToDo 
        // This method will be called once from within the menu class in order to set the decktype
        // Very simple
        // Will just take whichever button the user clicked return the Deck that the user has selected
        if (DeckType.equals("Basic")){
            return Decks.get(0); 
        }
        else{
            return Decks.get(1);
        }
    }
    public static void storeInfo(int ScoreIn, int TimeIn){
        Score  = ScoreIn;
        Time = TimeIn;
    }
    
    public static Deck addQuestions(Deck deck, String URL){
        try (BufferedReader csvReader = new BufferedReader(new FileReader(URL))){
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
    
   
    
    
}
