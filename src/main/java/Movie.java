import com.google.gson.annotations.SerializedName;

public class Movie {
    @SerializedName("id")
    int id;

    @SerializedName("title")
    String title;

    @SerializedName("genres")
    String genres;

    @SerializedName("duration")
    double duration;

    @SerializedName("company")
    String company;

    @SerializedName("year")
    int yearReleased;

    public Movie(int id, String title, String genres, double duration, String company, int yearReleased) {
        this.id = id;
        this.title = title;
        this.genres = genres;
        this.duration = duration;
        this.company = company;
        this.yearReleased = yearReleased;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genres='" + genres + '\'' +
                ", duration=" + duration +
                ", company='" + company + '\'' +
                ", yearReleased=" + yearReleased +
                '}';
    }
}
