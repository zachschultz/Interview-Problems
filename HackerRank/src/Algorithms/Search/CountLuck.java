package HackerRank.src.Algorithms.Search;

import java.util.*;

public class CountLuck {

    public static void main(String[] args) 
    {
       
        
        Scanner sc = new Scanner(System.in);
        
        // Get number of test cases
        int numCases = sc.nextInt();
        int caseNum = 0;
        while(caseNum < numCases)
        {
            caseNum++;

            // Get dimensions of array
            int n = sc.nextInt();   // Height
            int m = sc.nextInt();   // Width
            char[][] forest = new char[n][m];   // Our forest array
            boolean[][] visited = new boolean[n][m];    // Keep track of visited indices for later traversal
            int mI = 0, mJ = 0; // indices of M 
            int starI = 0, starJ = 0;   // indices of exit

            for (int i = 0; i < n; i++)
            {   
                String str = sc.next();
                for(int j=0; j<m; j++)
                {
                    forest[i][j]=str.charAt(j);
                    if(forest[i][j] == 'M')
                    {
                        mI = i;
                        mJ = j;
                    }
                    else if(forest[i][j] == '*')
                    {   
                        starI = i;
                        starJ = j;
                    }
                }
            }
            int expected  = sc.nextInt(); 
            int actual = 0;

            // Have completed array by now
            // Depth first search -> Left, right, up, down
            Stack<String> stack = new Stack<String>();
            stack.push(makeString(mI, mJ)); // Push initial position on
            visited[mI][mJ] = true; // Mark initial node as visited
            boolean foundIt = false;
            
            while(actual <= expected && foundIt!=true)
            {
                int i = getX(stack.peek());
                int j = getY(stack.peek());
                if(i==starI && j==starJ)
                {
                    foundIt = true;
                    if(actual == expected)
                        System.out.println("Impressed");
                }

                else
                {
                    if(hasMove(i,j, forest, visited))
                    {
                        
                        if(canGoLeft(i,j,forest, visited))
                        {
                            stack.push(makeString(i,j-1));
                            visited[i][j-1] = true;

                            if((canGoRight(i,j,forest, visited)) || (canGoUp(i,j,forest, visited)) || (canGoDown(i,j,forest, visited)))
                            {
                                actual++;
                            }

                        }
                        else if(canGoRight(i,j,forest, visited))
                        {
                            stack.push(makeString(i,j+1));
                            visited[i][j+1] = true;

                            if((canGoUp(i,j,forest, visited)) || (canGoDown(i,j,forest, visited)))
                            {
                                actual++;
                            }
                        }
                        else if(canGoUp(i,j,forest, visited))
                        {
                            stack.push(makeString(i-1,j));
                            visited[i-1][j] = true;
                            if(canGoDown(i,j,forest, visited))
                            {
                                actual++;
                            }
                        }
                        else if(canGoDown(i,j,forest, visited))
                        {
                            stack.push(makeString(i+1,j));
                            visited[i+1][j] = true;
                        } 
                    }
                    else
                    {
                        stack.pop();
                    }
                }
            }
           
            if(actual != expected)
                System.out.println("Oops!");  
        } // End while
    }

    static String makeString(int i, int j)
    {
        String s = Integer.toString(i);
        s += " ";
        s += Integer.toString(j);
        return s;
    }

    static int getX(String xy)
    {
        String[] coords = xy.split(" ");
        return Integer.parseInt(coords[0]);
    }

     static int getY(String xy)
    {
        String[] coords = xy.split(" ");
        return Integer.parseInt(coords[1]);
    }

    static boolean hasMove(int i, int j, char[][] c, boolean[][] b)
    {
        return (canGoUp(i,j,c,b) || canGoRight(i,j,c,b) || canGoDown(i,j,c,b) || canGoLeft(i,j,c,b));
    }

    static boolean canGoUp(int i, int j, char[][] c, boolean[][] b)
    {
        return ((i >=1) && (!b[i-1][j]) && (c[i-1][j] != 'X'));
    }

    static boolean canGoRight(int i, int j, char[][] c, boolean[][] b)
    {
        return ((j < c[0].length -1) && (!b[i][j+1]) && (c[i][j+1] != 'X'));
    }

    static boolean canGoDown(int i, int j, char[][] c, boolean[][] b)
    {
        return ((i<c.length-1) && (!b[i+1][j]) && (c[i+1][j] != 'X'));
    }

    static boolean canGoLeft(int i, int j, char[][] c, boolean[][] b)
    {
        return ((j >= 1) && (!b[i][j-1]) && (c[i][j-1] != 'X'));
    }



}



