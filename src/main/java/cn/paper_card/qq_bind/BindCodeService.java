package cn.paper_card.qq_bind;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;

@SuppressWarnings("unused")
public interface BindCodeService {

    // 生成一个绑定验证码，返回生成的绑定验证码
    // 如果是同一个玩家，后生成的验证码会使前面的验证码失效
    int createCode(@NotNull UUID uuid, @NotNull String name) throws Exception;

    // 根据验证码取出玩家信息，如果验证码过期或不存在，返回null。
    @Nullable BindCodeInfo takeByCode(int code) throws Exception;

    // 查询所有的有验证码的玩家名
    @NotNull List<String> queryPlayerNames() throws Exception;

    // 清除过期的验证码，返回清除的个数，如果没有执行清除操作则返回-1
    int cleanOutdated() throws Exception;

    // 验证码最大存活时间
    long getMaxAliveTime();

    // 验证码个数
    int getCodeCount();
}
