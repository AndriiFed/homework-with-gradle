### Lesson6. Gradle and Classes.

Домашнее задание:

Спроектировать и создать три класса, которые описывают отношения между школой, одной или несколькими группами и студентами (произвольное количество).
Поля классов на ваше усмотрение. Например, у каждого студента есть имя/фамилия, у группы - название, итп.

Каждый класс, кроме Main, должен иметь дефолтный конструктор (конструктор без параметров)

Иерархия классов должна быть следующая:

```
--jelementary
|   |_ people
|   |    |____Student.java
|   |    |____Group.java
|   |______School.java
|___Main.java
```

Предусмотрите методы добавления новых групп в объект типа 'школа' и новых студентов в объект(ы) типа 'группа'. Каждый студент может быть в одной или более группе, например 'Java elementary' и 'English intermidiate'.

Добавьте класс 'Main', в котором создайте метод 'main', где создайте объект типа 'школа' и произвольное количество групп (минимум две) и студентов (минимум один).

Создайте файл README.md, с примером компиляции ваших классов и запуска программы через класс Main.

> Напоминаю, что путь к директории с исходными кодами вашего ДЗ должен быть следующий:
> `homework/lesson6/name.surname/src/main/java`


```sh
$ gradlew.bat :homework\lesson_6\andrey.fedosenko:build
:homework\lesson_6\andrey.fedosenko:compileJava
:homework\lesson_6\andrey.fedosenko:processResources UP-TO-DATE
:homework\lesson_6\andrey.fedosenko:classes
:homework\lesson_6\andrey.fedosenko:jar
:homework\lesson_6\andrey.fedosenko:assemble
:homework\lesson_6\andrey.fedosenko:compileAcceptanceTestJava
:homework\lesson_6\andrey.fedosenko:processAcceptanceTestResources UP-TO-DATE
:homework\lesson_6\andrey.fedosenko:acceptanceTestClasses
:homework\lesson_6\andrey.fedosenko:checkstyleAcceptanceTest SKIPPED
:homework\lesson_6\andrey.fedosenko:checkstyleMain
:homework\lesson_6\andrey.fedosenko:compileTestJava UP-TO-DATE
:homework\lesson_6\andrey.fedosenko:processTestResources UP-TO-DATE
:homework\lesson_6\andrey.fedosenko:testClasses UP-TO-DATE
:homework\lesson_6\andrey.fedosenko:checkstyleTest SKIPPED
:homework\lesson_6\andrey.fedosenko:test UP-TO-DATE
:homework\lesson_6\andrey.fedosenko:check
:homework\lesson_6\andrey.fedosenko:build

BUILD SUCCESSFUL

Total time: 4.096 secs
```

```sh
$ gradlew.bat :homework\lesson_6\andrey.fedosenko:execute
:homework\lesson_6\andrey.fedosenko:compileJava UP-TO-DATE
:homework\lesson_6\andrey.fedosenko:processResources UP-TO-DATE
:homework\lesson_6\andrey.fedosenko:classes UP-TO-DATE
:homework\lesson_6\andrey.fedosenko:execute
Vasil Pupkin, 24 years old, rating: 1
Dadya Fedor, 21 years old, rating: 2
GROUP: Jelementary, No. 12, Students:
         -> Vasil Pupkin, 24 years old, rating: 1
GROUP: Q&A, No. 13, Students:  no students.
SCHOOL: Hillel, Address: Kanatnaya str., Groups:
       GROUP: Jelementary, No. 12, Students:
                -> Vasil Pupkin, 24 years old, rating: 1
        GROUP: Q&A, No. 13, Students:  no students.
    GROUP: English intermidiate, No. 7, Students:
                -> Vasil Pupkin, 24 years old, rating: 1
               -> Dadya Fedor, 21 years old, rating: 2
SCHOOL: IT school, Address: Paustovskogo str., Groups: no groups

BUILD SUCCESSFUL

Total time: 1.239 secs
```
