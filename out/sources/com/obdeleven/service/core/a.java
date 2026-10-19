package com.obdeleven.service.core;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29239a;

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f29239a) {
            case 0:
                return task;
            default:
                if (((Integer) task.getResult()).intValue() == 0) {
                    return 0;
                }
                if (((Integer) task.getResult()).intValue() == -1) {
                    return -3;
                }
                if (((Integer) task.getResult()).intValue() > 128) {
                    return (Integer) task.getResult();
                }
                return -1;
        }
    }
}
