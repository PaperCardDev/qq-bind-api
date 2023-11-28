package cn.paper_card.qq_bind.api;

import org.jetbrains.annotations.NotNull;

import java.util.UUID;

@SuppressWarnings("unused")
public interface QqFinder {

    // 实现要求：仅仅是获取玩家可能的QQ号码
    long findPossibleQq(@NotNull UUID uuid, @NotNull String name) throws Exception;
}
