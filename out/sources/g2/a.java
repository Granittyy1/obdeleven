package g2;

import X1.l;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import p114j1.A;
import p114j1.r;

/* JADX INFO: compiled from: Mp4WebvttParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f35498a = new r();

    @Override // X1.l
    public final void a(byte[] bArr, int i10, int i11, l.b bVar, p114j1.f<X1.c> fVar) {
        p102i1.a aVarA;
        r rVar = this.f35498a;
        rVar.E(i10 + i11, bArr);
        rVar.G(i10);
        ArrayList arrayList = new ArrayList();
        while (rVar.a() > 0) {
            p241t7.b.d("Incomplete Mp4Webvtt Top Level box header found.", rVar.a() >= 8);
            int iH = rVar.h();
            if (rVar.h() == 1987343459) {
                int i12 = iH - 8;
                CharSequence charSequenceF = null;
                p102i1.a.C0382a c0382aA = null;
                while (i12 > 0) {
                    p241t7.b.d("Incomplete vtt cue box header found.", i12 >= 8);
                    int iH2 = rVar.h();
                    int iH3 = rVar.h();
                    int i13 = iH2 - 8;
                    byte[] bArr2 = rVar.f41062a;
                    int i14 = rVar.f41063b;
                    int i15 = A.f40996a;
                    String str = new String(bArr2, i14, i13, StandardCharsets.UTF_8);
                    rVar.H(i13);
                    i12 = (i12 - 8) - i13;
                    if (iH3 == 1937011815) {
                        e.d dVar = new e.d();
                        e.e(str, dVar);
                        c0382aA = dVar.a();
                    } else if (iH3 == 1885436268) {
                        charSequenceF = e.f(null, str.trim(), Collections.emptyList());
                    }
                }
                if (charSequenceF == null) {
                    charSequenceF = "";
                }
                if (c0382aA != null) {
                    c0382aA.f36527a = charSequenceF;
                    aVarA = c0382aA.a();
                } else {
                    Pattern pattern = e.f35522a;
                    e.d dVar2 = new e.d();
                    dVar2.f35537c = charSequenceF;
                    aVarA = dVar2.a().a();
                }
                arrayList.add(aVarA);
            } else {
                rVar.H(iH - 8);
            }
        }
        fVar.a(new X1.c(-9223372036854775807L, -9223372036854775807L, arrayList));
    }
}
