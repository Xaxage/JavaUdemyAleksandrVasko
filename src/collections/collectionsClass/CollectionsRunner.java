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


    public static class Card implements Comparable<Card>{//It's parameter is "Card",cause
        //we are comparing that type .

        public Card(Suit suit, Face face) {
            this.suit = suit;
            this.face = face;
        }

        //Enums can be only inside static classes
        public enum Suit {SPADES, HEARTS, CLUBS, DIMONDS;}//Sorting alphabetical

        public enum Face { Six, Seven, Eight, Nine, Ten, Jack, Queen, King,Ace;}

        private final Face face;
        private final Suit suit;

        public Face getFace() {
            return face;
        }

        public Suit getSuit() {
            return suit;
        }

        @Override
        public int compareTo(Card card) {
            Face[] values=Face.values();
            //inputting elements of "Face" enum into "values" array.
            List<Face> faces= Arrays.asList(values);
            //Converting our array into the list
             if(faces.indexOf(this.face)<faces.indexOf(card.getFace())){
                 return -1;//Our first String has less char-elements than the seconds one.
             }else if(faces.indexOf(this.face)>faces.indexOf(card.getFace())){
                 return +1;//Our first String has more char-elements than the seconds one.
             }else if(faces.indexOf(this.face)== faces.indexOf(card.getFace())){
                return String.valueOf(suit).compareTo(String.valueOf(card.getSuit()));
                //String.valueOf(suit) convert suit into String.
             }
             return 0;//this means that we got the same cards
        }

        @Override
        public String toString() {
            return face + " of " + suit;
        }
    }

    public static class CardComparator implements Comparator<Card>{
        //We want to make our own comparator ,so it will reverse only faces.
        List<Card.Face> faces=Arrays.asList(Card.Face.values());//We got the sam list.
        @Override
        public int compare(Card card1, Card card2) {
            if(faces.indexOf(card1.getFace())<faces.indexOf(card2.getFace())){
                return -1;//Our first String has less char-elements than the seconds one.
            }else if(faces.indexOf(card1.getFace())>faces.indexOf(card2.getFace())){
                return +1;//Our first String has more char-elements than the seconds one.
            }else if(faces.indexOf(card1.getFace())== faces.indexOf(card2.getFace())){
                return String.valueOf(card1.getSuit()).compareTo(String.valueOf(card2.getSuit()));
                //String.valueOf(suit) convert suit into String.
            }
            return 0;
        }
    }
}
