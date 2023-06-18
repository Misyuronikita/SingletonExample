public class SingletonEx {
    //Тут храниться один единственный объект класса SingletonEx
    private static SingletonEx singletonEx;

    //Допустим у нас есть поле value
    private String value;

    public String getValue() {
        return value;
    }

    //ВАЖНО: конструктор обязатлеьно private
    //Мы не хотим, чтобы пользователь мог создавать новые объекты класса
    private SingletonEx(String value){
        this.value = value;
    }

    //Этот статический метод вызывает пользователь, чтобы получить объект класса
    public static SingletonEx getSingletonEx(String value){
        //проверка на то, создан ли объект
        if(singletonEx == null){
            //в этом случае, создаем объект класса, если он раньше не создавался
            singletonEx = new SingletonEx(value);
        }
        //все остальные вызовы этого метода будут возвращать лишь уже существующий объект этого класса
        return singletonEx;
    }
}
