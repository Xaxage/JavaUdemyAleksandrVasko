package collections.collectionsClass;

import java.util.*;

public class CollectionsRunner {
    public static void main(String[] args) {
       /* List<String> colors=new ArrayList<>();
        //String already has implementation of "compare.to" inside.
        colors.add("Yellow");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Black");
        colors.add("Red");
        System.out.println("List before sorting" + colors);
        Collections.sort(colors);
        System.out.println("List after sorting" + colors);*/

        List<Card> deckOfCards = new ArrayList<>();
        for (Card.Face face : Card.Face.values()) {
            for (Card.Suit suit : Card.Suit.values()) {
                deckOfCards.add(new Card(suit, face));
            }
        }
        System.out.println("Original deck of cards ");
        printOutput(deckOfCards);

        Collections.shuffle(deckOfCards);


        System.out.println("\n\nCards after shuffle");
        printOutput(deckOfCards);

        Collections.sort(deckOfCards);

        System.out.println("\n\nCards after sorting both face and suit ");
        printOutput(deckOfCards);

        Collections.sort(deckOfCards, Collections.reverseOrder());
        /*Sort has 2 types .First gets only 1 parameter "Collection".
        Second one gets both "Collection " and "Comparator".
        Collections.reverseOrder() is a comparator.*/
        System.out.println("\n\nCards after sorting reverse order both faces and suits");
        printOutput((List<Card>) deckOfCards);

        Collections.sort(deckOfCards, new CardComparator());//Adding "new" cause we made it.
        /*Sort has 2 types .First gets only 1 parameter "Collection".
        Second one gets both "Collection " and "Comparator".
        Collections.reverseOrder() is a comparator.*/
        System.out.println("\n\nCards after sorting reverse order only faces");
        printOutput(deckOfCards);

        Card card=new Card(Card.Suit.SPADES,Card.Face.Queen);

        int i=Collections.binarySearch(deckOfCards,card);
        //return card's position as int.Collection must be sorted before binary search.
        if(i>=0){
            System.out.println("\n\nCard was found at position " + i);
        }
        else{
            System.out.println("Card wasn't found.");
        }
    }

    private static void printOutput(List<Card> deckOfCards) {
        for (int i = 0; i < deckOfCards.size(); i++) {
            System.out.printf("%-20s %s", deckOfCards.get(i), (i + 1) % 4 == 0 ? "\n" : " ");
        }
    }


}
