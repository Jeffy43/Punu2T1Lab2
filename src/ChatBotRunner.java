public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot debbie = new ChatBot("debbie", 5);
        debbie.greeting("Jeffy Pun");
        debbie.weather();
        debbie.convertFeetToMeters(42);
        debbie.favoriteNumber(10);
        debbie.addNumbers(5,10,4);
        debbie.goodbye();
        debbie.divideByFavorite(30);
        debbie.multiply(3,4);
    }
}
