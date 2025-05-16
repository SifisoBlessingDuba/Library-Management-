# Library-Management-
The Library Booking System is a Java-based desktop application built using the Swing GUI framework. It was developed to simplify and manage student reservations for library access by offering an intuitive interface and robust file-handling system. The application is structured to enable students to register their personal information and reserve time slots for library usage, ensuring an organized and fair allocation of library resources.

When the application is launched, users are first presented with a registration interface. This interface collects essential details from the user, including their full name, surname, student email address, cell phone number, and a unique 4-digit PIN. There is also an option for students to indicate whether they are handicapped by checking a designated checkbox. This accessibility feature was added to promote inclusivity and support for students with disabilities.

Upon completing the registration form, the student proceeds to a booking interface where they can select an available time slot. The booking screen features a table (JTable) that visually displays a schedule of hourly time intervals across different rooms. Each cell in the table represents a specific time and room combination. When the application starts, it reads previously booked slots from a text file and disables those cells in the table to prevent double bookings. This ensures that students only select from genuinely available time slots.

The system handles file operations through a utility class that reads and writes booking information to a .txt file. This file-based persistence approach ensures that bookings remain intact between application runs without needing a database. When a student makes a booking, the selected time slot, along with their details, is saved into the file. During application startup, the file is read, and booked slots are loaded into memory and reflected in the booking table.

To prevent logical errors, the code checks that the data being read from the file matches the expected format. Earlier issues with missing or misread slots were debugged by adjusting the logic to correctly interpret the file structure, particularly ensuring that array length checks aligned with the actual data. The logic was also corrected to ensure that all rows, including the first time slot, are properly evaluated and represented in the booking table.

In summary, the Library Booking System provides a simple yet functional interface for managing student bookings, ensuring that time slots are fairly distributed, and previous bookings are respected. Its combination of Swing for UI, file I/O for data persistence, and structured logic for conflict prevention makes it a practical example of how to develop GUI-based desktop applications in Java. The system is modular, extendable, and lays a solid foundation for more complex resource management systems in academic environments.








