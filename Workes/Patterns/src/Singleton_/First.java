package Singleton_;

public class First {
    private static First instance;

    private First() {
    }

    public static First getInstance() {
        if (instance == null) {        //если объект еще не создан
            instance = new First();    //создать новый объект
        }
        return instance;        // вернуть ранее созданный объект
    }
}

/*
public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;
    private LazyInitializedSingleton(){}
    public static LazyInitializedSingleton getInstance(){ // #3
        if(instance == null){		//если объект еще не создан
            instance = new LazyInitializedSingleton();	//создать новый объект
        }
        return instance;		// вернуть ранее созданный объект
    }
}
*/
