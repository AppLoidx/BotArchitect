package bot.core.commands;

/**
 * @author Arthur Kupriyanov
 */
public class Unknown extends Command {
    @Override
    public String init(String... args) {
        return "Не распознанная команда";
    }

    @Override
    protected void setName() {
        this.name = "Unknown";
    }
}
