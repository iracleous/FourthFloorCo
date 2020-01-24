package gr.codehub.shop.f4;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Solution  {
    //fields
    private String title;
    private String description;
    private double agreedPrice;
    private double finalPrice;
    private Date date;

    //constructor

    public Solution(String title, String description, double agreedPrice, double finalPrice, Date date) {
        this(title, agreedPrice, date);
        this.description = description;
        this.finalPrice = finalPrice;
    }

    public Solution(String title,   double agreedPrice, Date date) {
        this.title = title;
        this.agreedPrice = agreedPrice;
        this.date = date;
    }

    public Solution() {
    }
//methods


    @Deprecated
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAgreedPrice() {
        return agreedPrice;
    }

    /**
     *
     * @param agreedPrice
     */
    public void setAgreedPrice(double agreedPrice) {
        this.agreedPrice = agreedPrice;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    /**
     *
     */
    public void setFinalPrice(  ) {
        int months = getMonths();
        switch(months){
            case 0:
            case 1:
                finalPrice = 0.7 * agreedPrice;
                break;
            case 2:
                finalPrice = 0.9 * agreedPrice;
                break;
            default:
                finalPrice = agreedPrice;
         }
    }

    /**
     *
     * @return the difference in months of the today and starting date of the solution
     */
    private int getMonths() {
        Calendar today= GregorianCalendar.getInstance();
        Calendar dateOfProposal= GregorianCalendar.getInstance();
        dateOfProposal.setTimeInMillis(date.getTime());

        int todayInMonths = today.get(Calendar.YEAR) * 12 + today.get(Calendar.MONTH);
        int proposalInMonths = dateOfProposal.get(Calendar.YEAR) * 12 + dateOfProposal.get(Calendar.MONTH);
        return todayInMonths - proposalInMonths;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Solution{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", agreedPrice=" + agreedPrice +
                ", finalPrice=" + finalPrice +
                ", date=" + date +
                '}';
    }
}
