package collections.collectionsClass;

import java.util.Arrays;
import java.util.List;

public class Card implements Comparable<Card> {//It's parameter is "Card",cause
    //we are comparing that type .

    public Card(Suit suit, Face face) {
        this.suit = suit;
        this.face = face;
    }

    //Enums can be only inside static classes
    public enum Suit {SPADES, HEARTS, CLUBS, DIMONDS;}//Sorting alphabetical

    public enum Face {Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace;}

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
        Face[] values = Face.values();
        //inputting elements of "Face" enum into "values" array.
        List<Face> faces = Arrays.asList(values);
        //Converting our array into the list
        if (faces.indexOf(this.face) < faces.indexOf(card.getFace())) {
            return -1;//Our first String has less char-elements than the seconds one.
        } else if (faces.indexOf(this.face) > faces.indexOf(card.getFace())) {
            return +1;//Our first String has more char-elements than the seconds one.
        } else if (faces.indexOf(this.face) == faces.indexOf(card.getFace())) {
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
