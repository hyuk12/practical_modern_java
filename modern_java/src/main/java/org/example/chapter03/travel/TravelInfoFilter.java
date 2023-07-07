package org.example.chapter03.travel;

// 자바 8에서 인터페이스에 하나의 메서드만 정의한 것을 함수형 인터페이스라 한다.
public interface TravelInfoFilter {
    public boolean isMatched(TravelInfo travelInfo);
}
