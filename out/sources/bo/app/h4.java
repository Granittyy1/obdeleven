package bo.app;

import com.braze.models.outgoing.BrazeProperties;

/* JADX INFO: loaded from: classes.dex */
public class h4 extends t6 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f21181f;

    public h4(String str, BrazeProperties brazeProperties, a2 a2Var) {
        super(brazeProperties, a2Var);
        this.f21181f = str;
    }

    @Override // bo.app.x2
    public String d() {
        return "purchase";
    }

    public String f() {
        return this.f21181f;
    }
}
