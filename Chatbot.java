import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! I'm a Java Chatbot. How can I assist you today?");
        System.out.println("You can type 'quit' to end the conversation.");

        boolean chatting = true;

        while (chatting) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().toLowerCase(); // Convert input to lowercase for case insensitivity

            // Check if the user wants to quit
            if (userInput.equals("quit")) {
                System.out.println("Chatbot: Goodbye! Have a great day.");
                chatting = false;
                continue;
            }

            // Process user input and generate response
            String botResponse = generateResponse(userInput);
            System.out.println("Chatbot: " + botResponse);
        }

        scanner.close();
    }

    private static String generateResponse(String userInput) {
        // Simple response generation based on user input
        String response;
        if (userInput.contains("hello") || userInput.contains("hi")) {
            response = "Hi there! How can I help you?";
        } else if (userInput.contains("how are you")) {
            response = "I'm just a program, so I'm always ready to assist!";
        } else if (userInput.contains("thanks") || userInput.contains("thank you")) {
            response = "You're welcome!";
        } else {
            response = "I'm not sure I understand. Can you please rephrase?";
        }
        return response;
    }
}
