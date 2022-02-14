
 class Main {

    //public static void count values over big
    public static int count(int array[],int start, int stop, int big)
    {
        int count = 0;
        for (int i = start; i<= stop; i = i + 1) {
          if (array[i] > big) {
            count = count + 1;
          }
        }
        return count;
    }
    
    // return the sum of the values from start to end
    public static int sum(int array[], int start, int stop)
    {
        int sum = 0;
        for (int i = start; i<= stop; i = i + 1) {
          sum = sum + array[i];
        }
        return sum;
    }
    
    
    //find the sum of all values over big, starting at spot and ending at another spot
    public static int largesum(int array[], int start, int stop, int big)
    {
        int sum = 0;
        
        return sum;
    }
    
    
    
    
    //Display all values in the array
    public static void display(int array[])
    {
        for(int i = 0; i < array.length; i++) {
          System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    // return a new array with items removed
    public static int[] removeBig(int array[], int big)
    {
        int [] toRet = new int[0];
        
        return toRet;
    }
    //is this array everything going up in value
    public static boolean ValuesUp(int array[])
    {
        boolean up = true;
        
        return up;
    }
    //is this array everything going down in value
    public static boolean ValuesDown(int array[])
    {
        boolean up = true;
        
        return up;
    }
    
    
    // this one is on your own, you can do it from scratch or use other methods
    public static int sumAll(int array[])
    {
        
        return 0;
    }
    
    

    public static void main(String[] args) {
      double x = Math.floor(Math.random()*11);
      int y = (int) x;
      double a = Math.floor(Math.random()*91);
      int b = (int) a;
      int randomnums[] = {66,91,30,69,45,92,2,46,13,65,42,81};
      display(randomnums);
      int sumnation = sum(randomnums,0,y);
      System.out.println(sumnation);
      int countnum = count(randomnums,0,y,b);
      System.out.println(countnum);
    }
    
}