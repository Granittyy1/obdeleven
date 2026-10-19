package com.voltasit.obdeleven.core.app;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: renamed from: com.voltasit.obdeleven.core.app.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2105u implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30164a;

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f30164a) {
            case 0:
                Integer num = (Integer) task.getResult();
                int iIntValue = num.intValue();
                if (iIntValue == -1) {
                    return -3;
                }
                if (iIntValue == 0) {
                    return 0;
                }
                if (iIntValue != 128) {
                    return -1;
                }
                return num;
            default:
                return Integer.valueOf(((Byte) task.getResult()).byteValue());
        }
    }
}
