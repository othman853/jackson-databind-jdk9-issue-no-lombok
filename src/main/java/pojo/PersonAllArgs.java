package pojo;

public class PersonAllArgs {

    private final String name;
    private final Integer age;

    public PersonAllArgs(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
