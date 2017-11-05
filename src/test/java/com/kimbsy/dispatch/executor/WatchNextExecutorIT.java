package com.kimbsy.dispatch.executor;

import com.kimbsy.dispatch.lib.request.Request;
import com.kimbsy.dispatch.lib.request.RequestType;
import org.junit.Test;

import java.util.Collections;

/**
 * @author kimbsy
 */
public class WatchNextExecutorIT {

    @Test
    public void testWatchNextStarTrek() {
        WatchNextExecutor watchNextExecutor = new WatchNextExecutor();
        watchNextExecutor.setRequest(new Request(RequestType.WATCH_NEXT, Collections.singletonList("STAR_TREK")));
        watchNextExecutor.execute();
    }

    @Test
    public void testWatchNextArcher() {
        WatchNextExecutor watchNextExecutor = new WatchNextExecutor();
        watchNextExecutor.setRequest(new Request(RequestType.WATCH_NEXT, Collections.singletonList("ARCHER")));
        watchNextExecutor.execute();
    }
}
