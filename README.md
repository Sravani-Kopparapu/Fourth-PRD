STUDENT PRACTICE TRACKER

PROJECT GOAL
Build a simple java console application that helps one student track daily Java practice.

The application allows the student to:
* Enter their name and course name
* Enter completed topics and questions solved
* View details and progress
* Add completed topics and questions solved
* Exit the application

Concepts Used:

* Class
* Object
* Method
* Instance Variables
* Local Variables
* Method Parameters
* this keyword
* Scanner
* if-else
* while loop
* Basic Artihemetic Operators

Create two classes
Student
StudentApp

In Student class
Instance Variables
String name;
String courseName;
int completedTopics;
int questionsSolved;

Methods
void setDetails(String name, String courseName)
void setProgress(int completedTopics, int questionsSolved)
void displayDetails()
void displayProgress()
void addTopics(int newlyCompletedTopics)
void addQuestion(int newlySolvedQuestions)


In StudentApp class
main(String[] args)
Create one Student object
Take inputs from user
Call methods to set details and progress
Display menu:
1. View Details
2. View Progress
3. Update newly completed Topics
4. Update newly solved Questions
5. Exit