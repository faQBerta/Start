package barajapp.entities;

import barajapp.utilities.NumberEnum;
import barajapp.utilities.Suit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class DeckOfCard {

    private ArrayList<Card> cards;
    private ArrayList<Card> deliveredCards;
    private Iterator<Card> it;
    private Scanner leer;

    public DeckOfCard() {
        this.cards = new ArrayList();
        this.deliveredCards = new ArrayList();
    }

    public void makeDeck() {
        for (Suit suit : Suit.values()) {
            for (NumberEnum num : NumberEnum.values()) {
                Card c = new Card(num, suit);
                cards.add(c);
            }
        }

        Collections.shuffle(cards);

        it = cards.iterator();
    }

    private void nextCard() {
            it.hasNext();
            Card handCard = it.next();
            deliveredCards.add(handCard);
            it.remove();
        }

    public void avaibleCards() {
        System.out.println("There's " + cards.size() + " cards left in the deck.");
    }

    public void showDeliveredCards() {
        System.out.println("Las cartas repartidas fueron: ");
        for (Card card : deliveredCards) {
            System.out.println(card.toString());
        }
    }

    public void showAvaibleCards() {
        System.out.println("Las cartas disponible son: ");
        for (Card card : cards) {
            System.out.println(card.toString());
        }
    }
    
    public void giveCards() {
         leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.print("How many cards do you want? ");
        int givenCards = leer.nextInt();
        if ( givenCards <cards.size()) {
            for (int i = 0; i < givenCards; i++) {
                nextCard();
            } 
        } else {
            System.out.println("There's not that many cards.");
        }
    }

}
