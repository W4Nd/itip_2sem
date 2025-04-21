package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Создаем контекст Spring
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        // Получаем бины
        Monster monster = context.getBean("monster", Monster.class);
        Goblin goblin = context.getBean("goblin", Goblin.class);
        Mermaid mermaid = context.getBean("mermaid", Mermaid.class);
        Dragon dragon = context.getBean("dragon", Dragon.class);

        // Выводим информацию о бинах
        System.out.println(monster);
        System.out.println(goblin);
        System.out.println(mermaid);
        System.out.println(dragon);

        // Закрываем контекст
        context.close();
    }
}