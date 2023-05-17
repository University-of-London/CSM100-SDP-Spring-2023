package blackjack;

public abstract class Player {

  protected BlackjackHand hand;
  private String name;

  public Player(String aName) {
    name = aName;
    hand = new BlackjackHand();
  }

  public String getName() {
    return name;
  }

  public BlackjackHand getHand() {
    return hand;
  }

  public void dealFaceUp(PlayingCard card) {
    hand.addFaceUp(card);
  }

  public void dealFaceDown(PlayingCard card) {
    hand.addFaceDown(card);
  }

  public abstract Move getMove(BlackjackHand... otherHands);

  public enum Move {HIT, STAND}
}
