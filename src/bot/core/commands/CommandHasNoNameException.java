package bot.core.commands;

/**
 * @author Arthur Kupriyanov
 */
public class CommandHasNoNameException extends NullPointerException {
    public CommandHasNoNameException(String msg){
        super(msg);
    }
}
