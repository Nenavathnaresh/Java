public class hello
{
    int x = 5 ;
    public static void main(String[] args)
    {
        String cars[] = {"volvo","BMW","Ford","Mazda"} ;

        for(int i = 0 ; i < cars.length; i++){
            System.out.println(cars[i]);
        }
        
        for(String i : cars){
            System.out.println(i);
        }

        int ages[] = {23,54,24,53,23,53,76,97};
        float avg, sum = 0 ;
        int length = ages.length;
        for(int x : ages){
            sum += x;
        }
        avg = sum/length;
        System.out.println(avg);

        int myNum[][] = {{1,2,3,4},{5,6,7,8}};
        System.out.println(myNum[1][2]);

        int n = myNum.length;
        int m = myNum[0].length;

        for(int i = 0; i < n; i++){
            for(int j = 0 ; j < m; j++){
                System.out.println(myNum[i][j]);
            }
        }

        for(int x[] :myNum){
            for(int y: x){
                System.out.println(y);
            }
        }
    }
}