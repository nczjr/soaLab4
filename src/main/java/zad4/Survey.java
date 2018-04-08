package zad4;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class Survey implements Serializable{

    @Inject
    private Person person;
    @Inject
    private Info info;
    private int bustSize;
    private String cupSize;
    private int waist;
    private int hips;
    private int legLength;
    private int chest;
    private boolean accepted = false;
    private int counter = 0;


    public Survey() {
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getBustSize() {
        return bustSize;
    }

    public void setBustSize(int bustSize) {
        this.bustSize = bustSize;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public int getWaist() {
        return waist;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }

    public int getHips() {
        return hips;
    }

    public void setHips(int hips) {
        this.hips = hips;
    }

    public int getLegLength() {
        return legLength;
    }

    public void setLegLength(int legLength) {
        this.legLength = legLength;
    }

    public int getChest() {
        return chest;
    }

    public void setChest(int chest) {
        this.chest = chest;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void incrementCounter(){
        counter++;
    }

    @Override
    public String toString() {
        return "Survey{" +
                person +
                "," + info +
                ", bustSize=" + bustSize +
                ", cupSize='" + cupSize + '\'' +
                ", waist=" + waist +
                ", hips=" + hips +
                ", legLength=" + legLength +
                ", chest=" + chest +
                '}';
    }
}
