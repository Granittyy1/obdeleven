package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: kotlinx.coroutines.i0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2694i0 extends kotlin.coroutines.e.a {

    /* JADX INFO: renamed from: kotlinx.coroutines.i0$a */
    /* JADX INFO: compiled from: Job.kt */
    public static final class a {
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.i0$b */
    /* JADX INFO: compiled from: Job.kt */
    public static final class b implements kotlin.coroutines.e.b<InterfaceC2694i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ b f43449b = new b();
    }

    P B(Ia.l<? super Throwable, p293xa.r> lVar);

    Object C(ContinuationImpl continuationImpl);

    boolean I0();

    CancellationException M();

    InterfaceC2703m S(JobSupport jobSupport);

    boolean c();

    P f0(boolean z10, boolean z11, Ia.l<? super Throwable, p293xa.r> lVar);

    InterfaceC2694i0 getParent();

    void i(CancellationException cancellationException);

    boolean isCancelled();

    boolean start();

    kotlin.sequences.g<InterfaceC2694i0> x();
}
