package p019b6;

import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.integrity.internal.af;
import com.google.android.play.integrity.internal.w;
import java.util.Objects;
import p191p5.h;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class n extends w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f20590c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, h hVar) {
        super(hVar);
        Objects.requireNonNull(oVar);
        this.f20590c = oVar;
    }

    @Override // com.google.android.play.integrity.internal.w
    public final void a(Exception exc) {
        if (!(exc instanceof af)) {
            super.a(exc);
        } else if (o.d(this.f20590c)) {
            super.a(new StandardIntegrityException(-2, false, exc));
        } else {
            super.a(new StandardIntegrityException(-9, false, exc));
        }
    }
}
