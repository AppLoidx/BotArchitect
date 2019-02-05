package bot;

import bot.core.Bot;

/**
 * @author Arthur Kupriyanov
 */
public class Temp {
    public static void main(String[] args) {
        Bot bot = new Bot();

        System.out.println(bot.getResponse("Hi"));
        System.out.println(bot.getResponse("Bye"));
        System.out.println(bot.getResponse("sabj"));
        System.out.println(bot.getResponse("Weather"));
    }
}
