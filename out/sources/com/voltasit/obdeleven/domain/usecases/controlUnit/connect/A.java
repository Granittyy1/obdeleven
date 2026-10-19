package com.voltasit.obdeleven.domain.usecases.controlUnit.connect;

import androidx.compose.foundation.C0936h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;

/* JADX INFO: compiled from: DisconnectFromCuUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.x f30672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J8.p f30673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p084g8.c f30674c;

    public A(J8.x xVar, J8.p pVar, p084g8.c cVar) {
        this.f30672a = xVar;
        this.f30673b = pVar;
        this.f30674c = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(short s10, ContinuationImpl continuationImpl) {
        DisconnectFromCuUC$invoke$1 disconnectFromCuUC$invoke$1;
        A a10;
        if (continuationImpl instanceof DisconnectFromCuUC$invoke$1) {
            disconnectFromCuUC$invoke$1 = (DisconnectFromCuUC$invoke$1) continuationImpl;
            int i10 = disconnectFromCuUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                disconnectFromCuUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                disconnectFromCuUC$invoke$1 = new DisconnectFromCuUC$invoke$1(this, continuationImpl);
            }
        } else {
            disconnectFromCuUC$invoke$1 = new DisconnectFromCuUC$invoke$1(this, continuationImpl);
        }
        Object obj = disconnectFromCuUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = disconnectFromCuUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            short s11 = s10;
            this.f30673b.f("DisconnectFromCuUC", C0936h.d("DisconnectFromCuUC(id=", p293xa.p.a(s11), "(0x", D9.o.u(s11), "))"));
            Sa.a aVar = N.f43200c;
            DisconnectFromCuUC$invoke$2 disconnectFromCuUC$invoke$2 = new DisconnectFromCuUC$invoke$2(this, s11, null);
            disconnectFromCuUC$invoke$1.L$0 = this;
            disconnectFromCuUC$invoke$1.label = 1;
            if (C2680e.f(aVar, disconnectFromCuUC$invoke$2, disconnectFromCuUC$invoke$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            a10 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a10 = (A) disconnectFromCuUC$invoke$1.L$0;
            kotlin.b.b(obj);
        }
        a10.f30672a.g(null);
        return new C8.a.b(p293xa.r.f47939a);
    }
}
