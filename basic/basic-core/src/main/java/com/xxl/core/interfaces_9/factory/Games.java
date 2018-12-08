/**
 * Project Name:X01
 * File Name:Games.java
 * Package Name:interfaces_9.factory
 * Date:2018年1月22日下午10:36:39
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.xxl.core.interfaces_9.factory;

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

    public boolean move()
    {
        Print.print("Checkers move " + moves);
        return ++moves != MOVES;
    }
}
class CheckersFactory implements GameFactory
{
    public Game getGame()
    {
        return new Checkers();
    }
}

class Chess implements Game
{
    private int moves = 0;
    private static final int MOVES = 4;

    public boolean move()
    {
        Print.print("Chess move " + moves);
        return ++moves != MOVES;
    }
}
class ChessFactory implements GameFactory
{
    public Game getGame()
    {
        return new Chess();
    }
}

/**
 * ClassName:Games <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:   TODO ADD REASON. <br/>
 * Date:     2018年1月22日 下午10:36:39 <br/>
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
        while(game.move())
            ;
    }

    public static void main(String[] args)
    {
        playGame(new CheckersFactory());
        playGame(new ChessFactory());
    }
}

