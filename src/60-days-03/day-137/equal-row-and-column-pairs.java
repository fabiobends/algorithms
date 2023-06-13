// TC: O(nˆ3), SC: O(1)

import java.util.HashMap;

class Solution {
  public int equalPairs(int[][] grid) {
    int result = 0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid.length; j++) {
        boolean isValid = true;
        for (int k = 0; k < grid.length; k++) {
          if (grid[i][k] != grid[k][j]) {
            isValid = false;
            break;
          }
        }
        if (isValid)
          result++;
      }
    }
    return result;
  }
}

// TC: O(nˆ2), SC: O(nˆ2)
class Solution2 {
  private StringBuilder builder;

  public Solution2() {
    this.builder = new StringBuilder();
  }

  public int equalPairs(int[][] grid) {
    int result = 0;
    final HashMap<String, Integer> map = new HashMap<String, Integer>();
    for (int i = 0; i < grid.length; i++) {
      final String key = createKey(grid[i]);
      var value = getValidValueFromMap(map, key);
      map.put(key, value + 1);
    }

    int[][] transpose = new int[grid.length][grid.length];
    for (int j = 0; j < grid.length; j++) {
      for (int k = 0; k < grid.length; k++)
        transpose[j][k] = grid[k][j];
    }

    for (int l = 0; l < grid.length; l++) {
      final String key = createKey(transpose[l]);
      final int value = getValidValueFromMap(map, key);
      if (value > 0) {
        result += value;
      }
    }

    return result;
  }

  private String createKey(int[] row) {
    builder.setLength(0);
    for (int number : row) {
      builder.append(number);
      builder.append("*");
    }
    return builder.toString();
  }

  private int getValidValueFromMap(HashMap<String, Integer> map, String key) {
    return map.get(key) == null ? 0 : (int) map.get(key);
  }
}