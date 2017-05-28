package com.kimbsy.dispatch.executor;

import java.io.*;

/**
 * This class is responsible for invoking the <code>watchnext</code> tool on <code>apotheosis</code>.
 * @author kimbsy
 */
public class WatchNextExecutor extends AbstractExecutor<Boolean> {

    /**
     * @inheritDoc
     */
    @Override
    public Boolean execute() {
        log.info("Executing WATCH_NEXT");
        try {
            // @TODO: should specify what to watch?
            // @TODO: can we use a command in /usr/bin/lib?
            Runtime.getRuntime().exec("ssh apotheosis './Tools/test/watchnext'");
            System.exit(0);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
