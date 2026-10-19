package com.voltasit.obdeleven.data.providers;

/* JADX INFO: compiled from: DimensionProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements J8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public J8.h.a f30261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public J8.h.a f30262b;

    @Override // J8.h
    public final void a(J8.h.a aVar) {
        this.f30262b = aVar;
    }

    @Override // J8.h
    public final J8.h.a b() {
        J8.h.a aVar = this.f30262b;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.i.m("menuBackground");
        throw null;
    }

    @Override // J8.h
    public final void c(J8.h.a aVar) {
        this.f30261a = aVar;
    }

    @Override // J8.h
    public final J8.h.a d() {
        J8.h.a aVar = this.f30261a;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.i.m("appBackground");
        throw null;
    }
}
