

public class Episode {
    private String episodeTitle;
    private int episodeNumber;
    private int seasonNumber;
    private int runTime;

    public Episode(String episodeTitle, int episodeNumber, int seasonNumber, int runTime) {
        this.episodeTitle = episodeTitle;
        this.episodeNumber = episodeNumber;
        this.seasonNumber = seasonNumber;
        this.runTime = runTime;
    }

    // Kaller den første konstruktøren og runTime = 0 som standard
    public Episode(String episodeTitle, int episodeNumber, int seasonNumber) {
        this(episodeTitle, episodeNumber, seasonNumber, 0);
    }

    public int getRunTime() {

        return runTime;
    }

    public void setRunTime(int runTime) {

        this.runTime = runTime;
    }

    public int getSeasonNumber() {

        return seasonNumber;
    }

    public void setSeasonNumber(int seasonNumber) {

        this.seasonNumber = seasonNumber;
    }

    public int getEpisodeNumber() {

        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {

        this.episodeNumber = episodeNumber;
    }

    public String getEpisodeTitle() {

        return episodeTitle;
    }

    public void setEpisodeTitle(String episodeTitle) {

        this.episodeTitle = episodeTitle;
    }
}
