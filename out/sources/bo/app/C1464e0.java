package bo.app;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: bo.app.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1464e0 extends a1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f20887l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f20888m = BrazeLogger.getBrazeLogTag((Class<?>) C1464e0.class);

    /* JADX INFO: renamed from: bo.app.e0$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: bo.app.e0$b */
    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Cb.a.e(Long.valueOf(((e5) obj).a()), Long.valueOf(((e5) obj2).a()));
        }
    }

    /* JADX INFO: renamed from: bo.app.e0$c */
    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e5 f20889b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f20890c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e5 f20891d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e5 e5Var, long j, e5 e5Var2) {
            super(0);
            this.f20889b = e5Var;
            this.f20890c = j;
            this.f20891d = e5Var2;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Batched request " + this.f20889b.b(this.f20890c) + " and combined into " + this.f20891d.b(this.f20890c);
        }
    }

    /* JADX INFO: renamed from: bo.app.e0$d */
    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1468g0 f20892b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e5 f20893c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C1468g0 c1468g0, e5 e5Var) {
            super(0);
            this.f20892b = c1468g0;
            this.f20893c = e5Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Could not merge other request: " + this.f20892b + " into parent: " + this.f20893c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1464e0(o0 dispatchDataProvider) {
        super(d2.a.V3_DATA, dispatchDataProvider);
        kotlin.jvm.internal.i.e(dispatchDataProvider, "dispatchDataProvider");
    }

    @Override // bo.app.a1
    public void a(long j) {
        List listE = e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listE) {
            e5 e5Var = (e5) obj;
            if (e5Var.c() == f5.PENDING_START || e5Var.c() == f5.PENDING_RETRY) {
                arrayList.add(obj);
            }
        }
        List listH0 = kotlin.collections.q.h0(arrayList, new b());
        int size = listH0.size();
        if (size < 2) {
            return;
        }
        a(j, (e5) kotlin.collections.q.O(listH0), listH0.subList(1, size));
    }

    private final void a(long j, e5 e5Var, List list) {
        d2 d2VarB = e5Var != null ? e5Var.b() : null;
        C1468g0 c1468g0 = d2VarB instanceof C1468g0 ? (C1468g0) d2VarB : null;
        if (c1468g0 == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e5 e5Var2 = (e5) it.next();
            d2 d2VarB2 = e5Var2.b();
            C1468g0 c1468g1 = d2VarB2 instanceof C1468g0 ? (C1468g0) d2VarB2 : null;
            if (c1468g0.a(c1468g1)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f20888m, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new c(e5Var2, j, e5Var), 6, (Object) null);
                e5Var2.a(j, f5.BATCHED);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new d(c1468g1, e5Var), 3, (Object) null);
            }
        }
    }
}
