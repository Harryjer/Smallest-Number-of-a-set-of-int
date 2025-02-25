//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*int givenArray = {2,6,3,8,5};*/
        Find_smallest_number small = new Find_smallest_number();
        small.findsmallest();
    }

        public class FindSmallest {
            int givenArray[] = {2, 6, 4, 6, 8};


            public void findSmallestValue() {
                int smallest = Integer.MAX_VALUE;
                for (int i = 0; i < givenArray.length; i++) {
                    if (givenArray[i] < smallest) {
                        smallest = givenArray[i];
                    }
                }
                System.out.println(smallest);
            }
        }
    }