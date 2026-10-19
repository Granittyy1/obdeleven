package androidx.compose.foundation.layout;

import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: compiled from: Box.kt */
/* JADX INFO: loaded from: classes.dex */
public final class BoxMeasurePolicy implements androidx.compose.ui.layout.E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.ui.d f10100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10101b;

    public BoxMeasurePolicy(androidx.compose.ui.d dVar, boolean z10) {
        this.f10100a = dVar;
        this.f10101b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoxMeasurePolicy)) {
            return false;
        }
        BoxMeasurePolicy boxMeasurePolicy = (BoxMeasurePolicy) obj;
        return kotlin.jvm.internal.i.a(this.f10100a, boxMeasurePolicy.f10100a) && this.f10101b == boxMeasurePolicy.f10101b;
    }

    @Override // androidx.compose.ui.layout.E
    public final androidx.compose.ui.layout.F g(final androidx.compose.ui.layout.H h8, final List<? extends androidx.compose.ui.layout.D> list, long j) {
        int iJ;
        int i10;
        androidx.compose.ui.layout.Y yQ;
        if (list.isEmpty()) {
            return h8.y1(p013b0.a.j(j), p013b0.a.i(j), kotlin.collections.y.p(), new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$measure$1
                @Override // Ia.l
                public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar) {
                    return p293xa.r.f47939a;
                }
            });
        }
        long j10 = this.f10101b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            final androidx.compose.ui.layout.D d10 = list.get(0);
            androidx.collection.K<androidx.compose.ui.d, androidx.compose.ui.layout.E> k10 = BoxKt.f10095a;
            Object objQ = d10.q();
            C0947g c0947g = objQ instanceof C0947g ? (C0947g) objQ : null;
            if (c0947g != null ? c0947g.f10303q : false) {
                iJ = p013b0.a.j(j);
                i10 = p013b0.a.i(j);
                int iJ2 = p013b0.a.j(j);
                int i11 = p013b0.a.i(j);
                if (!((i11 >= 0) & (iJ2 >= 0))) {
                    p013b0.i.a("width and height must be >= 0");
                }
                yQ = d10.Q(p013b0.b.h(iJ2, iJ2, i11, i11));
            } else {
                yQ = d10.Q(j10);
                iJ = Math.max(p013b0.a.j(j), yQ.f14220b);
                i10 = Math.max(p013b0.a.i(j), yQ.f14221c);
            }
            final int i12 = iJ;
            final int i13 = i10;
            final androidx.compose.ui.layout.Y y10 = yQ;
            return h8.y1(i12, i13, kotlin.collections.y.p(), new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$measure$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar) {
                    BoxKt.b(aVar, y10, d10, h8.getLayoutDirection(), i12, i13, this.f10100a);
                    return p293xa.r.f47939a;
                }
            });
        }
        final androidx.compose.ui.layout.Y[] yArr = new androidx.compose.ui.layout.Y[list.size()];
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = p013b0.a.j(j);
        final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = p013b0.a.i(j);
        List<? extends androidx.compose.ui.layout.D> list2 = list;
        int size = list2.size();
        boolean z10 = false;
        for (int i14 = 0; i14 < size; i14++) {
            androidx.compose.ui.layout.D d11 = list.get(i14);
            androidx.collection.K<androidx.compose.ui.d, androidx.compose.ui.layout.E> k11 = BoxKt.f10095a;
            Object objQ2 = d11.q();
            C0947g c0947g2 = objQ2 instanceof C0947g ? (C0947g) objQ2 : null;
            if (c0947g2 != null ? c0947g2.f10303q : false) {
                z10 = true;
            } else {
                androidx.compose.ui.layout.Y yQ2 = d11.Q(j10);
                yArr[i14] = yQ2;
                ref$IntRef.element = Math.max(ref$IntRef.element, yQ2.f14220b);
                ref$IntRef2.element = Math.max(ref$IntRef2.element, yQ2.f14221c);
            }
        }
        if (z10) {
            int i15 = ref$IntRef.element;
            int i16 = i15 != Integer.MAX_VALUE ? i15 : 0;
            int i17 = ref$IntRef2.element;
            long jA = p013b0.b.a(i16, i15, i17 != Integer.MAX_VALUE ? i17 : 0, i17);
            int size2 = list2.size();
            for (int i18 = 0; i18 < size2; i18++) {
                androidx.compose.ui.layout.D d12 = list.get(i18);
                androidx.collection.K<androidx.compose.ui.d, androidx.compose.ui.layout.E> k12 = BoxKt.f10095a;
                Object objQ3 = d12.q();
                C0947g c0947g3 = objQ3 instanceof C0947g ? (C0947g) objQ3 : null;
                if (c0947g3 != null ? c0947g3.f10303q : false) {
                    yArr[i18] = d12.Q(jA);
                }
            }
        }
        return h8.y1(ref$IntRef.element, ref$IntRef2.element, kotlin.collections.y.p(), new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$measure$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar) {
                androidx.compose.ui.layout.Y.a aVar2 = aVar;
                androidx.compose.ui.layout.Y[] yArr2 = yArr;
                List<androidx.compose.ui.layout.D> list3 = list;
                androidx.compose.ui.layout.H h10 = h8;
                Ref$IntRef ref$IntRef3 = ref$IntRef;
                Ref$IntRef ref$IntRef4 = ref$IntRef2;
                BoxMeasurePolicy boxMeasurePolicy = this;
                int length = yArr2.length;
                int i19 = 0;
                int i20 = 0;
                while (i20 < length) {
                    androidx.compose.ui.layout.Y y11 = yArr2[i20];
                    kotlin.jvm.internal.i.c(y11, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    BoxKt.b(aVar2, y11, list3.get(i19), h10.getLayoutDirection(), ref$IntRef3.element, ref$IntRef4.element, boxMeasurePolicy.f10100a);
                    i20++;
                    i19++;
                }
                return p293xa.r.f47939a;
            }
        });
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10101b) + (this.f10100a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb2.append(this.f10100a);
        sb2.append(", propagateMinConstraints=");
        return Z3.o.d(sb2, this.f10101b, ')');
    }
}
