
class Student {

    String name;
    String courseName;
    int completedTopics;
    int questionsSolved;

    void setDetails(String name, String courseName) {
        this.name = name;
        this.courseName = courseName;
    }

    void setProgress(int completedTopics, int questionsSolved) {
        this.completedTopics = completedTopics;
        this.questionsSolved = questionsSolved;
    }

    void displayDetails() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Course Name: " + this.courseName);
    }

    void displayProgress() {
        System.out.println("Completed Topics: " + this.completedTopics);
        System.out.println("Questions Solved: " + this.questionsSolved);
    }

    void addTopics(int newlyCompletedTopics) {

        this.completedTopics = this.completedTopics + newlyCompletedTopics;
        System.out.println("Total Completed Topics: " + this.completedTopics);
    }

    void addQuestion(int newlySolvedQuestions) {
        this.questionsSolved = this.questionsSolved + newlySolvedQuestions;
        System.out.println("Total Questions Solved: " + this.questionsSolved);
    }

}
