package cn.paper_card.qq_bind;

import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public interface QqBot {
    // 在主群发送提及某人的消息
    void sendAtMessage(long qq, @NotNull String message);
}
