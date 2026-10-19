package com.voltasit.obdeleven.core.app;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class E implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30039a;

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f30039a) {
            case 0:
                String str = (String) task.getResult();
                if (str.startsWith("6E")) {
                    return 0;
                }
                if (!str.startsWith("7F")) {
                    return -3;
                }
                int i10 = Integer.parseInt(str.substring(4), 16);
                if (i10 > 128) {
                    return Integer.valueOf(i10);
                }
                return -1;
            case 1:
                return com.obdeleven.service.core.b.a("00E8070000");
            default:
                return com.obdeleven.service.core.b.a("00E8070000");
        }
    }
}
