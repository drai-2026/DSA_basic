class arry{
   int[] arr2 = {10,9,8,7,6,5,4,3,2,1};
   int[] arr1 = {1,2,3,4,5,6,78,9};
}
public class selectionsort{
    public static void main(String[] args) {   
      arry ar = new arry();
      int len = ar.arr1.length;
      int temp1;
      int temp2;
      try{
      for(int i = 0;i < len;i++){
      int index = i;
        temp1 = ar.arr1[i];
        for(int j = i ; j<len ;j++){
             if(ar.arr1[j]<temp1){
              temp1 = ar.arr1[j];
              index = j ;
             }
        }
        temp2 = ar.arr1[i];
        ar.arr1[i] = temp1;
        ar.arr1[index] = temp2;
    }}
    catch(Exception e){System.out.println(e);}
    for(int i = 0 ; i < len ; i ++ ){
      System.out.println(ar.arr1[i]);
    }
}
}
