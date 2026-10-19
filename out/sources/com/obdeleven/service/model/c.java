package com.obdeleven.service.model;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements Continuation<String, Integer> {
    @Override // com.parse.boltsinternal.Continuation
    public final Integer then(Task<String> task) throws Exception {
        String result = task.getResult();
        if (result.startsWith("7B")) {
            return 0;
        }
        if (result.startsWith("7F")) {
            return androidx.compose.foundation.gestures.d.a(result, 4, 16);
        }
        return -1;
    }
}
