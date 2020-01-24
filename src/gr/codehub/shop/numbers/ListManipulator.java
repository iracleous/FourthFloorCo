package gr.codehub.shop.numbers;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class ListManipulator {

    public List<Integer> getPrimes(List<Integer> listNumbers){
        List<Integer> primeList = new ArrayList<>();
        for(int i = 0; i< listNumbers.size() ; i++) {
                if ( isPrime (listNumbers.get(i) )) {
                    primeList.add(listNumbers.get(i));
                }
        }
         return primeList;
    }
    public List<Integer> getPrimes2(List<Integer> listNumbers){
        List<Integer> primeList = new ArrayList<>();
        for(int x:listNumbers) {
            if ( isPrime (x )) {
                primeList.add(x);
            }
        }
        return primeList;
    }

    public List<Integer> getPrimes3(List<Integer> listNumbers){
       return listNumbers.stream()
                .filter(p -> isPrime(p))
                .collect(Collectors.toList());
    }


     public boolean isPrime(int number){
        if (number % 2 ==0) return false;
        for(int i = 3; i<= (int) (Math.sqrt(number)) ; i += 2) {
            if (number % i ==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

//        Integer[] ns={2, 3, 5, 4, 12, 71, 72, 99, 41, 42, 121};
//        List<Integer> numbers = Arrays.asList(ns);
//      //  List<Integer> numbers1 = Lists.newArrayList(ns);
//
//        System.out.println(numbers);
//        ListManipulator myManip = new ListManipulator();
//        List<Integer> primeNumbers = myManip.getPrimes(numbers);
//        System.out.println(primeNumbers);
//
//        System.out.println(primeNumbers.stream().sorted().collect( Collectors.toList()));

        Calendar cal1= new GregorianCalendar();
        System.out.println("cal1= "+cal1.get(Calendar.YEAR));
        //shallow copy
        Calendar cal2=cal1;
        System.out.println("cal2= "+cal2.get(Calendar.YEAR));
        //deep copy
        Calendar cal3=new GregorianCalendar();
        cal3.setTimeInMillis(cal1.getTimeInMillis());
        System.out.println("cal2= "+cal2.get(Calendar.YEAR));
        cal1.add(Calendar.YEAR,-10);
        System.out.println("cal1= "+cal1.get(Calendar.YEAR));
        System.out.println("cal2= "+cal2.get(Calendar.YEAR));
        System.out.println("cal3= "+cal3.get(Calendar.YEAR));
        System.out.println("------------------");



        BigInteger x1= new BigInteger("5");
        BigInteger y1=x1;
        x1=x1.add(new BigInteger("4"));
        System.out.println(x1);
        System.out.println(y1);

        int xx= 5;
        int yy=xx;
        xx=9;
        System.out.println(yy);


    }



}
