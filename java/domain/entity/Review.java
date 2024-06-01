package domain.entity;
public class Review {
    private int id;
    private String text;
    private int rating;
    private int user_id;
    private int company_id;
    
    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + text + '\'' +
                ", link=" + rating +
                ", isPaid=" + user_id +
                ", hasIntership=" + company_id;
    
    }
    
    public Review(int id, String text, int rating, int user_id,  int company_id) {
        this.id=id;
        this.text = text;
        this.rating = rating;
        this.user_id = user_id;
        this.company_id = company_id;
    }
    
    public int getId() {
        return id;
    }
    
    public String getText() {
        return text;
    }
    
    public int getRating() {
        return rating;
    }
    
    public int getUser_id() {
        return user_id;
    }
    
    public int getCompany_id() {
        return company_id;
    }
   
}
