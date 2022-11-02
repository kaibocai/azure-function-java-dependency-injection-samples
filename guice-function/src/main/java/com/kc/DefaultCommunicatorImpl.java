package com.kc;

import com.microsoft.azure.functions.ExecutionContext;

public class DefaultCommunicatorImpl implements Communicator{
    @Override
    public boolean sendMessage(ExecutionContext context) {
        context.getLogger().info("Message sent out from injected communicator :) ");
        return true;
    }
}