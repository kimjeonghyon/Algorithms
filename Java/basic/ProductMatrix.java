package aaa;
class ProductMatrix {
	public int[][] productMatrix(int[][] A, int[][] B) {
    

	 
	int[][] answer = new int[A.length][B[0].length];
    int[][] nB = new int[B[0].length][A[0].length];
    for(int i = 0; i<B[0].length; i++) {
    	for(int j=0; j<A[0].length; j++) {
        nB[i][j] = B[j][i];
   	  }
    }
    print(A);
    System.out.println("----------------");
    print(B);
    System.out.println("----------------"); 
    print(nB);
    for(int i = 0; i<A.length; i++) {
        System.out.print(" " + i);
    	for(int j=0; j<B[0].length; j++) {
        answer[i][j] = getRowSum(A[i],nB[j]);
        System.out.print(" " + j);
   	  }
    	System.out.println();
    }
    
    print(answer);
    return answer;
	}

  void print(int[][] answer) {
    for (int[] ak : answer) {
      for(int k : ak) {
        System.out.print(""+k+ ",");
      }
      System.out.println();
    }
  }
  int getRowSum(int [] a, int [] b) {
    int sum = 0;
    for(int i = 0;i<a.length;i++) {
      sum +=a[i]*b[i];
    }
    return sum;
  }
	public static void main(String[] args) {
		ProductMatrix c = new ProductMatrix();
//		int[][] a = { { 1, 2 }, 
//		{ 2, 3 } };
//		int[][] b = { { 3, 4 }, 
//		{ 5, 6 } };
		int[][] a = { { 5, 4, 8, 5, 2 }, 
	              { 9, 5, 6, 1, 3 },
	              { 1, 3, 6, 2, 8 },
	              { 1, 4, 2, 7, 3 } 
	             };
		int[][] b = {{6}, {10}, {7}, {1}, {7} };
     
// 145 
// 168 
// 136 
// 88     
      System.out.println("START");
      System.out.println("행렬의 곱셈 : " + c.productMatrix(a, b));
	}
}


