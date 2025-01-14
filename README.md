------
README
------

Byron is a multi-game Tic-Tac-Toe, with a running score and a race against
the clock. The object is to remain alive while as many points as possible.

A new game begins with five lives and zero points. You're X and Byron is O.
Byron starts first. Each Tic-Tac-Toe is timed. The timer starts at ten and 
counts down to zero. If you win the game, you get one point for every second 
left on the clock. If you lose, a "life" is taken from you. Byron is over 
when no lives remain. You get a new "life" for every 50 points.

Artificial Intelligence.

Byron uses three AI engines, Minimax, Monte Carlo and M.E.N.A.C.E.Minimax. 
The first one is based on Donald Michie's Machine Educable Noughts And Crosses
Engine (MENACE) engine. That was a "computer" constructed of match boxes which
was capable of "learning" Tic Tac Toe. http://en.wikipedia.org/wiki/Donald_Michie

The second engine is based on Minimax which is a decision theory concept designed
to MINImize a possible loss for a MAXimum loss scenario. 
http://en.wikipedia.org/wiki/Minimax

Of the two, Minimax consistently plays smarter Tic Tac Toe but it's incapable
of "learning." It plays its first game as well as its last. M.E.N.A.C.E., on 
the other hand, starts dumb and gets smarter. It's rewarded for winning behavior
and punished for losing behavior. 

M.E.N.A.C.E. generally provides a more enjoyable byron experience.

Requirements 

Byron requires java 1.6. The game itself is bundled in byron.jar. On most 
platforms, you should be able to double-click the file in order to play the 
game. If java is not associated with jar files on your computer, you can 
play the game with the following command:  java -jar byron.jar





