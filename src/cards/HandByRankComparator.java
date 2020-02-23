package cards;

import java.util.Comparator;

public class HandByRankComparator implements Comparator<Hand> {

    private Rank aRankToCompare;

    public HandByRankComparator() {
        // Default: compare number of Ace in the hand
        aRankToCompare = Rank.ACE;
    }

    /**
     * Contruct a new comparator to compare by a certain rank
     * @param pRankToCompare the rank to be compared
     */
    public HandByRankComparator(Rank pRankToCompare) {
        aRankToCompare = pRankToCompare;
    }

    public void setRankToCompare(Rank pRankToCompare) {
        aRankToCompare = pRankToCompare;
    }

    /**
     * @param pHand
     * @return the total number of this rank
     */
    private int countRank(Hand pHand) {
        int count = 0;
        for (Card c : pHand) {
            if (c.getRank() == aRankToCompare) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int compare(Hand o1, Hand o2) {
        System.out.println("Compare by " + aRankToCompare + " (ascending)");
        return countRank(o1) - countRank(o2);
    }
}
