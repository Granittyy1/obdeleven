package bo.app;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class g6 extends a1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final z1 f21149l;

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e5 f21150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f21151c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e5 e5Var, long j) {
            super(0);
            this.f21150b = e5Var;
            this.f21151c = j;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Template request will expire before send time and is not eligible for a request retry. Not retrying or performing any fallback triggers. " + this.f21150b.b(this.f21151c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(o0 dispatchDataProvider) {
        super(d2.a.TEMPLATE_REQUEST, dispatchDataProvider);
        kotlin.jvm.internal.i.e(dispatchDataProvider, "dispatchDataProvider");
        this.f21149l = new k1((int) TimeUnit.MINUTES.toMillis(1L), 0, dispatchDataProvider.i().k(), dispatchDataProvider.i().l(), 2, null);
    }

    @Override // bo.app.a1
    public z1 a() {
        return this.f21149l;
    }

    @Override // bo.app.a1
    public void a(long j) {
        List listE = e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listE) {
            e5 e5Var = (e5) obj;
            if (e5Var.c() == f5.PENDING_RETRY || e5Var.c() == f5.PENDING_START) {
                arrayList.add(obj);
            }
        }
        ArrayList<e5> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            e5 e5Var2 = (e5) obj2;
            d2 d2VarB = e5Var2.b();
            h6 h6Var = d2VarB instanceof h6 ? (h6) d2VarB : null;
            if ((h6Var != null ? h6Var.m() : -1L) < e5Var2.a()) {
                arrayList2.add(obj2);
            }
        }
        for (e5 e5Var3 : arrayList2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a(e5Var3, j), 3, (Object) null);
            e5Var3.a(j, f5.COMPLETE);
        }
    }
}
