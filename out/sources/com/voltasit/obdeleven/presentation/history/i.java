package com.voltasit.obdeleven.presentation.history;

import com.parse.SaveCallback;
import com.voltasit.obdeleven.R;
import p220r9.P;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements SaveCallback, j1.j.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32461c;

    public /* synthetic */ i(Object obj, Object obj2) {
        this.f32460b = obj;
        this.f32461c = obj2;
    }

    @Override // com.parse.ParseCallback1
    public void done(Throwable th) {
        HistoryAdapter historyAdapter = (HistoryAdapter) this.f32460b;
        if (historyAdapter.j) {
            HistoryAdapter.c cVar = (HistoryAdapter.c) this.f32461c;
            cVar.f32413e.setVisibility(8);
            cVar.f32414f.setVisibility(0);
        }
        P.b(historyAdapter.f32395i, R.string.common_archived);
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        ((p162n1.b) obj).f((n1.b.a) this.f32460b, (p235t1.k) this.f32461c);
    }
}
