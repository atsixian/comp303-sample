package cards;

import java.util.Arrays;
import java.util.Iterator;

public class Hand implements Iterable<Card>{

    private Card[] aCards = new Card[10];

    class HandIterator implements Iterator<Card> {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < aCards.length;
        }


        @Override
        public Card next() {
            return aCards[index++];
        }
    }

    public Hand(Card[] pCards) {
        aCards = pCards.clone();
    }


    @Override
    public Iterator<Card> iterator() {
        return new HandIterator();
    }

    @Override
    public String toString() {
        return Arrays.toString(aCards);
    }
}
