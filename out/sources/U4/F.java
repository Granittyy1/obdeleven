package U4;

import S4.C0760b;
import android.app.PendingIntent;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class F extends O {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f6354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC0794b f6355f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(AbstractC0794b abstractC0794b, int i10, Bundle bundle) {
        super(abstractC0794b);
        Objects.requireNonNull(abstractC0794b);
        this.f6355f = abstractC0794b;
        this.f6353d = i10;
        this.f6354e = bundle;
    }

    @Override // U4.O
    public final void a(Boolean bool) {
        AbstractC0794b abstractC0794b = this.f6355f;
        int i10 = this.f6353d;
        if (i10 != 0) {
            abstractC0794b.H(1, null);
            Bundle bundle = this.f6354e;
            c(new C0760b(i10, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
        } else {
            if (b()) {
                return;
            }
            abstractC0794b.H(1, null);
            c(new C0760b(8, null, null));
        }
    }

    public abstract boolean b();

    public abstract void c(C0760b c0760b);
}
