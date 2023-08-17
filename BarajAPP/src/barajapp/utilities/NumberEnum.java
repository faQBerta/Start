package barajapp.utilities;

public enum NumberEnum {
    ONE(1, "One"), TWO(2, "Two"), THREE(3, "Three"), FOUR(4, "Four"), FIVE(5, "Five"), SIX(6, "Six"), SEVEN(7, "Seven"), TEN(10, "Ten"), ELEVEN(11, "Eleven"), TWELVE(12, "Twelve");
    
    private Integer num;
    private String value;
    
    private NumberEnum (Integer num, String value) {
            this.num = num;
            this.value = value;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
   
    
}
