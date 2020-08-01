public class Task1_2 {
    public static void main(String[] args) {
        
        String[] country = {"JAPAN", "AMERICA", "KOREA"};

        System.out.println(country.length);
        
        String[] strArray = new String[3];
        strArray[0] = "りんご";
        strArray[1] = "もも";
        strArray[2] = "ぶどう";
        
        System.out.println(strArray[1]);
        
        //⑤下記の処理について、何をしているのかコメントを記入してください。
        //[10、20、30、40、50 を要素の値とする、
        //intArrayという名前のint型配列を宣言する。]
        int[] intArray = { 10, 20, 30, 40, 50 };

        // ⑥下記の処理について、何をしているのかコメントを記入してください。
        // [修正：intArrayという配列のindexが１と4の要素の加算した値を返す処理を記述しています。]
        System.out.println(intArray[1] + intArray[4]);

    }
}