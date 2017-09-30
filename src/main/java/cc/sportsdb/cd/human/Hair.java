package cc.sportsdb.cd.human;

import cc.sportsdb.cd.support.Renderable;
import cc.sportsdb.cd.support.Texture;

import java.awt.*;

public interface Hair extends Texture, Renderable {

    /**
     * Set hair's color
     *
     * @param color The color of the hair
     */
    void setColor(Color color);

    /**
     * Set hair's size
     * @param size The size of the hair
     */
    void setSize(int size);
}
