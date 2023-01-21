package additional.playlists;

import java.io.Serializable;


public class PlayListMusic implements Serializable{
    private static Song[] songs;
    private static int count;
    private String playlistName;

    public PlayListMusic() {
        songs = new Song[30];
        count = 0;
    }
    public String getPlaylistName() {
        return playlistName;
    }
    public void setPlayListName() {
        this.playlistName = playlistName;
    }

    public void add(Song a) {
        if(count == songs.length) {
            System.out.println("ОШИБКА: Коллекция заполнена. Песни не были добавлены в список воспроизведения.");
        }
        songs[count] = a;
        count++;
    }


    public static void print() {
        String result = "Номер песни = " + count
                + " / Ограничение на количество песен в списке воспроизведения = " + songs.length + "\n";

        for (int i=0; i<count; i++) {
            result += ("songList[" + i + "] = <"
                    + songs[i] + ">\n");
        }
        System.out.println(result.toString() + "\n");
    }
    public int size() {
        return count;
    }
    public int totalTime() {
        int totalTime = 0;
        for (int i=0; i<count; i++) {
            totalTime = songs[i].getLenght();
        }
        return totalTime;
    }




}
