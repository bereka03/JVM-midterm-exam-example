import java.util.Objects;

public class Department {
    private int people;
    private String name;

    public Department(int people, String name){
        this.people = people;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getPeople() {
        return people;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Department department){
            return name == department.getName() && people == department.getPeople();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(people, name);
    }
}
