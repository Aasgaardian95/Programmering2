import java.time.LocalDate;
import java.util.ArrayList;

public class TVSeries {
    private String seriesTitle;
    private String seriesDescription;
    private LocalDate seriesRelease;
    private ArrayList<Episode> seriesEpisodes = new ArrayList<>();

    public TVSeries(String seriesTitle, String seriesDescription, LocalDate seriesRelease) {
        this.seriesTitle = seriesTitle;
        this.seriesDescription = seriesDescription;
        this.seriesRelease = seriesRelease;
    }



    public String getSeriesTitle() {

        return seriesTitle;
    }

    public void setSeriesTitle(String seriesTitle) {

        this.seriesTitle = seriesTitle;
    }

    public String getSeriesDescription() {

        return seriesDescription;
    }

    public void setSeriesDescription(String seriesDescription) {

        this.seriesDescription = seriesDescription;
    }

    public LocalDate getSeriesRelease() {

        return seriesRelease;
    }

    public void setSeriesRelease(LocalDate seriesRelease) {

        this.seriesRelease = seriesRelease;
    }

    public ArrayList<Episode> getSeriesEpisodes() {

        return seriesEpisodes;
    }

    public void setSeriesEpisodes(ArrayList<Episode> seriesEpisodes) {

        this.seriesEpisodes = seriesEpisodes;
    }

    public void addEpisode (Episode episode) {

        seriesEpisodes.add(episode);
    }
}
