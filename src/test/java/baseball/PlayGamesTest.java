package baseball;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PlayGamesTest {
    private static Stream<Object[]> inputSet(){
        return Stream.of(
                new Object[]{Arrays.asList(1,2,3),1,1,BallStatus.STRIKE},
                new Object[]{Arrays.asList(1,2,3),1,2,BallStatus.BALL},
                new Object[]{Arrays.asList(1,2,3),1,4,BallStatus.NOTHING}
        );
    }
    @ParameterizedTest
    @MethodSource("inputSet")
    void play(List<Integer> ball, int index, int ballNum, BallStatus expect){
        Games answers = new Games(ball);
        BallStatus status = answers.play(new Game(index, ballNum));
        assertThat(status).isEqualTo(expect);
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
