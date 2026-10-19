package androidx.compose.ui;

import Ia.l;
import Ia.p;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.B;
import kotlinx.coroutines.InterfaceC2694i0;

/* JADX INFO: compiled from: SessionMutex.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class k<T> {

    /* JADX INFO: compiled from: SessionMutex.kt */
    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC2694i0 f14153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f14154b;

        public a(InterfaceC2694i0 interfaceC2694i0, T t8) {
            this.f14153a = interfaceC2694i0;
            this.f14154b = t8;
        }
    }

    public static final Object a(AtomicReference atomicReference, l lVar, p pVar, ContinuationImpl continuationImpl) {
        return B.d(new SessionMutex$withSessionCancellingPrevious$2(lVar, atomicReference, pVar, null), continuationImpl);
    }
}
