public class Person {
    private String name;
    private int age;
    private String priority;
    private String gpDetails;
    private boolean isFromHospital;

    public Person(String name, int age, String priority, String gpDetails, boolean isFromHospital) {
        this.name = name;
        this.age = age;
        this.priority = priority;
        this.gpDetails = gpDetails;
        this.isFromHospital = isFromHospital;
    }

    // Getters and setters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getPriority() { return priority; }
    public String getGpDetails() { return gpDetails; }
    public boolean isFromHospital() { return isFromHospital; }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Priority: " + priority + ", GP: " + gpDetails + ", From Hospital: " + isFromHospital;
    }
}