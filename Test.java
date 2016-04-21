public class Test {

 public void newbranch1() {
  System.out.print("This is new branch1");
 }

 public static void main(String args[]) {

  int[] numbers = {
   10,
   20,
   30,
   40,
   50
  };

  for (int x: numbers) {
   System.out.print(x);
   System.out.print(",");
  }
  System.out.print("\n");
  String[] names = {
   "James",
   "Larry",
   "Tom",
   "Lacy"
  };
  for (String name: names) {
   System.out.print(name);
   System.out.print(",");
   Test t = new Test();
   t.newbranch1();

  }
 }
}