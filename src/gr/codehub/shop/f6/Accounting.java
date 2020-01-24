package gr.codehub.shop.f6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Accounting implements ICrudable<Person>{

    private List<Person> persons;

    public Accounting(){
         persons = new ArrayList<>();
    }

    public  CardSendDto sendChristmasCard(){
        CardSendDto cardSentDto = new CardSendDto();
        int sentCards=0;
        List<Person> employeesNotReceivedCard =
                new ArrayList<>();

        for (Person p:persons) {
            int sentStatus = p.sendCard();
            if (sentStatus==0) {
                employeesNotReceivedCard.add(p);
            }
            sentCards+= sentStatus;
        }

        cardSentDto.setNotReceivedCardPerson(employeesNotReceivedCard);
        cardSentDto.setCardSent(sentCards);
        cardSentDto.setSendDate(new Date());

        return cardSentDto;
    }


    @Override
    public void addNewElement(Person tau) {
        persons.add(tau);
    }

    @Override
    public Person read(int index) {
        return persons.get(index);
    }

    @Override
    public void update(int index, Person newPerson) {
        persons.set(index, newPerson);
    }

    @Override
    public void delete(int index) {
        persons.remove(index);
    }

    public void showAll0()    {
        for (int i=0; i<persons.size();i++)
            System.out.println(persons.get(i));
    }

    public void showAll()    {
        for (Person p:persons)
            System.out.println(p);
    }

    public void showAll2()    {
        persons.forEach(p -> System.out.println(p));
    }
    public void showAll3()    {
        persons.forEach( System.out :: println);
    }

}
