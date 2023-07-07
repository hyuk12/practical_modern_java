package org.example.chapter02.extend;

public interface Female extends Human{
    public static String GENDER_FEMALE = "Female";

    @Override
    default String getGender() {
        return GENDER_FEMALE;
    }
}
