import java.util.Scanner;

public class QuizView {

    private Scanner scanner = new Scanner(System.in);

    // Display a question with options
    public void displayQuestion(String question, String[] options) {
        System.out.println(question);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    // Get user input for answer
    public int getUserAnswer() {
        System.out.print("Enter your answer (1-" + 4 + "): ");
        return scanner.nextInt() - 1;  // Return index (0-based)
    }

    // Display result
    public void displayResult(int correctAnswers, int totalQuestions) {
        System.out.println("You answered " + correctAnswers + " out of " + totalQuestions + " correctly!");
    }
}
