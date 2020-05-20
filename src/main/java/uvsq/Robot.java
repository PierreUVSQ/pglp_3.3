package uvsq;

public class Robot extends RobotAbstract {

  public Robot() {

    super();
  }

  /**
   * Fait tourner le robot.
   */
  public void tourne() {

    switch (this.direction) {
      case Nord:
        this.direction = Direction.Est;
        break;
      case Sud:
        this.direction = Direction.Ouest;
        break;
      case Ouest:
        this.direction = Direction.Nord;
        break;
      case Est:
        this.direction = Direction.Sud;
        break;
      default:
        System.out.println("Direction invalide");
    }
  }

  @Override
  public void avance() {

    switch (this.direction) {
      case Nord:
        position.y += 1;
        break;
      case Sud:
        position.y -= 1;
        break;
      case Ouest:
        position.x -= 1;
        break;
      case Est:
        position.x += 1;
        break;
      default:
        System.out.println("N'avance pas");
    }
  }
}
