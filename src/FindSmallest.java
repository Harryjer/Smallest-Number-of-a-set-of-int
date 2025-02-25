public class FindSmallest {
    int givenArray[]= {2,6,4,6,8};


public void findSmallestValue(){
    int smallest = Integer.MAX_VALUE;
    for(int i=0; i < givenArray.length; i++ ){
        if(givenArray[i]<smallest){
            smallest = givenArray[i];
        }
    }
    System.out.println(smallest);
}
}