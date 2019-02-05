package bot.core.commands;

/**
 * @author Arthur Kupriyanov
 */
public class Hi extends Command {
    @Override
    public String init(String... args) {
        return "Hello!";
    }

    @Override
    protected void setName() {
        this.name = "Hi";
    }
}
