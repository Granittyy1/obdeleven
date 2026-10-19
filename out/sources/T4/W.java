package T4;

import S4.C0760b;
import U4.AbstractC0794b;
import U4.InterfaceC0800h;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class W implements AbstractC0794b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.common.api.a.e f5904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0768a f5905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC0800h f5906c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f5907d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5908e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0771d f5909f;

    public W(C0771d c0771d, com.google.android.gms.common.api.a.e eVar, C0768a c0768a) {
        this.f5909f = c0771d;
        this.f5904a = eVar;
        this.f5905b = c0768a;
    }

    @Override // U4.AbstractC0794b.c
    public final void a(C0760b c0760b) {
        this.f5909f.f5941n.post(new V(this, c0760b));
    }

    public final void b(C0760b c0760b) {
        T t8 = (T) this.f5909f.f5938k.get(this.f5905b);
        if (t8 != null) {
            t8.p(c0760b);
        }
    }
}
