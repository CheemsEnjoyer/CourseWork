package domain.entity;
public class Company {
    private int id;
    private String name;
    private String link;
    private boolean isPaid;
    private boolean hasIntership;
    private boolean hasDistant;
    private float rating;
    
    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", link=" + link +
                ", isPaid=" + isPaid +
                ", hasIntership=" + hasIntership +
                ", hasDistant=" + hasDistant +
                ", rating=" + rating +
                '}';
    
    }
    
    public Company(int id, String name, String link, boolean isPaid,  boolean hasIntership, boolean hasDistant, float rating) {
        this.id=id;
        this.name = name;
        this.link = link;
        this.isPaid = isPaid;
        this.hasIntership = hasIntership;
        this.hasDistant = hasDistant;
        this.rating = rating;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getLink() {
        return link;
    }
    
    public boolean getIsPaid() {
        return isPaid;
    }
    
    public boolean getHasIntership() {
        return hasIntership;
    }
    
    public boolean getHasDistant() {
        return hasDistant;
    }
    
    public float getRating() {
        return rating;
    }
      
}
