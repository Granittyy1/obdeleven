package androidx.compose.ui.text;

/* JADX INFO: compiled from: ParagraphStyle.kt */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f15601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f15602b = 0;

    static {
        p013b0.o[] oVarArr = p013b0.n.f20492b;
        f15601a = p013b0.n.f20493c;
    }

    public static final n a(n nVar, int i10, int i11, long j, androidx.compose.ui.text.style.k kVar, r rVar, androidx.compose.ui.text.style.f fVar, int i12, int i13, androidx.compose.ui.text.style.l lVar) {
        int i14 = i10;
        int i15 = i11;
        long j10 = j;
        androidx.compose.ui.text.style.k kVar2 = kVar;
        r rVar2 = rVar;
        androidx.compose.ui.text.style.f fVar2 = fVar;
        int i16 = i12;
        int i17 = i13;
        androidx.compose.ui.text.style.l lVar2 = lVar;
        if (androidx.compose.ui.text.style.g.a(i14, Integer.MIN_VALUE) || androidx.compose.ui.text.style.g.a(i14, nVar.f15592a)) {
            p013b0.o[] oVarArr = p013b0.n.f20492b;
            if (((j10 & 1095216660480L) == 0 || p013b0.n.a(j10, nVar.f15594c)) && ((kVar2 == null || kVar2.equals(nVar.f15595d)) && ((androidx.compose.ui.text.style.i.a(i15, Integer.MIN_VALUE) || androidx.compose.ui.text.style.i.a(i15, nVar.f15593b)) && ((rVar2 == null || rVar2.equals(nVar.f15596e)) && ((fVar2 == null || fVar2.equals(nVar.f15597f)) && ((i16 == 0 || i16 == nVar.f15598g) && ((androidx.compose.ui.text.style.d.a(i17, Integer.MIN_VALUE) || androidx.compose.ui.text.style.d.a(i17, nVar.f15599h)) && (lVar2 == null || lVar2.equals(nVar.f15600i))))))))) {
                return nVar;
            }
        }
        p013b0.o[] oVarArr2 = p013b0.n.f20492b;
        if ((j10 & 1095216660480L) == 0) {
            j10 = nVar.f15594c;
        }
        if (kVar2 == null) {
            kVar2 = nVar.f15595d;
        }
        if (androidx.compose.ui.text.style.g.a(i14, Integer.MIN_VALUE)) {
            i14 = nVar.f15592a;
        }
        if (androidx.compose.ui.text.style.i.a(i15, Integer.MIN_VALUE)) {
            i15 = nVar.f15593b;
        }
        r rVar3 = nVar.f15596e;
        if (rVar3 != null && rVar2 == null) {
            rVar2 = rVar3;
        }
        if (fVar2 == null) {
            fVar2 = nVar.f15597f;
        }
        if (i16 == 0) {
            i16 = nVar.f15598g;
        }
        if (androidx.compose.ui.text.style.d.a(i17, Integer.MIN_VALUE)) {
            i17 = nVar.f15599h;
        }
        if (lVar2 == null) {
            lVar2 = nVar.f15600i;
        }
        return new n(i14, i15, j10, kVar2, rVar2, fVar2, i16, i17, lVar2);
    }
}
