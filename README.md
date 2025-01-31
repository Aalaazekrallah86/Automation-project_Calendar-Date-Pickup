# Calendar Selection Automation

This project demonstrates an automated way to interact with a calendar date picker on a website using Selenium WebDriver. The goal is to select a date (day, month, year) from the date picker and verify that the correct date is selected.

## Project Structure

### 1. **CalenderPage.java**
This file contains the `CalenderPage` class, which includes methods to interact with the date picker. It provides functionality to:

- Select a year, month, and day on the calendar.
- Get the selected date from the input field.

Key methods:
- `selectYear(int year)`: Selects the year in the date picker.
- `selectMonth(int monthIndex)`: Selects the month in the date picker.
- `selectDay(int day)`: Selects the day in the date picker.
- `PickData(int year, int month, int day)`: Selects the specified date (year, month, day).
- `getDataValue()`: Returns the value from the date input field.

### 2. **CalenderTest.java**
This file contains the test class `CalenderTest` using TestNG for validating the functionality of the `CalenderPage` class. It automates the process of:

- Launching the website containing the date picker.
- Using the `PickData()` method to pick a specific date (in this case, June 7, 1994).
- Verifying the date format in the input field to ensure it matches the expected format.

Key components:
- `setup()`: Initializes the WebDriver and opens the website.
- `testPickupTear()`: Test method to select a date and verify its correctness.

## Requirements

- Java 8 or higher
- Selenium WebDriver
- TestNG
- ChromeDriver (or other WebDriver executables for your browser)

## Getting Started

1. Clone this repository to your local machine.
2. Make sure you have Java and Maven installed.
3. Add Selenium WebDriver and TestNG dependencies to your project.
4. Set up ChromeDriver (or use the WebDriver corresponding to your browser).
5. Run the tests using your preferred IDE (e.g., IntelliJ IDEA, Eclipse) or via Maven/command line.

## How to Run the Tests

1. Open your project in an IDE (IntelliJ IDEA or Eclipse).
2. Right-click on the `CalenderTest.java` file and select "Run" to execute the tests.

Alternatively, if you're using Maven, you can run the tests with the following command:

```bash
mvn test
