package bo.app;

import com.braze.support.BrazeLogger;
import com.google.android.gms.internal.measurement.M1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C2702l0;
import kotlinx.coroutines.InterfaceC2713x;

/* JADX INFO: loaded from: classes.dex */
public final class o5 implements kotlinx.coroutines.A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o5 f21705a = new o5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static k2 f21706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final InterfaceC2713x f21707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final kotlinx.coroutines.Y f21708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final kotlin.coroutines.e f21709e;

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f21710b = new a();

        public a() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cancelling children of SerialCoroutineScope";
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f21711b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(0);
            this.f21711b = th;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Child job of SerialCoroutineScope got exception: " + this.f21711b;
        }
    }

    public static final class c extends kotlin.coroutines.a implements InterfaceC2713x {
        public c(InterfaceC2713x.a aVar) {
            super(aVar);
        }

        @Override // kotlinx.coroutines.InterfaceC2713x
        public void handleException(kotlin.coroutines.e eVar, Throwable th) {
            try {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                o5 o5Var = o5.f21705a;
                brazeLogger.brazelog(o5Var, BrazeLogger.Priority.E, th, new b(th));
                k2 k2VarB = o5Var.b();
                if (k2VarB != null) {
                    k2VarB.a(th, Throwable.class);
                }
            } catch (Exception unused) {
            }
        }
    }

    static {
        c cVar = new c(InterfaceC2713x.a.f43616b);
        f21707c = cVar;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        kotlin.jvm.internal.i.d(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor()");
        kotlinx.coroutines.Z z10 = new kotlinx.coroutines.Z(executorServiceNewSingleThreadExecutor);
        f21708d = z10;
        f21709e = z10.plus(cVar).plus(M1.a());
    }

    private o5() {
    }

    public final void a(k2 k2Var) {
        f21706b = k2Var;
    }

    public final k2 b() {
        return f21706b;
    }

    @Override // kotlinx.coroutines.A
    public kotlin.coroutines.e getCoroutineContext() {
        return f21709e;
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, a.f21710b, 2, (Object) null);
        C2702l0.d(getCoroutineContext());
    }
}
