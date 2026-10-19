package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Arrangement.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0945e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f10284a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f10285b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f10286c = new k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f10287d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f10288e = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f10289f = new h();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f10290g = new g();

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.e$a */
    /* JADX INFO: compiled from: Arrangement.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f10291a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0128a f10292b = new C0128a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f10293c = new c();

        /* JADX INFO: renamed from: androidx.compose.foundation.layout.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Arrangement.kt */
        public static final class C0128a implements InterfaceC0129e {
            @Override // androidx.compose.foundation.layout.C0945e.InterfaceC0129e
            public final void a(p013b0.c cVar, int i10, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                C0945e.a(i10, iArr, iArr2, false);
            }

            public final String toString() {
                return "AbsoluteArrangement#Center";
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.layout.e$a$b */
        /* JADX INFO: compiled from: Arrangement.kt */
        public static final class b implements InterfaceC0129e {
            @Override // androidx.compose.foundation.layout.C0945e.InterfaceC0129e
            public final void a(p013b0.c cVar, int i10, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                C0945e.b(iArr, iArr2, false);
            }

            public final String toString() {
                return "AbsoluteArrangement#Left";
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.layout.e$a$c */
        /* JADX INFO: compiled from: Arrangement.kt */
        public static final class c implements InterfaceC0129e {
            @Override // androidx.compose.foundation.layout.C0945e.InterfaceC0129e
            public final void a(p013b0.c cVar, int i10, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                C0945e.c(i10, iArr, iArr2, false);
            }

            public final String toString() {
                return "AbsoluteArrangement#Right";
            }
        }

        public static i a(float f10) {
            return new i(f10, false, new Ia.p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$spacedBy$1
                final /* synthetic */ androidx.compose.ui.d.b $alignment = androidx.compose.ui.d.a.f13347n;

                @Override // Ia.p
                public final Integer invoke(Integer num, LayoutDirection layoutDirection) {
                    return Integer.valueOf(this.$alignment.a(0, num.intValue(), layoutDirection));
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.e$b */
    /* JADX INFO: compiled from: Arrangement.kt */
    public static final class b implements l {
        @Override // androidx.compose.foundation.layout.C0945e.l
        public final void arrange(p013b0.c cVar, int i10, int[] iArr, int[] iArr2) {
            C0945e.c(i10, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#Bottom";
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.e$c */
    /* JADX INFO: compiled from: Arrangement.kt */
    public static final class c implements InterfaceC0129e, l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f10294a = 0;

        @Override // androidx.compose.foundation.layout.C0945e.InterfaceC0129e
        public final void a(p013b0.c cVar, int i10, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.f15717b) {
                C0945e.a(i10, iArr, iArr2, false);
            } else {
                C0945e.a(i10, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.C0945e.l
        public final void arrange(p013b0.c cVar, int i10, int[] iArr, int[] iArr2) {
            C0945e.a(i10, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.C0945e.InterfaceC0129e, androidx.compose.foundation.layout.C0945e.l
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
        public final float mo1getSpacingD9Ej5fM() {
            return this.f10294a;
        }

        public final String toString() {
            return "Arrangement#Center";
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.e$d */
    /* JADX INFO: compiled from: Arrangement.kt */
    public static final class d implements InterfaceC0129e {
        @Override // androidx.compose.foundation.layout.C0945e.InterfaceC0129e
        public final void a(p013b0.c cVar, int i10, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.f15717b) {
                C0945e.c(i10, iArr, iArr2, false);
            } else {
                C0945e.b(iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#End";
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Arrangement.kt */
    public interface InterfaceC0129e {
        void a(p013b0.c cVar, int i10, int[] iArr, LayoutDirection layoutDirection, int[] iArr2);

        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        default float mo1getSpacingD9Ej5fM() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.e$f */
    /* JADX INFO: compiled from: Arrangement.kt */
    public static final class f implements InterfaceC0129e, l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f10295a = 0;

        @Override // androidx.compose.foundation.layout.C0945e.InterfaceC0129e
        public final void a(p013b0.c cVar, int i10, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.f15717b) {
                C0945e.d(i10, iArr, iArr2, false);
            } else {
                C0945e.d(i10, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.C0945e.l
        public final void arrange(p013b0.c cVar, int i10, int[] iArr, int[] iArr2) {
            C0945e.d(i10, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.C0945e.InterfaceC0129e, androidx.compose.foundation.layout.C0945e.l
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        public final float mo1getSpacingD9Ej5fM() {
            return this.f10295a;
        }

        public final String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.e$g */
    /* JADX INFO: compiled from: Arrangement.kt */
    public static final class g implements InterfaceC0129e, l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f10296a = 0;

        @Override // androidx.compose.foundation.layout.C0945e.InterfaceC0129e
        public final void a(p013b0.c cVar, int i10, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.f15717b) {
                C0945e.e(i10, iArr, iArr2, false);
            } else {
                C0945e.e(i10, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.C0945e.l
        public final void arrange(p013b0.c cVar, int i10, int[] iArr, int[] iArr2) {
            C0945e.e(i10, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.C0945e.InterfaceC0129e, androidx.compose.foundation.layout.C0945e.l
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        public final float mo1getSpacingD9Ej5fM() {
            return this.f10296a;
        }

        public final String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.e$h */
    /* JADX INFO: compiled from: Arrangement.kt */
    public static final class h implements InterfaceC0129e, l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f10297a = 0;

        @Override // androidx.compose.foundation.layout.C0945e.InterfaceC0129e
        public final void a(p013b0.c cVar, int i10, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.f15717b) {
                C0945e.f(i10, iArr, iArr2, false);
            } else {
                C0945e.f(i10, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.C0945e.l
        public final void arrange(p013b0.c cVar, int i10, int[] iArr, int[] iArr2) {
            C0945e.f(i10, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.C0945e.InterfaceC0129e, androidx.compose.foundation.layout.C0945e.l
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        public final float mo1getSpacingD9Ej5fM() {
            return this.f10297a;
        }

        public final String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.e$i */
    /* JADX INFO: compiled from: Arrangement.kt */
    public static final class i implements InterfaceC0129e, l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f10298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f10299b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Lambda f10300c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f10301d;

        public i() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public i(float f10, boolean z10, Ia.p pVar) {
            this.f10298a = f10;
            this.f10299b = z10;
            this.f10300c = (Lambda) pVar;
            this.f10301d = f10;
        }

        /* JADX WARN: Type inference failed for: r11v2, types: [Ia.p, kotlin.jvm.internal.Lambda] */
        @Override // androidx.compose.foundation.layout.C0945e.InterfaceC0129e
        public final void a(p013b0.c cVar, int i10, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            int i11;
            int i12;
            if (iArr.length == 0) {
                return;
            }
            int iE1 = cVar.e1(this.f10298a);
            boolean z10 = this.f10299b && layoutDirection == LayoutDirection.f15718c;
            j jVar = C0945e.f10284a;
            if (z10) {
                int length = iArr.length - 1;
                i11 = 0;
                i12 = 0;
                while (-1 < length) {
                    int i13 = iArr[length];
                    int iMin = Math.min(i11, i10 - i13);
                    iArr2[length] = iMin;
                    int iMin2 = Math.min(iE1, (i10 - iMin) - i13);
                    int i14 = iArr2[length] + i13 + iMin2;
                    length--;
                    i12 = iMin2;
                    i11 = i14;
                }
            } else {
                int length2 = iArr.length;
                int i15 = 0;
                i11 = 0;
                i12 = 0;
                int i16 = 0;
                while (i15 < length2) {
                    int i17 = iArr[i15];
                    int iMin3 = Math.min(i11, i10 - i17);
                    iArr2[i16] = iMin3;
                    int iMin4 = Math.min(iE1, (i10 - iMin3) - i17);
                    int i18 = iArr2[i16] + i17 + iMin4;
                    i15++;
                    i16++;
                    i12 = iMin4;
                    i11 = i18;
                }
            }
            int i19 = i11 - i12;
            ?? r11 = this.f10300c;
            if (r11 == 0 || i19 >= i10) {
                return;
            }
            int iIntValue = ((Number) r11.invoke(Integer.valueOf(i10 - i19), layoutDirection)).intValue();
            int length3 = iArr2.length;
            for (int i20 = 0; i20 < length3; i20++) {
                iArr2[i20] = iArr2[i20] + iIntValue;
            }
        }

        @Override // androidx.compose.foundation.layout.C0945e.l
        public final void arrange(p013b0.c cVar, int i10, int[] iArr, int[] iArr2) {
            a(cVar, i10, iArr, LayoutDirection.f15717b, iArr2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return p013b0.f.a(this.f10298a, iVar.f10298a) && this.f10299b == iVar.f10299b && kotlin.jvm.internal.i.a(this.f10300c, iVar.f10300c);
        }

        @Override // androidx.compose.foundation.layout.C0945e.InterfaceC0129e, androidx.compose.foundation.layout.C0945e.l
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        public final float mo1getSpacingD9Ej5fM() {
            return this.f10301d;
        }

        public final int hashCode() {
            int iB = androidx.compose.animation.D.b(Float.hashCode(this.f10298a) * 31, 31, this.f10299b);
            Lambda lambda = this.f10300c;
            return iB + (lambda == null ? 0 : lambda.hashCode());
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f10299b ? "" : "Absolute");
            sb2.append("Arrangement#spacedAligned(");
            sb2.append((Object) p013b0.f.b(this.f10298a));
            sb2.append(", ");
            sb2.append(this.f10300c);
            sb2.append(')');
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.e$j */
    /* JADX INFO: compiled from: Arrangement.kt */
    public static final class j implements InterfaceC0129e {
        @Override // androidx.compose.foundation.layout.C0945e.InterfaceC0129e
        public final void a(p013b0.c cVar, int i10, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.f15717b) {
                C0945e.b(iArr, iArr2, false);
            } else {
                C0945e.c(i10, iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#Start";
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.e$k */
    /* JADX INFO: compiled from: Arrangement.kt */
    public static final class k implements l {
        @Override // androidx.compose.foundation.layout.C0945e.l
        public final void arrange(p013b0.c cVar, int i10, int[] iArr, int[] iArr2) {
            C0945e.b(iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#Top";
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.e$l */
    /* JADX INFO: compiled from: Arrangement.kt */
    public interface l {
        void arrange(p013b0.c cVar, int i10, int[] iArr, int[] iArr2);

        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        default float mo1getSpacingD9Ej5fM() {
            return 0;
        }
    }

    static {
        new f();
    }

    public static void a(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float f10 = (i10 - i12) / 2;
        if (!z10) {
            int length = iArr.length;
            int i14 = 0;
            while (i11 < length) {
                int i15 = iArr[i11];
                iArr2[i14] = Math.round(f10);
                f10 += i15;
                i11++;
                i14++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i16 = iArr[length2];
            iArr2[length2] = Math.round(f10);
            f10 += i16;
        }
    }

    public static void b(int[] iArr, int[] iArr2, boolean z10) {
        int i10 = 0;
        if (!z10) {
            int length = iArr.length;
            int i11 = 0;
            int i12 = 0;
            while (i10 < length) {
                int i13 = iArr[i10];
                iArr2[i11] = i12;
                i12 += i13;
                i10++;
                i11++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i14 = iArr[length2];
            iArr2[length2] = i10;
            i10 += i14;
        }
    }

    public static void c(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        int i14 = i10 - i12;
        if (!z10) {
            int length = iArr.length;
            int i15 = 0;
            while (i11 < length) {
                int i16 = iArr[i11];
                iArr2[i15] = i14;
                i14 += i16;
                i11++;
                i15++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i17 = iArr[length2];
            iArr2[length2] = i14;
            i14 += i17;
        }
    }

    public static void d(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float length = iArr.length == 0 ? 0.0f : (i10 - i12) / iArr.length;
        float f10 = length / 2;
        if (!z10) {
            int length2 = iArr.length;
            int i14 = 0;
            while (i11 < length2) {
                int i15 = iArr[i11];
                iArr2[i14] = Math.round(f10);
                f10 += i15 + length;
                i11++;
                i14++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i16 = iArr[length3];
            iArr2[length3] = Math.round(f10);
            f10 += i16 + length;
        }
    }

    public static void e(int i10, int[] iArr, int[] iArr2, boolean z10) {
        if (iArr.length == 0) {
            return;
        }
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float fMax = (i10 - i12) / Math.max(iArr.length - 1, 1);
        float f10 = (z10 && iArr.length == 1) ? fMax : 0.0f;
        if (z10) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i14 = iArr[length];
                iArr2[length] = Math.round(f10);
                f10 += i14 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i15 = 0;
        while (i11 < length2) {
            int i16 = iArr[i11];
            iArr2[i15] = Math.round(f10);
            f10 += i16 + fMax;
            i11++;
            i15++;
        }
    }

    public static void f(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float length = (i10 - i12) / (iArr.length + 1);
        if (z10) {
            float f10 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i14 = iArr[length2];
                iArr2[length2] = Math.round(f10);
                f10 += i14 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f11 = length;
        int i15 = 0;
        while (i11 < length3) {
            int i16 = iArr[i11];
            iArr2[i15] = Math.round(f11);
            f11 += i16 + length;
            i11++;
            i15++;
        }
    }

    public static i g(float f10) {
        return new i(f10, true, new Ia.p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$1
            @Override // Ia.p
            public final Integer invoke(Integer num, LayoutDirection layoutDirection) {
                return Integer.valueOf(Math.round((1 + (layoutDirection != LayoutDirection.f15717b ? (-1.0f) * (-1) : -1.0f)) * (num.intValue() / 2.0f)));
            }
        });
    }

    public static i h(float f10, final androidx.compose.ui.f.a aVar) {
        return new i(f10, true, new Ia.p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // Ia.p
            public final Integer invoke(Integer num, LayoutDirection layoutDirection) {
                return Integer.valueOf(aVar.a(0, num.intValue(), layoutDirection));
            }
        });
    }

    public static i i(float f10, final androidx.compose.ui.f.b bVar) {
        return new i(f10, false, new Ia.p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // Ia.p
            public final Integer invoke(Integer num, LayoutDirection layoutDirection) {
                return Integer.valueOf(bVar.a(0, num.intValue()));
            }
        });
    }
}
