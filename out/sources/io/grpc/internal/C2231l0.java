package io.grpc.internal;

import io.grpc.Status;

/* JADX INFO: renamed from: io.grpc.internal.l0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ManagedChannelImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2231l0 extends T4.B {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D9.b.a f37574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Status f37575e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2231l0(ManagedChannelImpl.e eVar, D9.b.a aVar, Status status) {
        super(1, eVar.f37344e);
        this.f37574d = aVar;
        this.f37575e = status;
    }

    @Override // T4.B
    public final void a() {
        this.f37574d.a(this.f37575e, new io.grpc.m());
    }
}
