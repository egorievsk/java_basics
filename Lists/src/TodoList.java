import java.util.ArrayList;

public class TodoList {

    private ArrayList listTodos;

    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка
        listTodos.add(todo);
    }

    public void add(int index, String todo) {
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
        listTodos.add(index, todo);
    }

    public void edit(int index, String todo) {
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
        listTodos.set(index, todo);
    }

    public void delete(int index) {
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
        listTodos.remove(index);
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        return listTodos;
    }

}
