package Chater01;

import Chater01.맛보기예제.Customer;
import Chater01.맛보기예제.Movie;
import Chater01.맛보기예제.Rental;

import static Chater01.맛보기예제.Movie.CHILDREN;
import static Chater01.맛보기예제.Movie.NEW_RELEASE;

public class Chapter01TestRunner {
    public static void main(String[] args) {
        //when
        Customer wndbcks = new Customer("wndbcks");
        Customer juyoochan = new Customer("juyoochan");

        Movie 탬탬버린 = new Movie("탬탬버린", CHILDREN);
        Movie youtube = new Movie("Youtube", NEW_RELEASE);

        Rental toWndbcks = new Rental(탬탬버린, 2);
        Rental toJuyoochan = new Rental(youtube, 2);

        //given
        wndbcks.addRental(toWndbcks);
        juyoochan.addRental(toJuyoochan);

        String ofWndbcks = wndbcks.statement();
        String ofJuyoochan = juyoochan.statement();

        //then
        System.out.println("ofJuyoochan = " + ofJuyoochan);
        System.out.println("ofWndbcks = " + ofWndbcks);

        /**
         * ofJuyoochan = juyoochan고객님의 대여 기록
         * 	 Youtube	6.0
         *  누적 대여로   6.0
         *  적립 포인트   2
         *
         * ofWndbcks = wndbcks고객님의 대여 기록
         *  탬탬버린	     1.5
         *  누적 대여로    1.5
         *  적립 포인트    1
         */
    }
}
