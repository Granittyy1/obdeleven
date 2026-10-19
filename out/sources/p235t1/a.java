package p235t1;

import A1.C0574i;
import A1.p;
import A1.t;
import android.net.Uri;
import androidx.compose.animation.D;
import androidx.media3.exoplayer.source.UnrecognizedInputFormatException;
import androidx.media3.exoplayer.source.k;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.voltasit.obdeleven.domain.usecases.user.C2126g;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import p140l1.d;
import p241t7.b;

/* JADX INFO: compiled from: BundledExtractorsAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f47000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f47001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0574i f47002c;

    public a(t tVar) {
        this.f47000a = tVar;
    }

    public final long a() {
        C0574i c0574i = this.f47002c;
        if (c0574i != null) {
            return c0574i.f523d;
        }
        return -1L;
    }

    public final void b(d dVar, Uri uri, Map map, long j, long j10, k kVar) throws IOException {
        boolean z10;
        C0574i c0574i = new C0574i(dVar, j, j10);
        this.f47002c = c0574i;
        if (this.f47001b != null) {
            return;
        }
        p[] pVarArrD = this.f47000a.d(uri, map);
        ImmutableList.a aVarC = ImmutableList.C(pVarArrD.length);
        boolean z11 = true;
        if (pVarArrD.length == 1) {
            this.f47001b = pVarArrD[0];
        } else {
            for (p pVar : pVarArrD) {
                try {
                    if (pVar.l(c0574i)) {
                        this.f47001b = pVar;
                        c0574i.f525f = 0;
                        break;
                    } else {
                        aVarC.f(pVar.g());
                        z10 = this.f47001b != null || c0574i.f523d == j;
                    }
                } catch (EOFException unused) {
                    z10 = this.f47001b != null || c0574i.f523d == j;
                } catch (Throwable th) {
                    if (this.f47001b == null && c0574i.f523d != j) {
                        z11 = false;
                    }
                    b.k(z11);
                    c0574i.f525f = 0;
                    throw th;
                }
                b.k(z10);
                c0574i.f525f = 0;
            }
            if (this.f47001b == null) {
                StringBuilder sb2 = new StringBuilder("None of the available extractors (");
                C2126g c2126g = new C2126g(", ");
                Iterator it = Lists.b(ImmutableList.I(pVarArrD), new D(7)).iterator();
                StringBuilder sb3 = new StringBuilder();
                c2126g.a(sb3, it);
                sb2.append(sb3.toString());
                sb2.append(") could read the stream.");
                String string = sb2.toString();
                uri.getClass();
                throw new UnrecognizedInputFormatException(string, uri, aVarC.h());
            }
        }
        this.f47001b.m(kVar);
    }
}
