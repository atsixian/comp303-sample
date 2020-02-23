package cards;

import java.util.List;

/**
 * Utility functions
 */
public class Util {
    public static int countAces(List<Card> pCards){
        int total = 0;
        for (Card c : pCards) {
            if (c.getRank() == Rank.ACE) total ++;
        }
        return total;
    }
}
