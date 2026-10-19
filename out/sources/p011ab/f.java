package p011ab;

import Ia.a;
import io.intercom.android.sdk.helpcenter.articles.ReactionsComponentKt;
import p111ia.c;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8104c;

    public /* synthetic */ f(int i10, Object obj) {
        this.f8103b = i10;
        this.f8104c = obj;
    }

    @Override // Ia.a
    public final Object invoke() {
        switch (this.f8103b) {
            case 0:
                h hVar = (h) this.f8104c;
                return Integer.valueOf(c.f(hVar, hVar.f8116k));
            default:
                return ReactionsComponentKt.ReactionsComponent$lambda$13$lambda$12$lambda$7$lambda$6((a) this.f8104c);
        }
    }
}
