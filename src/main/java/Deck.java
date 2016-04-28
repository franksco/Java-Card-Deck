import java.util.ArrayList;
import java.util.Random;

public class Deck{
    private static final String[] SUITS = {"Spades", "Clubs", "Hearts", "Diamonds"};
    private static final String[] VALUES = {
    "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"
  };

  private ArrayList<String> mCards;

  public Deck() {
    mCards = new ArrayList<String>();
    for (String suit : SUITS) {
      for ( String value : VALUES) {
        mCards.add(value + " of " + suit);
      }
    }
  }

  public ArrayList<String> getCards() {
    return mCards;
  }

  public String randomCard() {
    Random randomGenerator = new Random();
    int i = randomGenerator.nextInt(52);
    return mCards.get(i);
  }
}
