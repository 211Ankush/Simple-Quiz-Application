public class QuizModel {

    private String[] questions = {
        "What is the capital of France?",
        "Which planet is known as the Red Planet?",
        "What is the largest mammal?"
    };

    private String[][] options = {
        {"Paris", "London", "Rome", "Berlin"},
        {"Mars", "Earth", "Jupiter", "Venus"},
        {"Elephant", "Blue Whale", "Shark", "Giraffe"}
    };

    private int[] correctAnswers = {0, 0, 1};  // Index of the correct answers for each question

    // Get a question by index
    public String getQuestion(int index) {
        if (index >= 0 && index < questions.length) {
            return questions[index];
        }
        return null;
    }

    // Get options for a specific question
    public String[] getOptions(int index) {
        if (index >= 0 && index < options.length) {
            return options[index];
        }
        return null;
    }

    // Get the index of the correct answer
    public int getCorrectAnswer(int index) {
        if (index >= 0 && index < correctAnswers.length) {
            return correctAnswers[index];
        }
        return -1;
    }

    // Get total number of questions
    public int getTotalQuestions() {
        return questions.length;
    }
}
