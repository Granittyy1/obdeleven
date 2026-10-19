package p318zb;

import D2.V;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import okio.internal.c;
import okio.internal.e;
import okio.internal.g;
import okio.internal.h;

/* JADX INFO: compiled from: ZipFileSystem.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class J extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z f49056e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f49057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f49058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f49059d;

    static {
        String str = z.f49122c;
        f49056e = z.a.a("/", false);
    }

    public J(z zVar, l fileSystem, LinkedHashMap linkedHashMap) {
        i.e(fileSystem, "fileSystem");
        this.f49057b = zVar;
        this.f49058c = fileSystem;
        this.f49059d = linkedHashMap;
    }

    @Override // p318zb.l
    public final void a(z path) throws IOException {
        i.e(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // p318zb.l
    public final List<z> d(z dir) throws IOException {
        i.e(dir, "dir");
        z zVar = f49056e;
        zVar.getClass();
        g gVar = (g) this.f49059d.get(c.b(zVar, dir, true));
        if (gVar != null) {
            List<z> listO0 = q.o0(gVar.f45743q);
            i.b(listO0);
            return listO0;
        }
        throw new IOException("not a directory: " + dir);
    }

    @Override // p318zb.l
    public final k f(z path) throws Throwable {
        Long lValueOf;
        Long lValueOf2;
        Long l10;
        Long lValueOf3;
        Throwable th;
        Throwable th2;
        g gVarE;
        i.e(path, "path");
        z zVar = f49056e;
        zVar.getClass();
        g gVar = (g) this.f49059d.get(c.b(zVar, path, true));
        if (gVar == null) {
            return null;
        }
        long j = gVar.f45735h;
        if (j != -1) {
            AbstractC2843j abstractC2843jG = this.f49058c.g(this.f49057b);
            try {
                C cB = v.b(abstractC2843jG.j(j));
                try {
                    gVarE = h.e(cB, gVar);
                    i.b(gVarE);
                    try {
                        cB.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        cB.close();
                    } catch (Throwable th5) {
                        V.e(th4, th5);
                    }
                    th2 = th4;
                    gVarE = null;
                }
                if (th2 != null) {
                    throw th2;
                }
                try {
                    abstractC2843jG.close();
                    th = null;
                } catch (Throwable th6) {
                    th = th6;
                }
                th = th;
                gVar = gVarE;
            } catch (Throwable th7) {
                th = th7;
                if (abstractC2843jG != null) {
                    try {
                        abstractC2843jG.close();
                    } catch (Throwable th8) {
                        V.e(th, th8);
                    }
                }
                gVar = null;
            }
            if (th != null) {
                throw th;
            }
        }
        boolean z10 = gVar.f45729b;
        boolean z11 = !z10;
        Long lValueOf4 = z10 ? null : Long.valueOf(gVar.f45733f);
        Long l11 = gVar.f45739m;
        if (l11 != null) {
            lValueOf = Long.valueOf((l11.longValue() / ((long) 10000)) - 11644473600000L);
        } else {
            Integer num = gVar.f45742p;
            lValueOf = num != null ? Long.valueOf(((long) num.intValue()) * 1000) : null;
        }
        Long l12 = gVar.f45737k;
        if (l12 != null) {
            lValueOf2 = Long.valueOf((l12.longValue() / ((long) 10000)) - 11644473600000L);
        } else {
            Integer num2 = gVar.f45740n;
            if (num2 != null) {
                lValueOf2 = Long.valueOf(((long) num2.intValue()) * 1000);
            } else {
                int i10 = gVar.j;
                if (i10 == -1 || i10 == -1) {
                    lValueOf2 = null;
                } else {
                    int i11 = gVar.f45736i;
                    int i12 = (i11 >> 5) & 15;
                    GregorianCalendar gregorianCalendar = new GregorianCalendar();
                    gregorianCalendar.set(14, 0);
                    gregorianCalendar.set(((i11 >> 9) & 127) + 1980, i12 - 1, i11 & 31, (i10 >> 11) & 31, (i10 >> 5) & 63, (i10 & 31) << 1);
                    lValueOf2 = Long.valueOf(gregorianCalendar.getTime().getTime());
                }
            }
        }
        Long l13 = gVar.f45738l;
        if (l13 == null) {
            Integer num3 = gVar.f45741o;
            if (num3 != null) {
                lValueOf3 = Long.valueOf(((long) num3.intValue()) * 1000);
            } else {
                l10 = null;
            }
            return new k(z11, z10, null, lValueOf4, lValueOf, lValueOf2, l10);
        }
        lValueOf3 = Long.valueOf((l13.longValue() / ((long) 10000)) - 11644473600000L);
        l10 = lValueOf3;
        return new k(z11, z10, null, lValueOf4, lValueOf, lValueOf2, l10);
    }

    @Override // p318zb.l
    public final AbstractC2843j g(z file) {
        i.e(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // p318zb.l
    public final F h(z file) throws IOException {
        i.e(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // p318zb.l
    public final H i(z file) throws Throwable {
        Throwable th;
        C cB;
        i.e(file, "file");
        z zVar = f49056e;
        zVar.getClass();
        g gVar = (g) this.f49059d.get(c.b(zVar, file, true));
        if (gVar == null) {
            throw new FileNotFoundException("no such file: " + file);
        }
        AbstractC2843j abstractC2843jG = this.f49058c.g(this.f49057b);
        try {
            cB = v.b(abstractC2843jG.j(gVar.f45735h));
            try {
                abstractC2843jG.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (abstractC2843jG != null) {
                try {
                    abstractC2843jG.close();
                } catch (Throwable th4) {
                    V.e(th3, th4);
                }
            }
            th = th3;
            cB = null;
        }
        if (th != null) {
            throw th;
        }
        i.e(cB, "<this>");
        h.e(cB, null);
        int i10 = gVar.f45734g;
        long j = gVar.f45733f;
        if (i10 == 0) {
            return new e(cB, j, true);
        }
        return new e(new q(v.b(new e(cB, gVar.f45732e, true)), new Inflater(true)), j, false);
    }
}
