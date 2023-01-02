
import java.util.ArrayList;
import java.util.Scanner;

/**
 * App (клиентский класс)
 */
public class App {
  /**
   * создание экземляра, вывод данных
   */
  public static void main(String[] args) {
    Infrastructure infrastructure = new Infrastructure();
    System.out.print("Введите буковки фильма, который хотите найти: ");
    String searchingWords = infrastructure.findWord();
    ArrayList<String> result = infrastructure.findAll(searchingWords);
    infrastructure.printResult(result);

  }
}

/**
 * Infrastructure (класс отвечающий за создание приложения)
 */
class Infrastructure {
  /**
   * запуск создания БД
   */
  public Infrastructure() {
    init();
  }

  Db2 db2;

  /**
   * готовая база данных
   * 
   * @return база данных
   */
  public Db getDb() {
    return db;
  }

  /**
   * 
   * @param idCinema id фильма
   * @return данные в формате(жанр и компания обращаются к соответствующим
   *         таблицам)
   */
  public String getAllInfo(int idCinema) {
    Cinema c = db2.films.get(idCinema - 1);

    return String.format("%d %s %s %s",
        c.id,
        c.name,
        db2.genres.get(c.genre - 1).name,
        db2.prod.get(c.filmProd - 1).titleName);
  }

  /**
   * Метод поиска фильмов по входным данным
   * @param searchData входные данные для поиска
   * @return возвращает результат поиска в виде списка
   */
  public ArrayList<String> findAll(String searchData) {
    ArrayList<String> findAll = new ArrayList<>();
    int size = db2.films.size();
    for (int idCinema = 0; idCinema < size; idCinema++) {
      Cinema c = db2.films.get(idCinema);
      if (c.name.toLowerCase().contains(searchData)) {
        findAll.add(String.format("%d %s %s %s",
            c.id,
            c.name,
            db2.genres.get(c.genre-1).name,
            db2.prod.get(c.filmProd-1).titleName));
      }
    }
    if (findAll.size() == 0) {
      findAll.add("Ничего не найдено");
    }
    return findAll;
  }

// Метод печати результата поиска
  public void printResult(ArrayList<String> findAll) {
    for (int i = 0; i < findAll.size(); i++) {
      System.out.println(findAll.get(i));
    }
  }

  // Метод ввода данных
  public String findWord() {
    Scanner sc = new Scanner(System.in);
    return  sc.nextLine();
  }

  /**
   * создание БД, наполнение, добавление в БД, добавление жанров, заполнение
   * компаний
   * @return база данных
   */
  Db2 init() {
    db2 = new Db2();
    Cinema c1 = new Cinema(1, "Тьма", 1, 1);
    Cinema c2 = new Cinema(2, "Свет", 1, 2);
    Cinema c3 = new Cinema(3, "Особенности национальной рыбалки", 2, 2);
    Cinema c4 = new Cinema(4, "Человек паук", 3, 3);

    db2.films.add(c1);
    db2.films.add(c2);
    db2.films.add(c3);
    db2.films.add(c4);

    db2.genres.add(new Genre(1, "Ужасы"));
    db2.genres.add(new Genre(2, "Комедия"));
    db2.genres.add(new Genre(3, "Боевик"));
    FilmProducerFactory pf = new FilmProducerFactory();
    db2.addFilmProducer(pf.getFilmProducer("Ленфильм"));
    db2.addFilmProducer(pf.getFilmProducer("Мосфильм"));
    db2.addFilmProducer(pf.getFilmProducer("Марвел"));
    db2.addFilmProducer(pf.getFilmProducer("DC"));

    return db2;
  }
}

/**
 * Db (база данных, создание списков: фильмы, компания, жанры)
 */
class Db {
  ArrayList<Cinema> films = new ArrayList<>();
  ArrayList<FilmProducer> prod = new ArrayList<>();
  ArrayList<Genre> genres = new ArrayList<>();

  /**
   * метод добавление компании
   * 
   * @param producer
   */
  public void addFilmProducer(FilmProducer producer) {
    prod.add(producer);
  }
}

/**
 * Cinema (модель фильмов)
 * id, компания, название, жанр
 */
class Cinema {
  int id;
  int filmProd;
  String name;
  int genre;

  /**
   * сгенерированный конструктор(для создания выделяем строки 124-127 ПКМ ->
   * действие с исходным кодом -> Generate Constructors)
   */
  public Cinema(int id, String name, int genre, int filmProd) {
    this.id = id;
    this.filmProd = filmProd;
    this.name = name;
    this.genre = genre;
  }
}

/**
 * FilmProducer (модель киностудий)
 * id, наименование
 */
class FilmProducer {
  int id;
  String titleName;
}

/**
 * Genre (модель жанров)
 * id, жанр
 */
class Genre {
  int id;
  String name;

  /**
   * сгенерированный конструктор
   */
  public Genre(int id, String name) {
    this.id = id;
    this.name = name;
  }
}

/**
 * FilmProducerFactory (таблица с компаниями)
 */
class FilmProducerFactory {
  int count = 1;

  /**
   * создание компании
   * 
   * @param name название компании
   * @return компания
   */
  public FilmProducer getFilmProducer(String name) {
    FilmProducer fp = new FilmProducer();
    fp.id = count++;
    fp.titleName = name;
    return fp;
  }
}
