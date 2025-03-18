import java.util.*;

public class AppointmentScheduler {
    private PriorityQueue<Person> priorityQueue;
    private List<Person> noShows;

    public AppointmentScheduler() {
        // Priority queue with custom comparator
        priorityQueue = new PriorityQueue<>(Comparator
            .comparing(Person::getPriority, Comparator.reverseOrder()) // Higher priority first
            .thenComparing(Person::getAge) // Younger patients first
            .thenComparing(Person::isFromHospital, Comparator.reverseOrder()) // Hospital patients first
        );
        noShows = new ArrayList<>();
    }

    public void addPerson(Person person) {
        priorityQueue.add(person);
    }

    public String getAppointments() {
        StringBuilder result = new StringBuilder();
        for (Person person : priorityQueue) {
            result.append(person.toString()).append("\n");
        }
        return result.toString().isEmpty() ? "No Appointments Scheduled" : result.toString();
    }

    public void trackNoShow(Person person) {
        if (noShows.size() >= 5) {
            noShows.remove(0); // Remove the oldest no-show
        }
        noShows.add(person);
    }

    public String getNoShowsAsString() {
        StringBuilder result = new StringBuilder();
        for (Person person : noShows) {
            result.append(person.toString()).append("\n");
        }
        return result.toString().isEmpty() ? "No No-Shows Tracked" : result.toString();
    }
}