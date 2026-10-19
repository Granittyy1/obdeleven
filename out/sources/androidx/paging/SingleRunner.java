package androidx.paging;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: compiled from: SingleRunner.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SingleRunner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f19324a;

    /* JADX INFO: compiled from: SingleRunner.kt */
    public static final class CancelIsolatedRunnerException extends CancellationException {
        private final SingleRunner runner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CancelIsolatedRunnerException(SingleRunner runner) {
            super("Cancelled isolated runner");
            kotlin.jvm.internal.i.e(runner, "runner");
            this.runner = runner;
        }

        public final SingleRunner a() {
            return this.runner;
        }
    }

    /* JADX INFO: compiled from: SingleRunner.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SingleRunner f19325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f19326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final MutexImpl f19327c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public InterfaceC2694i0 f19328d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f19329e;

        public a(SingleRunner singleRunner, boolean z10) {
            kotlin.jvm.internal.i.e(singleRunner, "singleRunner");
            this.f19325a = singleRunner;
            this.f19326b = z10;
            this.f19327c = kotlinx.coroutines.sync.b.a();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object a(InterfaceC2694i0 interfaceC2694i0, ContinuationImpl continuationImpl) {
            SingleRunner$Holder$onFinish$1 singleRunner$Holder$onFinish$1;
            kotlinx.coroutines.sync.a aVar;
            a aVar2;
            if (continuationImpl instanceof SingleRunner$Holder$onFinish$1) {
                singleRunner$Holder$onFinish$1 = (SingleRunner$Holder$onFinish$1) continuationImpl;
                int i10 = singleRunner$Holder$onFinish$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    singleRunner$Holder$onFinish$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    singleRunner$Holder$onFinish$1 = new SingleRunner$Holder$onFinish$1(this, continuationImpl);
                }
            } else {
                singleRunner$Holder$onFinish$1 = new SingleRunner$Holder$onFinish$1(this, continuationImpl);
            }
            Object obj = singleRunner$Holder$onFinish$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i11 = singleRunner$Holder$onFinish$1.label;
            if (i11 == 0) {
                kotlin.b.b(obj);
                singleRunner$Holder$onFinish$1.L$0 = this;
                singleRunner$Holder$onFinish$1.L$1 = interfaceC2694i0;
                aVar = this.f19327c;
                singleRunner$Holder$onFinish$1.L$2 = aVar;
                singleRunner$Holder$onFinish$1.label = 1;
                if (aVar.f(null, singleRunner$Holder$onFinish$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar2 = this;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) singleRunner$Holder$onFinish$1.L$2;
                InterfaceC2694i0 interfaceC2694i1 = (InterfaceC2694i0) singleRunner$Holder$onFinish$1.L$1;
                aVar2 = (a) singleRunner$Holder$onFinish$1.L$0;
                kotlin.b.b(obj);
                aVar = aVar3;
                interfaceC2694i0 = interfaceC2694i1;
            }
            try {
                if (interfaceC2694i0 == aVar2.f19328d) {
                    aVar2.f19328d = null;
                }
                p293xa.r rVar = p293xa.r.f47939a;
                return p293xa.r.f47939a;
            } finally {
                aVar.g(null);
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlinx.coroutines.i0] */
        /* JADX WARN: Type inference failed for: r11v1, types: [kotlinx.coroutines.sync.a] */
        /* JADX WARN: Type inference failed for: r11v14 */
        /* JADX WARN: Type inference failed for: r11v15 */
        /* JADX WARN: Type inference failed for: r11v4, types: [kotlinx.coroutines.sync.a] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v4, types: [kotlinx.coroutines.i0] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v8 */
        public final Object b(int i10, InterfaceC2694i0 interfaceC2694i0, ContinuationImpl continuationImpl) {
            SingleRunner$Holder$tryEnqueue$1 singleRunner$Holder$tryEnqueue$1;
            a aVar;
            ?? r10;
            kotlinx.coroutines.sync.a aVar2;
            ?? r11;
            a aVar3;
            int i11;
            if (continuationImpl instanceof SingleRunner$Holder$tryEnqueue$1) {
                singleRunner$Holder$tryEnqueue$1 = (SingleRunner$Holder$tryEnqueue$1) continuationImpl;
                int i12 = singleRunner$Holder$tryEnqueue$1.label;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    singleRunner$Holder$tryEnqueue$1.label = i12 - Integer.MIN_VALUE;
                } else {
                    singleRunner$Holder$tryEnqueue$1 = new SingleRunner$Holder$tryEnqueue$1(this, continuationImpl);
                }
            } else {
                singleRunner$Holder$tryEnqueue$1 = new SingleRunner$Holder$tryEnqueue$1(this, continuationImpl);
            }
            Object obj = singleRunner$Holder$tryEnqueue$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i13 = singleRunner$Holder$tryEnqueue$1.label;
            boolean z10 = true;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        i10 = singleRunner$Holder$tryEnqueue$1.I$0;
                        kotlinx.coroutines.sync.a aVar4 = (kotlinx.coroutines.sync.a) singleRunner$Holder$tryEnqueue$1.L$2;
                        InterfaceC2694i0 interfaceC2694i1 = (InterfaceC2694i0) singleRunner$Holder$tryEnqueue$1.L$1;
                        aVar = (a) singleRunner$Holder$tryEnqueue$1.L$0;
                        kotlin.b.b(obj);
                        r10 = interfaceC2694i1;
                        aVar2 = aVar4;
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i10 = singleRunner$Holder$tryEnqueue$1.I$0;
                        kotlinx.coroutines.sync.a aVar5 = (kotlinx.coroutines.sync.a) singleRunner$Holder$tryEnqueue$1.L$2;
                        InterfaceC2694i0 interfaceC2694i2 = (InterfaceC2694i0) singleRunner$Holder$tryEnqueue$1.L$1;
                        aVar3 = (a) singleRunner$Holder$tryEnqueue$1.L$0;
                        kotlin.b.b(obj);
                        r11 = interfaceC2694i2;
                        aVar2 = aVar5;
                    }
                    aVar = aVar3;
                    r10 = r11;
                    aVar.f19328d = r10;
                    aVar.f19329e = i10;
                    interfaceC2694i0 = aVar2;
                    Boolean boolValueOf = Boolean.valueOf(z10);
                    interfaceC2694i0.g(null);
                    return boolValueOf;
                }
                kotlin.b.b(obj);
                singleRunner$Holder$tryEnqueue$1.L$0 = this;
                singleRunner$Holder$tryEnqueue$1.L$1 = interfaceC2694i0;
                MutexImpl mutexImpl = this.f19327c;
                singleRunner$Holder$tryEnqueue$1.L$2 = mutexImpl;
                singleRunner$Holder$tryEnqueue$1.I$0 = i10;
                singleRunner$Holder$tryEnqueue$1.label = 1;
                if (mutexImpl.f(null, singleRunner$Holder$tryEnqueue$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar = this;
                r10 = interfaceC2694i0;
                aVar2 = mutexImpl;
                InterfaceC2694i0 interfaceC2694i3 = aVar.f19328d;
                if (interfaceC2694i3 == null || !interfaceC2694i3.c() || (i11 = aVar.f19329e) < i10 || (i11 == i10 && aVar.f19326b)) {
                    if (interfaceC2694i3 != null) {
                        interfaceC2694i3.i(new CancelIsolatedRunnerException(aVar.f19325a));
                    }
                    if (interfaceC2694i3 != null) {
                        singleRunner$Holder$tryEnqueue$1.L$0 = aVar;
                        singleRunner$Holder$tryEnqueue$1.L$1 = r10;
                        singleRunner$Holder$tryEnqueue$1.L$2 = aVar2;
                        singleRunner$Holder$tryEnqueue$1.I$0 = i10;
                        singleRunner$Holder$tryEnqueue$1.label = 2;
                        if (interfaceC2694i3.C(singleRunner$Holder$tryEnqueue$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        r11 = r10;
                        aVar3 = aVar;
                        aVar2 = aVar2;
                        aVar = aVar3;
                        r10 = r11;
                    }
                    aVar.f19328d = r10;
                    aVar.f19329e = i10;
                    interfaceC2694i0 = aVar2;
                } else {
                    z10 = false;
                    interfaceC2694i0 = aVar2;
                }
                Boolean boolValueOf2 = Boolean.valueOf(z10);
                interfaceC2694i0.g(null);
                return boolValueOf2;
            } catch (Throwable th) {
                interfaceC2694i0.g(null);
                throw th;
            }
        }
    }

    public SingleRunner() {
        this(0);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i10, Ia.l lVar, ContinuationImpl continuationImpl) {
        SingleRunner$runInIsolation$1 singleRunner$runInIsolation$1;
        SingleRunner singleRunner;
        if (continuationImpl instanceof SingleRunner$runInIsolation$1) {
            singleRunner$runInIsolation$1 = (SingleRunner$runInIsolation$1) continuationImpl;
            int i11 = singleRunner$runInIsolation$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                singleRunner$runInIsolation$1.label = i11 - Integer.MIN_VALUE;
            } else {
                singleRunner$runInIsolation$1 = new SingleRunner$runInIsolation$1(this, continuationImpl);
            }
        } else {
            singleRunner$runInIsolation$1 = new SingleRunner$runInIsolation$1(this, continuationImpl);
        }
        Object obj = singleRunner$runInIsolation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i12 = singleRunner$runInIsolation$1.label;
        if (i12 == 0) {
            kotlin.b.b(obj);
            try {
                SingleRunner$runInIsolation$2 singleRunner$runInIsolation$2 = new SingleRunner$runInIsolation$2(this, i10, lVar, null);
                singleRunner$runInIsolation$1.L$0 = this;
                singleRunner$runInIsolation$1.label = 1;
                if (kotlinx.coroutines.B.d(singleRunner$runInIsolation$2, singleRunner$runInIsolation$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (CancelIsolatedRunnerException e10) {
                e = e10;
                singleRunner = this;
                if (e.a() != singleRunner) {
                    throw e;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            singleRunner = (SingleRunner) singleRunner$runInIsolation$1.L$0;
            try {
                kotlin.b.b(obj);
            } catch (CancelIsolatedRunnerException e11) {
                e = e11;
                if (e.a() != singleRunner) {
                    throw e;
                }
            }
        }
        return p293xa.r.f47939a;
    }

    public SingleRunner(int i10) {
        this.f19324a = new a(this, true);
    }
}
