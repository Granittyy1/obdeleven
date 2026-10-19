package bo.app;

import com.braze.models.outgoing.BrazeProperties;

/* JADX INFO: renamed from: bo.app.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1458b0 extends t6 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f20742f;

    public C1458b0(String str, BrazeProperties brazeProperties, a2 a2Var) {
        super(brazeProperties, a2Var);
        this.f20742f = str;
    }

    @Override // bo.app.x2
    public String d() {
        return "custom_event";
    }

    public String f() {
        return this.f20742f;
    }
}
