package U4;

import S4.C0760b;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class T extends F {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC0794b f6372g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(AbstractC0794b abstractC0794b, int i10, Bundle bundle) {
        super(abstractC0794b, i10, bundle);
        Objects.requireNonNull(abstractC0794b);
        this.f6372g = abstractC0794b;
    }

    @Override // U4.F
    public final boolean b() {
        this.f6372g.f6406p.a(C0760b.f5525g);
        return true;
    }

    @Override // U4.F
    public final void c(C0760b c0760b) {
        AbstractC0794b abstractC0794b = this.f6372g;
        abstractC0794b.getClass();
        abstractC0794b.f6406p.a(c0760b);
        abstractC0794b.f6396e = c0760b.f5527c;
        abstractC0794b.f6397f = System.currentTimeMillis();
    }
}
