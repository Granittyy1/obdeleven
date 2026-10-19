package p103i2;

import A1.C0574i;
import androidx.media3.common.ParserException;
import com.google.gson.internal.b;
import java.io.IOException;
import p114j1.k;
import p114j1.r;

/* JADX INFO: compiled from: WavHeaderReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: compiled from: WavHeaderReader.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f36595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f36596b;

        public a(int i10, long j) {
            this.f36595a = i10;
            this.f36596b = j;
        }

        public static a a(C0574i c0574i, r rVar) throws IOException {
            c0574i.c(rVar.f41062a, 0, 8, false);
            rVar.G(0);
            return new a(rVar.h(), rVar.l());
        }
    }

    public static boolean a(C0574i c0574i) throws IOException {
        r rVar = new r(8);
        int i10 = a.a(c0574i, rVar).f36595a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        c0574i.c(rVar.f41062a, 0, 4, false);
        rVar.G(0);
        int iH = rVar.h();
        if (iH == 1463899717) {
            return true;
        }
        k.c("WavHeaderReader", "Unsupported form type: " + iH);
        return false;
    }

    public static a b(int i10, C0574i c0574i, r rVar) throws IOException {
        a aVarA = a.a(c0574i, rVar);
        while (true) {
            int i11 = aVarA.f36595a;
            if (i11 == i10) {
                return aVarA;
            }
            b.e(i11, "Ignoring unknown WAV chunk: ");
            long j = aVarA.f36596b;
            long j10 = 8 + j;
            if (j % 2 != 0) {
                j10 = 9 + j;
            }
            if (j10 > 2147483647L) {
                throw ParserException.b("Chunk is too large (~2GB+) to skip; id: " + i11);
            }
            c0574i.i((int) j10);
            aVarA = a.a(c0574i, rVar);
        }
    }
}
