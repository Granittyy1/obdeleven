package io.ktor.client.content;

import Ia.q;
import X9.b;
import io.ktor.http.C2476a;
import io.ktor.http.g;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.c;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2673a0;
import kotlinx.coroutines.InterfaceC2694i0;
import p293xa.r;

/* JADX INFO: compiled from: ObservableContent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f40276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2694i0 f40277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q<Long, Long, c<? super r>, Object> f40278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ByteReadChannel f40279d;

    public a(b delegate, InterfaceC2694i0 callContext, q qVar) {
        io.ktor.utils.io.a aVarD;
        i.e(delegate, "delegate");
        i.e(callContext, "callContext");
        this.f40276a = delegate;
        this.f40277b = callContext;
        this.f40278c = qVar;
        if (delegate instanceof b.a) {
            aVarD = h.a(((b.a) delegate).d());
        } else if (delegate instanceof b.AbstractC0103b) {
            ByteReadChannel.f40586a.getClass();
            aVarD = ByteReadChannel.Companion.f40588b.getValue();
        } else if (delegate instanceof b.c) {
            aVarD = ((b.c) delegate).d();
        } else {
            if (!(delegate instanceof b.d)) {
                throw new NoWhenBranchMatchedException();
            }
            aVarD = io.ktor.utils.io.i.a(C2673a0.f43223b, callContext, true, new ObservableContent$content$1(this, null)).f40597c;
        }
        this.f40279d = aVarD;
    }

    @Override // X9.b
    public final Long a() {
        return this.f40276a.a();
    }

    @Override // X9.b
    public final C2476a b() {
        return this.f40276a.b();
    }

    @Override // X9.b
    public final g c() {
        return this.f40276a.c();
    }

    @Override // X9.b.c
    public final ByteReadChannel d() {
        return io.ktor.client.utils.a.a(this.f40279d, this.f40277b, this.f40276a.a(), this.f40278c);
    }
}
