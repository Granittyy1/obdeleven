package E3;

/* JADX INFO: compiled from: IntegerArrayAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class g implements a<int[]> {
    @Override // E3.a
    public final String a() {
        return "IntegerArrayPool";
    }

    @Override // E3.a
    public final int b() {
        return 4;
    }

    @Override // E3.a
    public final int c(int[] iArr) {
        return iArr.length;
    }

    @Override // E3.a
    public final int[] newArray(int i10) {
        return new int[i10];
    }
}
