package customPackage;


public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private Gender gender;

    public Person(String name, int age, Gender gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public Gender getGender() {
        return gender;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public String toString(){
        String txt = name + " ";
        txt += age + " ";
        txt += gender;
        return txt;
    }
    public int compareTo(Person p){
        return this.name.compareTo(p.getName());
    }
    public boolean equals(Person p1){
        boolean b1 = name.equals(p1.getName());
        boolean b2 = age == p1.getAge();
        boolean b3 = gender.equals(p1.getGender());
        return b1 && b2 && b3;
    }
    public int hashCode(){
        return name.hashCode() + age + gender.hashCode();
    }
}