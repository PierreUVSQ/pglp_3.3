package uvsq;

class Position {
  int x;
  int y;

  public Position(int x, int y) {

    this.x = x;
    this.y = y;
  }
}

public abstract class RobotAbstract {

  protected Position position;
  protected Direction direction;

  /**
   * Un robot non instantiable.
   */
  public RobotAbstract() {

    direction = Direction.Nord;
    position = new Position(0, 0);
  }

  public void avance() {}

  /**
   * Getter abscisse du point.
   * @return x
   */
  public int getx() {

    int res = this.position.x;
    return res;
  }

  /**
   * Getter ordonnée du point.
   * @return y
   */
  public int gety() {

    int res = this.position.y;
    return res;
  }

  /**
   * Getter direction.
   * @return direction
   */
  public Direction getd() {

    Direction res = this.direction;
    return res;
  }
}
