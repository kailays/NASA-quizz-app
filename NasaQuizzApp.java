import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * NasaQuizzApp - A quiz application about NASA and space exploration
 */
public class NasaQuizzApp {
    private List<Question> questions;
    private int score;
    private Scanner scanner;

    /**
     * Constructor - initializes the quiz app
     */
    public NasaQuizzApp() {
        this.questions = new ArrayList<>();
        this.score = 0;
        this.scanner = new Scanner(System.in);
    }

    /**
     * Initialize quiz questions
     */
    private void initializeQuestions() {
        questions.add(new Question(
            "What year did NASA first land humans on the Moon?",
            new String[]{"1965", "1969", "1971", "1973"},
            1
        ));
        
        questions.add(new Question(
            "What is the name of NASA's most powerful space telescope?",
            new String[]{"Hubble Space Telescope", "James Webb Space Telescope", "Chandra X-ray Observatory", "Spitzer Space Telescope"},
            1
        ));
        
        questions.add(new Question(
            "Which rover is currently exploring Mars?",
            new String[]{"Spirit", "Opportunity", "Curiosity", "Perseverance"},
            3
        ));
    }

    /**
     * Start the quiz
     */
    public void startQuiz() {
        System.out.println("=== Welcome to NASA Quiz App ===");
        System.out.println("Answer the following questions:\n");
        
        initializeQuestions();
        
        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("Question " + (i + 1) + ": " + q.getQuestion());
            
            for (int j = 0; j < q.getOptions().length; j++) {
                System.out.println((j + 1) + ". " + q.getOptions()[j]);
            }
            
            System.out.print("Your answer (1-" + q.getOptions().length + "): ");
            int userAnswer = scanner.nextInt() - 1;
            
            if (userAnswer == q.getCorrectAnswerIndex()) {
                score++;
                System.out.println("Correct!\n");
            } else {
                System.out.println("Wrong! The correct answer is: " + q.getOptions()[q.getCorrectAnswerIndex()] + "\n");
            }
        }
        
        displayResults();
    }

    /**
     * Display quiz results
     */
    private void displayResults() {
        System.out.println("=== Quiz Complete ===");
        System.out.println("Your Score: " + score + "/" + questions.size());
        double percentage = (score / (double) questions.size()) * 100;
        System.out.println("Percentage: " + String.format("%.1f", percentage) + "%");
    }

    /**
     * Main method
     */
    public static void main(String[] args) {
        NasaQuizzApp app = new NasaQuizzApp();
        app.startQuiz();
    }

    /**
     * Inner class representing a quiz question
     */
    static class Question {
        private String question;
        private String[] options;
        private int correctAnswerIndex;

        public Question(String question, String[] options, int correctAnswerIndex) {
            this.question = question;
            this.options = options;
            this.correctAnswerIndex = correctAnswerIndex;
        }

        public String getQuestion() {
            return question;
        }

        public String[] getOptions() {
            return options;
        }

        public int getCorrectAnswerIndex() {
            return correctAnswerIndex;
        }
    }
}
