package StackQueue;

import collections.collectionsClass.Card;
import collections.collectionsClass.CardComparator;

import java.util.Iterator;
import java.util.PriorityQueue;

import java.util.Queue;
import java.util.Stack;
/*We use stack collection when we want to work on collection than delete it .
Method pop() is very helpful */

public class StackQueuLauncher {
    public static void main(String[] args) {
        //passengerProcessing();
        Queue<Card> cardDeck = new PriorityQueue<>(36, new CardComparator());
        for (Card.Face face : Card.Face.values()) {
            for (Card.Suit suit : Card.Suit.values()) {
                cardDeck.offer(new Card(suit, face));//can change to add()
            }
        }

        for(int i=0;i<10;i++){
            System.out.println(cardDeck.poll());
        }
        System.out.println("Deck size is "+ cardDeck.size());
        System.out.println(cardDeck.toString());
        System.out.println(cardDeck.peek());//peek() wont delete peak element after returning it
        /*q.offer(4);
        q.offer(5);
        q.offer((23));
        q.offer(1);
        System.out.println(q.poll());
        System.out.println(q.poll());*/

    }



    public static void passengerProcessing(){
        Stack<Passenger> bus = new Stack<>();
        Passenger passenger = new Passenger("Katerina", "Ivanova");
        bus.push(new Passenger("Alex", "Vasko"));
        bus.push(new Passenger("Viktor", "Mikhailov"));
        bus.push(new Passenger("Dmitrii", "Petrov"));
        bus.push(passenger);
        bus.push(new Passenger("Ivan", "Ivanov"));

        System.out.println("Passenger found at position: " + bus.search(passenger));
        /*The Stack.search(Object element) method in Java is used to search
        for an element in the stack and get its distance from the top.
        This method starts the count of the position from 1 and not from 0.
        The element that is on the top of the stack is considered to be at position 1.*/

        System.out.println("Last entered passenger is: " + bus.peek());
        //peek() get us the last element of the stack
        while(!bus.empty()){
            System.out.println("Passenger " + bus.pop()) ;
            //pop() get us the last element of the stack and delete it right after.
        }


    }

    private static class Passenger{
        private static int number=0;/*It's static so we can count how many
         passengers were created.Watch inside constructor.*/
        private String name;
        private String surname;

        public Passenger(String name, String surname) {
            number++;
            this.name = name;
            this.surname = surname;
        }

        public static int getNumber() {
            return number;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        @Override
        public String toString() {
            return "Passenger " + name+" "+surname;

        }
    }
}

