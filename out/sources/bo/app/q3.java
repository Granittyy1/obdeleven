package bo.app;

import com.braze.support.DateTimeUtils;

/* JADX INFO: loaded from: classes.dex */
public final class q3 extends t5 {
    public /* synthetic */ q3(v5 v5Var, double d10, Double d11, boolean z10, int i10, kotlin.jvm.internal.e eVar) {
        this((i10 & 1) != 0 ? v5.f22077d.a() : v5Var, (i10 & 2) != 0 ? DateTimeUtils.nowInSecondsPrecise() : d10, (i10 & 4) != 0 ? null : d11, (i10 & 8) != 0 ? false : z10);
    }

    public final void A() {
        a(true);
        a(Double.valueOf(DateTimeUtils.nowInSecondsPrecise()));
    }

    @Override // bo.app.t5
    public void a(Double d10) {
        super.a(d10);
    }

    @Override // bo.app.t5
    public String toString() {
        return "\nMutableSession(sessionId=" + s() + ", startTime=" + x() + ", endTime=" + w() + ", isSealed=" + y() + ", duration=" + v() + ')';
    }

    @Override // bo.app.t5
    public Double w() {
        return super.w();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(v5 sessionId, double d10, Double d11, boolean z10) {
        super(sessionId, d10, d11, z10);
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
    }
}
