package Q2;

import androidx.work.BackoffPolicy;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.OverwritingInputMerger;
import androidx.work.WorkInfo$State;

/* JADX INFO: compiled from: WorkSpec.kt */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WorkInfo$State f5037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.work.d f5040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.work.d f5041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f5042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f5043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f5044i;
    public androidx.work.c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f5045k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final BackoffPolicy f5046l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f5047m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f5048n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f5049o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f5050p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f5051q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final OutOfQuotaPolicy f5052r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f5053s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f5054t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f5055u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f5056v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f5057w;

    /* JADX INFO: compiled from: WorkSpec.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f5058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WorkInfo$State f5059b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.i.a(this.f5058a, aVar.f5058a) && this.f5059b == aVar.f5059b;
        }

        public final int hashCode() {
            return this.f5059b.hashCode() + (this.f5058a.hashCode() * 31);
        }

        public final String toString() {
            return "IdAndState(id=" + this.f5058a + ", state=" + this.f5059b + ')';
        }
    }

    static {
        kotlin.jvm.internal.i.d(androidx.work.k.d("WorkSpec"), "tagWithPrefix(\"WorkSpec\")");
    }

    public z(String id, WorkInfo$State state, String workerClassName, String inputMergerClassName, androidx.work.d input, androidx.work.d output, long j, long j10, long j11, androidx.work.c constraints, int i10, BackoffPolicy backoffPolicy, long j12, long j13, long j14, long j15, boolean z10, OutOfQuotaPolicy outOfQuotaPolicy, int i11, int i12, long j16, int i13, int i14) {
        kotlin.jvm.internal.i.e(id, "id");
        kotlin.jvm.internal.i.e(state, "state");
        kotlin.jvm.internal.i.e(workerClassName, "workerClassName");
        kotlin.jvm.internal.i.e(inputMergerClassName, "inputMergerClassName");
        kotlin.jvm.internal.i.e(input, "input");
        kotlin.jvm.internal.i.e(output, "output");
        kotlin.jvm.internal.i.e(constraints, "constraints");
        kotlin.jvm.internal.i.e(backoffPolicy, "backoffPolicy");
        kotlin.jvm.internal.i.e(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.f5036a = id;
        this.f5037b = state;
        this.f5038c = workerClassName;
        this.f5039d = inputMergerClassName;
        this.f5040e = input;
        this.f5041f = output;
        this.f5042g = j;
        this.f5043h = j10;
        this.f5044i = j11;
        this.j = constraints;
        this.f5045k = i10;
        this.f5046l = backoffPolicy;
        this.f5047m = j12;
        this.f5048n = j13;
        this.f5049o = j14;
        this.f5050p = j15;
        this.f5051q = z10;
        this.f5052r = outOfQuotaPolicy;
        this.f5053s = i11;
        this.f5054t = i12;
        this.f5055u = j16;
        this.f5056v = i13;
        this.f5057w = i14;
    }

    public final long a() {
        boolean z10 = this.f5037b == WorkInfo$State.f20306b && this.f5045k > 0;
        long j = this.f5048n;
        boolean zC = c();
        long j10 = this.f5043h;
        long j11 = this.f5055u;
        int i10 = this.f5045k;
        BackoffPolicy backoffPolicy = this.f5046l;
        long j12 = this.f5047m;
        int i11 = this.f5053s;
        long j13 = this.f5042g;
        long j14 = this.f5044i;
        kotlin.jvm.internal.i.e(backoffPolicy, "backoffPolicy");
        long jA = Long.MAX_VALUE;
        if (j11 != Long.MAX_VALUE && zC) {
            return i11 == 0 ? j11 : Na.l.y(j11, j + 900000);
        }
        if (z10) {
            jA = Na.l.A(backoffPolicy == BackoffPolicy.f20288c ? j12 * ((long) i10) : (long) Math.scalb(j12, i10 - 1), 18000000L) + j;
        } else if (zC) {
            long j15 = i11 == 0 ? j + j13 : j + j10;
            jA = (j14 == j10 || i11 != 0) ? j15 : (j10 - j14) + j15;
        } else if (j != -1) {
            jA = j + j13;
        }
        return jA;
    }

    public final boolean b() {
        return !kotlin.jvm.internal.i.a(androidx.work.c.f20340i, this.j);
    }

    public final boolean c() {
        return this.f5043h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return kotlin.jvm.internal.i.a(this.f5036a, zVar.f5036a) && this.f5037b == zVar.f5037b && kotlin.jvm.internal.i.a(this.f5038c, zVar.f5038c) && kotlin.jvm.internal.i.a(this.f5039d, zVar.f5039d) && kotlin.jvm.internal.i.a(this.f5040e, zVar.f5040e) && kotlin.jvm.internal.i.a(this.f5041f, zVar.f5041f) && this.f5042g == zVar.f5042g && this.f5043h == zVar.f5043h && this.f5044i == zVar.f5044i && kotlin.jvm.internal.i.a(this.j, zVar.j) && this.f5045k == zVar.f5045k && this.f5046l == zVar.f5046l && this.f5047m == zVar.f5047m && this.f5048n == zVar.f5048n && this.f5049o == zVar.f5049o && this.f5050p == zVar.f5050p && this.f5051q == zVar.f5051q && this.f5052r == zVar.f5052r && this.f5053s == zVar.f5053s && this.f5054t == zVar.f5054t && this.f5055u == zVar.f5055u && this.f5056v == zVar.f5056v && this.f5057w == zVar.f5057w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r2v24, types: [int] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    public final int hashCode() {
        int iC = C4.b.c(this.f5050p, C4.b.c(this.f5049o, C4.b.c(this.f5048n, C4.b.c(this.f5047m, (this.f5046l.hashCode() + p005a4.q.b(this.f5045k, (this.j.hashCode() + C4.b.c(this.f5044i, C4.b.c(this.f5043h, C4.b.c(this.f5042g, (this.f5041f.hashCode() + ((this.f5040e.hashCode() + B1.a.b(this.f5039d, B1.a.b(this.f5038c, (this.f5037b.hashCode() + (this.f5036a.hashCode() * 31)) * 31, 31), 31)) * 31)) * 31, 31), 31), 31)) * 31, 31)) * 31, 31), 31), 31), 31);
        boolean z10 = this.f5051q;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return Integer.hashCode(this.f5057w) + p005a4.q.b(this.f5056v, C4.b.c(this.f5055u, p005a4.q.b(this.f5054t, p005a4.q.b(this.f5053s, (this.f5052r.hashCode() + ((iC + r10) * 31)) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return B7.b.g(new StringBuilder("{WorkSpec: "), this.f5036a, '}');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ z(String str, WorkInfo$State workInfo$State, String str2, String str3, androidx.work.d dVar, androidx.work.d dVar2, long j, long j10, long j11, androidx.work.c cVar, int i10, BackoffPolicy backoffPolicy, long j12, long j13, long j14, long j15, boolean z10, OutOfQuotaPolicy outOfQuotaPolicy, int i11, long j16, int i12, int i13, int i14) {
        androidx.work.d dVar3;
        androidx.work.d dVar4;
        WorkInfo$State workInfo$State2 = (i14 & 2) != 0 ? WorkInfo$State.f20306b : workInfo$State;
        String name = (i14 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3;
        if ((i14 & 16) != 0) {
            androidx.work.d EMPTY = androidx.work.d.f20352c;
            kotlin.jvm.internal.i.d(EMPTY, "EMPTY");
            dVar3 = EMPTY;
        } else {
            dVar3 = dVar;
        }
        if ((i14 & 32) != 0) {
            androidx.work.d EMPTY2 = androidx.work.d.f20352c;
            kotlin.jvm.internal.i.d(EMPTY2, "EMPTY");
            dVar4 = EMPTY2;
        } else {
            dVar4 = dVar2;
        }
        this(str, workInfo$State2, str2, name, dVar3, dVar4, (i14 & 64) != 0 ? 0L : j, (i14 & 128) != 0 ? 0L : j10, (i14 & 256) != 0 ? 0L : j11, (i14 & 512) != 0 ? androidx.work.c.f20340i : cVar, (i14 & 1024) != 0 ? 0 : i10, (i14 & 2048) != 0 ? BackoffPolicy.f20287b : backoffPolicy, (i14 & 4096) != 0 ? 30000L : j12, (i14 & 8192) != 0 ? -1L : j13, (i14 & 16384) != 0 ? 0L : j14, (32768 & i14) != 0 ? -1L : j15, (65536 & i14) != 0 ? false : z10, (131072 & i14) != 0 ? OutOfQuotaPolicy.f20303b : outOfQuotaPolicy, (262144 & i14) != 0 ? 0 : i11, 0, (1048576 & i14) != 0 ? Long.MAX_VALUE : j16, (2097152 & i14) != 0 ? 0 : i12, (i14 & 4194304) != 0 ? -256 : i13);
    }
}
