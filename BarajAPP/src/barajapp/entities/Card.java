
package barajapp.entities;

import barajapp.utilities.NumberEnum;
import barajapp.utilities.Suit;

public class Card {
    
    private NumberEnum num;
    private Suit suit;

    public Card() {
    }
    
    public Card(NumberEnum num, Suit suit) {
        this.num = num;
        this.suit = suit;
    }

    public NumberEnum getNum() {
        return num;
    }

    public void setNum(NumberEnum num) {
        this.num = num;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "" + num.getNum() + " de " + suit + ".";
    }
    
    
    
    
    
    
}