
import java.util.Scanner;

class StudentApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        System.out.println("Enter Student Name: ");
        String studentName = sc.nextLine();
        System.out.println("Enter Course Name: ");
        String courseName = sc.nextLine();
        System.out.println("Enter Completed Topics: ");
        int completedTopics = sc.nextInt();
        System.out.println("Enter Questions Solved: ");
        int questionsSolved = sc.nextInt();
        s1.setDetails(studentName, courseName);
        s1.setProgress(completedTopics, questionsSolved);

        System.out.println("=========================================");
        System.out.println("STUDENT PRACTICE TRACKER");
        System.out.println("=========================================");
        int choice;
        do {
            System.out.println("1. View Student Details");
            System.out.println("2. View Progress");
            System.out.println("3. Add Completed Topics");
            System.out.println("4. Add Solved Questions");
            System.out.println("5. Exit");
            System.out.println();
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    s1.displayDetails();
                    break;
                case 2:
                    s1.displayProgress();
                    break;
                case 3:
                    System.out.println("Enter New Completed Topics:");
                    int newlyCompletedTopics = sc.nextInt();
                    System.out.println("Topics updated succesfully.");
                    s1.addTopics(newlyCompletedTopics);
                    break;
                case 4:
                    System.out.println("Enter New Questions Solved: ");
                    int newlySolvedQuestions = sc.nextInt();
                    System.out.println("Questions updated successfully.");
                    s1.addQuestion(newlySolvedQuestions);
                    break;
                case 5:
                    System.out.println("Thank you for using Student Practice Tracker");
                    System.out.println("Keep Practicing!");
                    break;
                default:
                    System.out.println("Invalid choice");
                    System.out.println("please enter a value between 1 and 5.");
            }
            if (choice == 5) {
                break;
            }
        } while (true);

    }
}
