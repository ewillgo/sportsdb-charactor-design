package cc.sportsdb.cd.ui.bar;

import java.awt.*;

public interface Bar {

    /**
     * Set bar's name
     *
     * @param name The name of the bar
     */
    void setName(String name);

    /**
     * Set bar's value
     *
     * @param value The value of the bar
     */
    void setValue(long value);

    /**
     * Set bar's color
     *
     * @param color The color of the bar
     */
    void setColor(Color color);

    /**
     * Set bar's value as percentage
     *
     * @param percentage True or False
     */
    void percentage(boolean percentage);
}
