package com.kimbsy.dispatch.executor;

/**
 * This is a basic {@link Executor} which prints String arguments.
 *
 * @author kimbsy
 */
public class SystemOutPrintExecutor extends AbstractExecutor<Boolean> {

    /**
     * @inheritDoc
     */
    @Override
    public Boolean execute() {
        for (String argument : request.getArguments()) {
            System.out.println(argument);
        }
        return true;
    }
}
