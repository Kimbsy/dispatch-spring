package com.kimbsy.dispatch.executor;

import com.google.common.base.Preconditions;

import java.io.IOException;

/**
 * This class is responsible for invoking the <code>watchnext</code> tool on <code>apotheosis</code>.
 *
 * @author kimbsy
 */
public class WatchNextExecutor extends AbstractExecutor<Boolean> {

    /**
     * The available series with the name of their containing directory.
     */
    public enum Show {
        STAR_TREK("star-trek"),
        ARCHER("archer"),
        RICK_AND_MORTY("rick-and-morty"),
        SILICON_VALLEY("silicon-valley"),;

        private String dirName;

        Show(String dirName) {
            this.dirName = dirName;
        }

        public String getDirName() {
            return dirName;
        }
    }

    /**
     * @inheritDoc
     */
    @Override
    public Boolean execute() {
        Preconditions.checkNotNull(request, "request cannot be null");

        Show show = Show.valueOf(request.getArguments().get(0));
        Preconditions.checkNotNull(show, "request show cannot be null");

        try {
            log.info("Executing WATCH_NEXT");
            ProcessBuilder pb = new ProcessBuilder("ssh",
                    "apotheosis",
                    "watchnext " + show.getDirName(),
                    "&");
            Process p = pb.start();

//            BufferedReader stdOut = new BufferedReader(new
//                    InputStreamReader(p.getInputStream()));
//
//            BufferedReader stdError = new BufferedReader(new
//                    InputStreamReader(p.getErrorStream()));
//
//            // read the output from the command
//            String s;
//            System.out.println("Here is the standard output of the command:\n");
//            while ((s = stdOut.readLine()) != null) {
//                System.out.println(s);
//            }
//
//            // read any errors from the attempted command
//            System.out.println("Here is the standard error of the command (if any):\n");
//            while ((s = stdError.readLine()) != null) {
//                System.out.println(s);
//            }

            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
