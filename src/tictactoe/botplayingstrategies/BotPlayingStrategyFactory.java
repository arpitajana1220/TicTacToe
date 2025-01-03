package tictactoe.botplayingstrategies;

import tictactoe.models.BotDifficultyLevel;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getBotPlayingStrategyForDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        // have if else and implement on your own
        return new EasyBotPlayingStrategy();
    }
}
