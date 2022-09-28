package Chater01.맛보기예제;

public class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }

    double getCharge() {
        double result = 0;
        // 비디오 종류 별로 계산
        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (getDaysRented() > 2) {
                    result += (getDaysRented() - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                result += getDaysRented() * 3;
                break;
            case Movie.CHILDREN:
                result += 1.5;
                if (getDaysRented() > 3)
                    result += (getDaysRented() - 3) * 1.5;
                break;
        }
        return result;
    }
    int getFrequentRenterPoints(){
        // 최신물을 이틀 이상 대여하면 2 포인트 지급하고 그 외엔 1 포인트 지급하는 코드를
        // 빼네 getFrequentRenterPoints 메서드로 만들고 이 Rental 클래스로 옮겼다.
        if ((getMovie().getPriceCode() == Movie.NEW_RELEASE && getDaysRented() > 1)) {
            return 2;
        } else return 1;
    }
}
