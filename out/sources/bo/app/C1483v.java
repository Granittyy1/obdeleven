package bo.app;

/* JADX INFO: renamed from: bo.app.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1483v extends a1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1483v(o0 dispatchDataProvider) {
        super(d2.a.CONTENT_CARD_SYNC, dispatchDataProvider);
        kotlin.jvm.internal.i.e(dispatchDataProvider, "dispatchDataProvider");
    }

    @Override // bo.app.a1
    public void a(long j) {
        c(j);
    }

    @Override // bo.app.a1
    public void a(long j, e5 requestInfo, d4 apiResponse) {
        kotlin.jvm.internal.i.e(requestInfo, "requestInfo");
        kotlin.jvm.internal.i.e(apiResponse, "apiResponse");
        super.a(j, requestInfo, apiResponse);
        Long lB = apiResponse.b();
        if (lB != null) {
            requestInfo.a(lB.longValue() + j);
            requestInfo.a(j, f5.PENDING_RETRY);
            d2 d2VarB = requestInfo.b();
            C1487z c1487z = d2VarB instanceof C1487z ? (C1487z) d2VarB : null;
            if (c1487z == null) {
                return;
            }
            c1487z.a(requestInfo.d());
        }
    }
}
