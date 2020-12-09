
package com.groupProjectv2.model;
import com.groupProjectv2.model.Question;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author jackf
 */
public class Deck {
    private String Decktype;
    private List<Question> Questions = new ArrayList<>();
	
    public String getDecktype() {
	return Decktype;
    }
    public void setDecktype(String decktype) {
	Decktype = decktype;
    }
    public List<Question> getQuestions() {
	return Questions;
    }
    public void setQuestions(List<Question> questions) {
	Questions = questions;
    } 
    
}
