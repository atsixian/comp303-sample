import cards.Card;
import cards.Rank;
import cards.Suit;
import cards.Util;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UtilTest {

    @Test
    void testCountAces() {
        List<Card> cards = new ArrayList<>();
        // Here's the Flyweight Card class
        cards.add(Card.get(Rank.ACE, Suit.CLUBS));
        cards.add(Card.get(Rank.EIGHT, Suit.HEARTS));
        assertEquals(1, Util.countAces(cards));
    }
}