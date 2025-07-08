package src.fr.algorithmie;

public class CaracteresConsecutifs {
    public static void main(String[] args) {
        // Soit une chaine de caractères quelconque, transformez cette chaîne en comptant les
        //répétitions successives (ex : "aaabbc" → "a3b2c1").

        String str = "aaabbbccddeee";
        int count = 1;
        char currentChar = str.charAt(0); //
        if (str.isEmpty()) {
            System.out.println("La chaîne est vide.");
        } else {
            String result = ""; // String to hold the result
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == currentChar) {
                    count++;
                } else {
                    result += currentChar + String.valueOf(count);
                    currentChar = str.charAt(i);
                    count = 1;
                }
            }
            result += currentChar + String.valueOf(count);
            System.out.println("Chaîne transformée : " + result); // Print the transformed string
        }
    }
}
