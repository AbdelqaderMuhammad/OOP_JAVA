package Annotations;


@Serializable
public class Car {

    @JsonField(key = "manufacture")
    public String make;
    @JsonField(key = "")
    public String module;
    public String year;

    public Car(String make, String module, String year) {
        this.make = make;
        this.module = module;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car { " +
                "make ='" + make + '\'' +
                ", module ='" + module + '\'' +
                ", year ='" + year + '\'' +
                '}';
    }
}
