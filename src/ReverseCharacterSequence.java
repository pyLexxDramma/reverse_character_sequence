public class ReverseCharacterSequence {
    public static void main(String[] args) {
        String input = "Привет, мир!";
        String reversed = reverseCharacterSequence(input);
        System.out.println("Перевернутая последовательность: " + reversed);
    }

    public static String reverseCharacterSequence(String str) {
        char[] charArray = new char[str.length()]; // Создаем массив символов
        int index = 0;

        // Заполняем массив символов в обратном порядке
        for (int i = str.length() - 1; i >= 0; i--) {
            charArray[index++] = str.charAt(i);
        }

        // Создаем новую строку из массива символов
        StringBuilder reversedString = new StringBuilder();
        for (char c : charArray) {
            reversedString.append(c);
        }

        return reversedString.toString();
    }
}
