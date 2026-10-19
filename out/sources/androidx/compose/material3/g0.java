package androidx.compose.material3;

import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutexImpl f12454a = kotlinx.coroutines.sync.b.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1085f0 f12455b = J0.f(null);

    /* JADX INFO: compiled from: SnackbarHost.kt */
    public static final class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h0 f12456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C2693i f12457b;

        public a(h0 h0Var, C2693i c2693i) {
            this.f12456a = h0Var;
            this.f12457b = c2693i;
        }

        @Override // androidx.compose.material3.f0
        public final void a() {
            C2693i c2693i = this.f12457b;
            if (c2693i.c()) {
                c2693i.resumeWith(SnackbarResult.f12320c);
            }
        }

        @Override // androidx.compose.material3.f0
        public final h0 b() {
            return this.f12456a;
        }

        @Override // androidx.compose.material3.f0
        public final void dismiss() {
            C2693i c2693i = this.f12457b;
            if (c2693i.c()) {
                c2693i.resumeWith(SnackbarResult.f12319b);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.i.a(this.f12456a, aVar.f12456a) && this.f12457b.equals(aVar.f12457b);
        }

        public final int hashCode() {
            return this.f12457b.hashCode() + (this.f12456a.hashCode() * 31);
        }
    }

    /* JADX INFO: compiled from: SnackbarHost.kt */
    public static final class b implements h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f12458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f12459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f12460c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SnackbarDuration f12461d;

        public b(String str, String str2, boolean z10, SnackbarDuration snackbarDuration) {
            this.f12458a = str;
            this.f12459b = str2;
            this.f12460c = z10;
            this.f12461d = snackbarDuration;
        }

        @Override // androidx.compose.material3.h0
        public final boolean a() {
            return this.f12460c;
        }

        @Override // androidx.compose.material3.h0
        public final String b() {
            return this.f12459b;
        }

        @Override // androidx.compose.material3.h0
        public final SnackbarDuration c() {
            return this.f12461d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.i.a(this.f12458a, bVar.f12458a) && kotlin.jvm.internal.i.a(this.f12459b, bVar.f12459b) && this.f12460c == bVar.f12460c && this.f12461d == bVar.f12461d;
        }

        @Override // androidx.compose.material3.h0
        public final String getMessage() {
            return this.f12458a;
        }

        public final int hashCode() {
            int iHashCode = this.f12458a.hashCode() * 31;
            String str = this.f12459b;
            return this.f12461d.hashCode() + androidx.compose.animation.D.b((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f12460c);
        }
    }

    public static Object b(g0 g0Var, String str, String str2, SnackbarDuration snackbarDuration, kotlin.coroutines.c cVar, int i10) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        g0Var.getClass();
        return g0Var.a(new b(str, str2, false, snackbarDuration), (ContinuationImpl) cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(b bVar, ContinuationImpl continuationImpl) {
        SnackbarHostState$showSnackbar$2 snackbarHostState$showSnackbar$2;
        kotlinx.coroutines.sync.a aVar;
        g0 g0Var;
        h0 h0Var;
        g0 g0Var2;
        Throwable th;
        kotlinx.coroutines.sync.a aVar2;
        if (continuationImpl instanceof SnackbarHostState$showSnackbar$2) {
            snackbarHostState$showSnackbar$2 = (SnackbarHostState$showSnackbar$2) continuationImpl;
            int i10 = snackbarHostState$showSnackbar$2.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                snackbarHostState$showSnackbar$2.label = i10 - Integer.MIN_VALUE;
            } else {
                snackbarHostState$showSnackbar$2 = new SnackbarHostState$showSnackbar$2(this, continuationImpl);
            }
        } else {
            snackbarHostState$showSnackbar$2 = new SnackbarHostState$showSnackbar$2(this, continuationImpl);
        }
        Object obj = snackbarHostState$showSnackbar$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = snackbarHostState$showSnackbar$2.label;
        try {
            try {
                if (i11 == 0) {
                    kotlin.b.b(obj);
                    snackbarHostState$showSnackbar$2.L$0 = this;
                    snackbarHostState$showSnackbar$2.L$1 = bVar;
                    aVar = this.f12454a;
                    snackbarHostState$showSnackbar$2.L$2 = aVar;
                    snackbarHostState$showSnackbar$2.label = 1;
                    if (aVar.f(null, snackbarHostState$showSnackbar$2) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    g0Var = this;
                    h0Var = bVar;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar2 = (kotlinx.coroutines.sync.a) snackbarHostState$showSnackbar$2.L$2;
                        g0Var2 = (g0) snackbarHostState$showSnackbar$2.L$0;
                        try {
                            kotlin.b.b(obj);
                            g0Var2.f12455b.setValue(null);
                            aVar2.g(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            g0Var2.f12455b.setValue(null);
                            throw th;
                        }
                    }
                    kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) snackbarHostState$showSnackbar$2.L$2;
                    h0 h0Var2 = (h0) snackbarHostState$showSnackbar$2.L$1;
                    g0Var = (g0) snackbarHostState$showSnackbar$2.L$0;
                    kotlin.b.b(obj);
                    aVar = aVar3;
                    h0Var = h0Var2;
                }
                snackbarHostState$showSnackbar$2.L$0 = g0Var;
                snackbarHostState$showSnackbar$2.L$1 = h0Var;
                snackbarHostState$showSnackbar$2.L$2 = aVar;
                snackbarHostState$showSnackbar$2.L$3 = snackbarHostState$showSnackbar$2;
                snackbarHostState$showSnackbar$2.label = 2;
                C2693i c2693i = new C2693i(1, A8.p.y(snackbarHostState$showSnackbar$2));
                c2693i.s();
                g0Var.f12455b.setValue(new a(h0Var, c2693i));
                Object objP = c2693i.p();
                if (objP == coroutineSingletons) {
                    return coroutineSingletons;
                }
                g0Var2 = g0Var;
                kotlinx.coroutines.sync.a aVar4 = aVar;
                obj = objP;
                aVar2 = aVar4;
                g0Var2.f12455b.setValue(null);
                aVar2.g(null);
                return obj;
            } catch (Throwable th3) {
                g0Var2 = g0Var;
                th = th3;
                g0Var2.f12455b.setValue(null);
                throw th;
            }
        } catch (Throwable th4) {
            bVar.g(null);
            throw th4;
        }
    }
}
