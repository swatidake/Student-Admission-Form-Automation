
# Student Admission Form Automation

## Introduction

This project automates the student admission form using Selenium WebDriver in Java.

## Features

- Fills out student details such as name, email, address, etc.
- Selects gender, date of birth, and qualification options.
- Selects programming languages the student wants to learn.
- Agrees to terms and conditions.
- Submits the form and handles the alert message.


## Admission Form Details

The admission form is a web page that collects the following information from students:

- **Name:** First name, middle name, and last name.
- **Mobile Number:** The student's contact number.
- **Email:** The student's email address.
- **Address:** The student's residential address.
- **Gender:** Male, female, or other.
- **Date of Birth:** Day, month, and year.
- **Qualification:** The student's educational qualification.
- **Programming Languages:** Checkboxes to select the programming languages the student wants to learn.
- **Terms and Conditions:** Checkbox to agree to the terms and conditions.


## Java File Details

The `StudentAdmissionForm.java` file contains the Selenium WebDriver code written in Java. It automates the process of filling out the admission form by interacting with the web elements on the admission form web page.


## pom.xml File

The `pom.xml` file is a Maven project configuration file that specifies the project's dependencies and build settings. It includes the necessary dependencies for Selenium WebDriver, which are required to execute the automation script.


## Installation

To run this project locally, follow these steps:

1. Clone the repository:
   ```
   git clone https://github.com/your-username/student-admission-form.git
   ```
2. Install dependencies (make sure you have Maven installed):
   ```
   cd student-admission-form
   mvn install
   ```

## Usage

To execute the automation script, run the `StudentAdmissionForm.java` file located in the `src` directory. This Java file contains the Selenium WebDriver code that interacts with the admission form web page. Make sure you have the Chrome WebDriver installed and added to your system path.

```bash
java -cp target/12-sep-selenium-0.0.1-SNAPSHOT.jar com.fbs.formdemo.StudentAdmissionForm
```

## Technologies Used

- **Selenium WebDriver:** Used for automating web application testing.
- **Java:** Programming language used for writing the automation script.
- **Maven:** Dependency management tool used for managing project dependencies and building the project.
- **HTML:** Structure of the admission form page.
- **CSS:** Styles the admission form page.
- **JavaScript:** Adds interactivity.
- **Bootstrap:** Responsive design framework.


## Contributing

Contributions to this project are welcome! Feel free to open issues or pull requests with any improvements, bug fixes, or new features you'd like to see.

