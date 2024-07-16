# Student Management System

## Description

The Student Management System is a web application developed using Spring Boot and Thymeleaf. It allows users to create, view, update, and delete student records. Additionally, the application includes a delete confirmation functionality to prevent accidental deletions.

## Features

- Create new student records.
- View the list of all students.
- Edit existing student information.
- Delete student records with prior confirmation.

## Technologies Used

- Spring Boot
- Thymeleaf
- Sring MVC
- Spring Data JPA
- MySQL
- Bootstrap
  
 ## Project Structure

```plaintext
student-management-system
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── studentmanagement
│   │   │               ├── controller
│   │   │               │   ├── StudentController.java
│   │   │               ├── dto
│   │   │               │   ├── StudentDto.java
│   │   │               ├── model
│   │   │               │   ├── Student.java
│   │   │               ├── repository
│   │   │               │   ├── StudentRepository.java
│   │   │               ├── service
│   │   │               │   ├── StudentService.java
│   │   │               └── StudentManagementApplication.java
│   │   ├── resources
│   │   │   ├── templates
│   │   │   │   ├── create_student.html
│   │   │   │   ├── edit_student.html
│   │   │   │   ├── list_students.html
│   │   │   ├── application.properties
│   │   └── static
│   │       └── css
│   │           └── styles.css
├── .gitignore
├── README.md
├── mvnw
├── mvnw.cmd
├── pom.xml
└── Dockerfile
```
## Getting Started
Prerequisites
- Java 11 or higher
- Maven
- MySQL
### Installation
Clone the repository:
- https://github.com/AlexisMartinez1913/student-management-system


Configure the database in src/main/resources/application.properties:
```plaintext
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```
Access the application at http://localhost:8080/students.
### Usage
#### Creating a New Student
- Click on the "New Student" link in the navigation bar.
- Fill out the form and click "Submit".
### Viewing Students
- Access the main page to see the list of all students.
#### Editing a Student
- Click on the "Edit" button next to a student in the list.
- Update the information and click "Submit".
#### Deleting a Student
- Click on the "Delete" button next to a student in the list.
- Confirm the deletion in the popup modal.
### Contributing
Contributions are welcome! Please create a pull request or open an issue to discuss what you would like to change.
