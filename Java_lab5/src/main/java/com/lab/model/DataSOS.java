package com.lab.model;

public class DataSOS {
    public static BookEntity[] createArrayOfPredefinedBooks() {
        return new BookEntity[]{
                new BookEntity("Анна Каренина", "Лев Толстой", "ИД ЛОТОС", 2015, 150),
                new BookEntity("Мастер и Маргарита", "Михаил Булгаков", "Буква", 2012, 120),
                new BookEntity("Грозовой Перевал", "Эмили Бронте", "BESTBOOKS", 2019, 200),
                new BookEntity("Евгений Онегин", "Александр Пушкин", "Буква", 2012, 120),
                new BookEntity("Унесенные Ветром", "Маргарет Митчелл", "ИД ЛОТОС", 2012, 140),
                new BookEntity("Ромео и Джульетта", "Уильям Шекспир", "ИД ЛОТОС", 2019, 190),
                new BookEntity("Великий Гэтсби", "Фрэнсис Фицджеральд", "BESTBOOKS", 2021, 190),
                new BookEntity("Три мушкетера", "Александр Дюма", "Буква", 2016, 130),
                new BookEntity("Сестра Керри", "Теодор Драйзер", "BESTBOOKS", 2017, 110),
                new BookEntity("Американская трагедия", "Теодор Драйзер", "BESTBOOKS", 2017, 110),
                new BookEntity("Война и мир", "Лев Толстой", "Буква", 2014, 140),
                new BookEntity("Смерть Ивана Ильича", "Лев Толстой", "ИД ЛОТОС", 2014, 170),
                new BookEntity("Руслан и Людмила", "Александр Пушкин", "Буква", 2021, 190)
        };
    }
}
