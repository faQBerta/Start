package barajapp;

import barajapp.entities.DeckOfCard;

public class BarajAPP {

    public static void main(String[] args) {
        DeckOfCard Game = new DeckOfCard();

        Game.makeDeck();

        Game.avaibleCards();

        Game.giveCards();

        Game.showAvaibleCards();

        Game.showDeliveredCards();

        Game.avaibleCards();

    }

}
