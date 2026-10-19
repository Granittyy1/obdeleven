package com.google.android.material.carousel;

import Z3.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: KeylineStateList.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f26917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<b> f26918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<b> f26919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f26920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f26921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f26922f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f26923g;

    public c(b bVar, ArrayList arrayList, ArrayList arrayList2) {
        this.f26917a = bVar;
        this.f26918b = Collections.unmodifiableList(arrayList);
        this.f26919c = Collections.unmodifiableList(arrayList2);
        float f10 = ((b) n.f(1, arrayList)).b().f26911a - bVar.b().f26911a;
        this.f26922f = f10;
        float f11 = bVar.d().f26911a - ((b) n.f(1, arrayList2)).d().f26911a;
        this.f26923g = f11;
        this.f26920d = b(f10, arrayList, true);
        this.f26921e = b(f11, arrayList2, false);
    }

    public static float[] b(float f10, ArrayList arrayList, boolean z10) {
        int size = arrayList.size();
        float[] fArr = new float[size];
        int i10 = 1;
        while (i10 < size) {
            int i11 = i10 - 1;
            b bVar = (b) arrayList.get(i11);
            b bVar2 = (b) arrayList.get(i10);
            fArr[i10] = i10 == size + (-1) ? 1.0f : fArr[i11] + ((z10 ? bVar2.b().f26911a - bVar.b().f26911a : bVar.d().f26911a - bVar2.d().f26911a) / f10);
            i10++;
        }
        return fArr;
    }

    public static b c(b bVar, int i10, int i11, float f10, int i12, int i13, float f11) {
        ArrayList arrayList = new ArrayList(bVar.f26899b);
        arrayList.add(i11, (b.C0268b) arrayList.remove(i10));
        b.a aVar = new b.a(bVar.f26898a, f11);
        int i14 = 0;
        while (i14 < arrayList.size()) {
            b.C0268b c0268b = (b.C0268b) arrayList.get(i14);
            float f12 = c0268b.f26914d;
            aVar.b((f12 / 2.0f) + f10, c0268b.f26913c, f12, i14 >= i12 && i14 <= i13, c0268b.f26915e, c0268b.f26916f);
            f10 += c0268b.f26914d;
            i14++;
        }
        return aVar.d();
    }

    public final b a(float f10, float f11, float f12) {
        float fB;
        List<b> list;
        float[] fArr;
        float[] fArr2;
        float f13 = this.f26922f + f11;
        float f14 = f12 - this.f26923g;
        if (f10 < f13) {
            fB = p216r5.a.b(1.0f, 0.0f, f11, f13, f10);
            list = this.f26918b;
            fArr = this.f26920d;
        } else {
            if (f10 <= f14) {
                return this.f26917a;
            }
            fB = p216r5.a.b(0.0f, 1.0f, f14, f12, f10);
            list = this.f26919c;
            fArr = this.f26921e;
        }
        int size = list.size();
        float f15 = fArr[0];
        int i10 = 1;
        while (true) {
            if (i10 >= size) {
                fArr2 = new float[]{0.0f, 0.0f, 0.0f};
                break;
            }
            float f16 = fArr[i10];
            if (fB <= f16) {
                fArr2 = new float[]{p216r5.a.b(0.0f, 1.0f, f15, f16, fB), i10 - 1, i10};
                break;
            }
            i10++;
            f15 = f16;
        }
        b bVar = list.get((int) fArr2[1]);
        b bVar2 = list.get((int) fArr2[2]);
        float f17 = fArr2[0];
        if (bVar.f26898a != bVar2.f26898a) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List<b.C0268b> list2 = bVar.f26899b;
        int size2 = list2.size();
        List<b.C0268b> list3 = bVar2.f26899b;
        if (size2 != list3.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list2.size(); i11++) {
            b.C0268b c0268b = list2.get(i11);
            b.C0268b c0268b2 = list3.get(i11);
            arrayList.add(new b.C0268b(p216r5.a.a(c0268b.f26911a, c0268b2.f26911a, f17), p216r5.a.a(c0268b.f26912b, c0268b2.f26912b, f17), p216r5.a.a(c0268b.f26913c, c0268b2.f26913c, f17), p216r5.a.a(c0268b.f26914d, c0268b2.f26914d, f17), false, 0.0f));
        }
        return new b(bVar.f26898a, arrayList, p216r5.a.c(f17, bVar.f26900c, bVar2.f26900c), p216r5.a.c(f17, bVar.f26901d, bVar2.f26901d));
    }
}
