package p318zb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.RandomAccess;
import kotlin.collections.AbstractC2670b;
import kotlin.collections.k;
import kotlin.collections.l;
import kotlin.collections.p;
import kotlin.jvm.internal.i;
import okio.ByteString;

/* JADX INFO: compiled from: Options.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class x extends AbstractC2670b<ByteString> implements RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteString[] f49118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f49119c;

    /* JADX INFO: compiled from: Options.kt */
    public static final class a {
        public static void a(long j, C2839f c2839f, int i10, ArrayList arrayList, int i11, int i12, ArrayList arrayList2) throws IOException {
            int i13;
            int i14;
            int i15;
            int i16 = i10;
            if (i11 >= i12) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i17 = i11; i17 < i12; i17++) {
                if (((ByteString) arrayList.get(i17)).e() < i16) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            ByteString byteString = (ByteString) arrayList.get(i11);
            ByteString byteString2 = (ByteString) arrayList.get(i12 - 1);
            int i18 = -1;
            if (i16 == byteString.e()) {
                int iIntValue = ((Number) arrayList2.get(i11)).intValue();
                int i19 = i11 + 1;
                ByteString byteString3 = (ByteString) arrayList.get(i19);
                i13 = i19;
                i14 = iIntValue;
                byteString = byteString3;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (byteString.k(i16) == byteString2.k(i16)) {
                int iMin = Math.min(byteString.e(), byteString2.e());
                int i20 = 0;
                for (int i21 = i16; i21 < iMin && byteString.k(i21) == byteString2.k(i21); i21++) {
                    i20++;
                }
                long j10 = 4;
                long j11 = (c2839f.f49074c / j10) + j + ((long) 2) + ((long) i20) + 1;
                c2839f.c1(-i20);
                c2839f.c1(i14);
                int i22 = i20 + i16;
                while (i16 < i22) {
                    c2839f.c1(byteString.k(i16) & 255);
                    i16++;
                }
                if (i13 + 1 == i12) {
                    if (i22 != ((ByteString) arrayList.get(i13)).e()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    c2839f.c1(((Number) arrayList2.get(i13)).intValue());
                    return;
                } else {
                    C2839f c2839f2 = new C2839f();
                    c2839f.c1(((int) ((c2839f2.f49074c / j10) + j11)) * (-1));
                    a(j11, c2839f2, i22, arrayList, i13, i12, arrayList2);
                    c2839f.k0(c2839f2);
                    return;
                }
            }
            int i23 = 1;
            for (int i24 = i13 + 1; i24 < i12; i24++) {
                if (((ByteString) arrayList.get(i24 - 1)).k(i16) != ((ByteString) arrayList.get(i24)).k(i16)) {
                    i23++;
                }
            }
            long j12 = 4;
            long j13 = (c2839f.f49074c / j12) + j + ((long) 2) + ((long) (i23 * 2));
            c2839f.c1(i23);
            c2839f.c1(i14);
            for (int i25 = i13; i25 < i12; i25++) {
                int iK = ((ByteString) arrayList.get(i25)).k(i16);
                if (i25 == i13 || iK != ((ByteString) arrayList.get(i25 - 1)).k(i16)) {
                    c2839f.c1(iK & 255);
                }
            }
            C2839f c2839f3 = new C2839f();
            int i26 = i13;
            while (i26 < i12) {
                byte bK = ((ByteString) arrayList.get(i26)).k(i16);
                int i27 = i26 + 1;
                int i28 = i27;
                while (true) {
                    if (i28 >= i12) {
                        i15 = i12;
                        break;
                    } else {
                        if (bK != ((ByteString) arrayList.get(i28)).k(i16)) {
                            i15 = i28;
                            break;
                        }
                        i28++;
                    }
                }
                if (i27 == i15 && i16 + 1 == ((ByteString) arrayList.get(i26)).e()) {
                    c2839f.c1(((Number) arrayList2.get(i26)).intValue());
                } else {
                    c2839f.c1(((int) ((c2839f3.f49074c / j12) + j13)) * i18);
                    a(j13, c2839f3, i16 + 1, arrayList, i26, i15, arrayList2);
                }
                c2839f3 = c2839f3;
                i26 = i15;
                i18 = -1;
            }
            c2839f.k0(c2839f3);
        }

        public static x b(ByteString... byteStringArr) throws IOException {
            if (byteStringArr.length == 0) {
                return new x(new ByteString[0], new int[]{0, -1});
            }
            ArrayList arrayListF0 = k.f0(byteStringArr);
            p.F(arrayListF0);
            int size = arrayListF0.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(-1);
            }
            int length = byteStringArr.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                arrayList.set(l.p(arrayListF0, byteStringArr[i11]), Integer.valueOf(i12));
                i11++;
                i12++;
            }
            if (((ByteString) arrayListF0.get(0)).e() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            int i13 = 0;
            while (i13 < arrayListF0.size()) {
                ByteString byteString = (ByteString) arrayListF0.get(i13);
                int i14 = i13 + 1;
                int i15 = i14;
                while (i15 < arrayListF0.size()) {
                    ByteString byteString2 = (ByteString) arrayListF0.get(i15);
                    if (!byteString2.q(byteString)) {
                        break;
                    }
                    if (byteString2.e() == byteString.e()) {
                        throw new IllegalArgumentException(("duplicate option: " + byteString2).toString());
                    }
                    if (((Number) arrayList.get(i15)).intValue() > ((Number) arrayList.get(i13)).intValue()) {
                        arrayListF0.remove(i15);
                        arrayList.remove(i15);
                    } else {
                        i15++;
                    }
                }
                i13 = i14;
            }
            C2839f c2839f = new C2839f();
            a(0L, c2839f, 0, arrayListF0, 0, arrayListF0.size(), arrayList);
            int i16 = (int) (c2839f.f49074c / ((long) 4));
            int[] iArr = new int[i16];
            for (int i17 = 0; i17 < i16; i17++) {
                iArr[i17] = c2839f.j0();
            }
            Object[] objArrCopyOf = Arrays.copyOf(byteStringArr, byteStringArr.length);
            i.d(objArrCopyOf, "copyOf(...)");
            return new x((ByteString[]) objArrCopyOf, iArr);
        }
    }

    public x(ByteString[] byteStringArr, int[] iArr) {
        this.f49118b = byteStringArr;
        this.f49119c = iArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return super.contains((ByteString) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractCollection
    public final int e() {
        return this.f49118b.length;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return this.f49118b[i10];
    }

    @Override // kotlin.collections.AbstractC2670b, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.indexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractC2670b, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.lastIndexOf((ByteString) obj);
        }
        return -1;
    }
}
