public class Main {
    public static void main(String[] args) {
        Dealer spades = new Dealer(new Deck());

        System.out.println(spades.getDeckOfCards());
        spades.getDeckOfCards().shuffle();
        System.out.println(spades.getDeckOfCards());
        System.out.printf("Cards Dealt: %s\n", spades.deal());
        System.out.printf("Cards Dealt: %s\n", spades.deal(5));
    }
}
