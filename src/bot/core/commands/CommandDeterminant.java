package bot.core.commands;

/**
 * Определяет объект команды для ввода пользователя
 *
 * @author Артур Куприянов
 * @version 1.0.0
 */
public class CommandDeterminant {

    /**
     * Если начало ввода соответствует имени команды - возвращаем её объект
     * @return возвращает объект команды
     */
    public static Command getCommand(String userInput){
        userInput = userInput.split(" ")[0];
        for (Command command: CommandManager.getCommands()
             ) {
            if (command.getName().equals(userInput)){
                return command;
            }
        }

        return new Unknown();
    }
}
