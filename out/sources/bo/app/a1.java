package bo.app;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public abstract class a1 {
    public static final a j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f20693k = BrazeLogger.getBrazeLogTag((Class<?>) a1.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d2.a f20694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o0 f20695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f20696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f20697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private r2 f20698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f20699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f20700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f20701h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final z1 f20702i;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20703a;

        static {
            int[] iArr = new int[d2.a.values().length];
            try {
                iArr[d2.a.V3_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d2.a.CONTENT_CARD_SYNC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f20703a = iArr;
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f20705c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j) {
            super(0);
            this.f20705c = j;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Added request now to queue " + a1.this.d(this.f20705c);
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e5 f20706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f20707c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f20708d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e5 e5Var, long j, int i10) {
            super(0);
            this.f20706b = e5Var;
            this.f20707c = j;
            this.f20708d = i10;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Set retry count for " + this.f20706b.b(this.f20707c) + " to " + this.f20708d;
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e5 f20709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f20710c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e5 e5Var, long j) {
            super(0);
            this.f20709b = e5Var;
            this.f20710c = j;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Marking request as framework complete \n" + this.f20709b.b(this.f20710c);
        }
    }

    public static final class f implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Cb.a.e(Long.valueOf(((e5) obj).a()), Long.valueOf(((e5) obj2).a()));
        }
    }

    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e5 f20711b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e5 e5Var) {
            super(0);
            this.f20711b = e5Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "About to batch request " + this.f20711b;
        }
    }

    public static final class h extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f20713c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(long j) {
            super(0);
            this.f20713c = j;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "New state after request error " + a1.this.d(this.f20713c);
        }
    }

    public static final class i extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f20715c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(long j) {
            super(0);
            this.f20715c = j;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "New state after request success\n" + a1.this.d(this.f20715c);
        }
    }

    public static final class j extends Lambda implements Ia.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f20716b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(long j) {
            super(1);
            this.f20716b = j;
        }

        @Override // Ia.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(e5 it) {
            kotlin.jvm.internal.i.e(it, "it");
            return it.b(this.f20716b);
        }
    }

    public a1(d2.a destination, o0 dispatchDataProvider) {
        kotlin.jvm.internal.i.e(destination, "destination");
        kotlin.jvm.internal.i.e(dispatchDataProvider, "dispatchDataProvider");
        this.f20694a = destination;
        this.f20695b = dispatchDataProvider;
        this.f20699f = new ArrayList();
        int i10 = b.f20703a[destination.ordinal()];
        this.f20701h = i10 != 1 ? i10 != 2 ? 0L : 25L : 75L;
        this.f20702i = new k1(f().j(), 0, f().k(), f().l(), 2, null);
    }

    private final k2 c() {
        return this.f20695b.f();
    }

    private final r5 f() {
        return this.f20695b.j().n();
    }

    public z1 a() {
        return this.f20702i;
    }

    public abstract void a(long j10);

    public final long b() {
        return this.f20700g;
    }

    public long d() {
        return this.f20701h;
    }

    public final List e() {
        return this.f20699f;
    }

    public final void a(long j10, d2 request) {
        kotlin.jvm.internal.i.e(request, "request");
        request.a(c());
        this.f20699f.add(new e5(request, d() + j10, j10, null, 8, null));
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new c(j10), 3, (Object) null);
    }

    public final void b(long j10) {
        a(j10);
        List list = this.f20699f;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((e5) obj).c() == f5.BATCHED) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            int iD = ((e5) it.next()).d();
            while (it.hasNext()) {
                int iD2 = ((e5) it.next()).d();
                if (iD < iD2) {
                    iD = iD2;
                }
            }
            List list2 = this.f20699f;
            ArrayList<e5> arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                e5 e5Var = (e5) obj2;
                if (e5Var.c() == f5.PENDING_START || e5Var.c() == f5.PENDING_RETRY) {
                    arrayList2.add(obj2);
                }
            }
            for (e5 e5Var2 : arrayList2) {
                e5Var2.a(iD);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new d(e5Var2, j10, iD), 3, (Object) null);
            }
        }
        ArrayList<e5> arrayList3 = new ArrayList();
        List list3 = this.f20699f;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : list3) {
            e5 e5Var3 = (e5) obj3;
            if (e5Var3.c() == f5.BATCHED || e5Var3.c() == f5.COMPLETE) {
                arrayList4.add(obj3);
            }
        }
        arrayList3.addAll(arrayList4);
        List list4 = this.f20699f;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj4 : list4) {
            e5 e5Var4 = (e5) obj4;
            if (e5Var4.d() >= 15 && (e5Var4.c() == f5.PENDING_RETRY || e5Var4.c() == f5.PENDING_START)) {
                arrayList5.add(obj4);
            }
        }
        arrayList3.addAll(arrayList5);
        for (e5 e5Var5 : arrayList3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f20693k, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new e(e5Var5, j10), 6, (Object) null);
            e5Var5.b().b(c());
        }
        this.f20699f.removeAll(arrayList3);
    }

    public final void c(long j10) {
        List list = this.f20699f;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            e5 e5Var = (e5) obj;
            if (e5Var.c() == f5.PENDING_START || e5Var.c() == f5.PENDING_RETRY) {
                arrayList.add(obj);
            }
        }
        List listH0 = kotlin.collections.q.h0(arrayList, new f());
        if (listH0.size() >= 2) {
            int size = listH0.size();
            for (int i10 = 1; i10 < size; i10++) {
                e5 e5Var2 = (e5) listH0.get(i10);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f20693k, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new g(e5Var2), 6, (Object) null);
                e5Var2.a(j10, f5.BATCHED);
            }
        }
    }

    public final String d(long j10) {
        return kotlin.text.i.w("\n            |EndpointQueue: " + this.f20694a + "\n            |   lastFailureAt = " + (this.f20696c - j10) + "\n            |   lastSuccessAt = " + (this.f20697d - j10) + "\n            |   failureBackoffUntil = " + (this.f20700g - j10) + "\n            |   lastResponseError = " + this.f20698e + "\n            |   pendingWaitDuration = " + d() + "\n            |   requestInfoQueue: \n            |" + kotlin.collections.q.U(this.f20699f, "\n\n", null, null, new j(j10), 30) + "\n        ");
    }

    public void a(long j10, e5 requestInfo, AbstractC1461d apiResponse) {
        kotlin.jvm.internal.i.e(requestInfo, "requestInfo");
        kotlin.jvm.internal.i.e(apiResponse, "apiResponse");
        Long lB = apiResponse.b();
        long jLongValue = lB != null ? lB.longValue() : 0L;
        this.f20696c = j10;
        d4 d4Var = apiResponse instanceof d4 ? (d4) apiResponse : null;
        this.f20698e = d4Var != null ? d4Var.e() : null;
        this.f20700g = jLongValue + j10 + ((long) a().a());
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f20693k, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new h(j10), 6, (Object) null);
    }

    public void a(long j10, e5 requestInfo, d4 apiResponse) {
        kotlin.jvm.internal.i.e(requestInfo, "requestInfo");
        kotlin.jvm.internal.i.e(apiResponse, "apiResponse");
        a().b();
        this.f20697d = j10;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f20693k, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new i(j10), 6, (Object) null);
    }
}
