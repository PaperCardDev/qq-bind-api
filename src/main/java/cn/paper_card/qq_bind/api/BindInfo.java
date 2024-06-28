package cn.paper_card.qq_bind.api;

public record BindInfo(
        String uuid, // 玩家UUID
        long qq, // 玩家QQ

        String remark, // 备注

        long time // 创建时间
) {
}