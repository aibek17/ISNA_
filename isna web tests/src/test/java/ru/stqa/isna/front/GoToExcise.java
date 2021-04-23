package ru.stqa.isna.front;

import org.testng.annotations.*;

public class GoToExcise extends TestBase{

  @Test
  public void testGoToExcise() throws Exception {
    gotoArmOgd();;
    gotoExcise();
    gotoPriemObrabotka();
    gotoDocumentJournal();
  }
}

