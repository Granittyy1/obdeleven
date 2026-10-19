package T4;

import S4.C0760b;
import U4.C0795c;
import android.content.Context;
import android.os.Bundle;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends p166n5.d implements com.google.android.gms.common.api.d.a, com.google.android.gms.common.api.d.b {
    public static final p156m5.b j = p156m5.e.f44597a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f5951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e5.h f5952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p156m5.b f5953e = j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f5954f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0795c f5955g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p156m5.f f5956h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public W f5957i;

    public g0(Context context, e5.h hVar, C0795c c0795c) {
        this.f5951c = context;
        this.f5952d = hVar;
        this.f5955g = c0795c;
        this.f5954f = c0795c.f6425b;
    }

    @Override // p166n5.f
    public final void U(p166n5.l lVar) {
        this.f5952d.post(new P2.a(this, 1, lVar));
    }

    @Override // T4.InterfaceC0770c
    public final void b0(Bundle bundle) {
        this.f5956h.j(this);
    }

    @Override // T4.InterfaceC0770c
    public final void e(int i10) {
        W w3 = this.f5957i;
        T t8 = (T) w3.f5909f.f5938k.get(w3.f5905b);
        if (t8 != null) {
            if (t8.f5895k) {
                t8.p(new C0760b(17, null, null));
            } else {
                t8.e(i10);
            }
        }
    }

    @Override // T4.InterfaceC0776i
    public final void g(C0760b c0760b) {
        this.f5957i.b(c0760b);
    }
}
