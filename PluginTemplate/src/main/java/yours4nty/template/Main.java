package yours4nty.template;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.PluginCommand;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public final class Main extends JavaPlugin implements CommandExecutor {

    @Override
    public void onEnable() {
        // Mensaje decorado en consola
        getServer().getConsoleSender().sendMessage("§a===============================");
        getServer().getConsoleSender().sendMessage("§2  Enabling §ftemplate §7by §bYourS4nty");
        getServer().getConsoleSender().sendMessage("§a===============================");

        // Registrar el comando
        PluginCommand holaCmd = getCommand("hola");
        if (holaCmd != null) {
            holaCmd.setExecutor(this);
        }
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage("§c===============================");
        getServer().getConsoleSender().sendMessage("§4  Disabling §ftemplate §7by §bYourS4nty");
        getServer().getConsoleSender().sendMessage("§c===============================");
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (command.getName().equalsIgnoreCase("hola")) {
            if (sender instanceof Player) {
                sender.sendMessage("§eola como estas");
            } else {
                sender.sendMessage("Este comando solo puede ser usado por jugadores.");
            }
            return true;
        }
        return false;
    }
}
