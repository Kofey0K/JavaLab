package com.lab.model;

public class DataSOS {
    public static BookEntity[] createArrayOfPredefinedBooks() {
        BookEntity[] array = new BookEntity[13];
        array[0] = new BookEntity("Анна Каренина", "Лев Толстой", "ИД ЛОТОС", 2015, 150);
        array[1] = new BookEntity("Мастер и Маргарита", "Михаил Булгаков", "Буква", 2012, 120);
        array[2] = new BookEntity("Грозовой Перевал", "Эмили Бронте", "BESTBOOKS", 2019, 200);
        array[3] = new BookEntity("Евгений Онегин", "Александр Пушкин", "Буква", 2012, 120);
        array[4] = new BookEntity("Унесенные Ветром", "Маргарет Митчелл", "ИД ЛОТОС", 2012, 140);
        array[5] = new BookEntity("Ромео и Джульетта", "Уильям Шекспир", "ИД ЛОТОС", 2019, 190);
        array[6] = new BookEntity("Великий Гэтсби", "Фрэнсис Фицджеральд", "BESTBOOKS", 2021, 190);
        array[7] = new BookEntity("Три мушкетера", "Александр Дюма", "Буква", 2016, 130);
        array[8] = new BookEntity("Сестра Керри", "Теодор Драйзер", "BESTBOOKS", 2017, 110);
        array[9] = new BookEntity("Американская трагедия", "Теодор Драйзер", "BESTBOOKS", 2017, 110);
        array[10] = new BookEntity("Война и мир", "Лев Толстой", "Буква", 2014, 140);
        array[11] = new BookEntity("Смерть Ивана Ильича", "Лев Толстой", "ИД ЛОТОС", 2014, 170);
        array[12] = new BookEntity("Руслан и Людмила", "Александр Пушкин", "Буква", 2021, 190);
        return array;
    }
}
