package cn.paper_card.qq_bind.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

@SuppressWarnings("unused")
public interface BindService {
    void addBind(@NotNull BindInfo info) throws Exception;

    boolean removeBind(@NotNull UUID uuid, long qq) throws Exception;

    @Nullable BindInfo queryByUuid(@NotNull UUID uuid) throws Exception;

    @Nullable BindInfo queryByQq(long qq) throws Exception;

    void updateName(@NotNull UUID uuid, long qq, @NotNull String newName) throws Exception;

}