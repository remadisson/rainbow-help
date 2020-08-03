package red.rainbow.help;

import com.google.inject.Inject;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.command.CommandManager;
import com.velocitypowered.api.plugin.Plugin;
import org.slf4j.Logger;

@Plugin(
        id = "help",
        name = "RainbowHelp",
        version = "1.0",
        description = "Provides /help command.",
        url = "https://rainbow.red",
        authors = {"RainbowSpeedy"}
)
public class Help {

    public static final String pf = "§8»§r ";

    @Inject
    private Logger logger;

    @Inject
    private CommandManager cmdMgr;

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
        cmdMgr.register(new CmdExec(), "help");
    }
}
