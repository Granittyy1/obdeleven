package Y2;

import io.intercom.android.sdk.post.PostActivityV2;
import okhttp3.C2753d;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7574c;

    public /* synthetic */ a(int i10, Object obj) {
        this.f7573b = i10;
        this.f7574c = obj;
    }

    @Override // Ia.a
    public final Object invoke() {
        Object obj = this.f7574c;
        switch (this.f7573b) {
            case 0:
                C2753d c2753d = C2753d.f45335n;
                return C2753d.b.a(((c) obj).f7581f);
            default:
                return PostActivityV2.timeFormatter_delegate$lambda$2((PostActivityV2) obj);
        }
    }
}
