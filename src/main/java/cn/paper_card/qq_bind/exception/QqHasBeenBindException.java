package cn.paper_card.qq_bind.exception;

import cn.paper_card.qq_bind.BindInfo;
import org.jetbrains.annotations.NotNull;

// QQ号已经被绑定了
@SuppressWarnings("unused")
public class QqHasBeenBindException extends Exception {
    private final @NotNull BindInfo bindInfo;

    public QqHasBeenBindException(@NotNull BindInfo bindInfo, @NotNull String message) {
        super(message);
        this.bindInfo = bindInfo;
    }

    public @NotNull BindInfo getBindInfo() {
        return this.bindInfo;
    }
}
