package ru.stqa.isna.front;

import org.testng.annotations.*;

public class GoToMgu extends TestBase {

  @Test
  public void testGoToMgu() throws Exception {
    gotoArmOgd();
    gotoMgu();
  }
}