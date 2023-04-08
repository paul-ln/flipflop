import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Message {
    private String content;
    private int likes;

    public Message(String content, int likes) {
        this.content = content;
        this.likes = likes;
    }

    public String getContent() {
        return content;
    }

    public int getLikes() {
        return likes;
    }
}

class MessageFeed {
    private List<Message> messages;

    public MessageFeed() {
        messages = new ArrayList<>();
    }

    public void addMessage(Message message) {
        messages.add(message);
    }

    public void displayMessages() {
        // Tri des messages par nombre de likes décroissant
        Collections.sort(messages, Comparator.comparingInt(Message::getLikes).reversed());

        // Affichage des messages dans un format de fil d'actualité
        System.out.println("************ FlipFlop Network ************");
        System.out.println("-=-=-=-=-=-= Message Thread: -=-=-=-=-=-=-");

        // Affichage du message avec le plus de likes en premier
        if (!messages.isEmpty()) {
            System.out.println("------------------------------------------");
            System.out.println("Message 1:");
            System.out.println("Likes: " + messages.get(0).getLikes());
            System.out.println("Content: " + messages.get(0).getContent());
        }

        // Affichage du message avec le moins de likes en second
        if (messages.size() > 1) {
            System.out.println("------------------------------------------");
            System.out.println("Message 2:");
            System.out.println("Likes: " + messages.get(messages.size() - 1).getLikes());
            System.out.println("Content: " + messages.get(messages.size() - 1).getContent());
        }

        // Affichage des autres messages par nombre de likes décroissant
        if (messages.size() > 2) {
            for (int i = 1; i < messages.size() - 1; i++) {
                System.out.println("------------------------------------------");
                System.out.println("Message " + (i + 2) + ":");
                System.out.println("Likes: " + messages.get(i).getLikes());
                System.out.println("Content: " + messages.get(i).getContent());
            }
        }
        System.out.println("------------------------------------------");
    }
}
public class FlipFlop{
    public static void main(String[] args) {
        // Création de messages
        Message message1 = new Message("Hello world!", 142);
        Message message2 = new Message("I love coding!", 5);
        Message message3 = new Message("JavaScript is awesome!", 15);
        Message message4 = new Message("Java is powerful!", 8);
        Message message5 = new Message("Coding is my passion!", 8);
        Message message6 = new Message("Web development is fun!", 7);
        Message message7 = new Message("Coding is life!", 20);
        Message message8 = new Message("Tech is cool!", 3);
        Message message9 = new Message("J'adore coder", 26);



        // Création du fil de messages
        MessageFeed messageFeed = new MessageFeed();

        // Ajout des messages au fil
        messageFeed.addMessage(message1);
        messageFeed.addMessage(message2);
        messageFeed.addMessage(message3);
        messageFeed.addMessage(message4);
        messageFeed.addMessage(message5);
        messageFeed.addMessage(message6);
        messageFeed.addMessage(message7);
        messageFeed.addMessage(message8);
        messageFeed.addMessage(message9);


        // Affichage des messages dans le fil sous forme de réseau social
        messageFeed.displayMessages();
    }
}