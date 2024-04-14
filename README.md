
# Student Admission Form Automation

## Introduction

This project automates the student admission form using Selenium WebDriver in Java.

## Features

- Fills out student details such as name, email, address, etc.
- Selects gender, date of birth, and qualification options.
- Selects programming languages the student wants to learn.
- Agrees to terms and conditions.
- Submits the form and handles the alert message.

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

To execute the automation script, run the `StudentAdmissionForm.java` file located in the `src` directory. Make sure you have the Chrome WebDriver installed and added to your system path.

```bash
java -cp target/12-sep-selenium-0.0.1-SNAPSHOT.jar com.fbs.formdemo.StudentAdmissionForm
```

/**
 * StudentAdmissionForm.java
 * 
 * Description:
 * This Java class automates the student admission form on a web page using Selenium WebDriver.
 * It interacts with the web elements, fills out student details, selects options, submits the form, and handles alert messages.
 * 
 * Dependencies:
 * This project requires Selenium WebDriver and Chrome WebDriver.
 * 
 * Usage:
 * Run this Java file to execute the automation script. Make sure Chrome WebDriver is installed and added to the system path.
 * 
 * HTML (index.html):
 * - The HTML file contains the structure of the student admission form.
 * - It includes input fields for student details such as name, email, address, etc.
 * - It also includes radio buttons, dropdown menus, checkboxes, and a submit button.
 * - Each form element has attributes like `name`, `id`, and `class` for identification.
 * 
 * CSS (styles.css):
 * - The CSS file contains styling rules for the student admission form.
 * - It defines the appearance of form elements, such as fonts, colors, margins, and padding.
 * - It may include media queries for responsive design and layout adjustments based on screen size.
 * 
 * JavaScript (script.js):
 * - The JavaScript file contains client-side scripting logic for the student admission form.
 
 
   
