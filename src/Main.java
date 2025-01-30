import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Oppretter objekter ved bruk av klassen Episode:
        TVSeries ModernFamily = new TVSeries("Modern Family",
                "Comedy", LocalDate.of(2010, 2, 7));

        Episode episode1 = new Episode("Pilot",
                1,
                1,
                45);

        Episode episode2 = new Episode ("The stepson!",
                2,
                1,
                45);

        Episode episode3 = new Episode ("Birthday party",
                3,
                1,
                45);

        ModernFamily.addEpisode(episode1);
        ModernFamily.addEpisode(episode2);
        ModernFamily.addEpisode(episode3);


        for (Episode episode : ModernFamily.getSeriesEpisodes()) {
            System.out.println("---List of episodes---");
            System.out.println("Episode title: " + episode.getEpisodeTitle() +
                    "\nEpisode number: " + episode.getEpisodeNumber() +
                    "\nSeason number: " + episode.getSeasonNumber() +
                    "\nRuntime: " + episode.getRunTime() + "\n---End of list---\n");
        }

        System.out.println("Serien sitt navn: " + ModernFamily.getSeriesRelease());
        System.out.println("Episodens navn: " + episode1.getEpisodeTitle());
        
    }
}
