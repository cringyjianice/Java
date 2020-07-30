import javax.swing.text.StyledEditorKit.AlignmentAction;

public class Task1_4 {
    public static void main(String[] args) {
    
        String CONST_MSG_SUCCESS = "ログイン成功です。";
        String CONST_MSG_ERROR_NAME = "名前に誤りがあります。";
        String CONST_MSG_ERROR_PASS = "パスワードに誤りがあります。";
        String CONST_MSG_ERROR_INPUT = "入力情報に誤りがあります。";
   
        String name = "alice";
        String pass = "pass";

        if (name.equals("alice") && pass.equals("pass")) {
            System.out.println(CONST_MSG_SUCCESS);
        }

        else if (pass.equals("pass")) {
            System.out.println(CONST_MSG_ERROR_PASS);
        }

        else if (name.equals("alice")) {
            System.out.println(CONST_MSG_ERROR_NAME);
        }

        else {
            System.out.println(CONST_MSG_ERROR_INPUT);
        }
    }
}
