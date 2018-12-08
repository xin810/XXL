
package com.xxl.core.innerclasses_10.innerfactory;

import com.xxl.util.Print;

interface Game
{
    boolean move();
}

interface GameFactory
{
    Game getGame();
}

class Checkers implements Game
{
    private int moves = 0;
    private static final int MOVES = 3;

    private Checkers()
    {
    }

    public boolean move()
    {
        Print.print("Checkers move " + moves);
        return ++moves != MOVES;
    }

    public static GameFactory factory =
        new GameFactory()
        {
            public Game getGame()
            {
                return new Checkers();
            }
        };
}

class Chess implements Game
{
    private int moves = 0;
    private static final int MOVES = 4;

    private Chess()
    {
    }

    public boolean move()
    {
        Print.print("Chess move " + moves);
        return ++moves != MOVES;
    }

    public static GameFactory factory =
        new GameFactory()
        {
            public Game getGame()
            {
                return new Chess();
            }
        };
}

/**
 * ClassName:Games <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:   TODO ADD REASON. <br/>
 * Date:     2018年1月28日 下午6:27:50 <br/>
 * @author   l
 * @version
 * @since    JDK 1.8
 * @see
 */
public class Games
{
    public static void playGame(GameFactory factory)
    {
        Game game = factory.getGame();

        while (game.move())
            ;
    }

    public static void main(String[] args)
    {
        playGame(Checkers.factory);
        playGame(Chess.factory);
    }
}

