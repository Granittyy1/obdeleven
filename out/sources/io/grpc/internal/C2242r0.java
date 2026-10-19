package io.grpc.internal;

import io.grpc.Status;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: io.grpc.internal.r0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: NoopClientStream.java */
/* JADX INFO: loaded from: classes3.dex */
public class C2242r0 implements InterfaceC2236o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2242r0 f37685a = new C2242r0();

    @Override // io.grpc.internal.P0
    public final boolean b() {
        return false;
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public void e(androidx.compose.runtime.snapshots.j jVar) {
        ((ArrayList) jVar.f13215b).add("noop");
    }

    @Override // io.grpc.internal.P0
    public final void flush() {
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public final void i() {
    }

    @Override // io.grpc.internal.P0
    public final void l() {
    }

    @Override // io.grpc.internal.P0
    public final void request() {
    }

    @Override // io.grpc.internal.P0
    public final void a(D9.f fVar) {
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public final void c(int i10) {
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public final void d(int i10) {
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public final void f(Status status) {
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public final void g(D9.j jVar) {
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public final void h(D9.l lVar) {
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public void j(ClientStreamListener clientStreamListener) {
    }

    @Override // io.grpc.internal.P0
    public final void k(InputStream inputStream) {
    }
}
