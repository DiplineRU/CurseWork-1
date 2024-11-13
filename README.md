RU text
#  **Курсовое задание. Книга сотрудников**
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
1. **Базовая сложность**
- Создать класс Employee, который содержит информацию о Ф. И. О., отделе и зарплате сотрудника. Отделы для простоты должны быть названы от 1 до 5.
- Добавить статическую переменную-счетчик, которая будет отвечать за id.
- Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение. 
- Добавить возможность получать значения полей из Employee (геттеры) для всех полей.
- Добавить возможность устанавливать значения полей отдела и зарплаты (сеттеры).
- По умолчанию все поля должны передавать через конструктор (кроме id) и заполняться в нем (включая id, который нужно получить из счетчика).
- Создать внутри класса с методом main поле типа Employee[10], которое будет выполнять роль «хранилища» для записей о сотрудниках.
- Создать статические методы, которые будут взаимодействовать с массивом и предоставлять результат:
- Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
    - Посчитать сумму затрат на зарплаты в месяц.
    - Найти сотрудника с минимальной зарплатой. 
    - Найти сотрудника с максимальной зарплатой. 
    - Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b). 
    - Получить Ф. И. О. всех сотрудников (вывести в консоль).
2. **Повышенная сложность**

Создать дополнительные статические методы для решения следующих задач.
- Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %).
- Получить в качестве параметра номер отдела (1–5) и найти (всего 6 методов):
    - Сотрудника с минимальной зарплатой.
    - Сотрудника с максимальной зарплатой.
    - Сумму затрат на зарплату по отделу.
    - Среднюю зарплату по отделу (учесть, что количество людей в отделе отличается от employees.length).
    - Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра.
    - Напечатать всех сотрудников отдела (все данные, кроме отдела).
- Получить в качестве параметра число и найти:
    - Всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль).
    - Всех сотрудников с зарплатой больше (или равно) числа (вывести id, Ф. И. О. и зарплатой в консоль).
3. **Очень сложно**

Привести структуру проекта к ООП.
- Создать класс EmployeeBook.
- Перенести хранилище сотрудников в него (массив), закрыть к нему доступ извне (сделать приватным).
- Все статические методы по работе с массивом перенести в этот класс и сделать нестатическими.
- Добавить несколько новых методов:
    - Добавить нового сотрудника (создаем объект, заполняем поля, кладем в массив).
    Нужно найти свободную ячейку в массиве и добавить нового сотрудника в нее. Искать нужно всегда с начала, так как возможно добавление в ячейку удаленных ранее сотрудников.
    - Удалить сотрудника (находим сотрудника по Ф. И. О. и/или id, обнуляем его ячейку в массиве).
- Изменить сотрудника (получить сотрудника по Ф. И. О., модернизировать его запись): 
    - Изменить зарплату.
    - Изменить отдел. 
    - Придумать архитектуру. Сделать или два метода, или один, но продумать его.
- Получить Ф. И. О. всех сотрудников по отделам (напечатать список отделов и их сотрудников).
   
ENG text
#  **Course assignment. Employee Book**
*Task description:*
Write a program that deals with employee accounting and helps HR and accounting automate processes.
With the help of your program, the accounting department and the HR department will be able to find out the following information:
1. Get a list of all employees.
2. Calculate the amount of salary costs.
3. Find an employee with a minimum wage.
4. Find an employee with the maximum salary.
5. Calculate the average value of salaries. 

The following are the points that need to be implemented in order to do the task. Please note that the task has three levels of difficulty, depending on the elaboration of your program:
you need to make basic points, tasks with increased complexity and very difficult ones — if desired.
1. **Basic difficulty**
- Create an Employee class that contains information about the employee's full name, department, and salary. Departments should be named from 1 to 5 for simplicity.
- Add a static counter variable that will be responsible for the id.
- Add the id field to the Employee class, which is entered from the counter, and then the counter increases its value. 
- Add the ability to get field values from Employee (getters) for all fields.
- Add the ability to set the values of the department and salary fields (setters).
- By default, all fields must be passed through the constructor (except for the id) and filled in (including the id to be obtained from the counter).
- Create an Employee type field inside the class with the main method[10], which will act as a "repository" for employee records.
- Create static methods that will interact with the array and provide the result:
- Get a list of all employees with all the data available on them (output the values of all fields to the console (toString)).
    - Calculate the amount of salary costs per month.
    - Find an employee with a minimum salary. 
    - Find an employee with the maximum salary. 
    - Calculate the average value of salaries (you can use the method from point b for this). 
    - Get the full name of all employees (output to the console).
2. **Increased difficulty**

Create additional static methods to solve the following tasks.
- Index the salary (cause a change in salaries for all employees by the value of the argument in %).
- Get the department number (1-5) as a parameter and find (6 methods in total):
- An employee with a minimum salary.
    - An employee with a maximum salary.
    - The amount of salary costs for the department.
    - The average salary for the department (take into account that the number of people in the department differs from employees.length).
    - Index the salary of all employees of the department by the percentage that comes as a parameter.
    - Print all employees of the department (all data except the department).
- Get a number as a parameter and find:
- All employees with a salary less than a number (output id, full name and salary to the console).
    - All employees with a salary greater than (or equal to) the number (output id, full name and salary to the console).
3. **It is very difficult**

Bring the project structure to the OOP.
- Create an EmployeeBook class.
- Move the employee storage to it (array), close access to it from the outside (make it private).
- Move all static methods for working with an array to this class and make them non-static.
- Add several new methods:
- Add a new employee (create an object, fill in the fields, put it in an array).
    You need to find an empty cell in the array and add a new employee to it. You should always search from the beginning, since it is possible to add previously deleted employees to the cell.
    - Delete an employee (find an employee by full name and/or id, reset his cell in the array).
- Change an employee (get an employee by full name, upgrade his record): 
    - Change the salary.
    - Change the department. 
    - Come up with an architecture. Make either two methods, or one, but think it through.
- Get the full name of all employees by department (print a list of departments and their employees).
