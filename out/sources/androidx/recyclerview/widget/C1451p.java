package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DiffUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1451p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f19912a = new a();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.p$a */
    /* JADX INFO: compiled from: DiffUtil.java */
    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        public final int compare(c cVar, c cVar2) {
            return cVar.f19913a - cVar2.f19913a;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.p$b */
    /* JADX INFO: compiled from: DiffUtil.java */
    public static abstract class b {
        public abstract boolean areContentsTheSame(int i10, int i11);

        public abstract boolean areItemsTheSame(int i10, int i11);

        public Object getChangePayload(int i10, int i11) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.p$c */
    /* JADX INFO: compiled from: DiffUtil.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f19915c;

        public c(int i10, int i11, int i12) {
            this.f19913a = i10;
            this.f19914b = i11;
            this.f19915c = i12;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.p$d */
    /* JADX INFO: compiled from: DiffUtil.java */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f19916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f19917b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f19918c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f19919d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f19920e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f19921f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f19922g;

        public d(b bVar, ArrayList arrayList, int[] iArr, int[] iArr2) {
            int[] iArr3;
            int[] iArr4;
            b bVar2;
            int i10;
            int i11;
            this.f19916a = arrayList;
            this.f19917b = iArr;
            this.f19918c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f19919d = bVar;
            int oldListSize = bVar.getOldListSize();
            this.f19920e = oldListSize;
            int newListSize = bVar.getNewListSize();
            this.f19921f = newListSize;
            this.f19922g = true;
            c cVar = arrayList.isEmpty() ? null : (c) arrayList.get(0);
            if (cVar == null || cVar.f19913a != 0 || cVar.f19914b != 0) {
                arrayList.add(0, new c(0, 0, 0));
            }
            arrayList.add(new c(oldListSize, newListSize, 0));
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                iArr3 = this.f19918c;
                iArr4 = this.f19917b;
                bVar2 = this.f19919d;
                if (!zHasNext) {
                    break;
                }
                c cVar2 = (c) it.next();
                for (int i12 = 0; i12 < cVar2.f19915c; i12++) {
                    int i13 = cVar2.f19913a + i12;
                    int i14 = cVar2.f19914b + i12;
                    int i15 = bVar2.areContentsTheSame(i13, i14) ? 1 : 2;
                    iArr4[i13] = (i14 << 4) | i15;
                    iArr3[i14] = (i13 << 4) | i15;
                }
            }
            if (this.f19922g) {
                Iterator it2 = arrayList.iterator();
                int i16 = 0;
                while (it2.hasNext()) {
                    c cVar3 = (c) it2.next();
                    while (true) {
                        i10 = cVar3.f19913a;
                        if (i16 < i10) {
                            if (iArr4[i16] == 0) {
                                int size = arrayList.size();
                                int i17 = 0;
                                for (int i18 = 0; i18 < size; i18++) {
                                    c cVar4 = (c) arrayList.get(i18);
                                    while (true) {
                                        i11 = cVar4.f19914b;
                                        if (i17 < i11) {
                                            if (iArr3[i17] == 0 && bVar2.areItemsTheSame(i16, i17)) {
                                                int i19 = bVar2.areContentsTheSame(i16, i17) ? 8 : 4;
                                                iArr4[i16] = (i17 << 4) | i19;
                                                iArr3[i17] = i19 | (i16 << 4);
                                                break;
                                            }
                                            i17++;
                                        }
                                    }
                                    i17 = cVar4.f19915c + i11;
                                }
                            }
                            i16++;
                        }
                    }
                    i16 = cVar3.f19915c + i10;
                }
            }
        }

        public static f b(ArrayDeque arrayDeque, int i10, boolean z10) {
            f fVar;
            Iterator it = arrayDeque.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fVar = null;
                    break;
                }
                fVar = (f) it.next();
                if (fVar.f19923a == i10 && fVar.f19925c == z10) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                f fVar2 = (f) it.next();
                if (z10) {
                    fVar2.f19924b--;
                } else {
                    fVar2.f19924b++;
                }
            }
            return fVar;
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00f0  */
        public final void a(C1437b c1437b) {
            int[] iArr;
            b bVar;
            int i10;
            int i11;
            int i12;
            ArrayList arrayList;
            int i13;
            int i14;
            d dVar = this;
            C1441f c1441f = new C1441f(c1437b);
            ArrayDeque arrayDeque = new ArrayDeque();
            ArrayList arrayList2 = dVar.f19916a;
            int size = arrayList2.size() - 1;
            int i15 = dVar.f19920e;
            int i16 = dVar.f19921f;
            int i17 = i15;
            while (size >= 0) {
                c cVar = (c) arrayList2.get(size);
                int i18 = cVar.f19913a;
                int i19 = cVar.f19915c;
                int i20 = i18 + i19;
                int i21 = cVar.f19914b;
                int i22 = i21 + i19;
                while (true) {
                    iArr = dVar.f19917b;
                    bVar = dVar.f19919d;
                    i10 = 0;
                    if (i17 <= i20) {
                        break;
                    }
                    i17--;
                    int i23 = iArr[i17];
                    if ((i23 & 12) != 0) {
                        arrayList = arrayList2;
                        int i24 = i23 >> 4;
                        f fVarB = b(arrayDeque, i24, false);
                        if (fVarB != null) {
                            i13 = i16;
                            int i25 = (i15 - fVarB.f19924b) - 1;
                            c1441f.c(i17, i25);
                            if ((i23 & 4) != 0) {
                                c1441f.b(i25, 1, bVar.getChangePayload(i17, i24));
                            }
                        } else {
                            i13 = i16;
                            arrayDeque.add(new f(i17, (i15 - i17) - 1, true));
                        }
                    } else {
                        arrayList = arrayList2;
                        i13 = i16;
                        if (c1441f.f19840b != 2 || (i14 = c1441f.f19841c) < i17 || i14 > i17 + 1) {
                            c1441f.a();
                            c1441f.f19841c = i17;
                            c1441f.f19842d = 1;
                            c1441f.f19840b = 2;
                        } else {
                            c1441f.f19842d++;
                            c1441f.f19841c = i17;
                        }
                        i15--;
                    }
                    arrayList2 = arrayList;
                    i16 = i13;
                }
                ArrayList arrayList3 = arrayList2;
                while (i16 > i22) {
                    i16--;
                    int i26 = dVar.f19918c[i16];
                    if ((i26 & 12) != 0) {
                        int i27 = i26 >> 4;
                        f fVarB2 = b(arrayDeque, i27, true);
                        if (fVarB2 == null) {
                            arrayDeque.add(new f(i16, i15 - i17, false));
                            i11 = 0;
                        } else {
                            i11 = 0;
                            c1441f.c((i15 - fVarB2.f19924b) - 1, i17);
                            if ((i26 & 4) != 0) {
                                c1441f.b(i17, 1, bVar.getChangePayload(i27, i16));
                            }
                        }
                    } else {
                        i11 = i10;
                        if (c1441f.f19840b != 1 || i17 < (i12 = c1441f.f19841c)) {
                            c1441f.a();
                            c1441f.f19841c = i17;
                            c1441f.f19842d = 1;
                            c1441f.f19840b = 1;
                        } else {
                            int i28 = c1441f.f19842d;
                            if (i17 <= i12 + i28) {
                                c1441f.f19842d = i28 + 1;
                                c1441f.f19841c = Math.min(i17, i12);
                            } else {
                                c1441f.a();
                                c1441f.f19841c = i17;
                                c1441f.f19842d = 1;
                                c1441f.f19840b = 1;
                            }
                        }
                        i15++;
                    }
                    dVar = this;
                    i10 = i11;
                }
                i17 = cVar.f19913a;
                int i29 = i17;
                int i30 = i21;
                while (i10 < i19) {
                    if ((iArr[i29] & 15) == 2) {
                        c1441f.b(i29, 1, bVar.getChangePayload(i29, i30));
                    }
                    i29++;
                    i30++;
                    i10++;
                }
                size--;
                dVar = this;
                i16 = i21;
                arrayList2 = arrayList3;
            }
            c1441f.a();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.p$e */
    /* JADX INFO: compiled from: DiffUtil.java */
    public static abstract class e<T> {
        public abstract boolean a(T t8, T t10);

        public abstract boolean b(T t8, T t10);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.p$f */
    /* JADX INFO: compiled from: DiffUtil.java */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19924b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f19925c;

        public f(int i10, int i11, boolean z10) {
            this.f19923a = i10;
            this.f19924b = i11;
            this.f19925c = z10;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.p$g */
    /* JADX INFO: compiled from: DiffUtil.java */
    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19928c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f19929d;

        public final int a() {
            return this.f19929d - this.f19928c;
        }

        public final int b() {
            return this.f19927b - this.f19926a;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.p$h */
    /* JADX INFO: compiled from: DiffUtil.java */
    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19931b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19932c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f19933d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f19934e;

        public final int a() {
            return Math.min(this.f19932c - this.f19930a, this.f19933d - this.f19931b);
        }
    }

    public static d a(b bVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        g gVar;
        h hVar;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i10;
        g gVar2;
        c cVar;
        int i11;
        int i12;
        h hVar2;
        h hVar3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int oldListSize = bVar.getOldListSize();
        int newListSize = bVar.getNewListSize();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        g gVar3 = new g();
        int i19 = 0;
        gVar3.f19926a = 0;
        gVar3.f19927b = oldListSize;
        gVar3.f19928c = 0;
        gVar3.f19929d = newListSize;
        arrayList6.add(gVar3);
        int i20 = oldListSize + newListSize;
        int i21 = 1;
        int i22 = (((i20 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i22];
        int i23 = i22 / 2;
        int[] iArr2 = new int[i22];
        ArrayList arrayList7 = new ArrayList();
        while (!arrayList6.isEmpty()) {
            g gVar4 = (g) arrayList6.remove(arrayList6.size() - i21);
            if (gVar4.b() >= i21 && gVar4.a() >= i21) {
                int iA = ((gVar4.a() + gVar4.b()) + i21) / 2;
                int i24 = i21 + i23;
                iArr[i24] = gVar4.f19926a;
                iArr2[i24] = gVar4.f19927b;
                int i25 = i19;
                while (true) {
                    if (i25 >= iA) {
                        arrayList = arrayList6;
                        arrayList2 = arrayList7;
                        gVar = gVar4;
                        hVar = null;
                        break;
                    }
                    int i26 = Math.abs(gVar4.b() - gVar4.a()) % 2 == i21 ? i21 : i19;
                    int iB = gVar4.b() - gVar4.a();
                    int i27 = -i25;
                    int i28 = i27;
                    while (true) {
                        if (i28 > i25) {
                            arrayList = arrayList6;
                            i11 = i19;
                            arrayList2 = arrayList7;
                            i12 = iA;
                            hVar2 = null;
                            break;
                        }
                        if (i28 == i27 || (i28 != i25 && iArr[i28 + 1 + i23] > iArr[(i28 - 1) + i23])) {
                            i16 = iArr[i28 + 1 + i23];
                            i17 = i16;
                        } else {
                            i16 = iArr[(i28 - 1) + i23];
                            i17 = i16 + 1;
                        }
                        i12 = iA;
                        arrayList = arrayList6;
                        int i29 = ((i17 - gVar4.f19926a) + gVar4.f19928c) - i28;
                        int i30 = (i25 == 0 || i17 != i16) ? i29 : i29 - 1;
                        arrayList2 = arrayList7;
                        while (i17 < gVar4.f19927b && i29 < gVar4.f19929d && bVar.areItemsTheSame(i17, i29)) {
                            i17++;
                            i29++;
                        }
                        iArr[i28 + i23] = i17;
                        if (i26 != 0) {
                            int i31 = iB - i28;
                            i18 = i26;
                            if (i31 >= i27 + 1 && i31 <= i25 - 1 && iArr2[i31 + i23] <= i17) {
                                hVar2 = new h();
                                hVar2.f19930a = i16;
                                hVar2.f19931b = i30;
                                hVar2.f19932c = i17;
                                hVar2.f19933d = i29;
                                i11 = 0;
                                hVar2.f19934e = false;
                                break;
                            }
                        } else {
                            i18 = i26;
                        }
                        i28 += 2;
                        i19 = 0;
                        iA = i12;
                        arrayList6 = arrayList;
                        arrayList7 = arrayList2;
                        i26 = i18;
                    }
                    if (hVar2 != null) {
                        hVar = hVar2;
                        gVar = gVar4;
                        break;
                    }
                    int i32 = (gVar4.b() - gVar4.a()) % 2 == 0 ? 1 : i11;
                    int iB2 = gVar4.b() - gVar4.a();
                    int i33 = i27;
                    while (true) {
                        if (i33 > i25) {
                            gVar = gVar4;
                            hVar3 = null;
                            break;
                        }
                        if (i33 == i27 || (i33 != i25 && iArr2[i33 + 1 + i23] < iArr2[(i33 - 1) + i23])) {
                            i13 = iArr2[i33 + 1 + i23];
                            i14 = i13;
                        } else {
                            i13 = iArr2[(i33 - 1) + i23];
                            i14 = i13 - 1;
                        }
                        int i34 = gVar4.f19929d - ((gVar4.f19927b - i14) - i33);
                        int i35 = (i25 == 0 || i14 != i13) ? i34 : i34 + 1;
                        while (true) {
                            if (i14 > gVar4.f19926a && i34 > gVar4.f19928c) {
                                gVar = gVar4;
                                if (!bVar.areItemsTheSame(i14 - 1, i34 - 1)) {
                                    break;
                                }
                                i14--;
                                i34--;
                                gVar4 = gVar;
                            } else {
                                gVar = gVar4;
                                break;
                            }
                        }
                        iArr2[i33 + i23] = i14;
                        if (i32 != 0 && (i15 = iB2 - i33) >= i27 && i15 <= i25 && iArr[i15 + i23] >= i14) {
                            hVar3 = new h();
                            hVar3.f19930a = i14;
                            hVar3.f19931b = i34;
                            hVar3.f19932c = i13;
                            hVar3.f19933d = i35;
                            hVar3.f19934e = true;
                            break;
                        }
                        i33 += 2;
                        gVar4 = gVar;
                    }
                    if (hVar3 != null) {
                        hVar = hVar3;
                        break;
                    }
                    i25++;
                    iA = i12;
                    arrayList6 = arrayList;
                    arrayList7 = arrayList2;
                    gVar4 = gVar;
                    i21 = 1;
                    i19 = 0;
                }
            } else {
                arrayList = arrayList6;
                arrayList2 = arrayList7;
                gVar = gVar4;
                hVar = null;
                break;
            }
            if (hVar != null) {
                if (hVar.a() > 0) {
                    int i36 = hVar.f19933d;
                    int i37 = hVar.f19931b;
                    int i38 = i36 - i37;
                    int i39 = hVar.f19932c;
                    int i40 = hVar.f19930a;
                    int i41 = i39 - i40;
                    if (i38 == i41) {
                        cVar = new c(i40, i37, i41);
                    } else if (hVar.f19934e) {
                        cVar = new c(i40, i37, hVar.a());
                    } else {
                        cVar = i38 > i41 ? new c(i40, i37 + 1, hVar.a()) : new c(i40 + 1, i37, hVar.a());
                    }
                    arrayList5.add(cVar);
                }
                if (arrayList2.isEmpty()) {
                    gVar2 = new g();
                    arrayList4 = arrayList2;
                    i10 = 1;
                } else {
                    i10 = 1;
                    arrayList4 = arrayList2;
                    gVar2 = (g) arrayList4.remove(arrayList2.size() - 1);
                }
                gVar2.f19926a = gVar.f19926a;
                gVar2.f19928c = gVar.f19928c;
                gVar2.f19927b = hVar.f19930a;
                gVar2.f19929d = hVar.f19931b;
                arrayList3 = arrayList;
                arrayList3.add(gVar2);
                gVar.f19927b = gVar.f19927b;
                gVar.f19929d = gVar.f19929d;
                gVar.f19926a = hVar.f19932c;
                gVar.f19928c = hVar.f19933d;
                arrayList3.add(gVar);
            } else {
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                i10 = 1;
                arrayList4.add(gVar);
            }
            i21 = i10;
            arrayList6 = arrayList3;
            arrayList7 = arrayList4;
            i19 = 0;
        }
        Collections.sort(arrayList5, f19912a);
        return new d(bVar, arrayList5, iArr, iArr2);
    }
}
