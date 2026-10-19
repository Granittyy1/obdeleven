package bo.app;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class y0 implements q2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f22231e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k2 f22232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c2 f22233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f22235d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d2 f22236b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d2 d2Var) {
            super(0);
            this.f22236b = d2Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Short circuiting execution of network request (" + this.f22236b.hashCode() + ") and immediately marking it as succeeded.";
        }
    }

    public y0(k2 internalEventPublisher, c2 brazeManager, boolean z10) {
        kotlin.jvm.internal.i.e(internalEventPublisher, "internalEventPublisher");
        kotlin.jvm.internal.i.e(brazeManager, "brazeManager");
        this.f22232a = internalEventPublisher;
        this.f22233b = brazeManager;
        this.f22234c = z10;
        this.f22235d = new ArrayList();
    }

    @Override // bo.app.q2
    public void a(e5 requestInfo, c5.c requestDispatchCallback, boolean z10) {
        kotlin.jvm.internal.i.e(requestInfo, "requestInfo");
        kotlin.jvm.internal.i.e(requestDispatchCallback, "requestDispatchCallback");
        d2 d2VarB = requestInfo.b();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new b(d2VarB), 3, (Object) null);
        d4 d4Var = new d4(d2VarB, new l2.a(201, kotlin.collections.y.p(), null, 4, null), this.f22233b);
        k2 k2Var = this.f22232a;
        d2VarB.a(k2Var, k2Var, d4Var);
        d2VarB.b(this.f22232a);
        requestDispatchCallback.a(d4Var);
        this.f22232a.a(new q0(d2VarB), q0.class);
    }

    public /* synthetic */ y0(k2 k2Var, c2 c2Var, boolean z10, int i10, kotlin.jvm.internal.e eVar) {
        this(k2Var, c2Var, (i10 & 4) != 0 ? false : z10);
    }
}
