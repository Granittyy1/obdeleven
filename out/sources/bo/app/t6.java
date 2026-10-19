package bo.app;

import com.braze.models.outgoing.BrazeProperties;

/* JADX INFO: loaded from: classes.dex */
public abstract class t6 extends r6 implements z2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BrazeProperties f21970e;

    public t6(BrazeProperties brazeProperties, a2 a2Var) {
        super(a2Var);
        this.f21970e = brazeProperties;
    }

    @Override // bo.app.z2
    public BrazeProperties c() {
        return this.f21970e;
    }
}
