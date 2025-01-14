package org.joedog.byron.players;

import org.joedog.byron.controller.GameController;

public abstract class Player {
  public static final int HUMAN    = 1;
  public static final int COMPUTER = 2;
  protected int mark; 
  protected int ENGINE;

  public Player (int mark) {
    this.mark = mark;
  }

  public abstract void start(); 


  public abstract void finish(int status); 

  public abstract void takeTurn();

  public abstract String getType();

  public void setEngine(int engine) {
    this.ENGINE = engine;
  }

  public int getMark() {
    return this.mark;
  }
  
}
