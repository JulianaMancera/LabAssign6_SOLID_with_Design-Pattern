public class Journal implements LibraryResource {
    private final String station = "'Journal Station'";

    @Override
    public void borrow(String title) {
        System.out.println(station);
        System.out.println("Journal borrowed: " + title);
    }
}
