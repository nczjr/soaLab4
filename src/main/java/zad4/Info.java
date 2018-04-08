package zad4;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Arrays;


@Named
@SessionScoped
public class Info implements Serializable{

    private String moneyAmount;
    private String frequency;
    private String[] color;
    private String[] clothesKind;
    private String lastShopping;
    private String shoppingSatisfaction;
    private String staffSatisfaction;
    private String comments;


    public Info() {
    }

    public String getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(String moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String[] getColor() {
        return color;
    }

    public void setColor(String[] color) {
        this.color = color;
    }

    public String[] getClothesKind() {
        return clothesKind;
    }

    public void setClothesKind(String[] clothesKind) {
        this.clothesKind = clothesKind;
    }

    public String getLastShopping() {
        return lastShopping;
    }

    public void setLastShopping(String lastShopping) {
        this.lastShopping = lastShopping;
    }

    public String getShoppingSatisfaction() {
        return shoppingSatisfaction;
    }

    public void setShoppingSatisfaction(String shoppingSatisfaction) {
        this.shoppingSatisfaction = shoppingSatisfaction;
    }

    public String getStaffSatisfaction() {
        return staffSatisfaction;
    }

    public void setStaffSatisfaction(String staffSatisfaction) {
        this.staffSatisfaction = staffSatisfaction;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "CommonInfo{" +
                "moneyAmount='" + moneyAmount + '\'' +
                ", frequency='" + frequency + '\'' +
                ", color=" + Arrays.toString(color) +
                ", clothesKind=" + Arrays.toString(clothesKind) +
                ", lastShopping='" + lastShopping + '\'' +
                ", shoppingSatisfaction='" + shoppingSatisfaction + '\'' +
                ", staffSatisfaction='" + staffSatisfaction + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
