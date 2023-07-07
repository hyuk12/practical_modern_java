package org.example.chapter02.extend;

public interface Male extends Human{
    public static String GENDER_MALE = "Male";

    @Override
    default String getGender() {
        return Male.GENDER_MALE;
    };
}
