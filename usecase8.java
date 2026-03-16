import java.util.HashMap;

public class usecase8 {

    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        map.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        map.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return map;
    }

    // Method to display banner
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        int height = 5;

        for (int row = 0; row < height; row++) {

            for (int i = 0; i < message.length(); i++) {

                char ch = message.charAt(i);

                String[] pattern = charMap.get(ch);

                if (pattern != null) {
                    System.out.print(pattern[row] + " ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();

        String message = "OOPS";

        displayBanner(message, charMap);
    }
}
    

