package red.rainbow.help;

public class StringProvider {

    private static final String pf = Help.pf;

    private static final String[] categories = {"homes", "friends", "party"};
    private static final String mainscreen =
            pf +"§d§lRainbowRED HELPSCREEN§r" +
                    "\n" + pf +"§7Please choose a valid help category by using §o/help [yourChosenCategory].§r" +
                    "\n" + pf +"§7You can choose from the following categories:§r";
    private static final String categoryHomes =
            "\n" + pf +"§d§lHelp category: §aHomes§r" +
                    "\n" + pf +"\n§a/sethome §7- Set your homepoint." +
                    "\n" + pf +"\n§a/home §7- Sends you back to your set homepoint.";

    public static String[] getCategories() {
        return categories;
    }

    public static String getMainscreen() {
        StringBuilder returnString = new StringBuilder(mainscreen);

        for (int i = 0; i < categories.length; i++) {
            returnString.append("\n" + pf + "§a").append(categories[i].toUpperCase()).append("§r");
        }

        return returnString.toString();
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