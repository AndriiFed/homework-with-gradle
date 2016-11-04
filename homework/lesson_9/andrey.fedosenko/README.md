### Lesson9. Initialization order.

Домашнее задание:

Скопируйте Java классы из директории `lesson_9/misc/src` в `lesson_9/name.surname/...`

> Напоминаю, что Gradle ищет исходные коды Java программы в соответствии с определенной структурой директорий.

Поменяйте код в классах `TopLevelClass, ParentClass и GrandParentClass` так, чтобы порядок инициализации полей класса (как статических, так и обычных), конструкторов и инициализаторов, соответсвовал правильному порядку инициализации в Java

Пример (порядок инициализации неверный, но чтобы показать идею - достаточно)

```Java
public class ExampleClass  {
  private InitOrderLogger l1 = InitOrderLogger.logAndGetInstance(1);
  private static InitOrderLogger l2 = InitOrderLogger.logAndGetInstance(2);

  // ......

  public ExampleClass() {
    InitOrderLogger.logAndGetInstance(3);
  }
```

#### Порядок инициализации:

1. Статические поля и статический инициализатор каждого класса в порядке наследования.
2. Поля, инициализатор, конструктор каждого класса в порядке наследования.

```sh
$ gradle :homework\\lesson_9\\andrey.fedosenko:acceptanceTest
:homework\lesson_9\andrey.fedosenko:compileJava UP-TO-DATE
:homework\lesson_9\andrey.fedosenko:processResources UP-TO-DATE
:homework\lesson_9\andrey.fedosenko:classes UP-TO-DATE
:homework\lesson_9\andrey.fedosenko:compileAcceptanceTestJava UP-TO-DATE
:homework\lesson_9\andrey.fedosenko:processAcceptanceTestResources UP-TO-DATE
:homework\lesson_9\andrey.fedosenko:acceptanceTestClasses UP-TO-DATE
:homework\lesson_9\andrey.fedosenko:acceptanceTest UP-TO-DATE

BUILD SUCCESSFUL

Total time: 5.613 secs
```
