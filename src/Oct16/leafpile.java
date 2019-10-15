package Oct16;

import java.util.Scanner;

public class leafpile {
	   public static void main(String[] args) {
	       Ground map[][] = new Ground[5][10];
	       generateRandomGround(map);
	       printMap(map);
	       System.out.println(largestLeafPile(map));
	   }

	   /***************** STUDENT CODE HERE *******************/

	   private static int largestLeafPile(Ground map[][]) {
	      
	        int cnt;
	       int vis[][] = new int[1000][1000];
	       void dfs(int a[][],int x,int y)
	       {
	       vis[x][y] = 1;
	       if(x+1<a.length&&y<a[x+1].length&&a[x+1][y]==1&&vis[x+1][y]==0)
	       {
	       cnt++;
	       dfs(a,x+1,y);
	       }
	       if(x-1>=0&&y<a[x-1].length&&a[x-1][y]==1&&vis[x-1][y]==0)
	       {
	       cnt++;
	       dfs(a,x-1,y);
	       }
	       if(y+1<a[x].length&&a[x][y+1]==1&&vis[x][y+1]==0)
	       {
	       cnt++;
	       dfs(a,x,y+1);
	       }
	       if(y-1>=0&&a[x][y-1]==1&&vis[x][y-1]==0)
	       {
	       cnt++;
	       dfs(a,x,y-1);
	       }
	       }
	       public static void main(String args[])
	       {
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enter number of rows");
	       int rowcnt = sc.nextInt();
	       int a[][] = new int[rowcnt][];
	       for(int i=1;i<=rowcnt;i++)
	       {
	       System.out.println("Enter number of entries in column "+i);
	       int x;
	       x = sc.nextInt();
	       a[i-1] = new int[x];
	       }
	       int answer = -1;
	       String str;
	       char ch;
	       System.out.println("Enter the map according to the above given sizes");
	       for(int i=0;i<rowcnt;i++)
	       {
	       str = sc.next();
	       for(int j=0;j<a[i].length;j++)
	       {
	       ch = str.charAt(j);
	       if(ch=='.')
	       a[i][j] = 0;
	       else
	       a[i][j] = 1;
	       vis[i][j]=0;
	       }
	       }
	       for(int i=0;i<rowcnt;i++)
	       {
	       for(int j=0;j<a[i].length;j++)
	       {
	       if(a[i][j]==1&&vis[i][j]==0)
	       {
	       cnt=1;
	       dfs(a,i,j);
	       answer = answer > cnt ? answer : cnt;
	       }
	       }
	       }
	       System.out.println("The largest pile of leaves has size : "+answer);
	       }
	   }

	   /**************** END STUDENT CODE **********************/

	   /************ Utility Methods *************/

	   private static void printMap(Ground map[][]) {
	       for (int r = 0; r < map.length; r++) {
	           for (int c = 0; c < map[r].length; c++) {
	               if (map[r][c] == Ground.GRASS) {
	                   System.out.print(". ");
	               }
	               if (map[r][c] == Ground.LEAF) {
	                   System.out.print("~ ");
	               }
	           }
	           System.out.println();
	       }
	   }

	   private static void generateRandomGround(Ground map[][]) {
	       int randGround;
	       for (int r = 0; r < map.length; r++) {
	           for (int c = 0; c < map[r].length; c++) {
	               randGround = (int) (Math.random() * 2);
	               map[r][c] = randGround == 0 ? Ground.GRASS : Ground.LEAF;
	           }
	       }
	   }

	}
