import com.exemple.database.Mysql;
import com.exemple.entity.Game;
import com.exemple.repository.GameRepository;

import java.util.ArrayList;

public class Main {
    static void main() {
        try {
            GameRepository gameRepository = new GameRepository();
            ArrayList<Game> games = new ArrayList<>();
            games =  gameRepository.findAll();

            System.out.println(games);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
