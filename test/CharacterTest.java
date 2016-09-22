import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by michaelplott on 9/22/16.
 */
public class CharacterTest {
    @Test
    public void testBattle() {
        Player player = new Player();
        player.name = "Test Player";
        player.location = "Tunnel";
        player.weapon = "sword";
        Enemy enemy = new Enemy("Test enemy", 20, 10);
        player.battle(enemy);
        assertTrue(player.health > 0);
        assertTrue(enemy.health <= 0);
    }
}