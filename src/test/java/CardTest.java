import enums.FaceCards;
import enums.Suits;
import org.junit.Assert;
import org.junit.Test;

public class CardTest {

    @Test
    public void getSuit() {
        Card card = new Card(Suits.SPADE, FaceCards.ACE);

        Assert.assertEquals(Suits.SPADE, card.getSuit());
    }

    @Test
    public void getFaceName() {
        Card card = new Card(Suits.SPADE, FaceCards.ACE);

        Assert.assertEquals(FaceCards.ACE, card.getFaceName());
    }

    @Test
    public void compareCardsDifferentSuitSameFace() {
        Card card = new Card(Suits.SPADE, FaceCards.ACE);
        Card card2 = new Card(Suits.CLUBS, FaceCards.ACE);

        Assert.assertEquals(-1, card.compareTo(card2));
    }

    @Test
    public void compareCardsSameSuitDifferentFace() {
        Card card = new Card(Suits.SPADE, FaceCards.ACE);
        Card card2 = new Card(Suits.SPADE, FaceCards.KING);

        Assert.assertEquals(-1, card.compareTo(card2));
    }


}