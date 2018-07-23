public class Application {
    public static void main(String[] args) {

        //One dimensional array
        int[] values = {1, 2, 12, 5234};

        //Requires one dimension or value to access
        System.out.println(values[2]);

        //Two dimensional array or array of arrays
        int[][] grid = {
                {1, 2, 12, 5234},
                {4, 65, 324},
                {76, 903, 12, 4, 77}

        };

        System.out.println(grid[2][1]);
        System.out.println(grid[1][0]);
        System.out.println(grid[0][3]);

        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[i].length; j++) {
                System.out.print(grid[i][j] + ", ");
            }
            System.out.println();
        }

    }
}


