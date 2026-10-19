package rb;

/* JADX INFO: compiled from: Settings.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f46667b = new int[10];

    public final int a() {
        if ((this.f46666a & 128) != 0) {
            return this.f46667b[7];
        }
        return 65535;
    }

    public final void b(t other) {
        kotlin.jvm.internal.i.e(other, "other");
        for (int i10 = 0; i10 < 10; i10++) {
            if (((1 << i10) & other.f46666a) != 0) {
                c(i10, other.f46667b[i10]);
            }
        }
    }

    public final void c(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f46667b;
            if (i10 >= iArr.length) {
                return;
            }
            this.f46666a = (1 << i10) | this.f46666a;
            iArr[i10] = i11;
        }
    }
}
