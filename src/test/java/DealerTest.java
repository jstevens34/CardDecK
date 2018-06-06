import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class DealerTest {

    Deck deck;

    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void canDealCard() {
        Dealer dealer = new Dealer(deck);

        Card card = dealer.deal().get();

        Assert.assertNotNull(card);
    }

    @Test
    public void canDealMultipleCards() {
        Dealer dealer = new Dealer(deck);

        List<Card> card = dealer.deal(3).get();

        Assert.assertEquals(3, card.size());
    }

    @Test
    public void deckIsEmpty() {
        Dealer dealer = new Dealer(deck);

        Boolean cards = dealer.deal(54).isPresent();

        Assert.assertEquals(false, cards);
    }

}