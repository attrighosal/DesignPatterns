package com.attri.DesignPatterns.BuilderPattern;

public class HouseBuilder {

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

  public HouseBuilder setDoor(String door) {
    this.door = door;
    return this;
  }

  public HouseBuilder setWindows(String windows) {
    this.windows = windows;
    return this;
  }

  public HouseBuilder setWalls(String walls) {
    this.walls = walls;
    return this;
  }

  public HouseBuilder setRoof(String roof) {
    this.roof = roof;
    return this;
  }

  public HouseBuilder setGarage(String garage) {
    this.garage = garage;
    return this;
  }

  public HouseBuilder setPool(String pool) {
    this.pool = pool;
    return this;
  }

  public HouseBuilder setGarden(String garden) {
    this.garden = garden;
    return this;
  }

  public HouseBuilder setStatues(String statues) {
    this.statues = statues;
    return this;
  }

  public House build() {
    return new House(door, windows, walls, roof, garage, pool, garden, statues);
  }
}
