package pojos;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

//@JsonSerialize(using = ToStringSerializer.class)
public class CreateEmployeeRequest {
    @JsonProperty("name")
    private String name;
    @JsonProperty("salary")
    private String salary;
    @JsonProperty("age")
    private String age;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSalary() {
        return salary;
    }

    public String getAge() {
        return age;
    }
}
