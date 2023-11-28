package cn.paper_card.qq_bind;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

@SuppressWarnings("unused")
public interface QqBindApi {

    // 接收验证码的QQ主群消息，由其他模块调用
    @Nullable List<String> onMainGroupMessage(long qq, @NotNull String message);

    @NotNull BindService getBindService();

    @NotNull BindCodeService getBindCodeService();

    // 设置QQ主群号码
    void setGroupId(long id);

    // 获取QQ主群号码
    long getGroupId();
}