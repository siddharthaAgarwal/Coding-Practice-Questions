class Solution {

    public void setZeroes(int[][] a) {
        int col = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 0) {
                    a[i][0] = 0;

                    if (j == 0) {
                        col = 0;
                    } else {
                        a[0][j] = 0;
                    }
                }
            }
        }

        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < a[i].length; j++) {
                if (a[i][0] == 0 || a[0][j] == 0) {
                    a[i][j] = 0;
                }
            }
        }

        if (a[0][0] == 0) {
            for (int j = 0; j < a[0].length; j++) {
                a[0][j] = 0;
            }
        }

        if (col == 0) {
            for (int i = 0; i < a.length; i++) {
                a[i][0] = 0;
            }
        }
    }
}
