package com.groupProjectv2.model;

import java.util.List;
import com.groupProjectv2.UI.QuestionScreen;

/**
 *
 * @author jackf
 */
public class Controller {
    private List<Deck> Decks;
    private Deck DeckToRun;
    
    public void StoreDecks(){
        // ToDo Create method to store decks outside of java and load them at initialisation
        // This method will create a list containing both decks with each deck having questions in and will assign them to the Decks attribute
        // This method will be called from the main class inside the Menu UI element
        // Test code below
        Deck Basic  = new Deck();
        Basic.setDecktype("Basic");
        
        Deck Advanced = new Deck();
        Advanced.setDecktype("Advanced");
        
        
    }
    public Deck SetDeck(String DeckType){
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
    public void RunGame(Deck DeckToRun){
        int Score = 0;
        // The main method
        // This will run the game
        // Will take the deck selected and iterate through each question displaying each within the QuestionScreen UI element
        // This will also keep track of the score and how many the user has correct
        // At the end of the game this method will display the users score and the time taken and then take the user back to the main menu
        
        for (Question Q : DeckToRun.getQuestions()){
            QuestionScreen Qs = new QuestionScreen(Q, Score, null);
            
        }
    }
   
    
    
}
