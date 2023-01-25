package baseball;

import java.util.ArrayList;
import java.util.List;

public class Games {
    private final List<Game> games;
    public Games(List <Integer> answers){
        this.games = new ArrayList<>();
        for(int i = 0; i< answers.size();i++){
            games.add(new Game(i+1,answers.get(i)));
        }
    }

    public BallStatus play(Game userGame){
        return games.stream()
                .map(answer -> answer.play(userGame))
                .filter(status -> status != BallStatus.NOTHING)
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }
}
