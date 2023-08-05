class Arraay {
    public int show(int arr[]){
        int max=arr[0];
for(int i=1;i<arr.length;i++){
        if(arr[i]<max){
            max=arr[i];
        }

}
        return max;}}

public class NumberPattern {
    public  static void main(String[]args){
        Arraay obj=new Arraay();

        int arr[]={2,3,4,5,5,6,6,66,555};
        System.out.println(obj.show(arr));
      /*  int n =6;

        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0||i==(n-1)||j==(n-1)){
                System.out.print(j);}
                else{
                    System.out.print(" ");
                }

    }
            System.out.println();
    }*/



}
}
