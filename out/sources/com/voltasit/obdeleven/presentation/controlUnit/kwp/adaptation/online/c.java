package com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.online;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: OnlineControlUnitAdaptationFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class c<TTaskResult, TContinuationResult> implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OnlineControlUnitAdaptationFragment f31712a;

    public c(OnlineControlUnitAdaptationFragment onlineControlUnitAdaptationFragment) {
        this.f31712a = onlineControlUnitAdaptationFragment;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        OnlineControlUnitAdaptationFragment onlineControlUnitAdaptationFragment = this.f31712a;
        if (!onlineControlUnitAdaptationFragment.f31671E) {
            return null;
        }
        onlineControlUnitAdaptationFragment.c0();
        return null;
    }
}
