import java.util.List;

public class PrintCourses {
    static List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","Docker");
    public static void printIndividually() {

        courses.stream().forEach(System.out::println);
    }

    public static void printAllContainsText(String text){
        courses.stream().filter(course -> course.contains(text)).forEach(System.out::println);
    }

    public static void printAllBiggerThan4Char(){
        courses.stream().filter(course -> course.length() > 4).forEach(System.out::println);
    }

    public static void printLengthCourses(){
        courses.stream().map(course -> course.length()).forEach(System.out::println);
    }
}
