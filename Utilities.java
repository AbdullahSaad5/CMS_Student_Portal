package CMS_Student_Portal;
public class Utilities {

    public static boolean checkString(String message){
        for (int i = 0; i < message.length(); i++) {
            char curr = message.charAt(i);
            if(!Character.isLetter(curr)){
                return false;
            }
        }
        return true;
    }

    public static boolean checkStringWithSpaces(String message){
        for (int i = 0; i < message.length(); i++) {
            char curr = message.charAt(i);
            if(!(Character.isAlphabetic(curr) || Character.isSpaceChar(curr))){
                return false;
            }
        }
        return true;
    }

    public static boolean checkNumber(String message){
        for (int i = 0; i < message.length(); i++) {
            char curr = message.charAt(i);
            if(!Character.isDigit(curr)){
                return false;
            }
        }
        return true;
    }

    public static boolean checkFloat(String message){
        String part1 = "";
        int index = -1;
        for (int i = 0; i < message.length(); i++) {
            char curr = message.charAt(i);
            if(curr == '.'){
                index = i;
                break;
            }
            part1 += curr;
        }
        if(index == -1 || index == message.length() - 1){
            return false;
        }
        String part2 = message.substring(index + 1);
        if(checkNumber(part1) && checkNumber(part2)){
            return true;
        }
        return false;
    }

    public static boolean checkRegistrationNumber(String message){
        if(message.length() != 12){
            return false;
        }

        String[] departments = {"BAF", "BAR", "BBA", "BCE", "BCS", "BDE", "BEC", "BEE", "BEL", "BET", "BFA", "BPH", "BPY",
                "BSE", "BSI", "BSM", "BSO", "BTN", "ECE", "EEE", "EPE", "MBA", "PBM", "PBS", "PCE", "PCH", "PCS", "PEE",
                "PME", "PMG", "PMI", "PMS", "PMT", "PPH", "PPH", "R06", "RBA", "RBI", "RBM", "RBS", "RCE", "RCS", "REC",
                "REE", "REL", "RHI", "RIR", "RIS", "RME", "RMG", "RMI", "RMS", "RMT", "RMV", "RPH"};
        String dashes = message.substring(4, 5) + message.substring(8, 9);
        String batch = message.substring(0, 2);
        String year = message.substring(2, 4);
        String dept = message.substring(5, 8);
        String regNo = message.substring(9);

        if(!dashes.equals("--")){
            return false;
        }
        if(!(batch.equalsIgnoreCase("FA") || batch.equalsIgnoreCase("SP"))){
            return false;
        }
        if(!(checkNumber(year) && checkNumber(regNo))){
            return false;
        }
        if(Integer.parseInt(year) > 20 || Integer.parseInt(year) < 14) {
            return false;
        }
        if(Integer.parseInt(regNo) > 200 || Integer.parseInt(regNo) < 1) {
            return false;
        }

        for (String e : departments){
            if(e.equalsIgnoreCase(dept)){
                return true;
            }
        }
        return false;
    }


    public static boolean checkEmail(String message){
        String part1 = "";
        int index = -1;
        for (int i = 0; i < message.length(); i++) {
            char curr = message.charAt(i);
            if(curr == '@'){
                index = i;
                break;
            }
            part1 += curr;
        }

        if(part1.length() < 1){
            return false;
        }
        if (index == -1){
            return false;
        }

        String part2 = message.substring(index + 1);

        for (int i = 0; i < part1.length(); i++) {
            if(!Character.isLetterOrDigit(message.charAt(i))){
                return false;
            }
        }
        if (part2.equalsIgnoreCase("gmail.com")){
            return true;
        }
        return false;
    }


}