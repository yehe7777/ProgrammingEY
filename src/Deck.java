import java.util.List;

public class Deck {
  private List<Card> Card;    
  private int size;       
  
  
  public Deck(String[] ranks, String[] suits, int[] values, List<Card> Card) {
    for(int i = 0; i < ranks.length; i++){
      @SuppressWarnings("unused")
	Card card = new Card(ranks[i], suits[i], values[i]);    
      this.Card = Card;
    }
    size = Card.size();   
  }
  
  
  public boolean isEmpty() {
    return Card.isEmpty();
  }
  

  public int size() {
    return Card.size();
  }
  
  
  public void shuffle() {
   
  }
  
  
  public Card deal() {
	return null;
  
  }
  
  

  public String toString() {
    String rtn = "size = " + size + "\nUndealt cards: \n";
    
    for (int k = size - 1; k >= 0; k--) {
      rtn = rtn + Card.get(k);
      if (k != 0) {
        rtn = rtn + ", ";
      }
      if ((size - k) % 2 == 0) {
        // Insert carriage returns so entire deck is visible on console.
        rtn = rtn + "\n";
      }
    }
    
    rtn = rtn + "\nDealt cards: \n";
    for (int k = Card.size() - 1; k >= size; k--) {
      rtn = rtn + Card.get(k);
      if (k != size) {
        rtn = rtn + ", ";
      }
      if ((k - Card.size()) % 2 == 0) {
        
        rtn = rtn + "\n";
      }
    }
    
    rtn = rtn + "\n";
    return rtn;
  }
}