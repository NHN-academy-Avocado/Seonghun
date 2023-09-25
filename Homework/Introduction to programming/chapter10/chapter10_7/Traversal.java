package chapter10_7;

public class Traversal {

  private int[] traversal;
  private Moor moor;
  private boolean found;
  private static int count;

  public int getCount() {
    return count;
  }

  public Traversal(Moor m) {
    moor = m;
    traversal = new int[moor.getNumColumns()];
    count = 0;
    found = traverseMoor(moor, traversal);
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

  private static boolean traverseMoor(Moor m, int[] path) {
    for (int row = 0; row < m.getNumRows(); row++)
      if (searchTraversal(m, row, 0, path)) return true;
    return false;
  }

  private static boolean searchTraversal(Moor m, int r, int c, int[] path) {
    count++;
    if (!m.land(r,c))
      return false;
    else {
      path[c] = r;
      if (c == m.getNumColumns()-1)
        return true;
      else
        return searchTraversal(m, r-1, c+1, path) ||
               searchTraversal(m, r,   c+1, path) ||
               searchTraversal(m, r+1, c+1, path);
    }
  }
}
