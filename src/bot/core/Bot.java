package bot.core;

import bot.core.commands.CommandDeterminant;

/**
 * @author Arthur Kupriyanov
 */
public class Bot {
    public String getResponse(String request){
        return CommandDeterminant.getCommand(request).init(request);
    }

}
