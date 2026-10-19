package R0;

import android.graphics.Typeface;
import android.util.SparseArray;

/* JADX INFO: compiled from: MetadataRepo.java */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S0.b f5173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char[] f5174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f5175c = new a(1024);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Typeface f5176d;

    /* JADX INFO: compiled from: MetadataRepo.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseArray<a> f5177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public n f5178b;

        public a() {
            this(1);
        }

        public final void a(n nVar, int i10, int i11) {
            int iA = nVar.a(i10);
            SparseArray<a> sparseArray = this.f5177a;
            a aVar = sparseArray == null ? null : sparseArray.get(iA);
            if (aVar == null) {
                aVar = new a();
                sparseArray.put(nVar.a(i10), aVar);
            }
            if (i11 > i10) {
                aVar.a(nVar, i10 + 1, i11);
            } else {
                aVar.f5178b = nVar;
            }
        }

        public a(int i10) {
            this.f5177a = new SparseArray<>(i10);
        }
    }

    public l(Typeface typeface, S0.b bVar) {
        int i10;
        int i11;
        this.f5176d = typeface;
        this.f5173a = bVar;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i12 = iA + bVar.f5344a;
            i10 = bVar.f5345b.getInt(bVar.f5345b.getInt(i12) + i12);
        } else {
            i10 = 0;
        }
        this.f5174b = new char[i10 * 2];
        int iA2 = bVar.a(6);
        if (iA2 != 0) {
            int i13 = iA2 + bVar.f5344a;
            i11 = bVar.f5345b.getInt(bVar.f5345b.getInt(i13) + i13);
        } else {
            i11 = 0;
        }
        for (int i14 = 0; i14 < i11; i14++) {
            n nVar = new n(this, i14);
            S0.a aVarC = nVar.c();
            int iA3 = aVarC.a(4);
            Character.toChars(iA3 != 0 ? aVarC.f5345b.getInt(iA3 + aVarC.f5344a) : 0, this.f5174b, i14 * 2);
            A0.f.c("invalid metadata codepoint length", nVar.b() > 0);
            this.f5175c.a(nVar, 0, nVar.b() - 1);
        }
    }
}
