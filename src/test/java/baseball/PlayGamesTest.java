package baseball;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PlayGamesTest {
    @Test
    void play(){

    }
    @Test
    void strike(){
        Games answers = new Games(Arrays.asList(1,2,3));
        BallStatus status = answers.play(new Game(1,1));
        assertThat(status).isEqualTo(BallStatus.STRIKE);
    }
    @Test
    void ball(){
        Games answers = new Games(Arrays.asList(1,2,3));
        BallStatus status = answers.play(new Game(1,2));
        assertThat(status).isEqualTo(BallStatus.BALL);
    }
    @Test
    void nothing(){
        Games answers = new Games(Arrays.asList(1,2,3));
        BallStatus status = answers.play(new Game(1,4));
        assertThat(status).isEqualTo(BallStatus.NOTHING);
    }
}
