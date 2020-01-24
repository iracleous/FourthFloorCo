package gr.codehub.shop.f6;

import java.util.Date;
import java.util.List;



public class CardSendDto {

    private int cardSent;
    private List<Person> notReceivedCardPerson;
    private Employee responsibleEmployee;
    private Date sendDate;

    public CardSendDto() {
    }

    public int getCardSent() {
        return cardSent;
    }

    public void setCardSent(int cardSent) {
        this.cardSent = cardSent;
    }

    public List<Person> getNotReceivedCardPerson() {
        return notReceivedCardPerson;
    }

    public void setNotReceivedCardPerson(List<Person> notReceivedCardPerson) {
        this.notReceivedCardPerson = notReceivedCardPerson;
    }

    public Employee getResponsibleEmployee() {
        return responsibleEmployee;
    }

    public void setResponsibleEmployee(Employee responsibleEmployee) {
        this.responsibleEmployee = responsibleEmployee;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }
}
