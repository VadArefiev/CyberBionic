package Task18;

import java.util.HashMap;

public class Welcome {
    public static void main(String[] args) {

    }

    public static String greet(String language) {
        HashMap<String, String> lang = new HashMap<>();
        lang.put("english", "Welcome");
        lang.put("czech", "Vitejte");
        lang.put("danish", "Velkomst");
        lang.put("dutch", "Welkom");
        lang.put("estonian", "Tere tulemast");
        lang.put("finnish", "Tervetuloa");
        lang.put("flemish", "Welgekomen");
        lang.put("french", "Bienvenue");
        lang.put("german", "Willkommen");
        lang.put("irish", "Failte");
        lang.put("italian", "Benvenuto");
        lang.put("latvian", "Gaidits");
        lang.put("lithuanian", "Laukiamas");
        lang.put("polish", "Witamy");
        lang.put("spanish", "Bienvenido");
        lang.put("swedish", "Valkommen");
        lang.put("welsh", "Croeso");
        if (lang.containsKey(language)) {
                return lang.get(language);
            }

        return lang.get("english");
    }
}


