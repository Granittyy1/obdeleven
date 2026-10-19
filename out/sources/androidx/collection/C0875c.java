package androidx.collection;

/* JADX INFO: renamed from: androidx.collection.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CircularIntArray.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0875c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f9169e;

    public /* synthetic */ C0875c(int i10) {
        this.f9165a = i10;
    }

    public void a(p148la.b bVar) {
        Object obj;
        Object obj2;
        Object[] objArr = (Object[]) this.f9169e;
        int i10 = this.f9166b;
        int iHashCode = bVar.hashCode() * (-1640531527);
        int i11 = (iHashCode ^ (iHashCode >>> 16)) & i10;
        Object obj3 = objArr[i11];
        if (obj3 != null) {
            if (obj3.equals(bVar)) {
                return;
            }
            do {
                i11 = (i11 + 1) & i10;
                obj2 = objArr[i11];
                if (obj2 == null) {
                }
            } while (!obj2.equals(bVar));
            return;
        }
        objArr[i11] = bVar;
        int i12 = this.f9167c + 1;
        this.f9167c = i12;
        if (i12 < this.f9168d) {
            return;
        }
        Object[] objArr2 = (Object[]) this.f9169e;
        int length = objArr2.length;
        int i13 = length << 1;
        int i14 = i13 - 1;
        Object[] objArr3 = new Object[i13];
        while (true) {
            int i15 = i12 - 1;
            if (i12 == 0) {
                this.f9166b = i14;
                this.f9168d = (int) (i13 * 0.75f);
                this.f9169e = objArr3;
                return;
            }
            do {
                length--;
                obj = objArr2[length];
            } while (obj == null);
            int iHashCode2 = obj.hashCode() * (-1640531527);
            int i16 = (iHashCode2 ^ (iHashCode2 >>> 16)) & i14;
            if (objArr3[i16] != null) {
                do {
                    i16 = (i16 + 1) & i14;
                } while (objArr3[i16] != null);
            }
            objArr3[i16] = objArr2[length];
            i12 = i15;
        }
    }

    public void b(int i10) {
        int[] iArr = (int[]) this.f9169e;
        int i11 = this.f9167c;
        iArr[i11] = i10;
        int i12 = this.f9168d & (i11 + 1);
        this.f9167c = i12;
        int i13 = this.f9166b;
        if (i12 == i13) {
            int length = iArr.length;
            int i14 = length - i13;
            int i15 = length << 1;
            if (i15 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i15];
            Q3.d.m(0, i13, length, iArr, iArr2);
            Q3.d.m(i14, 0, this.f9166b, (int[]) this.f9169e, iArr2);
            this.f9169e = iArr2;
            this.f9166b = 0;
            this.f9167c = length;
            this.f9168d = i15 - 1;
        }
    }

    public int c() {
        return this.f9168d - this.f9167c;
    }

    public void d(int i10, int i11, Object[] objArr) {
        int i12;
        Object obj;
        this.f9167c--;
        while (true) {
            int i13 = i10 + 1;
            while (true) {
                i12 = i13 & i11;
                obj = objArr[i12];
                if (obj != null) {
                    int iHashCode = obj.hashCode() * (-1640531527);
                    int i14 = (iHashCode ^ (iHashCode >>> 16)) & i11;
                    if (i10 > i12) {
                        if (i10 >= i14 && i14 > i12) {
                            break;
                        } else {
                            i13 = i12 + 1;
                        }
                    } else if (i10 >= i14 || i14 > i12) {
                        break;
                    } else {
                        i13 = i12 + 1;
                    }
                } else {
                    objArr[i10] = null;
                    return;
                }
            }
            objArr[i10] = obj;
            i10 = i12;
        }
    }

    public String toString() {
        switch (this.f9165a) {
            case 1:
                return "";
            default:
                return super.toString();
        }
    }

    public C0875c() {
        this.f9165a = 0;
        int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f9168d = iHighestOneBit - 1;
        this.f9169e = new int[iHighestOneBit];
    }
}
