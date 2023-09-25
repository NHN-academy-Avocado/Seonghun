package chapter10_8;

public class Moor {

  private boolean[][] moor;

  public Moor(int rows, int columns, double probLand) {
    moor = new boolean[rows][columns];
    for (int r = 0; r < rows; r++)
      for (int c = 0; c < columns; c++)
        moor[r][c] = (Math.random() < probLand);
  }

  public int getNumRows() {
    return moor.length;
  }

  public int getNumColumns() {
    return moor[0].length;
  }

  public boolean land(int r, int c) {
    return (r >= 0) && (r < moor.length) &&
      (c >= 0) && (c < moor[0].length) &&
      moor[r][c];
  }

  public String toString() {
    String res = "";
    for (int r = 0; r < moor.length; r++) {
      for (int c = 0; c < moor[0].length; c++)
        res = res + (moor[r][c]? "*" : "o");
      res = res + "\n";
    }
    return res;
  }

  // 횡단 있는 경우:
  // O#OOOO
  // #O##OO
  // *OOO##
  // O**OO*
  // *O*OOO


  // 횡단 없는 경우:
  // ***O**
  // O*OOOO
  // OOO**O
  // *O*O*O
  // **O*OO

  // 반복적으로 탐색하게 되는 예시:
  // O****O
  // **OOOO
  // **OO##
  // O**OO*
  // ***OOO
  // 이미 (2, 0)에서의 탐색을 통해 1행으로는 끝에 닿을 수 없다는 것을 알고 있다.
  // 하지만 (3, 0)에서 다시 한 번 1행을 탐색하게 된다.




}
