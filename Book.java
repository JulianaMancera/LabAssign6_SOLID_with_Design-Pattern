public class Book implements LibraryResource {
    private final String station = "'Book Station'";

    @Override
    public void borrow(String title) {
        System.out.println(station);
        System.out.println("Book borrowed: " + title);
    }
}
