package com.attri.DesignPatterns.BuilderPattern;

public class House {

  // Mandatory Parameters
  private String door;
  private String windows;
  private String walls;
  private String roof;

  // Optional Parameters
  private String garage;
  private String pool;
  private String garden;
  private String statues;

  public House(String door, String windows, String walls, String roof) {
    this.door = door;
    this.windows = windows;
    this.walls = walls;
    this.roof = roof;
  }

  public House(String door, String windows, String walls, String roof, String garage, String pool, String garden, String statues) {
    this.door = door;
    this.windows = windows;
    this.walls = walls;
    this.roof = roof;
    this.garage = garage;
    this.pool = pool;
    this.garden = garden;
    this.statues = statues;
  }
}
