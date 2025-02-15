import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailList {

    Comparator comparator = new Comparator() {
        @Override
        public int compare(Object email1, Object email2) {
            return email1.toString().compareTo(email2.toString());
        }
    };
    private TreeSet<String> setListEmail = new TreeSet<>(comparator);



    public void add(String email) {
        // TODO: валидный формат email добавляется, email это строка, она быть может любой
        String regex = "[A-Za-z0-9-]+@[A-Za-z0-9-]+[.][a-z0-9]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        while(matcher.find()) {
            email = matcher.group();
            setListEmail.add(email);
        };

    }

    public List<String> getSortedEmails() {
        // TODO: возвращается сортированный список электронных адресов в алфавитном порядке

        ArrayList<String> listEmail = new ArrayList<>(setListEmail);

        return listEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmailList emailList)) return false;
        return Objects.equals(setListEmail, emailList.setListEmail);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hashCode(setListEmail);
//    }

//    @Override
//    public int compareTo(Object email) {
//        return this.toString().compareTo(email.toString());
//    }
}
