package cards;

import java.util.Arrays;

public class Driver {

    public static void main(String[] args) {
        Deck deck = new Deck();
        Hand[] hands = new Hand[] {deck.deal(), deck.deal()};

        System.out.println(Arrays.toString(hands));
        Arrays.sort(hands, new HandByRankComparator(Rank.JACK));
        System.out.println(Arrays.toString(hands));
    }
}
