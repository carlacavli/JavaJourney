package Day15;
//TODO
// Given 2 arrays of ints, a and b, print "have the same first elements"
//       if they have the same first element
public class ArrayTask5 {
    public static void main(String[] args) {
      int [] a = {1,4,5,8, 10};
      int [] b = {2,5,6,9, 10 };


      if (a[0] == b[0] || a[4] ==b[4] || a[2] == b[2]  ){

          System.out.println("have the same first elements " + a[0]);

          System.out.println("have the same last elements " + a[4]);

          System.out.println("have the same middle elements " +a[2]);


          System.out.println(" they are not same ");

          }
      }


    }

