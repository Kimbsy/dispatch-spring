package com.kimbsy.dispatch.executor;

import java.io.*;

/**
 * @author kimbsy
 */
public class WatchNextExecutor extends AbstractExecutor<Boolean> {

    public static void main(String[] args) {
        WatchNextExecutor executor = new WatchNextExecutor();
        executor.execute();
    }

    @Override
    public Boolean execute() {
        log.info("Executing WATCH_NEXT");
        try {
            Runtime.getRuntime().exec("ssh apotheosis './Tools/test/watchnext'");
            System.exit(0);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
