package com.kimbsy.dispatch.executor;

/**
 * @author kimbsy
 */
public class SystemOutPrintExecutor extends AbstractExecutor<Boolean> {

    @Override
    public Boolean execute() {
        for (String argument : request.getArguments()) {
            System.out.println(argument);
        }
        return true;
    }
}
