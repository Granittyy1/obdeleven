package com.obdeleven.service.core;

import com.obdeleven.service.core.gen1.SetProtocolCommand;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2673a0;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: BluetoothCommandExecutor.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements p109i8.d {
    public final Task<List<Short>> a() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C2680e.c(C2673a0.f43223b, null, null, new BroadcastExecutor$execute$1(taskCompletionSource, null), 3);
        Task<List<Short>> task = taskCompletionSource.getTask();
        i.d(task, "getTask(...)");
        return task;
    }

    public final Task<String> b(String str) {
        return b.a(str).continueWithTask(new a(0));
    }

    public final Task<Void> c(SetProtocolCommand.Protocol protocol) {
        return new SetProtocolCommand(protocol).a().continueWithTask(new a(0));
    }
}
