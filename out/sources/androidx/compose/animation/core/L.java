package androidx.compose.animation.core;

import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: compiled from: InternalMutatorMutex.kt */
/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<a> f9383a = new AtomicReference<>(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutexImpl f9384b = kotlinx.coroutines.sync.b.a();

    /* JADX INFO: compiled from: InternalMutatorMutex.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MutatePriority f9385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC2694i0 f9386b;

        public a(MutatePriority mutatePriority, InterfaceC2694i0 interfaceC2694i0) {
            this.f9385a = mutatePriority;
            this.f9386b = interfaceC2694i0;
        }
    }

    public static Object a(L l10, Ia.l lVar, kotlin.coroutines.c cVar) {
        MutatePriority mutatePriority = MutatePriority.f9387b;
        l10.getClass();
        return kotlinx.coroutines.B.d(new MutatorMutex$mutate$2(mutatePriority, l10, lVar, null), cVar);
    }
}
