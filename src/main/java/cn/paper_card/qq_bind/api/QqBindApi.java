package cn.paper_card.qq_bind.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

@SuppressWarnings("unused")
public interface QqBindApi {

    @Deprecated
    void addBind(@NotNull UUID uuid, long qq, @NotNull String remark) throws Exception;


    @NotNull BindInfo addBind2(@NotNull UUID uuid, long qq, @NotNull String remark) throws Exception;

    @Deprecated
    boolean removeBind(@NotNull UUID uuid, long qq) throws Exception;

    @Nullable BindInfo removeBind(@NotNull UUID uuid) throws Exception;

    @Nullable BindInfo queryByUuid(@NotNull UUID uuid) throws Exception;

    @Nullable BindInfo queryByQq(long qq) throws Exception;

}