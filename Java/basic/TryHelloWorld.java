package aaa;

import java.util.*;
class TryHelloWorld
{
    public int findLargestSquare(char [][]board)
    {
        int answer = 0;
        for (int i=0;i<board.length;i++) {
        	answer = Math.max(answer, getSurface(board, i));
         // System.out.println("===========");
        }
        return answer;
    }
    int getSurface(char[][] input, int idx) {
       int height = 0;
       int width = 0;
       int surface = 0;
       List<Integer> aWidth = new ArrayList<>();
       for (int i = 0; i< input.length;i++) {
         width = 0;         
         for(int j = idx; j< input[0].length;j++) {
           //System.out.print(input[i][j]+",");
           if (input[i][j] == 'X') break;
           else if (input[i][idx] == 'O' && input[i][j] == 'O') width++;    
         }
         aWidth.add(width);
         //System.out.print(" w:" + width);  
         surface = Math.max(surface, calcRect(aWidth));
        
       }
      return surface;
    }
    int calcRect(List<Integer> aWidth) {
    	int square = 0;
      for(int i= 0;i < aWidth.size();i++) {
        if(aWidth.get(i) > square) square++;
        else square = 0;
      }
     // System.out.println(" s:" + square);      
      return square*square;
    }
    public static void main(String[] args)
    {
        TryHelloWorld test = new TryHelloWorld();
				char [][]board ={
				{'X','O','O','O','O','O','O'},
				{'X','O','O','O','O','O','O'},
				{'X','O','O','O','O','O','O'},
				{'X','O','O','O','O','O','O'},
				{'X','O','O','O','O','O','O'},
                {'X','O','O','O','O','O','O'},
                {'X','X','X','O','O','O','O'}
        };

        System.out.println(test.findLargestSquare(board));
    }
}