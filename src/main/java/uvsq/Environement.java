package uvsq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Environement {

  List<RobotAbstract> l;

  public Environement() {

    l = new ArrayList<RobotAbstract>();
  }

  public void avanceTous() {

    for (RobotAbstract r : l) {

      r.avance();
    }
  }

  public void addRobot(RobotAbstract r) {

    this.l.add(r);
  }

  public List<RobotAbstract> getList() {

    return Collections.unmodifiableList(l);
  }
}
