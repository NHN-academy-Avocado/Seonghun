package chapter10_8;

public class Traversal {

  private int[] traversal;
  private Moor moor;
  private boolean found;
  private boolean[][] visited;
  private int count;

  public int getCount() {
    return count;
  }

  public Traversal(Moor m) {
    moor = m;
    traversal = new int[moor.getNumColumns()];
    count = 0;
    visited = new boolean[moor.getNumRows()][moor.getNumColumns()];
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

  public int length() {
    if (found)
      return traversal.length;
    else
      throw new RuntimeException("Traversal: traversal does not exist");
  }

  public int step(int i) {
    if (found)
      return traversal[i];
    else
      throw new RuntimeException("Traversal: traversal does not exist");
  }

  public String toString() {
    if (!found) {
        return moor.toString();
    }
    String answer = "";
    String temp = moor.toString();
    int flag = 0;
    for (int i = 0; i < moor.getNumRows(); i++) {
        for (int j = 0; j < moor.getNumColumns()+1; j++) {
            flag = 0;
            for (int k = 0; k < moor.getNumColumns(); k++) {
                if (step(k) == i && k == j) {
                    answer += '#';
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                answer += temp.charAt(i*(moor.getNumColumns()+1)+j);
            }
        }
    }
    return answer;
  }

  // auxiliary methods

  private boolean traverseMoor(Moor m, int[] path) {
    for (int row = 0; row < m.getNumRows(); row++)
      if (searchTraversal(m, row, 0, path)) return true;
    return false;
  }

  private boolean searchTraversal(Moor m, int r, int c, int[] path) {
    count++;
    if (!m.land(r,c))
      return false;
    else {
      path[c] = r;
      if (c == m.getNumColumns()-1)
        return true;
      else {
        if (isInRange(r-1, c+1) && !visited[r-1][c+1]) {
          visited[r-1][c+1] = true;
          if (searchTraversal(m, r-1, c+1, path))
            return true;
        }
        if (isInRange(r, c+1) && !visited[r][c+1]) {
          visited[r][c+1] = true;
          if (searchTraversal(m, r, c+1, path))
            return true;
        }
        if (isInRange(r+1, c+1) && !visited[r+1][c+1]) {
          visited[r+1][c+1] = true;
          if (searchTraversal(m, r+1, c+1, path))
            return true;
        }
        return false;
        }
      }
    }
  
}
