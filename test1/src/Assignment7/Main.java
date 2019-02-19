package Assignment7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        ArrayList<News> arrNews = new ArrayList<News>();
        while (true) {
            System.out.println("MENU: ");
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3. Average rate");
            System.out.println("4. Exit");
            System.out.println("Your choice: ");
            s = scanner.nextLine().trim();
            switch (s) {
                case ("1")://==============Insert News========
                    News news = Main.insertNews();
                    arrNews.add(news);
                    break;
                case ("2")://=========View list news==========
                    for (News n1 : arrNews) {
                        System.out.println("============================");
                        n1.Display();
                    }
                    break;
                case ("3")://============Average Rate=====
                    for (News n1 : arrNews) {
                        n1.Calculate();
                        System.out.println("============================");
                        n1.Display();
                    }
                    break;
                case ("4")://======Exit=======
                    return;
            }
        }

    }

    public static News insertNews() {
        Scanner scanner = new Scanner(System.in);
        String title, publishDate, author, content;
        System.out.println("Please input News: ");
        System.out.println("Title: ");
        title = scanner.nextLine().trim();
        System.out.println("PublishDate: ");
        publishDate = scanner.nextLine().trim();
        System.out.println("Author: ");
        author = scanner.nextLine().trim();
        System.out.println("Content: ");
        content = scanner.nextLine().trim();
        News news = new News(title, publishDate, author, content);
        System.out.println("Please input 3 Rates: ");
        for (int i = 0; i < news.getRateList().length; i++) {
            System.out.println("Rate " + (i + 1) + ": ");
            news.setRateList(i, scanner.nextInt());
        }
        return news;
    }
}
