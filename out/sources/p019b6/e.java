package p019b6;

import android.text.TextUtils;
import androidx.compose.foundation.lazy.staggeredgrid.u;
import com.google.android.play.integrity.internal.d;
import com.google.android.play.integrity.internal.z;
import p191p5.g;
import p191p5.h;
import p191p5.j;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f20567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f20568b;

    public e(o oVar, t tVar) {
        this.f20567a = oVar;
        this.f20568b = tVar;
    }

    @Override // p019b6.a
    public final g a(u uVar) {
        if (!TextUtils.isEmpty(null)) {
            try {
                return j.e(new s(this.f20568b, uVar.f20605a, Long.parseLong(null), 0));
            } catch (NumberFormatException e10) {
                return j.d(e10);
            }
        }
        long j = uVar.f20605a;
        Object[] objArr = {Long.valueOf(j)};
        o oVar = this.f20567a;
        oVar.f20591a.b("warmUpIntegrityToken(%s)", objArr);
        h hVar = new h();
        i iVar = new i(oVar, hVar, 0, j, hVar);
        d dVar = oVar.f20595e;
        dVar.getClass();
        dVar.a().post(new z(dVar, hVar, hVar, iVar));
        return hVar.f45811a.q(new u(this, uVar));
    }
}
