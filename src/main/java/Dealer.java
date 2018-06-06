import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Object that will be used to deal deck of cards
 *
 */
public class Dealer {

    private Deck deckOfCards;

    /**
     * Constructs an instance of Dealer
     * @param deckOfCards
     */
    Dealer(Deck deckOfCards){
        this.deckOfCards = deckOfCards;
    }

    /**
     * Deal card at the top.
     * @return a Card Object
     */
    public Optional<Card> deal(){
        return this.deckOfCards.getCards().empty() ? Optional.empty() :
                Optional.of(this.deckOfCards.getCards().pop());
    }

    /**
     * Deals giving number of cards if provided number is available
     * @param numberOfCards
     * @return List of Hands
     */
    public Optional<List<Card>> deal(int numberOfCards){
        if(this.deckOfCards.getCards().empty() ||
                this.deckOfCards.getCards().size() < numberOfCards) {
           return Optional.empty();
        } else {
            List<Card> hand = new ArrayList<>();
            for (int i = 0; i< numberOfCards; i++) {
               hand.add(this.deckOfCards.getCards().pop());
            }
            return Optional.of(hand);
        }
    }

    public Deck getDeckOfCards() {
        return deckOfCards;
    }

}
