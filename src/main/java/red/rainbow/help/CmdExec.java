package red.rainbow.help;

import com.velocitypowered.api.command.Command;
import com.velocitypowered.api.command.CommandSource;
import net.kyori.text.TextComponent;
import net.kyori.text.format.TextColor;
import org.checkerframework.checker.nullness.qual.NonNull;

import static red.rainbow.help.StringStore.getMainscreen;

public class CmdExec implements Command {

    @Override
    public void execute(CommandSource source, String[] args) {
        if (args.length == 0) {
            source.sendMessage(TextComponent.of(getMainscreen()));
        }
    }

}
