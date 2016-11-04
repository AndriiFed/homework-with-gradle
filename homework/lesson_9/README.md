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
