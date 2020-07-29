package collections.collectionsClass;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CardComparator implements Comparator<Card> {
    //We want to make our own comparator ,so it will reverse only faces.
    List<Card.Face> faces = Arrays.asList(Card.Face.values());//We got the sam list.

    @Override
    public int compare(Card card1, Card card2) {
        if (faces.indexOf(card1.getFace()) < faces.indexOf(card2.getFace())) {
            //indexOf(),cause we sort by Enum element number
            return -1;//Our first String has less char-elements than the seconds one.
        } else if (faces.indexOf(card1.getFace()) > faces.indexOf(card2.getFace())) {
            //indexOf(),cause we sort by Enum element number
            return +1;//Our first String has more char-elements than the seconds one.
        } else if (faces.indexOf(card1.getFace()) == faces.indexOf(card2.getFace())) {
            //indexOf(),cause we sort by Enum element number
            return String.valueOf(card1.getSuit()).compareTo(String.valueOf(card2.getSuit()));
            //String.valueOf(suit) convert suit into String.
        }
        return 0;
    }
}
