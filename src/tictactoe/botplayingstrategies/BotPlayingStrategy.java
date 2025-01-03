package tictactoe.botplayingstrategies;

import tictactoe.models.Board;
import tictactoe.models.Cell;

public interface BotPlayingStrategy {

    Cell makeMove(Board board);
}