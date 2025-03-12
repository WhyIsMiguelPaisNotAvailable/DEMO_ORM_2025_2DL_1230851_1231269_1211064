package isep.eapli.demo_orm.util;

import jakarta.persistence.Embeddable;

import java.util.Locale;

@Embeddable
public class Matricula {
    private String firstSegment;
    private String secondSegment;
    private String thirdSegment;

    protected Matricula(){
    }

    public Matricula(String firstSegment, String secondSegment, String thirdSegment){
        this.firstSegment=firstSegment.toUpperCase(Locale.ROOT);
        this.secondSegment=secondSegment.toUpperCase(Locale.ROOT);
        this.thirdSegment=thirdSegment.toUpperCase(Locale.ROOT);
    }

    public String firstSegment(){
        return firstSegment;
    }
    public String secondSegment(){
        return secondSegment;
    }
    public String thirdSegment(){
        return thirdSegment;
    }

    @Override
    public String toString() {
        return String.format("%s-%s-%s",firstSegment,secondSegment,thirdSegment);
    }
}
