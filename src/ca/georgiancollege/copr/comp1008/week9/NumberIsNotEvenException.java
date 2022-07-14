package ca.georgiancollege.copr.comp1008.week9;

public class NumberIsNotEvenException extends  Exception{

    public NumberIsNotEvenException(){
        super();
    }
    public NumberIsNotEvenException(String message){
        super(message);
    }
}
