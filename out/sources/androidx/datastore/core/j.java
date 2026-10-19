package androidx.datastore.core;

import D2.V;
import Ia.p;
import androidx.datastore.preferences.core.MutablePreferences;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.q;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.C2706p;
import kotlinx.coroutines.InterfaceC2705o;
import kotlinx.coroutines.flow.B;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.t;
import p293xa.r;

/* JADX INFO: compiled from: SingleProcessDataStore.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j<T> implements e<T> {
    public static final LinkedHashSet j = new LinkedHashSet();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f17046k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ia.a<File> f17047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.datastore.core.a<T> f17048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A f17049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f17050d = new t(new SingleProcessDataStore$data$1(this, null));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f17051e = ".tmp";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p293xa.g f17052f = kotlin.a.a(new Ia.a<File>(this) { // from class: androidx.datastore.core.SingleProcessDataStore$file$2
        final /* synthetic */ j<Object> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.this$0 = this;
        }

        @Override // Ia.a
        public final File invoke() {
            File fileInvoke = this.this$0.f17047a.invoke();
            String it = fileInvoke.getAbsolutePath();
            synchronized (j.f17046k) {
                LinkedHashSet linkedHashSet = j.j;
                if (linkedHashSet.contains(it)) {
                    throw new IllegalStateException(("There are multiple DataStores active for the same file: " + fileInvoke + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                }
                kotlin.jvm.internal.i.d(it, "it");
                linkedHashSet.add(it);
            }
            return fileInvoke;
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StateFlowImpl f17053g = B.a(m.f17066a);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<? extends p<? super h<T>, ? super kotlin.coroutines.c<? super r>, ? extends Object>> f17054h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SimpleActor<a<T>> f17055i;

    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    public static abstract class a<T> {

        /* JADX INFO: renamed from: androidx.datastore.core.j$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SingleProcessDataStore.kt */
        public static final class C0177a<T> extends a<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final l<T> f17056a;

            public C0177a(l<T> lVar) {
                this.f17056a = lVar;
            }
        }

        /* JADX INFO: compiled from: SingleProcessDataStore.kt */
        public static final class b<T> extends a<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SuspendLambda f17057a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final C2706p f17058b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final l<T> f17059c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final kotlin.coroutines.e f17060d;

            /* JADX WARN: Multi-variable type inference failed */
            public b(p pVar, C2706p c2706p, l lVar, kotlin.coroutines.e callerContext) {
                kotlin.jvm.internal.i.e(callerContext, "callerContext");
                this.f17057a = (SuspendLambda) pVar;
                this.f17058b = c2706p;
                this.f17059c = lVar;
                this.f17060d = callerContext;
            }
        }
    }

    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    public static final class b extends OutputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FileOutputStream f17061b;

        public b(FileOutputStream fileOutputStream) {
            this.f17061b = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() throws IOException {
            this.f17061b.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i10) throws IOException {
            this.f17061b.write(i10);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] b10) throws IOException {
            kotlin.jvm.internal.i.e(b10, "b");
            this.f17061b.write(b10);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bytes, int i10, int i11) {
            kotlin.jvm.internal.i.e(bytes, "bytes");
            this.f17061b.write(bytes, i10, i11);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    public j(Ia.a aVar, List list, androidx.datastore.core.a aVar2, A a10) {
        this.f17047a = aVar;
        this.f17048b = aVar2;
        this.f17049c = a10;
        this.f17054h = q.o0(list);
        this.f17055i = new SimpleActor<>(a10, new Ia.l<Throwable, r>(this) { // from class: androidx.datastore.core.SingleProcessDataStore$actor$1
            final /* synthetic */ j<Object> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // Ia.l
            public final r invoke(Throwable th) {
                Throwable th2 = th;
                if (th2 != null) {
                    StateFlowImpl stateFlowImpl = this.this$0.f17053g;
                    g gVar = new g(th2);
                    stateFlowImpl.getClass();
                    stateFlowImpl.k(null, gVar);
                }
                Object obj = j.f17046k;
                j<Object> jVar = this.this$0;
                synchronized (obj) {
                    j.j.remove(jVar.c().getAbsolutePath());
                }
                return r.f47939a;
            }
        }, new p<a<Object>, Throwable, r>() { // from class: androidx.datastore.core.SingleProcessDataStore$actor$2
            @Override // Ia.p
            public final r invoke(j.a<Object> aVar3, Throwable th) {
                j.a<Object> msg = aVar3;
                Throwable cancellationException = th;
                kotlin.jvm.internal.i.e(msg, "msg");
                if (msg instanceof j.a.b) {
                    j.a.b bVar = (j.a.b) msg;
                    if (cancellationException == null) {
                        cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
                    }
                    bVar.f17058b.h(cancellationException);
                }
                return r.f47939a;
            }
        }, new SingleProcessDataStore$actor$3(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00af  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [Ia.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    /* JADX WARN: Type inference failed for: r2v3, types: [Ia.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.datastore.core.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [androidx.datastore.core.j] */
    /* JADX WARN: Type inference failed for: r8v13, types: [kotlinx.coroutines.o] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public static final Object b(j jVar, a.b bVar, ContinuationImpl continuationImpl) {
        SingleProcessDataStore$handleUpdate$1 singleProcessDataStore$handleUpdate$1;
        InterfaceC2705o interfaceC2705o;
        InterfaceC2705o interfaceC2705o2;
        ?? r10;
        Object objI;
        ?? r11;
        jVar.getClass();
        if (continuationImpl instanceof SingleProcessDataStore$handleUpdate$1) {
            singleProcessDataStore$handleUpdate$1 = (SingleProcessDataStore$handleUpdate$1) continuationImpl;
            int i10 = singleProcessDataStore$handleUpdate$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$handleUpdate$1.label = i10 - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$handleUpdate$1 = new SingleProcessDataStore$handleUpdate$1(jVar, continuationImpl);
            }
        } else {
            singleProcessDataStore$handleUpdate$1 = new SingleProcessDataStore$handleUpdate$1(jVar, continuationImpl);
        }
        Object objA = singleProcessDataStore$handleUpdate$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = singleProcessDataStore$handleUpdate$1.label;
        boolean z10 = true;
        if (i11 != 0) {
            try {
                if (i11 == 1) {
                    interfaceC2705o = (InterfaceC2705o) singleProcessDataStore$handleUpdate$1.L$0;
                } else if (i11 == 2) {
                    InterfaceC2705o interfaceC2705o3 = (InterfaceC2705o) singleProcessDataStore$handleUpdate$1.L$2;
                    j jVar2 = (j) singleProcessDataStore$handleUpdate$1.L$1;
                    a.b bVar2 = (a.b) singleProcessDataStore$handleUpdate$1.L$0;
                    kotlin.b.b(objA);
                    interfaceC2705o2 = interfaceC2705o3;
                    r10 = jVar2;
                    bVar = bVar2;
                    r10 = jVar;
                    ?? r12 = bVar.f17057a;
                    kotlin.coroutines.e eVar = bVar.f17060d;
                    singleProcessDataStore$handleUpdate$1.L$0 = interfaceC2705o2;
                    singleProcessDataStore$handleUpdate$1.L$1 = null;
                    singleProcessDataStore$handleUpdate$1.L$2 = null;
                    singleProcessDataStore$handleUpdate$1.label = 3;
                    objI = r10.i(r12, eVar, singleProcessDataStore$handleUpdate$1);
                    if (objI == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    InterfaceC2705o interfaceC2705o4 = interfaceC2705o2;
                    objA = objI;
                    r11 = interfaceC2705o4;
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC2705o = (InterfaceC2705o) singleProcessDataStore$handleUpdate$1.L$0;
                }
                kotlin.b.b(objA);
                r11 = interfaceC2705o;
            } catch (Throwable th) {
                th = th;
                objA = kotlin.b.a(th);
                r11 = jVar;
            }
        } else {
            kotlin.b.b(objA);
            interfaceC2705o2 = bVar.f17058b;
            try {
                l<T> lVar = (l) jVar.f17053g.getValue();
                if (lVar instanceof androidx.datastore.core.b) {
                    ?? r13 = bVar.f17057a;
                    kotlin.coroutines.e eVar2 = bVar.f17060d;
                    singleProcessDataStore$handleUpdate$1.L$0 = interfaceC2705o2;
                    singleProcessDataStore$handleUpdate$1.label = 1;
                    objI = jVar.i(r13, eVar2, singleProcessDataStore$handleUpdate$1);
                    if (objI == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (!(lVar instanceof i)) {
                        z10 = lVar instanceof m;
                    }
                    if (!z10) {
                        if (lVar instanceof g) {
                            throw ((g) lVar).f17044a;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    if (lVar != bVar.f17059c) {
                        throw ((i) lVar).f17045a;
                    }
                    singleProcessDataStore$handleUpdate$1.L$0 = bVar;
                    singleProcessDataStore$handleUpdate$1.L$1 = jVar;
                    singleProcessDataStore$handleUpdate$1.L$2 = interfaceC2705o2;
                    singleProcessDataStore$handleUpdate$1.label = 2;
                    if (jVar.e(singleProcessDataStore$handleUpdate$1) == coroutineSingletons) {
                        r10 = jVar;
                        return coroutineSingletons;
                    }
                    r10 = jVar;
                    ?? r14 = bVar.f17057a;
                    kotlin.coroutines.e eVar3 = bVar.f17060d;
                    singleProcessDataStore$handleUpdate$1.L$0 = interfaceC2705o2;
                    singleProcessDataStore$handleUpdate$1.L$1 = null;
                    singleProcessDataStore$handleUpdate$1.L$2 = null;
                    singleProcessDataStore$handleUpdate$1.label = 3;
                    objI = r10.i(r14, eVar3, singleProcessDataStore$handleUpdate$1);
                    if (objI == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                InterfaceC2705o interfaceC2705o5 = interfaceC2705o2;
                objA = objI;
                r11 = interfaceC2705o5;
            } catch (Throwable th2) {
                th = th2;
                jVar = interfaceC2705o2;
                objA = kotlin.b.a(th);
                r11 = jVar;
            }
        }
        Throwable thA = Result.a(objA);
        if (thA == null) {
            r11.r0(objA);
        } else {
            r11.h(thA);
        }
        return r.f47939a;
    }

    @Override // androidx.datastore.core.e
    public final Object a(p pVar, ContinuationImpl continuationImpl) {
        C2706p c2706pA = I.e.a();
        this.f17055i.a(new a.b(pVar, c2706pA, (l) this.f17053g.getValue(), continuationImpl.getContext()));
        Object objD = c2706pA.D(continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        return objD;
    }

    public final File c() {
        return (File) this.f17052f.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:41:0x0112 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x0113  */
    /* JADX WARN: Code duplicated, block: B:46:0x0124  */
    /* JADX WARN: Code duplicated, block: B:47:0x0129  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[LOOP:0: B:33:0x00d6->B:58:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(ContinuationImpl continuationImpl) {
        SingleProcessDataStore$readAndInit$1 singleProcessDataStore$readAndInit$1;
        kotlinx.coroutines.sync.a aVarA;
        Ref$ObjectRef ref$ObjectRef;
        j<T> jVar;
        Ref$ObjectRef ref$ObjectRef2;
        j<T> jVar2;
        Ref$ObjectRef ref$ObjectRef3;
        k kVar;
        Iterator<T> it;
        kotlinx.coroutines.sync.a aVar;
        Ref$BooleanRef ref$BooleanRef;
        Ref$BooleanRef ref$BooleanRef2;
        j<T> jVar3;
        Ref$ObjectRef ref$ObjectRef4;
        kotlinx.coroutines.sync.a aVar2;
        p pVar;
        T t8;
        int iHashCode;
        if (continuationImpl instanceof SingleProcessDataStore$readAndInit$1) {
            singleProcessDataStore$readAndInit$1 = (SingleProcessDataStore$readAndInit$1) continuationImpl;
            int i10 = singleProcessDataStore$readAndInit$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readAndInit$1.label = i10 - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$readAndInit$1 = new SingleProcessDataStore$readAndInit$1(this, continuationImpl);
            }
        } else {
            singleProcessDataStore$readAndInit$1 = new SingleProcessDataStore$readAndInit$1(this, continuationImpl);
        }
        T t10 = (T) singleProcessDataStore$readAndInit$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = singleProcessDataStore$readAndInit$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ref$ObjectRef = (Ref$ObjectRef) singleProcessDataStore$readAndInit$1.L$3;
                ref$ObjectRef2 = (Ref$ObjectRef) singleProcessDataStore$readAndInit$1.L$2;
                aVarA = (kotlinx.coroutines.sync.a) singleProcessDataStore$readAndInit$1.L$1;
                jVar = (j) singleProcessDataStore$readAndInit$1.L$0;
                kotlin.b.b(t10);
            } else if (i11 == 2) {
                it = (Iterator) singleProcessDataStore$readAndInit$1.L$5;
                kVar = (k) singleProcessDataStore$readAndInit$1.L$4;
                ref$BooleanRef = (Ref$BooleanRef) singleProcessDataStore$readAndInit$1.L$3;
                ref$ObjectRef3 = (Ref$ObjectRef) singleProcessDataStore$readAndInit$1.L$2;
                aVar = (kotlinx.coroutines.sync.a) singleProcessDataStore$readAndInit$1.L$1;
                jVar2 = (j) singleProcessDataStore$readAndInit$1.L$0;
                kotlin.b.b(t10);
                while (it.hasNext()) {
                    pVar = (p) it.next();
                    singleProcessDataStore$readAndInit$1.L$0 = jVar2;
                    singleProcessDataStore$readAndInit$1.L$1 = aVar;
                    singleProcessDataStore$readAndInit$1.L$2 = ref$ObjectRef3;
                    singleProcessDataStore$readAndInit$1.L$3 = ref$BooleanRef;
                    singleProcessDataStore$readAndInit$1.L$4 = kVar;
                    singleProcessDataStore$readAndInit$1.L$5 = it;
                    singleProcessDataStore$readAndInit$1.label = 2;
                    if (pVar.invoke(kVar, singleProcessDataStore$readAndInit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                ref$BooleanRef2 = ref$BooleanRef;
                ref$ObjectRef2 = ref$ObjectRef3;
                aVarA = aVar;
                jVar3 = jVar2;
                jVar3.f17054h = null;
                singleProcessDataStore$readAndInit$1.L$0 = jVar3;
                singleProcessDataStore$readAndInit$1.L$1 = ref$ObjectRef2;
                singleProcessDataStore$readAndInit$1.L$2 = ref$BooleanRef2;
                singleProcessDataStore$readAndInit$1.L$3 = aVarA;
                singleProcessDataStore$readAndInit$1.L$4 = null;
                singleProcessDataStore$readAndInit$1.L$5 = null;
                singleProcessDataStore$readAndInit$1.label = 3;
                if (aVarA.f(null, singleProcessDataStore$readAndInit$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$ObjectRef4 = ref$ObjectRef2;
                aVar2 = aVarA;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (kotlinx.coroutines.sync.a) singleProcessDataStore$readAndInit$1.L$3;
                ref$BooleanRef2 = (Ref$BooleanRef) singleProcessDataStore$readAndInit$1.L$2;
                ref$ObjectRef4 = (Ref$ObjectRef) singleProcessDataStore$readAndInit$1.L$1;
                jVar3 = (j) singleProcessDataStore$readAndInit$1.L$0;
                kotlin.b.b(t10);
            }
            try {
                ref$BooleanRef2.element = true;
                r rVar = r.f47939a;
                aVar2.g(null);
                StateFlowImpl stateFlowImpl = jVar3.f17053g;
                t8 = ref$ObjectRef4.element;
                if (t8 != null) {
                    iHashCode = t8.hashCode();
                } else {
                    iHashCode = 0;
                }
                androidx.datastore.core.b bVar = new androidx.datastore.core.b(iHashCode, t8);
                stateFlowImpl.getClass();
                stateFlowImpl.k(null, bVar);
                return r.f47939a;
            } catch (Throwable th) {
                aVar2.g(null);
                throw th;
            }
        }
        kotlin.b.b(t10);
        StateFlowImpl stateFlowImpl2 = this.f17053g;
        if (!kotlin.jvm.internal.i.a(stateFlowImpl2.getValue(), m.f17066a) && !(stateFlowImpl2.getValue() instanceof i)) {
            throw new IllegalStateException("Check failed.");
        }
        aVarA = kotlinx.coroutines.sync.b.a();
        ref$ObjectRef = new Ref$ObjectRef();
        singleProcessDataStore$readAndInit$1.L$0 = this;
        singleProcessDataStore$readAndInit$1.L$1 = aVarA;
        singleProcessDataStore$readAndInit$1.L$2 = ref$ObjectRef;
        singleProcessDataStore$readAndInit$1.L$3 = ref$ObjectRef;
        singleProcessDataStore$readAndInit$1.label = 1;
        t10 = (T) h(singleProcessDataStore$readAndInit$1);
        if (t10 == coroutineSingletons) {
            return coroutineSingletons;
        }
        jVar = this;
        ref$ObjectRef2 = ref$ObjectRef;
        ref$ObjectRef.element = t10;
        Ref$BooleanRef ref$BooleanRef3 = new Ref$BooleanRef();
        k kVar2 = new k(aVarA, ref$BooleanRef3, ref$ObjectRef2, jVar);
        List<? extends p<? super h<T>, ? super kotlin.coroutines.c<? super r>, ? extends Object>> list = jVar.f17054h;
        if (list == null) {
            ref$BooleanRef2 = ref$BooleanRef3;
            jVar3 = jVar;
        } else {
            jVar2 = jVar;
            ref$ObjectRef3 = ref$ObjectRef2;
            kVar = kVar2;
            it = list.iterator();
            aVar = aVarA;
            ref$BooleanRef = ref$BooleanRef3;
            while (it.hasNext()) {
                pVar = (p) it.next();
                singleProcessDataStore$readAndInit$1.L$0 = jVar2;
                singleProcessDataStore$readAndInit$1.L$1 = aVar;
                singleProcessDataStore$readAndInit$1.L$2 = ref$ObjectRef3;
                singleProcessDataStore$readAndInit$1.L$3 = ref$BooleanRef;
                singleProcessDataStore$readAndInit$1.L$4 = kVar;
                singleProcessDataStore$readAndInit$1.L$5 = it;
                singleProcessDataStore$readAndInit$1.label = 2;
                if (pVar.invoke(kVar, singleProcessDataStore$readAndInit$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            ref$BooleanRef2 = ref$BooleanRef;
            ref$ObjectRef2 = ref$ObjectRef3;
            aVarA = aVar;
            jVar3 = jVar2;
        }
        jVar3.f17054h = null;
        singleProcessDataStore$readAndInit$1.L$0 = jVar3;
        singleProcessDataStore$readAndInit$1.L$1 = ref$ObjectRef2;
        singleProcessDataStore$readAndInit$1.L$2 = ref$BooleanRef2;
        singleProcessDataStore$readAndInit$1.L$3 = aVarA;
        singleProcessDataStore$readAndInit$1.L$4 = null;
        singleProcessDataStore$readAndInit$1.L$5 = null;
        singleProcessDataStore$readAndInit$1.label = 3;
        if (aVarA.f(null, singleProcessDataStore$readAndInit$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        ref$ObjectRef4 = ref$ObjectRef2;
        aVar2 = aVarA;
        ref$BooleanRef2.element = true;
        r rVar2 = r.f47939a;
        aVar2.g(null);
        StateFlowImpl stateFlowImpl3 = jVar3.f17053g;
        t8 = ref$ObjectRef4.element;
        if (t8 != null) {
            iHashCode = t8.hashCode();
        } else {
            iHashCode = 0;
        }
        androidx.datastore.core.b bVar2 = new androidx.datastore.core.b(iHashCode, t8);
        stateFlowImpl3.getClass();
        stateFlowImpl3.k(null, bVar2);
        return r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(ContinuationImpl continuationImpl) throws Throwable {
        SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1;
        j<T> jVar;
        if (continuationImpl instanceof SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1) {
            singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 = (SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1) continuationImpl;
            int i10 = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.label = i10 - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 = new SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1(this, continuationImpl);
            }
        } else {
            singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 = new SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1(this, continuationImpl);
        }
        Object obj = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (j) singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.L$0;
            try {
                kotlin.b.b(obj);
                return r.f47939a;
            } catch (Throwable th) {
                th = th;
                StateFlowImpl stateFlowImpl = jVar.f17053g;
                i iVar = new i(th);
                stateFlowImpl.getClass();
                stateFlowImpl.k(null, iVar);
                throw th;
            }
        }
        kotlin.b.b(obj);
        try {
            singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.L$0 = this;
            singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.label = 1;
            if (d(singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return r.f47939a;
        } catch (Throwable th2) {
            th = th2;
            jVar = this;
            StateFlowImpl stateFlowImpl2 = jVar.f17053g;
            i iVar2 = new i(th);
            stateFlowImpl2.getClass();
            stateFlowImpl2.k(null, iVar2);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(ContinuationImpl continuationImpl) {
        SingleProcessDataStore$readAndInitOrPropagateFailure$1 singleProcessDataStore$readAndInitOrPropagateFailure$1;
        j<T> jVar;
        if (continuationImpl instanceof SingleProcessDataStore$readAndInitOrPropagateFailure$1) {
            singleProcessDataStore$readAndInitOrPropagateFailure$1 = (SingleProcessDataStore$readAndInitOrPropagateFailure$1) continuationImpl;
            int i10 = singleProcessDataStore$readAndInitOrPropagateFailure$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readAndInitOrPropagateFailure$1.label = i10 - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$readAndInitOrPropagateFailure$1 = new SingleProcessDataStore$readAndInitOrPropagateFailure$1(this, continuationImpl);
            }
        } else {
            singleProcessDataStore$readAndInitOrPropagateFailure$1 = new SingleProcessDataStore$readAndInitOrPropagateFailure$1(this, continuationImpl);
        }
        Object obj = singleProcessDataStore$readAndInitOrPropagateFailure$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = singleProcessDataStore$readAndInitOrPropagateFailure$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            try {
                singleProcessDataStore$readAndInitOrPropagateFailure$1.L$0 = this;
                singleProcessDataStore$readAndInitOrPropagateFailure$1.label = 1;
                if (d(singleProcessDataStore$readAndInitOrPropagateFailure$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (Throwable th) {
                th = th;
                jVar = this;
                StateFlowImpl stateFlowImpl = jVar.f17053g;
                i iVar = new i(th);
                stateFlowImpl.getClass();
                stateFlowImpl.k(null, iVar);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (j) singleProcessDataStore$readAndInitOrPropagateFailure$1.L$0;
            try {
                kotlin.b.b(obj);
            } catch (Throwable th2) {
                th = th2;
                StateFlowImpl stateFlowImpl2 = jVar.f17053g;
                i iVar2 = new i(th);
                stateFlowImpl2.getClass();
                stateFlowImpl2.k(null, iVar2);
            }
        }
        return r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.datastore.core.j] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.SingleProcessDataStore$readData$1] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.j] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.FileInputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [androidx.datastore.preferences.core.e] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object g(ContinuationImpl continuationImpl) throws IOException {
        ?? singleProcessDataStore$readData$1;
        ?? fileInputStream;
        Throwable th;
        ?? r10;
        if (continuationImpl instanceof SingleProcessDataStore$readData$1) {
            SingleProcessDataStore$readData$1 singleProcessDataStore$readData$2 = (SingleProcessDataStore$readData$1) continuationImpl;
            int i10 = singleProcessDataStore$readData$2.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readData$2.label = i10 - Integer.MIN_VALUE;
                singleProcessDataStore$readData$1 = singleProcessDataStore$readData$2;
            } else {
                singleProcessDataStore$readData$1 = new SingleProcessDataStore$readData$1(this, continuationImpl);
            }
        } else {
            singleProcessDataStore$readData$1 = new SingleProcessDataStore$readData$1(this, continuationImpl);
        }
        Object objA = singleProcessDataStore$readData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = singleProcessDataStore$readData$1.label;
        int i12 = 1;
        boolean z10 = true;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = (Throwable) singleProcessDataStore$readData$1.L$2;
                fileInputStream = (Closeable) singleProcessDataStore$readData$1.L$1;
                singleProcessDataStore$readData$1 = (j) singleProcessDataStore$readData$1.L$0;
                try {
                    kotlin.b.b(objA);
                    r10 = fileInputStream;
                    p241t7.b.n(r10, th);
                    return objA;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        p241t7.b.n(fileInputStream, th);
                        throw th3;
                    }
                }
            }
            kotlin.b.b(objA);
            try {
                fileInputStream = new FileInputStream(c());
                try {
                    ?? r11 = androidx.datastore.preferences.core.e.f17088a;
                    singleProcessDataStore$readData$1.L$0 = this;
                    singleProcessDataStore$readData$1.L$1 = fileInputStream;
                    singleProcessDataStore$readData$1.L$2 = null;
                    singleProcessDataStore$readData$1.label = 1;
                    objA = r11.a(fileInputStream);
                    if (objA == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    th = null;
                    r10 = fileInputStream;
                    p241t7.b.n(r10, th);
                    return objA;
                } catch (Throwable th4) {
                    th = th4;
                    singleProcessDataStore$readData$1 = this;
                    throw th;
                }
            } catch (FileNotFoundException e10) {
                e = e10;
                singleProcessDataStore$readData$1 = this;
                if (singleProcessDataStore$readData$1.c().exists()) {
                    throw e;
                }
                return new MutablePreferences(i12, z10 ? 1 : 0);
            }
        } catch (FileNotFoundException e11) {
            e = e11;
        }
    }

    @Override // androidx.datastore.core.e
    public final InterfaceC2686c<T> getData() {
        return this.f17050d;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0074 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(ContinuationImpl continuationImpl) throws IOException {
        SingleProcessDataStore$readDataOrHandleCorruption$1 singleProcessDataStore$readDataOrHandleCorruption$1;
        j<T> jVar;
        Object objA;
        CorruptionException corruptionException;
        j<T> jVar2;
        CorruptionException corruptionException2;
        if (continuationImpl instanceof SingleProcessDataStore$readDataOrHandleCorruption$1) {
            singleProcessDataStore$readDataOrHandleCorruption$1 = (SingleProcessDataStore$readDataOrHandleCorruption$1) continuationImpl;
            int i10 = singleProcessDataStore$readDataOrHandleCorruption$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readDataOrHandleCorruption$1.label = i10 - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$readDataOrHandleCorruption$1 = new SingleProcessDataStore$readDataOrHandleCorruption$1(this, continuationImpl);
            }
        } else {
            singleProcessDataStore$readDataOrHandleCorruption$1 = new SingleProcessDataStore$readDataOrHandleCorruption$1(this, continuationImpl);
        }
        Object objG = singleProcessDataStore$readDataOrHandleCorruption$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = singleProcessDataStore$readDataOrHandleCorruption$1.label;
        if (i11 == 0) {
            kotlin.b.b(objG);
            try {
                singleProcessDataStore$readDataOrHandleCorruption$1.L$0 = this;
                singleProcessDataStore$readDataOrHandleCorruption$1.label = 1;
                objG = g(singleProcessDataStore$readDataOrHandleCorruption$1);
                return objG == coroutineSingletons ? coroutineSingletons : objG;
            } catch (CorruptionException e10) {
                e = e10;
                jVar = this;
                androidx.datastore.core.a<T> aVar = jVar.f17048b;
                singleProcessDataStore$readDataOrHandleCorruption$1.L$0 = jVar;
                singleProcessDataStore$readDataOrHandleCorruption$1.L$1 = e;
                singleProcessDataStore$readDataOrHandleCorruption$1.label = 2;
                objA = aVar.a(e);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                j<T> jVar3 = jVar;
                corruptionException = e;
                objG = objA;
                jVar2 = jVar3;
                singleProcessDataStore$readDataOrHandleCorruption$1.L$0 = corruptionException;
                singleProcessDataStore$readDataOrHandleCorruption$1.L$1 = objG;
                singleProcessDataStore$readDataOrHandleCorruption$1.label = 3;
                if (jVar2.j(objG, singleProcessDataStore$readDataOrHandleCorruption$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return objG;
            }
        }
        if (i11 != 1) {
            if (i11 == 2) {
                corruptionException = (CorruptionException) singleProcessDataStore$readDataOrHandleCorruption$1.L$1;
                jVar2 = (j) singleProcessDataStore$readDataOrHandleCorruption$1.L$0;
                kotlin.b.b(objG);
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj = singleProcessDataStore$readDataOrHandleCorruption$1.L$1;
                corruptionException2 = (CorruptionException) singleProcessDataStore$readDataOrHandleCorruption$1.L$0;
                try {
                    kotlin.b.b(objG);
                    return obj;
                } catch (IOException e11) {
                    e = e11;
                }
            }
            V.e(corruptionException2, e);
            throw corruptionException2;
        }
        jVar = (j) singleProcessDataStore$readDataOrHandleCorruption$1.L$0;
        try {
            kotlin.b.b(objG);
        } catch (CorruptionException e12) {
            e = e12;
            androidx.datastore.core.a<T> aVar2 = jVar.f17048b;
            singleProcessDataStore$readDataOrHandleCorruption$1.L$0 = jVar;
            singleProcessDataStore$readDataOrHandleCorruption$1.L$1 = e;
            singleProcessDataStore$readDataOrHandleCorruption$1.label = 2;
            objA = aVar2.a(e);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            j<T> jVar4 = jVar;
            corruptionException = e;
            objG = objA;
            jVar2 = jVar4;
            singleProcessDataStore$readDataOrHandleCorruption$1.L$0 = corruptionException;
            singleProcessDataStore$readDataOrHandleCorruption$1.L$1 = objG;
            singleProcessDataStore$readDataOrHandleCorruption$1.label = 3;
            if (jVar2.j(objG, singleProcessDataStore$readDataOrHandleCorruption$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return objG;
        }
        try {
            singleProcessDataStore$readDataOrHandleCorruption$1.L$0 = corruptionException;
            singleProcessDataStore$readDataOrHandleCorruption$1.L$1 = objG;
            singleProcessDataStore$readDataOrHandleCorruption$1.label = 3;
            if (jVar2.j(objG, singleProcessDataStore$readDataOrHandleCorruption$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return objG;
        } catch (IOException e13) {
            e = e13;
            corruptionException2 = corruptionException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(p pVar, kotlin.coroutines.e eVar, ContinuationImpl continuationImpl) throws Throwable {
        SingleProcessDataStore$transformAndWrite$1 singleProcessDataStore$transformAndWrite$1;
        j<T> jVar;
        androidx.datastore.core.b bVar;
        Object obj;
        j<T> jVar2;
        if (continuationImpl instanceof SingleProcessDataStore$transformAndWrite$1) {
            singleProcessDataStore$transformAndWrite$1 = (SingleProcessDataStore$transformAndWrite$1) continuationImpl;
            int i10 = singleProcessDataStore$transformAndWrite$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$transformAndWrite$1.label = i10 - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$transformAndWrite$1 = new SingleProcessDataStore$transformAndWrite$1(this, continuationImpl);
            }
        } else {
            singleProcessDataStore$transformAndWrite$1 = new SingleProcessDataStore$transformAndWrite$1(this, continuationImpl);
        }
        Object obj2 = singleProcessDataStore$transformAndWrite$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = singleProcessDataStore$transformAndWrite$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                obj = singleProcessDataStore$transformAndWrite$1.L$2;
                bVar = (androidx.datastore.core.b) singleProcessDataStore$transformAndWrite$1.L$1;
                jVar = (j) singleProcessDataStore$transformAndWrite$1.L$0;
                kotlin.b.b(obj2);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = singleProcessDataStore$transformAndWrite$1.L$1;
                jVar2 = (j) singleProcessDataStore$transformAndWrite$1.L$0;
                kotlin.b.b(obj2);
            }
            StateFlowImpl stateFlowImpl = jVar2.f17053g;
            androidx.datastore.core.b bVar2 = new androidx.datastore.core.b(obj != null ? obj.hashCode() : 0, obj);
            stateFlowImpl.getClass();
            stateFlowImpl.k(null, bVar2);
            return obj;
        }
        kotlin.b.b(obj2);
        androidx.datastore.core.b bVar3 = (androidx.datastore.core.b) this.f17053g.getValue();
        T t8 = bVar3.f17041a;
        if ((t8 != null ? t8.hashCode() : 0) != bVar3.f17042b) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
        T t10 = bVar3.f17041a;
        SingleProcessDataStore$transformAndWrite$newData$1 singleProcessDataStore$transformAndWrite$newData$1 = new SingleProcessDataStore$transformAndWrite$newData$1(pVar, t10, null);
        singleProcessDataStore$transformAndWrite$1.L$0 = this;
        singleProcessDataStore$transformAndWrite$1.L$1 = bVar3;
        singleProcessDataStore$transformAndWrite$1.L$2 = t10;
        singleProcessDataStore$transformAndWrite$1.label = 1;
        Object objF = C2680e.f(eVar, singleProcessDataStore$transformAndWrite$newData$1, singleProcessDataStore$transformAndWrite$1);
        if (objF == coroutineSingletons) {
            return coroutineSingletons;
        }
        jVar = this;
        bVar = bVar3;
        obj2 = objF;
        obj = t10;
        T t11 = bVar.f17041a;
        if ((t11 != null ? t11.hashCode() : 0) != bVar.f17042b) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
        if (!kotlin.jvm.internal.i.a(obj, obj2)) {
            singleProcessDataStore$transformAndWrite$1.L$0 = jVar;
            singleProcessDataStore$transformAndWrite$1.L$1 = obj2;
            singleProcessDataStore$transformAndWrite$1.L$2 = null;
            singleProcessDataStore$transformAndWrite$1.label = 2;
            if (jVar.j(obj2, singleProcessDataStore$transformAndWrite$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = obj2;
            jVar2 = jVar;
            StateFlowImpl stateFlowImpl2 = jVar2.f17053g;
            androidx.datastore.core.b bVar4 = new androidx.datastore.core.b(obj != null ? obj.hashCode() : 0, obj);
            stateFlowImpl2.getClass();
            stateFlowImpl2.k(null, bVar4);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v6 */
    public final Object j(Object obj, ContinuationImpl continuationImpl) throws IOException {
        SingleProcessDataStore$writeData$1 singleProcessDataStore$writeData$1;
        ?? file;
        ?? fileOutputStream;
        j<T> jVar;
        ?? r10;
        Throwable th;
        if (continuationImpl instanceof SingleProcessDataStore$writeData$1) {
            singleProcessDataStore$writeData$1 = (SingleProcessDataStore$writeData$1) continuationImpl;
            int i10 = singleProcessDataStore$writeData$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$writeData$1.label = i10 - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$writeData$1 = new SingleProcessDataStore$writeData$1(this, continuationImpl);
            }
        } else {
            singleProcessDataStore$writeData$1 = new SingleProcessDataStore$writeData$1(this, continuationImpl);
        }
        Object obj2 = singleProcessDataStore$writeData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = singleProcessDataStore$writeData$1.label;
        ?? r11 = 1;
        try {
            if (i11 == 0) {
                kotlin.b.b(obj2);
                File fileC = c();
                File parentFile = fileC.getCanonicalFile().getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                    if (!parentFile.isDirectory()) {
                        throw new IOException(kotlin.jvm.internal.i.k(fileC, "Unable to create parent directories of "));
                    }
                }
                file = new File(kotlin.jvm.internal.i.k(this.f17051e, c().getAbsolutePath()));
                try {
                    fileOutputStream = new FileOutputStream((File) file);
                    try {
                        androidx.datastore.preferences.core.e eVar = androidx.datastore.preferences.core.e.f17088a;
                        b bVar = new b(fileOutputStream);
                        singleProcessDataStore$writeData$1.L$0 = this;
                        singleProcessDataStore$writeData$1.L$1 = file;
                        singleProcessDataStore$writeData$1.L$2 = fileOutputStream;
                        singleProcessDataStore$writeData$1.L$3 = null;
                        singleProcessDataStore$writeData$1.L$4 = fileOutputStream;
                        singleProcessDataStore$writeData$1.label = 1;
                        if (eVar.b(obj, bVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        jVar = this;
                        r11 = file;
                        r10 = fileOutputStream;
                        th = null;
                        fileOutputStream = fileOutputStream;
                    } catch (Throwable th2) {
                        th = th2;
                        r11 = file;
                        throw th;
                    }
                } catch (IOException e10) {
                    e = e10;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                FileOutputStream fileOutputStream2 = (FileOutputStream) singleProcessDataStore$writeData$1.L$4;
                th = (Throwable) singleProcessDataStore$writeData$1.L$3;
                fileOutputStream = (Closeable) singleProcessDataStore$writeData$1.L$2;
                r11 = (File) singleProcessDataStore$writeData$1.L$1;
                jVar = (j) singleProcessDataStore$writeData$1.L$0;
                try {
                    kotlin.b.b(obj2);
                    fileOutputStream = fileOutputStream;
                    r11 = r11;
                    r10 = fileOutputStream2;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        throw th;
                    } catch (Throwable th4) {
                        p241t7.b.n(fileOutputStream, th);
                        throw th4;
                    }
                }
            }
            r10.getFD().sync();
            r rVar = r.f47939a;
            p241t7.b.n(fileOutputStream, th);
            if (r11.renameTo(jVar.c())) {
                return r.f47939a;
            }
            throw new IOException("Unable to rename " + r11 + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
        } catch (IOException e11) {
            e = e11;
            file = r11;
        }
    }
}
