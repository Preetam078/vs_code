public class ArrayData {
    public static void main(String[] args) {
        
        // int marks[] = new int[5];
        // marks[0] = 4;
        // marks[1] = 5;
        // marks[2] = 6;
        // marks[3] = 47;
        // marks[4] = 43;

        int marks[] = {1,3,5,6,7,8};

        for(int i =0 ;i <marks.length;i++){
            System.out.println(marks[i]);
        }

        int  dimension[][] = {{1,3},{3,2},{5,7}};

        for(int i = 0; i< dimension.length;i++){
            for(int j =0; j<dimension[i].length;j++){
                System.out.println(dimension[i][j]);
            }
        }


    }}
