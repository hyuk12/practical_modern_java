package org.example.chapter02.extend;

public class Worker implements Female, Male{
    public static final String MALE = "Male";
    public static final String FEMALE = "Female";

    private int age;
    private String name;
    private String gender;

    public Worker(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getGender() {
        String returnValue = null;
        if(gender != null && "Male".equals(gender)) {
            returnValue = Male.super.getGender();
        }else if(gender!= null && "Female".equals(gender)) {
            returnValue = Female.super.getGender();
        }else {
            returnValue = "N/A";
        }
        return returnValue;
    }

    @Override
    public String getInformation() {
        return Female.super.getInformation();
    }

    public static void main(String[] args) {
        Worker worker = new Worker( 23,"John", Worker.MALE);

        System.out.println(worker.getInformation() + ", " + worker.getGender());
    }
}
