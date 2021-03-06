package me.simplex.pluginkickstarter.generator;

import me.simplex.pluginkickstarter.PluginKickstarter;
import me.simplex.pluginkickstarter.storage.CommandContainer;

public class GenCommand extends Generator {
	CommandContainer c;

	public GenCommand(PluginKickstarter main, CommandContainer c) {
		super(main);
		this.c = c;
	}
		
	public String buildPlayerOnly(){
		if (c.isPlayerOnly()) {
			return 	"			if (!(sender instanceof Player)) {\n"+
					"				sender.sendMessage(\"Y U NO PLAYER??!111\");\n"+
					"				return true;\n"+
					"			}\n";
		}
		else {
			return "";
		}
	}

	public String buildPlayerImport() {
		if (c.isPlayerOnly()) {
			return "import org.bukkit.entity.Player;\n";
		}
		return "";
	}

	public String buildCommand() {
		return c.getCommand().toLowerCase();
	}

	@Override
	public String buildClassname() {
		return "CommandExecutor_"+StringToClassName(c.getCommand());
	}


}
