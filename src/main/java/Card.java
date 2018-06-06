import enums.FaceCards;
import enums.Suits;

public class Card implements Comparable<Card> {
    private Suits suit;
    private FaceCards faceName;

    /**
     * Constructs instance of Card
     * @param suit
     * @param faceName
     */
    Card (Suits suit, FaceCards faceName) {
        this.faceName = faceName;
        this.suit = suit;
    }

    public String toString(){
        return String.format("FaceName: %s, Suit: %s ", this.faceName, this.suit);
    }

    /**
     *
     * @return Suit of Card
     */
    public Suits getSuit() {
        return suit;
    }

    /**
     * Get Face Card Name and Value
     * @return Face Card
     */
    public FaceCards getFaceName() {
        return faceName;
    }

    /**
     * Sorts cards by Suits highest value first
     *
     * @param o
     * @return
     */
    @Override
    public int compareTo(Card o) {

        int comparison = Integer.compare(this.suit.getSuitValue(), o.suit.getSuitValue());
        if (comparison != 0 ) return comparison;
        return Integer.compare(o.faceName.getRank(), this.faceName.getRank());
    }
}
