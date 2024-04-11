# Calculator API Project

## Overview

This Calculator API is a Java-based RESTful service developed using the Spring Boot framework. It's designed to provide a hands-on experience with one of the industry standards: REST API testing. The project covers basic arithmetic operations and is structured to emphasize best practices in unit testing.

## Objective

The primary purpose of this project is to serve as a practice tool for learning and enhancing unit testing skills, specifically in the context of REST APIs. Unit testing is a critical area for growth in software development, ensuring that each part of the code performs as expected.

## Features

- Basic arithmetic operations: Addition, Subtraction, Multiplication, Division, and Modulus.
- RESTful API endpoints for each operation.
- Exception handling for edge cases like division by zero.

## Growth Area: Unit Testing with REST API

- This project is an excellent opportunity to dive into the nuances of unit testing, a key skill in software development.
- Emphasizes on testing REST API, which is a vital part of the modern software development landscape.
- Includes examples of various unit testing scenarios, focusing on industry-standard practices.

## Getting Started

This section provides detailed instructions on setting up and running the Calculator API project. Follow these steps to get the project up and running on your local machine for development and testing purposes.

### Prerequisites

Before you start, ensure you have the following installed on your system:

- Java JDK 11 or newer
- Maven (for managing project dependencies and running the project)
- An IDE of your choice (e.g., IntelliJ IDEA, Eclipse, VS Code)

### Step 1: Clone the Repository

Begin by cloning the repository to your local machine. If the project is hosted on a site like GitHub, use the following command:

```bash
git clone https://github.com/Supernorwood/calculator-api.git
```

### Step 2: Import the Project into Your IDE

Open your IDE and import the project. Most IDEs have an option to import existing projects and will automatically detect the project settings from the `pom.xml` file.

### Step 3: Install Dependencies

The project uses Maven for dependency management. To install all necessary dependencies, navigate to the project's root directory in your terminal and run:

```bash
mvn clean install
```

This command cleans the target directory, installs project dependencies, and builds the project.

### Step 4: Run the Application

To start the application, navigate to the `src/main/java/com/testing/calculator/CalculatorApplication.java` file and run the main method. Alternatively, you can use the Maven Spring Boot plugin from the terminal:

```bash
mvn spring-boot:run
```

The application should start, and the API will be accessible via `http://localhost:8080`.

### Step 5: Accessing the API

You can access the API endpoints through tools like Postman or by using `curl` commands in the terminal. The API supports basic arithmetic operations like addition, subtraction, multiplication, division, and modulus.

### Step 6: Running Unit Tests

To run the unit tests, you can use your IDE's built-in test runner or execute the tests using Maven with the following command:

```bash
mvn test
```

This command will run all the tests in the `src/test/java` directory.

### Step 7: Exploring and Adding Tests

- Explore existing test cases in the `src/test/java` directory to understand how unit tests are written and executed.
- Try writing additional tests to cover more scenarios and edge cases.

### Step 8: Learning and Experimentation

- Modify the code and observe how it affects the test outcomes. This practice helps in understanding the importance of tests in verifying application functionality.
- Review and compare your testing approaches with industry standards to enhance your learning.

By following these steps, you should have a running instance of the Calculator API project and be ready to start experimenting with and learning about unit testing in Java Spring Boot applications.

## How to Use This Project for Learning

1. **Understand REST API Concepts:** Familiarize yourself with REST API principles and how they are implemented in Spring Boot.
2. **Write Unit Tests:** Practice by writing tests for both the service layer and the REST controllers.
3. **Run and Analyze Tests:** Execute tests to see how they verify the functionality and handle failure scenarios.
4. **Experiment:** Modify code and tests to see how changes affect test outcomes and application behavior.
5. **Review Industry Standards:** Compare your testing approach with industry standards and best practices.

## Contributing to Tests

Contributions to enhance the test suite are always welcome. This includes adding more test cases or improving existing tests for the REST API.

## Feedback

Any feedback for improving the project, especially the test suite, is highly appreciated.
