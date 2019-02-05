package bot.core.commands;

import bot.module.WeatherParser;

import java.io.IOException;

/**
 * @author Arthur Kupriyanov
 */
public class Weather extends Command {
    @Override
    public String init(String... args) {
        try {
            WeatherParser parser = new WeatherParser();

            return parser.getWeatherFullDescription();

        } catch (IOException e) {
            e.printStackTrace();
            return "Ошибка при исполнении команды";
        }

    }

    @Override
    protected void setName() {
        this.name = "Weather";
    }
}
