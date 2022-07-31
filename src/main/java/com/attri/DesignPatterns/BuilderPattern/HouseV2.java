package com.attri.DesignPatterns.BuilderPattern;

public class HouseV2 {

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

  public static Builder build() {
    return new Builder();
  }

  public static class Builder {

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
    
    public Builder setWindows(String windows) {
      this.windows = windows;
      return this;
    }

    public Builder setWalls(String walls) {
      this.walls = walls;
      return this;
    }

    public Builder setRoof(String roof) {
      this.roof = roof;
      return this;
    }

    public Builder setGarage(String garage) {
      this.garage = garage;
      return this;
    }

    public Builder setPool(String pool) {
      this.pool = pool;
      return this;
    }

    public Builder setGarden(String garden) {
      this.garden = garden;
      return this;
    }

    public Builder setStatues(String statues) {
      this.statues = statues;
      return this;
    }

    public House build() {
      return new House(door, windows, walls, roof, garage, pool, garden, statues);
    }
  }

}
