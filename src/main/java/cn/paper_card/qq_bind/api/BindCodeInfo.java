package cn.paper_card.qq_bind.api;

import java.util.UUID;

public record BindCodeInfo(
        int code, // 验证码
        String name, // 玩家名
        UUID uuid, // 玩家UUID
        long time // 验证码创建时间
) {
}
