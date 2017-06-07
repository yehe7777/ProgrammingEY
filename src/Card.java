public class Card {
  
  private String suit;     
  private String rank;     
  private int pointValue;  
  

  public Card(String cardRank, String cardSuit, int cardPointValue) {
    suit = cardSuit;
    rank = cardRank;
    pointValue = cardPointValue;
  }
  

  public String suit() {
    return suit;
  }
  

  public String rank() {
    return rank;
  }
  

  public int pointValue() {
    return pointValue;
  }
  
  
  public boolean matches(Card otherCard) {
    if(otherCard.suit().equals(this.suit()) && otherCard.rank().equals(this.rank()) && otherCard.pointValue() == this.pointValue())
      return true;
    else
      return false;
  }
  
  
  
  public String toString() {
    return rank + " of " + suit + " (point value = " + pointValue + ")";
  }
}