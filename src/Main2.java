public class Main2 {

    public static void main(String[] args) {
        String[][] array = {{"1","2"}, {"3","4", null}};
        System.out.println(sum2d(array));

    }
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                try {
                    if(!(arr[i][j] instanceof String)){
                        int val = Integer.parseInt(arr[i][j]);
                        sum += val;

                }
            } catch (Exception e){
                    System.out.println("Error");
                }
            }
        }

        return sum;

    }

}
