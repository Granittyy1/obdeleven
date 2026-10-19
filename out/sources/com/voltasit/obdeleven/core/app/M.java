package com.voltasit.obdeleven.core.app;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.ui.dialogs.DialogC2146g0;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class M implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30055a;

    public /* synthetic */ M(int i10) {
        this.f30055a = i10;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f30055a) {
            case 0:
                return Integer.valueOf(((Boolean) task.getResult()).booleanValue() ? 0 : -3);
            case 1:
                return new com.obdeleven.service.core.gen1.a().a();
            case 2:
                kotlin.jvm.internal.i.e(task, "task");
                DialogC2146g0 dialogC2146g0 = (DialogC2146g0) task.getResult();
                if (dialogC2146g0 == null) {
                    return null;
                }
                return dialogC2146g0.b();
            default:
                String str = (String) task.getResult();
                if (str.startsWith("50")) {
                    return Boolean.TRUE;
                }
                return str.startsWith("7F") ? Boolean.FALSE : Boolean.FALSE;
        }
    }
}
