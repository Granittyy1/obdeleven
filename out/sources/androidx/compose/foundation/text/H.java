package androidx.compose.foundation.text;

/* JADX INFO: compiled from: ValidatingOffsetMapping.kt */
/* JADX INFO: loaded from: classes.dex */
public final class H implements androidx.compose.ui.text.input.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.ui.text.input.r f11110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11112c;

    public H(androidx.compose.ui.text.input.r rVar, int i10, int i11) {
        this.f11110a = rVar;
        this.f11111b = i10;
        this.f11112c = i11;
    }

    @Override // androidx.compose.ui.text.input.r
    public final int a(int i10) {
        int iA = this.f11110a.a(i10);
        if (i10 >= 0 && i10 <= this.f11112c) {
            I.c(iA, this.f11111b, i10);
        }
        return iA;
    }

    @Override // androidx.compose.ui.text.input.r
    public final int b(int i10) {
        int iB = this.f11110a.b(i10);
        if (i10 >= 0 && i10 <= this.f11111b) {
            I.b(iB, this.f11112c, i10);
        }
        return iB;
    }
}
