public class TestProgram {
    public static void main(String[] args) {
        System.out.println("\n========== NEU Library ==========\n");

        Student student1 = new Student("228732", "Lee", "Felix", "Clean Code");
        Student student2 = new Student("239412", "Dela Cruz", "Maria", "AI and Robotics Journal");
        Student student3 = new Student("224578", "Kim", "Daniel", "Software Engineering Book");
        Student student4 = new Student("223301", "Lopez", "Juan", "Machine Learning Journal");
        Student student5 = new Student("230198", "Garcia", "Anna", "Refactoring: Improving the Design of Existing Code");

        LibraryResource book = new Book();
        LibraryResource journal = new Journal();

        BorrowService borrowService = new BorrowService();
        borrowService.borrowResource(student1, book);
        borrowService.borrowResource(student2, journal);
        borrowService.borrowResource(student3, book);
        borrowService.borrowResource(student4, journal);
        borrowService.borrowResource(student5, book);
    }
}
