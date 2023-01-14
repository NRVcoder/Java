import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    class ClubManagerTest {
        @Test
        public void TestContrStrike() {

            assertEquals("ContrStrike started!", "ContrStrikestarted!");
        }
        @Test
        public void TestChess() {

            assertEquals("Chess started!", "Chess started!");
        }
        @Test
        public void TestDota()
        {
            assertEquals("Dota started!", "Dota started!");
        }
        @Test
        public void TestLOL() {

            assertEquals("LOL started!", "LOL started!");
        }
        @Test
        public void TestPUBG() {
            assertEquals("PUBG started!", "PUBGstarted!");
        }
    }
}
