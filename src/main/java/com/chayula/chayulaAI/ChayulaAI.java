package com.chayula.chayulaAI;

import com.chayula.chayulaAI.commands.AIChatCommand;
import com.chayula.chayulaAI.commands.AdminCommand;
import com.chayula.chayulaAI.services.OpenRouterService;
import com.chayula.chayulaAI.utils.MessageUtil;
import com.chayula.chayulaAI.utils.ChatHistoryUtil;
import org.bukkit.plugin.java.JavaPlugin;

public final class ChayulaAI extends JavaPlugin {
    private OpenRouterService openRouterService;
    private MessageUtil messageUtil;
    private ChatHistoryUtil chatHistoryUtil;

    @Override
    public void onEnable() {
        // Config dosyalarını kaydet
        saveDefaultConfig();
        
        // Message util'i başlat
        messageUtil = new MessageUtil(this);
        
        // OpenRouter servisini başlat
        openRouterService = new OpenRouterService(this);
        
        chatHistoryUtil = new ChatHistoryUtil(this);
        
        // Komutları kaydet
        getCommand("ai").setExecutor(new AIChatCommand(this));
        getCommand("cai").setExecutor(new AdminCommand(this));
        
        getLogger().info("ChayulaAI has been successfully activated!");
    }

    @Override
    public void onDisable() {
        getLogger().info("ChayulaAI is closed!");
    }

    public OpenRouterService getOpenRouterService() {
        return openRouterService;
    }

    public MessageUtil getMessageUtil() {
        return messageUtil;
    }

    public ChatHistoryUtil getChatHistoryUtil() {
        return chatHistoryUtil;
    }

    public void reloadPlugin() {
        reloadConfig();
        messageUtil.loadMessages();
    }
}
