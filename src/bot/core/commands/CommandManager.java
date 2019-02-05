package bot.core.commands;


import java.util.ArrayList;

/**
 * Используется для распределения команд
 *
 * Понадобится при создании нескольких уровней доступа
 */
public class CommandManager {
    private static ArrayList<Command> commands = new ArrayList<>();

    static {
        commands.add(new Hi());
        commands.add(new Bye());
        commands.add(new Unknown());
        commands.add(new Weather());
    }

    public static ArrayList<Command> getCommands(){
        return commands;
    }
}
