RU text
### Курсовое задание. Книга сотрудников
*Описание задачи:*
Напишите программу, которая занимается учетом сотрудников и помогает кадрам и бухгалтерии автоматизировать процессы.
С помощью вашей программы бухгалтерия и отдел кадров смогут узнавать следующую информацию:
1. Получить список всех сотрудников.
2. Посчитать сумму затрат на зарплаты.
3. Найти сотрудника с минимальной заплатой.
4. Найти сотрудника с максимальной зарплатой.
5. Подсчитать среднее значение зарплат. 

Далее описаны пункты, которые нужно реализовать, чтобы сделать задание. Обратите внимание, что у задания три уровня сложности в зависимости от проработки вашей программы:
необходимо сделать базовые пункты, задачи с повышенной сложностью и очень сложные — по желанию.
- **Базовая сложность**
    1. Создать класс Employee, который содержит информацию о Ф. И. О., отделе и зарплате сотрудника. Отделы для простоты должны быть названы от 1 до 5.
    2. Добавить статическую переменную-счетчик, которая будет отвечать за id.
    3. Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение. 
    4. Добавить возможность получать значения полей из Employee (геттеры) для всех полей.
    5. Добавить возможность устанавливать значения полей отдела и зарплаты (сеттеры).
    6. По умолчанию все поля должны передавать через конструктор (кроме id) и заполняться в нем (включая id, который нужно получить из счетчика).
    7. Создать внутри класса с методом main поле типа Employee[10], которое будет выполнять роль «хранилища» для записей о сотрудниках.
    8. Создать статические методы, которые будут взаимодействовать с массивом и предоставлять результат:
        a. Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
        b. Посчитать сумму затрат на зарплаты в месяц.
        c. Найти сотрудника с минимальной зарплатой. 
        d. Найти сотрудника с максимальной зарплатой. 
        e. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b). 
        f. Получить Ф. И. О. всех сотрудников (вывести в консоль).
- **Повышенная сложность**
    Создать дополнительные статические методы для решения следующих задач.
    1. Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %).
    2. Получить в качестве параметра номер отдела (1–5) и найти (всего 6 методов):
        a. Сотрудника с минимальной зарплатой.
        b. Сотрудника с максимальной зарплатой.
        c. Сумму затрат на зарплату по отделу.
        d. Среднюю зарплату по отделу (учесть, что количество людей в отделе отличается от employees.length).
        e. Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра.
        f. Напечатать всех сотрудников отдела (все данные, кроме отдела).
    3. Получить в качестве параметра число и найти:
        a. Всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль).
        b. Всех сотрудников с зарплатой больше (или равно) числа (вывести id, Ф. И. О. и зарплатой в консоль).
  - **Очень сложно**
    Привести структуру проекта к ООП.
    1. Создать класс EmployeeBook.
    2. Перенести хранилище сотрудников в него (массив), закрыть к нему доступ извне (сделать приватным).
    3. Все статические методы по работе с массивом перенести в этот класс и сделать нестатическими.
    4. Добавить несколько новых методов:
        a. Добавить нового сотрудника (создаем объект, заполняем поля, кладем в массив).
        Нужно найти свободную ячейку в массиве и добавить нового сотрудника в нее. Искать нужно всегда с начала, так как возможно добавление в ячейку удаленных ранее сотрудников.
        b. Удалить сотрудника (находим сотрудника по Ф. И. О. и/или id, обнуляем его ячейку в массиве).
    5. Изменить сотрудника (получить сотрудника по Ф. И. О., модернизировать его запись): 
        a. Изменить зарплату.
        b. Изменить отдел. 
        Придумать архитектуру. Сделать или два метода, или один, но продумать его.
    6. Получить Ф. И. О. всех сотрудников по отделам (напечатать список отделов и их сотрудников).
   
ENG text
### Course assignment. Employee Book
*Task description:*
Write a program that deals with employee accounting and helps HR and accounting automate processes.
With the help of your program, the accounting department and the HR department will be able to find out the following information:
1. Get a list of all employees.
2. Calculate the amount of salary costs.
3. Find an employee with a minimum wage.
4. Find an employee with the maximum salary.
5. Calculate the average value of salaries. 

The following describes the points that need to be implemented in order to do the task. Please note that the task has three levels of difficulty, depending on the elaboration of your program:
you need to make basic points, tasks with increased complexity and very complex ones — if desired.
- **Basic difficulty**
    1. Create an Employee class that contains information about the employee's full name, department, and salary. Departments should be named from 1 to 5 for simplicity.
    2. Add a static counter variable that will be responsible for the id.
    3. Add the id field to the Employee class, which is entered from the counter, and then the counter increases its value. 
    4. Add the ability to get field values from Employee (getters) for all fields.
    5. Add the ability to set the values of the department and salary fields (setters).
    6. By default, all fields must be passed through the constructor (except for the id) and filled in (including the id to be obtained from the counter).
    7. Create an Employee type field inside the class with the main method[10], which will act as a "repository" for employee records.
    8. Create static methods that will interact with the array and provide the result:
        a. Get a list of all employees with all available data on them (output the values of all fields to the console (toString)).
        b. Calculate the amount of salary costs per month.
        c. Find an employee with a minimum salary. 
        d. Find an employee with the maximum salary. 
        e. Calculate the average value of salaries (you can use the method from point b for this). 
        f. Get the full name of all employees (output to the console).
- **Increased difficulty**
    Create additional static methods to solve the following tasks.
    1. Index the salary (cause a change in salaries for all employees by the value of the argument in %).
    2. Get the department number (1-5) as a parameter and find (6 methods in total):
        a. An employee with a minimum salary.
        b. The employee with the maximum salary.
        c. The amount of salary costs for the department.
        d. The average salary for the department (take into account that the number of people in the department differs from employees.length).
        e. Index the salary of all employees of the department by the percentage that comes as a parameter.
        f. Print all employees of the department (all data except the department).
    3. Get a number as a parameter and find:
        a. All employees with a salary less than the number (output id, full name and salary to the console).
        b. All employees with a salary greater than (or equal to) the number (output id, full name and salary to the console).
  - **Very difficult**
    Bring the project structure to the OOP.
    1. Create an EmployeeBook class.
    2. Move the employee storage to it (array), close access to it from the outside (make it private).
    3. All static methods for working with an array should be moved to this class and made non-static.
    4. Add several new methods:
a. Add a new employee (create an object, fill in the fields, put it in an array).
        You need to find an empty cell in the array and add a new employee to it. You should always search from the beginning, since it is possible to add previously deleted employees to the cell.
        b. Delete an employee (find an employee by full name and/or id, reset his cell in the array).
    5. Change an employee (get an employee by full name, upgrade his record): 
        a. Change the salary.
        b. Change the department. 
        Come up with an architecture. Make either two methods, or one, but think it through.
    6. Get the full name of all employees by department (print a list of departments and their employees).
