package cn.paper_card.qq_bind;

import java.util.UUID;

public record BindInfo(
        UUID uuid, // 玩家UUID

        String name, // 玩家名
        long qq, // 玩家QQ

        String remark, // 备注

        long time // 创建时间
) {
}
