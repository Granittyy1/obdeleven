package com.google.android.material.carousel;

import C4.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: KeylineState.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f26898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<C0268b> f26899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26901d;

    /* JADX INFO: compiled from: KeylineState.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f26902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f26903b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public C0268b f26905d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public C0268b f26906e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f26904c = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f26907f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f26908g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f26909h = 0.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f26910i = -1;

        public a(float f10, float f11) {
            this.f26902a = f10;
            this.f26903b = f11;
        }

        public final void a(float f10, float f11, float f12, boolean z10, boolean z11) {
            float fAbs;
            float f13 = f12 / 2.0f;
            float f14 = f10 - f13;
            float f15 = f13 + f10;
            float f16 = this.f26903b;
            if (f15 > f16) {
                fAbs = Math.abs(f15 - Math.max(f15 - f12, f16));
            } else {
                fAbs = 0.0f;
                if (f14 < 0.0f) {
                    fAbs = Math.abs(f14 - Math.min(f14 + f12, 0.0f));
                }
            }
            b(f10, f11, f12, z10, z11, fAbs);
        }

        public final void b(float f10, float f11, float f12, boolean z10, boolean z11, float f13) {
            if (f12 <= 0.0f) {
                return;
            }
            ArrayList arrayList = this.f26904c;
            if (z11) {
                if (z10) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i10 = this.f26910i;
                if (i10 != -1 && i10 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f26910i = arrayList.size();
            }
            C0268b c0268b = new C0268b(Float.MIN_VALUE, f10, f11, f12, z11, f13);
            if (z10) {
                if (this.f26905d == null) {
                    this.f26905d = c0268b;
                    this.f26907f = arrayList.size();
                }
                if (this.f26908g != -1 && arrayList.size() - this.f26908g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f12 != this.f26905d.f26914d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f26906e = c0268b;
                this.f26908g = arrayList.size();
            } else {
                if (this.f26905d == null && f12 < this.f26909h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f26906e != null && f12 > this.f26909h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f26909h = f12;
            arrayList.add(c0268b);
        }

        public final void c(float f10, float f11, float f12, int i10, boolean z10) {
            if (i10 <= 0 || f12 <= 0.0f) {
                return;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                a((i11 * f12) + f10, f11, f12, z10, false);
            }
        }

        public final b d() {
            if (this.f26905d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (true) {
                ArrayList arrayList2 = this.f26904c;
                int size = arrayList2.size();
                float f10 = this.f26902a;
                if (i10 >= size) {
                    return new b(f10, arrayList, this.f26907f, this.f26908g);
                }
                C0268b c0268b = (C0268b) arrayList2.get(i10);
                arrayList.add(new C0268b((i10 * f10) + (this.f26905d.f26912b - (this.f26907f * f10)), c0268b.f26912b, c0268b.f26913c, c0268b.f26914d, c0268b.f26915e, c0268b.f26916f));
                i10++;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.carousel.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: KeylineState.java */
    public static final class C0268b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f26911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f26912b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f26913c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f26914d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f26915e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f26916f;

        public C0268b(float f10, float f11, float f12, float f13, boolean z10, float f14) {
            this.f26911a = f10;
            this.f26912b = f11;
            this.f26913c = f12;
            this.f26914d = f13;
            this.f26915e = z10;
            this.f26916f = f14;
        }
    }

    public b(float f10, ArrayList arrayList, int i10, int i11) {
        this.f26898a = f10;
        this.f26899b = Collections.unmodifiableList(arrayList);
        this.f26900c = i10;
        this.f26901d = i11;
    }

    public final C0268b a() {
        return this.f26899b.get(this.f26900c);
    }

    public final C0268b b() {
        return this.f26899b.get(0);
    }

    public final C0268b c() {
        return this.f26899b.get(this.f26901d);
    }

    public final C0268b d() {
        return (C0268b) v.e(1, this.f26899b);
    }
}
