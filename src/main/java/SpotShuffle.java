import java.util.ArrayList;
import java.util.HashSet;

public class SpotShuffle {
    ArrayList<Track> playlist;

    public SpotShuffle(ArrayList<Track> playlist) {
        this.playlist = playlist;
    }

    public void shuffleAndPlayTracks(int numRepeats) {

        for (int i = 0; i < numRepeats; i++){

            HashSet<Track> songsPlayed = new HashSet<>();
            int playlistSize = this.playlist.size();

            for (int j = 0; j < playlistSize; j++) {

                long shuffleIdx = Math.round(Math.random());

            }
        }
    }


    private class Track {
        String name;
        String artist;

        public Track(String name, String artist) {
            this.name = name;
            this.artist = artist;
        }

        private void playTrack(){
            try {
                System.out.println("Playing track: " + this.name + " by " + this.artist);
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
