//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean passIsValid = true;
        boolean inCarantine = true;

        boolean isPersonenel = true;

        String message;
        if (passIsValid && !inCarantine) {
            message = "Проход открыт";
        } else if (isPersonenel) {
            message = "Проход открыт только для персонала";
        } else {
            message = "Проход закрыт";
        }
    }
}