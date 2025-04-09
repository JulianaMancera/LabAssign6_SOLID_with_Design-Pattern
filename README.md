# LabAssign6_SOLID_with_Design-Pattern
## NEU LIBRARY
&emsp;&emsp; The **NEU Library** offers a variety of resources, including books, theses, capstones, internet access, journals, and newspapers.
Currently, the Student object has methods like `borrowBook()`, `borrowJournal()` with a parameter of title, which directly depend on specific resource types.

&emsp;&emsp;To adhere to the **Dependency Inversion Principle (DIP)** and ensure flexibility for future changes *(such as introducing audio books or e-journals)*, we need to **refactor the program while maintaining SOLID principles.** The goal is to create a robust system that can seamlessly accommodate new resource types in the future.

**Note: Your solution should not violate other SOLID principles.** Make sure you have a TestProgram that will validate the proposed refactored codes.

## SOLID Principle with Design Pattern (Strategy Pattern)
- S: Single Responsibility - `Student` only holds student data. `Book` and `Journal` only handle borrowing logic. `BorrowService` only manages borrowing operations. Each class does one job.
- O: Open/Closed - You can add new resources (e.g., `Thesis`, `EJournal`) without modifying `BorrowService` or existing classes—just implement the `LibraryResource` interface.
- L: Liskov Substitution - you can pass a `Book` or `Journal` (both `LibraryResource`) to `BorrowService` without breaking anything.
- I: Interface Segregation - `LibraryResource` has only one method: `borrow()`. 
- D: Dependency Inversion - `BorrowService` depends on the interface `LibraryResource`, not concrete classes like `Book` or `Journal`. This promotes **loose coupling and flexibility**.
- Strategy Pattern - Encapsulates interchangeable algorithms/behaviors and allows them to vary independently from clients that use them.
| LibraryResource | strategy interface |
| Book, Journal | different strategies (different borrowing behaviors) |
| BorrowService | uses the strategy dynamically at runtime |
## UML CLASS DIAGRAM
