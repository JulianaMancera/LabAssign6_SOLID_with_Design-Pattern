public class BorrowService {
    public void borrowResource(Student student, LibraryResource resource) {
        resource.borrow(student.getTitle());
        System.out.println("Borrowed by: " + student);
    }
}
