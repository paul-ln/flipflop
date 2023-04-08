class Message {
    constructor(content, likes) {
        this.content = content;
        this.likes = likes;
    }
    getContent() {
        return this.content;
    }

    getLikes() {
        return this.likes;
    }
}

class MessageFeed {
    constructor() {
        this.messages = [];
    }

    addMessage(message) {
        this.messages.push(message);
    }

    displayMessages() {
        // Tri des messages par nombre de likes décroissant
        this.messages.sort((a, b) => b.getLikes() - a.getLikes());

        // Affichage des messages dans un format de fil d'actualité
        console.log("************ FlipFlop Network ************");
        console.log("-=-=-=-=-=-= Message Thread: -=-=-=-=-=-=-");

        // Affichage du message avec le plus de likes en premier
        if (this.messages.length > 0) {
            console.log("------------------------------------------");
            console.log("Message 1:");
            console.log("Likes: " + this.messages[0].getLikes());
            console.log("Content: " + this.messages[0].getContent());
        }

        // Affichage du message avec le moins de likes en second
        if (this.messages.length > 1) {
            console.log("------------------------------------------");
            console.log("Message 2:");
            console.log("Likes: " + this.messages[this.messages.length - 1].getLikes());
            console.log("Content: " + this.messages[this.messages.length - 1].getContent());
        }

        // Affichage des autres messages par nombre de likes décroissant
        if (this.messages.length > 2) {
            for (let i = 1; i < this.messages.length - 1; i++) {
                console.log("------------------------------------------");
                console.log("Message " + (i + 2) + ":");
                console.log("Likes: " + this.messages[i].getLikes());
                console.log("Content: " + this.messages[i].getContent());
            }
        }
        console.log("------------------------------------------");
    }
}

// Création de messages
let message1 = new Message("Hello world!", 10);
let message2 = new Message("I love coding!", 5);
let message3 = new Message("JavaScript is awesome!", 15);
let message4 = new Message("Java is powerful!", 1);
let message5 = new Message("Coding is my passion!", 12);
let message6 = new Message("Web development is fun!", 7);
let message7 = new Message("Coding is life!", 20);
let message8 = new Message("Tech is cool!", 3);
let message9 = new Message("J'adore coder", 26);

// Création du fil de messages
let messageFeed = new MessageFeed();

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
