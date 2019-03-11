package com.alibaba.cola.command;

import com.alibaba.cola.dto.Command;
import com.alibaba.cola.dto.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Just send Command to CommandBus, 
 * //命令总线
 * @author fulan.zjf 2017年10月24日 上午12:47:18
 */
@Component
public class CommandBus implements CommandBusI{

    @Autowired
    private CommandHub commandHub;

    @Override
    public Response send(Command cmd) {
        return commandHub.getCommandInvocation(cmd.getClass()).invoke(cmd);
    }

    @Override
    public Response send(Command cmd,  Class<? extends CommandExecutorI> executorClz){
        CommandInvocation commandInvocation = commandHub.getCommandInvocation(cmd.getClass());
        if(!isEquals(executorClz, commandInvocation)){
            throw new IllegalArgumentException(executorClz + " is not the same with "+commandInvocation.getCommandExecutor().getClass());
        }
        return send(cmd);
    }

    private boolean isEquals(Class<? extends CommandExecutorI> executorClz, CommandInvocation commandInvocation) {
        return executorClz.equals(commandInvocation.getCommandExecutor().getClass());
    }

}
