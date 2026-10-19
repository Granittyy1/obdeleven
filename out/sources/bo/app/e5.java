package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class e5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d2 f20907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f20908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f20909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f5 f20910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f20911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20912f;

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f5 f20914c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f20915d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f5 f5Var, long j) {
            super(0);
            this.f20914c = f5Var;
            this.f20915d = j;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Moving from " + e5.this.c() + " -> " + this.f20914c + " with time " + this.f20915d + " for \n" + e5.this.b(this.f20915d);
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f20917c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j) {
            super(0);
            this.f20917c = j;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Moving to pending retry.Updated retry count: " + e5.this.d() + " for: \n" + e5.this.b(this.f20917c);
        }
    }

    public e5(d2 request, long j, long j10, f5 state) {
        kotlin.jvm.internal.i.e(request, "request");
        kotlin.jvm.internal.i.e(state, "state");
        this.f20907a = request;
        this.f20908b = j;
        this.f20909c = j10;
        this.f20910d = state;
        this.f20911e = j10;
    }

    public final long a() {
        return this.f20908b;
    }

    public final d2 b() {
        return this.f20907a;
    }

    public final f5 c() {
        return this.f20910d;
    }

    public final int d() {
        return this.f20912f;
    }

    public final void a(long j) {
        this.f20908b = j;
    }

    public final String b(long j) {
        return kotlin.text.i.w("\n            |RequestInfo for " + this.f20907a.hashCode() + " \n            | at " + j + "\n            | request.target = " + this.f20907a.f() + "\n            | nextAdvance = " + (this.f20908b - j) + "\n            | createdAt = " + (this.f20909c - j) + "\n            | state = " + this.f20910d + "\n            | lastStateMovedAt = " + (this.f20911e - j) + "\n            | timesMovedToRetry = " + this.f20912f + "\n        ");
    }

    public final void a(int i10) {
        this.f20912f = i10;
    }

    public final void a(long j, f5 newState) {
        kotlin.jvm.internal.i.e(newState, "newState");
        if (this.f20910d != newState) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.V;
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new a(newState, j), 2, (Object) null);
            this.f20911e = j;
            this.f20910d = newState;
            if (newState == f5.PENDING_RETRY) {
                this.f20912f++;
                BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new b(j), 2, (Object) null);
            }
        }
    }

    public /* synthetic */ e5(d2 d2Var, long j, long j10, f5 f5Var, int i10, kotlin.jvm.internal.e eVar) {
        this(d2Var, j, j10, (i10 & 8) != 0 ? f5.PENDING_START : f5Var);
    }
}
