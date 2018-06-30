package test;

public enum Enum1 {
    // Enum
     COMPUTER("S전자", "R70", 100000.0),
     NOTEBOOK("L전자", "R410", 200000.0);

     // Instance Variable
     private final String company;
     private final String model;
     private final double price;

      // 부가가치세          
     private static final double vat = 0.1;

     // Constructor
     Enum1(String company, String model, double price)
     {
             this.company = company;
             this.model = model; 
             this.price = price;
     }

      // Instance Method
     public String getCompany(){
            return this.company;
     }

     public String getModel(){
            return this.model;
     }

     public double getPrice(int amount)
     {
            double price = this.price * (double)amount ;
            return ( price  * vat ) + price;
     }

     public static void main(String args[])
     {
           int cnt = 1;
          double estimate = Enum1.COMPUTER.getPrice(5);  
          String company = Enum1.COMPUTER.getCompany();
          String model = Enum1.COMPUTER.getModel();

          // 단일 출력
          System.out.println("1. 단일출력--------------");
          System.out.println( "회사" + company + ",모델" + model + ",견적" + estimate );  
          
          System.out.println();  // 출력 이쁘게 해줄려고 한거니깐 오해 말아요.

          // for each문
          System.out.println("2. 다중출력--------------");
          for ( Enum1 x : Enum1.values() )
         {
                   estimate = x.getPrice(5);  
                   company = x.getCompany();
                   model = x.getModel();

                   System.out.println( "번호:" + cnt + ",회사" + company + ",모델" + model + ",견적" + estimate );  

                   cnt++;
        }

   }

}



