package com.vaadin.addon.charts.events;

/*-
 * #%L
 * Vaadin Charts Addon
 * %%
 * Copyright (C) 2012 - 2019 Vaadin Ltd
 * %%
 * This program is available under Commercial Vaadin Add-On License 3.0
 * (CVALv3).
 * 
 * See the file licensing.txt distributed with this software for more
 * information about licensing.
 * 
 * You should have received a copy of the CVALv3 along with this program.
 * If not, see <https://vaadin.com/license/cval-3>.
 * #L%
 */

import com.vaadin.addon.charts.model.Series;

/**
 * Listener class for Series enabling and disabling events.
 * 
 * @since 2.0
 */
public class SeriesStateEvent extends AbstractSeriesEvent {

    private static final long serialVersionUID = 20141117;

    /** Series was enabled */
    private final boolean enabled;

    /**
     * Constructs the event with given series and its state information.
     * 
     * @param series
     *            Series.
     * @param enabled
     *            Whether or not series is enabled.
     */
    public SeriesStateEvent(Series series, boolean enabled) {
        super(series);
        this.enabled = enabled;
    }

    /**
     * Returns whether or not series is enabled.
     * 
     * @return <b>true</b> when given series is enabled, <b>false</b> otherwise.
     */
    public boolean isEnabled() {
        return enabled;
    }

}
