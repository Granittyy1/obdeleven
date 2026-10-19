package io.ktor.utils.io;

import Ia.l;
import Ia.p;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.InterfaceC2703m;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.P;
import kotlinx.coroutines.z0;
import p293xa.r;

/* JADX INFO: compiled from: Coroutines.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e implements InterfaceC2694i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f40596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ByteBufferChannel f40597c;

    public e(z0 z0Var, ByteBufferChannel byteBufferChannel) {
        this.f40596b = z0Var;
        this.f40597c = byteBufferChannel;
    }

    @Override // kotlinx.coroutines.InterfaceC2694i0
    public final P B(l<? super Throwable, r> lVar) {
        return this.f40596b.B(lVar);
    }

    @Override // kotlinx.coroutines.InterfaceC2694i0
    public final Object C(ContinuationImpl continuationImpl) {
        return this.f40596b.C(continuationImpl);
    }

    @Override // kotlinx.coroutines.InterfaceC2694i0
    public final boolean I0() {
        return this.f40596b.I0();
    }

    @Override // kotlinx.coroutines.InterfaceC2694i0
    public final CancellationException M() {
        return this.f40596b.M();
    }

    @Override // kotlinx.coroutines.InterfaceC2694i0
    public final InterfaceC2703m S(JobSupport jobSupport) {
        return this.f40596b.S(jobSupport);
    }

    @Override // kotlinx.coroutines.InterfaceC2694i0
    public final boolean c() {
        return this.f40596b.c();
    }

    @Override // kotlinx.coroutines.InterfaceC2694i0
    public final P f0(boolean z10, boolean z11, l<? super Throwable, r> lVar) {
        return this.f40596b.f0(z10, z11, lVar);
    }

    @Override // kotlin.coroutines.e
    public final <R> R fold(R r10, p<? super R, ? super kotlin.coroutines.e.a, ? extends R> operation) {
        kotlin.jvm.internal.i.e(operation, "operation");
        return (R) kotlin.coroutines.e.a.C0479a.a(this.f40596b, r10, operation);
    }

    @Override // kotlin.coroutines.e
    public final <E extends kotlin.coroutines.e.a> E get(kotlin.coroutines.e.b<E> key) {
        kotlin.jvm.internal.i.e(key, "key");
        return (E) kotlin.coroutines.e.a.C0479a.b(this.f40596b, key);
    }

    @Override // kotlin.coroutines.e.a
    public final kotlin.coroutines.e.b<?> getKey() {
        return InterfaceC2694i0.b.f43449b;
    }

    @Override // kotlinx.coroutines.InterfaceC2694i0
    public final InterfaceC2694i0 getParent() {
        return this.f40596b.getParent();
    }

    @Override // kotlinx.coroutines.InterfaceC2694i0
    public final void i(CancellationException cancellationException) {
        this.f40596b.i(cancellationException);
    }

    @Override // kotlinx.coroutines.InterfaceC2694i0
    public final boolean isCancelled() {
        return this.f40596b.isCancelled();
    }

    @Override // kotlin.coroutines.e
    public final kotlin.coroutines.e minusKey(kotlin.coroutines.e.b<?> key) {
        kotlin.jvm.internal.i.e(key, "key");
        return kotlin.coroutines.e.a.C0479a.c(this.f40596b, key);
    }

    @Override // kotlin.coroutines.e
    public final kotlin.coroutines.e plus(kotlin.coroutines.e context) {
        kotlin.jvm.internal.i.e(context, "context");
        return kotlin.coroutines.e.a.C0479a.d(this.f40596b, context);
    }

    @Override // kotlinx.coroutines.InterfaceC2694i0
    public final boolean start() {
        return this.f40596b.start();
    }

    public final String toString() {
        return "ChannelJob[" + this.f40596b + ']';
    }

    @Override // kotlinx.coroutines.InterfaceC2694i0
    public final kotlin.sequences.g<InterfaceC2694i0> x() {
        return this.f40596b.x();
    }
}
