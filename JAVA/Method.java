public class Method {
    public static void main(String[] args) {
        
      System.out.println(sum(7,8));



      //Exception Handling 
      int array[] =  new int[5];

      try {
          System.out.println(array[6]);
      } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println(e.getLocalizedMessage());
      }

    } 
       static int sum(int first, int second){
            int s = first+second;
            return s;      
      }
    
  }    
