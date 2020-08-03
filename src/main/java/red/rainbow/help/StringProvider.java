package red.rainbow.help;

public class StringProvider {

    private static String[] categories = {"§ahomes", "§6friends", "§6partys"};
    private static String mainscreen =
            "§d§lRainbowRED HELPSCREEN§r" +
            "\n§fPlease choose a valid help category by using §o/help [yourChosenCategory].§r" +
            "\n§7You can choose from the following categories:§r";
    private static String categoryHomes =
            "§d§lHelp category: §aHomes§r" +
            "\n§a/sethome §7- Set your homepoint." +
            "\n§a/home §7- Sends you back to your set homepoint.";

    public static String[] getCategories() {
        return categories;
    }

    public static String getMainscreen() {
        String returnString = mainscreen;

        for (int i = 0; i < categories.length; i++) {
            returnString = returnString + "\n§7" + categories[i].toUpperCase() + "§r";
        }

        return returnString;
    }

    public static String getScreenForCategory(String category) {
        switch (category.toLowerCase()) {
            case "homes":
                return categoryHomes;
            default:
                return "§cInternal error. Please inform a staff member about this.";
        }
    }

}
