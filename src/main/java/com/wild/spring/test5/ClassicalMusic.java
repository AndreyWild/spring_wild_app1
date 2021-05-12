package com.wild.spring.test5;

public class ClassicalMusic implements Music {

    private ClassicalMusic() {
    }

    // init-method
    public void doMyInit(){
        System.out.println("Do my initialization");
    }

    // destroy-method
    public void doMyDestroy(){
        System.out.println("Do my destroy");
    }

    // Создаем фабричный метод, обязательно static
    public static ClassicalMusic getClassicalMusic(){
        System.out.println("Сработал метод getClassicalMusic()");
        return new ClassicalMusic();
    }



    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
