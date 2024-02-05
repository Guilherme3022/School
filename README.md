# People Management System

This project is a simple Java implementation of a People Management System. It includes three classes: `Person`, `Student`, and `Responsible`, designed to represent different types of individuals within a system.

## Class: `Person`

The `Person` class is an abstract class that serves as a base for other classes. It implements the `PersonIF` interface and contains common attributes such as name, ID, email, and phone. The class provides getter and setter methods for each attribute.

### Attributes:
- `name` (String): Represents the name of the person.
- `id` (String): Represents the ID of the person.
- `email` (String): Represents the email address of the person.
- `phone` (String): Represents the phone number of the person.

### Methods:
- `getName()`: Returns the name of the person.
- `setName(String name)`: Sets the name of the person.
- `getId()`: Returns the ID of the person.
- `setId(String id)`: Sets the ID of the person.
- `getEmail()`: Returns the email address of the person.
- `setEmail(String email)`: Sets the email address of the person.
- `getPhone()`: Returns the phone number of the person.
- `setPhone(String phone)`: Sets the phone number of the person.

## Class: `Student`

The `Student` class extends the `Person` class and introduces additional attributes and methods specific to a student. It includes attributes such as registration, grades, and methods for managing grades.

### Additional Attributes:
- `registration` (String): Represents the registration number of the student.
- `grades` (double[]): Represents an array of grades for the student.

### Additional Methods:
- `getRegistration()`: Returns the registration number of the student.
- `setRegistration(String registration)`: Sets the registration number of the student.
- `getGrades()`: Returns an array of grades for the student.
- `setGrades(double[] grades)`: Sets the array of grades for the student.
- `consolidatedGrades(int unit, double nota)`: Consolidates grades based on unit and grade values.
- `finalMedia()`: Private method to calculate the final average of the student.
- `report()`: Override method to generate a report for the student.
- `situation(int x)`: Override method to determine the situation of the student.

## Class: `Responsible`

The `Responsible` class extends the `Person` class and includes attributes and methods specific to a responsible person. It introduces the concept of payments and methods to manage monthly payments.

### Additional Attributes:
- `payments` (boolean[]): Represents an array of boolean values indicating payment status for each month.

### Additional Methods:
- `getPayments()`: Returns an array indicating payment status for each month.
- `setPayments(boolean[] payments)`: Sets the array indicating payment status for each month.
- `mensalPayments(int month, boolean situation)`: Method to manage monthly payments.
- `situation(int x)`: Override method to determine the situation of the responsible person.
- `report()`: Override method to generate a report for the responsible person.

Feel free to extend and modify these classes according to the specific requirements of your People Management System.
