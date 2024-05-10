public class AuthUtils {

    public static final String checkPassword(String pwd, String id) {

        // 비밀번호 포맷 확인(영문, 특수문자, 숫자 포함 8자 이상)
        Pattern passPattern1 = Pattern.compile("^(?=.*[a-zA-Z])(?=.*\\d)(?=.*\\W).{8,20}$");
        Matcher passMatcher1 = passPattern1.matcher(pwd);

        if(!passMatcher1.find()){
            return "비밀번호는 영문과 특수문자, 숫자를 포함하며 8자 이상이어야 합니다.";
        }

        // 반복된 문자 확인
        Pattern passPattern2 = Pattern.compile("(\\w)\\1\\1\\1");
        Matcher passMatcher2 = passPattern2.matcher(pwd);

        if(passMatcher2.find()){
            return "비밀번호에 동일한 문자를 과도하게 연속해서 사용할 수 없습니다.";
        }

        // 아이디 포함 확인
        for(int i = 0; i<pwd.length() -3; i++) {
            if(id.contains(pwd.substring(i, i+3))) {
                return "비밀번호에 ID를 포함할 수 없습니다.";
            }
        }

        // 특수문자 확인
        Pattern passPattern3 = Pattern.compile("\\W");
        Pattern passPattern4 = Pattern.compile("[!@#$%^*+=-]");

        for(int i = 0; i < pwd.length(); i++){
            String s = String.valueOf(pwd.charAt(i));
            Matcher passMatcher3 = passPattern3.matcher(s);

            if(passMatcher3.find()){
                Matcher passMatcher4 = passPattern4.matcher(s);
                if(!passMatcher4.find()){
                    return "비밀번호에 특수문자는 !@#$^*+=-만 사용 가능합니다.";
                }
            }
        }

        // 연속된 문자,숫자 확인
        int cnt = 0;
        int cnt2 = 0;

        byte temp = 0;
        byte temp2 = 0;
        byte temp3 = 0;

        byte[] bytes = pwd.getBytes(StandardCharsets.US_ASCII);

        for(int i=0; i<bytes.length - 3; i++) {

            temp = bytes[i];
            temp2 = bytes[i+1];
            temp3 = bytes[i+2];

            if(temp - temp2 == 1 && temp2 - temp3 ==1) {
                cnt = cnt +1;
            }

            if(temp - temp2 == -1 && temp2 - temp3 == -1) {
                cnt2 = cnt2 +1;
            }

        }

        if(cnt > 0 || cnt2 > 0) {
            return "비밀번호에 연속된 문자,숫자를 사용할 수 없습니다.";
        }

        return "";
    }
}