package models;

/**
 * IS-A describes an inheritance relationship; Has-A describes an association relationship;
 * <p>
 * Abstraction class may define a constructor; otherwise compiler will add a non-argument constructor.
 * <p>
 * Why need an abstraction class a constructor? The sub-class must match with the super class and to have such a
 * constructor.
 */
public class Employee extends AbstractPerson {
    private Integer id;
    private String department;
    private AbstractPerson manager;

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Employee(String firstName, String lastName, Integer id) {
        super(firstName, lastName);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public AbstractPerson getManager() {
        return manager;
    }

    public void setManager(AbstractPerson manager) {
        this.manager = manager;
    }
}
