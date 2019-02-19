package Assignment7;

public class News implements INews{
    private int ID;
    private String Title;
    private String PublishDate;
    private String Author;
    private String Content;
    private float AverageRate;
    private int[] RateList = new int[3];

    public News(String title, String publishDate, String author, String content) {

        this.Title = title;
        this.PublishDate = publishDate;
        this.Author = author;
        this.Content = content;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    public int[] getRateList() {
        return RateList;
    }

    public void setRateList(int i, int Rate) {
        this.RateList[i] = Rate;
    }

    @Override
    public void Display() {
        System.out.println("Title: " + this.getTitle());
        System.out.println("PublishDate: " + this.getPublishDate());
        System.out.println("Author: " + this.getAuthor());
        System.out.println("Content: " + this.getContent());
        System.out.println("AverageRate: " + this.getAverageRate());
    }

    public void Calculate(){
        this.AverageRate = (RateList[0]+RateList[1]+RateList[2])/3;
    }

}
