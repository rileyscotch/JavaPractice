public class Application {
    public static void main(String[] args) {
        String[] words = new String[2];

        words[0] = "Hello";
        words[1] = "There";

        for(int i=0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        String[] response = {"General", "Kenobi"};

        for(int i=0; i < response.length; i++) {
            System.out.println(response[i]);
        }
    }
}
