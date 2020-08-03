package red.rainbow.help;

import com.velocitypowered.api.command.Command;
import com.velocitypowered.api.command.CommandSource;
import net.kyori.text.TextComponent;

import java.util.Arrays;
import java.util.function.Predicate;

import static red.rainbow.help.StringProvider.*;

public class CmdExec implements Command {

    @Override
    public void execute(CommandSource source, String[] args) {
        if (args.length == 0) {
            source.sendMessage(TextComponent.of(getMainscreen()));
        } else if (args.length == 1) {
            if (Arrays.stream(getCategories()).anyMatch(Predicate.isEqual(args[0].toLowerCase()))) {
                source.sendMessage(TextComponent.of(getScreenForCategory(args[0])));
            } else {
                source.sendMessage(TextComponent.of(getMainscreen()));
            }
        }
    }

}
