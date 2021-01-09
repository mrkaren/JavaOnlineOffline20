package classwork.chapter12;

public enum Role {

    ADMIN(3000000),
    USER(2000000),
    MANAGER,
    GUEST;

    private int salary;

    Role(int salary) {
        this.salary = salary;
    }
    Role(){
    }

    public int getSalary() {
        return salary;
    }
}
