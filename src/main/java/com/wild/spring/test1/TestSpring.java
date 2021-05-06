package com.wild.spring.test1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        /* Клсс обращается к файлу applicationContext (из папки с ресурсами), считывает бимы и помещает их в
        Application Context */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        /* Получаем бин (имя бина(из applicationContext.xml), класс объекта) */
        TestBean testBean = context.getBean("testBean", TestBean.class);

        System.out.println(testBean.getName());
        System.out.println(testBean.getClass());

        // Закрываем контекст
        context.close();
    }
}
