package chapter10_9;

import java.util.*;

public class Traversal {

  private byte[][] traversal;
  private Moor moor;
  private boolean found;
  private int count;

  public int getCount() {
    return count;
  }

  public Traversal(Moor m) {
    moor = m;
    traversal = new byte[moor.getNumRows()][moor.getNumColumns()];
    count = 0;
    found = traverseMoor(moor, traversal);
  }

  public boolean isInRange(int r, int c) {
    return r >= 0 && c >= 0 && r < moor.getNumRows() && c < moor.getNumColumns();
  }

  public Moor moor() {
    return moor;
  }

  public boolean existsTraversal() {
    return found;
  }

  // public int length() {
  //   if (found)
  //     return traversal.length();
  //   else
  //     throw new RuntimeException("Traversal: traversal does not exist");
  // }

  // public int step(int i) {
  //   if (found)
  //     return traversal[i];
  //   else
  //     throw new RuntimeException("Traversal: traversal does not exist");
  // }

  public String toString() {
    if (!found) {
        return moor.toString();
    }
    String answer = "";
    String temp = moor.toString();
    for (int i = 0; i < moor.getNumRows(); i++) {
        for (int j = 0; j < moor.getNumColumns()+1; j++) {
          if (j < moor.getNumColumns() && traversal[i][j] == 1) {
            answer += '#';
          } else {
            answer += temp.charAt(i*(moor.getNumColumns()+1)+j);
          }
        }
    }
    return answer;
  }

  // auxiliary methods

  private boolean traverseMoor(Moor m, byte[][] path) {
    for (int row = 0; row < m.getNumRows(); row++)
      if (searchTraversal(m, row, 0, path)) return true;
    return false;
  }

  private boolean searchTraversal(Moor m, int r, int c, byte[][] path) {
    count++;
    if (!m.land(r,c)) {
      return false;
    }
    else {
      path[r][c] = 1;
      if (c == m.getNumColumns()-1)
        return true;
      else {
        int[] di = {-1, 0, 1, 1, 1, 0, -1, -1};
        int[] dj = {1, 1, 1, 0, -1, -1, -1, 0};
        for (int i = 0; i < 8; i++) {
          if (moor.land(r+di[i], c+dj[i]) && path[r+di[i]][c+dj[i]] == 0) {
            if (searchTraversal(m, r+di[i], c+dj[i], path)) {
              return true;
            }
            path[r+di[i]][c+dj[i]] = 2;
          }
        }
        path[r][c] = 0;
        return false;
        }
      }
    }
  
}
