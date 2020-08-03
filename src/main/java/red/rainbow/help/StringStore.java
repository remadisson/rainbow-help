package red.rainbow.help;

public class StringStore {

    private static String[] categories = {"Homes", "Friends", "Partys"};
    private static String mainscreen =
            "§d§lRainbowRED HELPSCREEN§r" +
            "\n§fPlease choose a help category by using §o/help [yourChosenCategory].§r" +
            "\n§7You can choose from the following categories:§r";

    public static String getMainscreen() {
        String returnString = mainscreen;

        for (int i = 0; i < categories.length; i++) {
            returnString = returnString + "\n§7" + categories[i].toLowerCase() + "§r";
        }

        return returnString;
    }
}
