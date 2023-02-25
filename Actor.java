package MovieLovers20;

import java.beans.JavaBean;

@JavaBean
public class Actor {

    private String searchName;
    private String title;//actor name
    private String description;//actor description+moviename+movieyear
    private String image;
    public Actor() {
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSearchName() {
        return searchName;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override //override toString method for print testing
    public String toString() {
        return "Actors{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
