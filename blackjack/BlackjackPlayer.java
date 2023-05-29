package blackjack;

public abstract class BlackjackPlayer extends Player {
  protected BlackjackHand hand;
  private String name;

  public BlackjackPlayer(String aname) {
    super(aname);
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
}
