
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
 * - It may include event handlers for form submission, validation, and interaction with the user.
 * - It can dynamically update the form based on user input, handle errors, and perform asynchronous tasks such as AJAX requests.
 * 
 * @author [Your Name]
 * @version 1.0
 * @since [Date]
 */

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudentAdmissionForm {

    public static void main(String[] args) throws InterruptedException {

        // URL of the student admission form
        String url = "http://127.0.0.1:5500/Form/index.html";

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the URL
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // Fill out the form
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Riya");

        WebElement middleName = driver.findElement(By.name("middlename"));
        middleName.sendKeys("Vijay");

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Mehara");

        // Continue filling out the form...

        // Submit the form
        driver.findElement(By.id("submit")).click();

        // Handle alert message
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();

        // Close the browser
        Thread.sleep(3000);
        driver.quit();
    }
}
