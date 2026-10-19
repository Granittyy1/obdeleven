package Y2;

import android.graphics.Bitmap;
import coil.util.k;
import java.io.EOFException;
import java.io.IOException;
import java.util.regex.Pattern;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import okhttp3.o;
import okhttp3.r;
import okhttp3.z;
import p318zb.B;
import p318zb.C;

/* JADX INFO: compiled from: CacheResponse.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f7579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f7580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o f7581f;

    public c(C c10) throws EOFException {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f42973d;
        this.f7576a = kotlin.a.b(lazyThreadSafetyMode, new a(0, this));
        this.f7577b = kotlin.a.b(lazyThreadSafetyMode, new Ia.a() { // from class: Y2.b
            @Override // Ia.a
            public final Object invoke() {
                String strE = this.f7575b.f7581f.e("Content-Type");
                if (strE == null) {
                    return null;
                }
                Pattern pattern = r.f45588d;
                return r.a.b(strE);
            }
        });
        this.f7578c = Long.parseLong(c10.x(Long.MAX_VALUE));
        this.f7579d = Long.parseLong(c10.x(Long.MAX_VALUE));
        this.f7580e = Integer.parseInt(c10.x(Long.MAX_VALUE)) > 0;
        int i10 = Integer.parseInt(c10.x(Long.MAX_VALUE));
        o.a aVar = new o.a();
        for (int i11 = 0; i11 < i10; i11++) {
            String strX = c10.x(Long.MAX_VALUE);
            Bitmap.Config[] configArr = k.f23160a;
            int iP = n.P(strX, ':', 0, false, 6);
            if (iP == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(strX).toString());
            }
            String strSubstring = strX.substring(0, iP);
            i.d(strSubstring, "substring(...)");
            String string = n.p0(strSubstring).toString();
            String strSubstring2 = strX.substring(iP + 1);
            i.d(strSubstring2, "substring(...)");
            aVar.d(string, strSubstring2);
        }
        this.f7581f = aVar.e();
    }

    public final void a(B b10) throws IOException {
        b10.Q0(this.f7578c);
        b10.E(10);
        b10.Q0(this.f7579d);
        b10.E(10);
        b10.Q0(this.f7580e ? 1L : 0L);
        b10.E(10);
        o oVar = this.f7581f;
        b10.Q0(oVar.size());
        b10.E(10);
        int size = oVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            b10.Z(oVar.k(i10));
            b10.Z(": ");
            b10.Z(oVar.v(i10));
            b10.E(10);
        }
    }

    public c(z zVar) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f42973d;
        this.f7576a = kotlin.a.b(lazyThreadSafetyMode, new a(0, this));
        this.f7577b = kotlin.a.b(lazyThreadSafetyMode, new Ia.a() { // from class: Y2.b
            @Override // Ia.a
            public final Object invoke() {
                String strE = this.f7575b.f7581f.e("Content-Type");
                if (strE == null) {
                    return null;
                }
                Pattern pattern = r.f45588d;
                return r.a.b(strE);
            }
        });
        this.f7578c = zVar.f45689l;
        this.f7579d = zVar.f45690m;
        this.f7580e = zVar.f45684f != null;
        this.f7581f = zVar.f45685g;
    }
}
