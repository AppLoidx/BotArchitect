package bot.core.commands;

/**
 * @author Arthur Kupriyanov
 */
public class Bye extends Command {
    @Override
    public String init(String... args) {
        return "Bye bye!";
    }

    @Override
    protected void setName() {
        this.name = "Bye";
    }
}
