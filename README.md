# People Management in Java

This is a sample project to demonstrate the implementation of a people management system in Java. The project includes classes to represent students and responsibles, as well as unit tests to ensure the correct functioning of the classes.

## Description

The goal of this project is to provide a basic implementation of a people management system, focusing on the following functionalities:

- Registration and management of information for students and responsibles.
- Assignment of grades to students and tracking of their academic performance.
- Tracking of monthly payments by responsibles.

## Project Structure

src/
│
├── main/
│ └── java/
│ └── people/
│ ├── person.java
│ ├── Responsible.java
│ └── Student.java
│
└── test/
└── java/
└── people/
├── ResponsibleTest.java
└── StudentTest.java



The project is structured into `main` and `test` packages, containing the main project classes and the unit tests, respectively.

## Environment Setup

To run the project locally, you need to have the JDK (Java Development Kit) installed on your system.

## Running the Project

Follow these steps to run the project:

1. Clone this repository to your local environment.
2. Navigate to the root folder of the project.
3. Execute the following command in the terminal to compile the project:
   javac -d bin src/main/java/people/.java src/test/java/people/.java
4. Execute the following command to run the tests:
   java -cp bin:lib/junit-jupiter-api-5.8.2.jar
   org.junit.platform.console.ConsoleLauncher --scan-class-path

## Contribution

Contributions are welcome! If you encounter any issues or have any suggestions for improvement, feel free to open an issue or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).

   


   



