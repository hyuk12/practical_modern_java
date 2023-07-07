package org.example.chapter02.extend;

public interface Human {
    public int getAge();

    public String getName();

    public String getGender();

    // default 메서드이며 human 을 리턴
    default String getInformation() {
        return "Human";
    }
}
