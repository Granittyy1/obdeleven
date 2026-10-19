package com.google.firebase;

import androidx.annotation.Keep;
import androidx.compose.material.T;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.collections.l;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.AbstractC2712w;
import p228s6.j;
import p228s6.p;
import p228s6.q;

/* JADX INFO: compiled from: Firebase.kt */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* JADX INFO: compiled from: Firebase.kt */
    public static final class a<T> implements p228s6.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a<T> f28044b = new a<>();

        @Override // p228s6.d
        public final Object f(q qVar) {
            Object objC = qVar.c(new p<>(p217r6.a.class, Executor.class));
            i.d(objC, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return T.g((Executor) objC);
        }
    }

    /* JADX INFO: compiled from: Firebase.kt */
    public static final class b<T> implements p228s6.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b<T> f28045b = new b<>();

        @Override // p228s6.d
        public final Object f(q qVar) {
            Object objC = qVar.c(new p<>(p217r6.c.class, Executor.class));
            i.d(objC, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return T.g((Executor) objC);
        }
    }

    /* JADX INFO: compiled from: Firebase.kt */
    public static final class c<T> implements p228s6.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c<T> f28046b = new c<>();

        @Override // p228s6.d
        public final Object f(q qVar) {
            Object objC = qVar.c(new p<>(p217r6.b.class, Executor.class));
            i.d(objC, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return T.g((Executor) objC);
        }
    }

    /* JADX INFO: compiled from: Firebase.kt */
    public static final class d<T> implements p228s6.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d<T> f28047b = new d<>();

        @Override // p228s6.d
        public final Object f(q qVar) {
            Object objC = qVar.c(new p<>(p217r6.d.class, Executor.class));
            i.d(objC, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return T.g((Executor) objC);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<p228s6.a<?>> getComponents() {
        p228s6.a.C0531a c0531aB = p228s6.a.b(new p(p217r6.a.class, AbstractC2712w.class));
        c0531aB.a(new j((p<?>) new p(p217r6.a.class, Executor.class), 1, 0));
        c0531aB.f46942f = a.f28044b;
        p228s6.a aVarB = c0531aB.b();
        p228s6.a.C0531a c0531aB2 = p228s6.a.b(new p(p217r6.c.class, AbstractC2712w.class));
        c0531aB2.a(new j((p<?>) new p(p217r6.c.class, Executor.class), 1, 0));
        c0531aB2.f46942f = b.f28045b;
        p228s6.a aVarB2 = c0531aB2.b();
        p228s6.a.C0531a c0531aB3 = p228s6.a.b(new p(p217r6.b.class, AbstractC2712w.class));
        c0531aB3.a(new j((p<?>) new p(p217r6.b.class, Executor.class), 1, 0));
        c0531aB3.f46942f = c.f28046b;
        p228s6.a aVarB3 = c0531aB3.b();
        p228s6.a.C0531a c0531aB4 = p228s6.a.b(new p(p217r6.d.class, AbstractC2712w.class));
        c0531aB4.a(new j((p<?>) new p(p217r6.d.class, Executor.class), 1, 0));
        c0531aB4.f46942f = d.f28047b;
        return l.s(aVarB, aVarB2, aVarB3, c0531aB4.b());
    }
}
