package com.obdeleven.service.model;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements Continuation<String, Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ControlUnit.b f29423a;

    public e(ControlUnit.b bVar) {
        this.f29423a = bVar;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Integer then(Task<String> task) throws Exception {
        String result = task.getResult();
        if (result.startsWith("6E" + this.f29423a.f29350a)) {
            return 0;
        }
        if (result.startsWith("7F")) {
            return androidx.compose.foundation.gestures.d.a(result, 4, 16);
        }
        return -1;
    }
}
