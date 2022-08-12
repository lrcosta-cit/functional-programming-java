public class Main {
    public static void main(String[] args) {
        System.out.println("ODD NUMBERS");
        PrintOddNumbers.print();

        System.out.println("ALL COURSES");
        PrintCourses.printIndividually();

        System.out.println("ALL COURSES THAT CONTAINS 'SPRING'");
        PrintCourses.printAllContainsText("Spring");

        System.out.println("ALL COURSES THAT LENGTH ARE BIGGER THAN 4 CHARACTERS");
        PrintCourses.printAllBiggerThan4Char();

    }
}
