package androidx.compose.ui.node;

import androidx.compose.ui.layout.AbstractC1155a;
import androidx.compose.ui.layout.InterfaceC1156b;
import androidx.compose.ui.layout.InterfaceC1157c;
import androidx.compose.ui.layout.InterfaceC1166l;

/* JADX INFO: compiled from: LayoutModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class NodeMeasuringIntrinsics {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: LayoutModifierNode.kt */
    public static final class IntrinsicMinMax {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final IntrinsicMinMax f14540b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final IntrinsicMinMax f14541c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ IntrinsicMinMax[] f14542d;

        static {
            IntrinsicMinMax intrinsicMinMax = new IntrinsicMinMax("Min", 0);
            f14540b = intrinsicMinMax;
            IntrinsicMinMax intrinsicMinMax2 = new IntrinsicMinMax("Max", 1);
            f14541c = intrinsicMinMax2;
            IntrinsicMinMax[] intrinsicMinMaxArr = {intrinsicMinMax, intrinsicMinMax2};
            f14542d = intrinsicMinMaxArr;
            kotlin.enums.a.a(intrinsicMinMaxArr);
        }

        public IntrinsicMinMax() {
            throw null;
        }

        public static IntrinsicMinMax valueOf(String str) {
            return (IntrinsicMinMax) Enum.valueOf(IntrinsicMinMax.class, str);
        }

        public static IntrinsicMinMax[] values() {
            return (IntrinsicMinMax[]) f14542d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: LayoutModifierNode.kt */
    public static final class IntrinsicWidthHeight {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final IntrinsicWidthHeight f14543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final IntrinsicWidthHeight f14544c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ IntrinsicWidthHeight[] f14545d;

        static {
            IntrinsicWidthHeight intrinsicWidthHeight = new IntrinsicWidthHeight("Width", 0);
            f14543b = intrinsicWidthHeight;
            IntrinsicWidthHeight intrinsicWidthHeight2 = new IntrinsicWidthHeight("Height", 1);
            f14544c = intrinsicWidthHeight2;
            IntrinsicWidthHeight[] intrinsicWidthHeightArr = {intrinsicWidthHeight, intrinsicWidthHeight2};
            f14545d = intrinsicWidthHeightArr;
            kotlin.enums.a.a(intrinsicWidthHeightArr);
        }

        public IntrinsicWidthHeight() {
            throw null;
        }

        public static IntrinsicWidthHeight valueOf(String str) {
            return (IntrinsicWidthHeight) Enum.valueOf(IntrinsicWidthHeight.class, str);
        }

        public static IntrinsicWidthHeight[] values() {
            return (IntrinsicWidthHeight[]) f14545d.clone();
        }
    }

    /* JADX INFO: compiled from: LayoutModifierNode.kt */
    public static final class a implements androidx.compose.ui.layout.D {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC1166l f14546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IntrinsicMinMax f14547c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final IntrinsicWidthHeight f14548d;

        public a(InterfaceC1166l interfaceC1166l, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
            this.f14546b = interfaceC1166l;
            this.f14547c = intrinsicMinMax;
            this.f14548d = intrinsicWidthHeight;
        }

        @Override // androidx.compose.ui.layout.InterfaceC1166l
        public final int I(int i10) {
            return this.f14546b.I(i10);
        }

        @Override // androidx.compose.ui.layout.InterfaceC1166l
        public final int J(int i10) {
            return this.f14546b.J(i10);
        }

        @Override // androidx.compose.ui.layout.D
        public final androidx.compose.ui.layout.Y Q(long j) {
            IntrinsicWidthHeight intrinsicWidthHeight = IntrinsicWidthHeight.f14543b;
            IntrinsicMinMax intrinsicMinMax = this.f14547c;
            IntrinsicWidthHeight intrinsicWidthHeight2 = this.f14548d;
            InterfaceC1166l interfaceC1166l = this.f14546b;
            if (intrinsicWidthHeight2 == intrinsicWidthHeight) {
                return new b(intrinsicMinMax == IntrinsicMinMax.f14541c ? interfaceC1166l.J(p013b0.a.g(j)) : interfaceC1166l.I(p013b0.a.g(j)), p013b0.a.c(j) ? p013b0.a.g(j) : 32767);
            }
            return new b(p013b0.a.d(j) ? p013b0.a.h(j) : 32767, intrinsicMinMax == IntrinsicMinMax.f14541c ? interfaceC1166l.s(p013b0.a.h(j)) : interfaceC1166l.k0(p013b0.a.h(j)));
        }

        @Override // androidx.compose.ui.layout.InterfaceC1166l
        public final int k0(int i10) {
            return this.f14546b.k0(i10);
        }

        @Override // androidx.compose.ui.layout.InterfaceC1166l
        public final Object q() {
            return this.f14546b.q();
        }

        @Override // androidx.compose.ui.layout.InterfaceC1166l
        public final int s(int i10) {
            return this.f14546b.s(i10);
        }
    }

    public static int a(InterfaceC1157c.a aVar, InterfaceC1156b interfaceC1156b, InterfaceC1166l interfaceC1166l, int i10) {
        IntrinsicMinMax intrinsicMinMax = IntrinsicMinMax.f14540b;
        IntrinsicWidthHeight intrinsicWidthHeight = IntrinsicWidthHeight.f14543b;
        p013b0.b.b(i10, 0, 13);
        interfaceC1156b.getLayoutDirection();
        return InterfaceC1157c.this.p0().getHeight();
    }

    public static int b(InterfaceC1157c.b bVar, InterfaceC1156b interfaceC1156b, InterfaceC1166l interfaceC1166l, int i10) {
        IntrinsicMinMax intrinsicMinMax = IntrinsicMinMax.f14540b;
        IntrinsicWidthHeight intrinsicWidthHeight = IntrinsicWidthHeight.f14543b;
        p013b0.b.b(0, i10, 7);
        interfaceC1156b.getLayoutDirection();
        return InterfaceC1157c.this.p0().getWidth();
    }

    public static int c(InterfaceC1157c.C0158c c0158c, InterfaceC1156b interfaceC1156b, InterfaceC1166l interfaceC1166l, int i10) {
        IntrinsicMinMax intrinsicMinMax = IntrinsicMinMax.f14540b;
        IntrinsicWidthHeight intrinsicWidthHeight = IntrinsicWidthHeight.f14543b;
        p013b0.b.b(i10, 0, 13);
        interfaceC1156b.getLayoutDirection();
        return InterfaceC1157c.this.p0().getHeight();
    }

    public static int d(InterfaceC1157c.d dVar, InterfaceC1156b interfaceC1156b, InterfaceC1166l interfaceC1166l, int i10) {
        IntrinsicMinMax intrinsicMinMax = IntrinsicMinMax.f14540b;
        IntrinsicWidthHeight intrinsicWidthHeight = IntrinsicWidthHeight.f14543b;
        p013b0.b.b(0, i10, 7);
        interfaceC1156b.getLayoutDirection();
        return InterfaceC1157c.this.p0().getWidth();
    }

    /* JADX INFO: compiled from: LayoutModifierNode.kt */
    public static final class b extends androidx.compose.ui.layout.Y {
        public b(int i10, int i11) {
            t0((((long) i11) & 4294967295L) | (((long) i10) << 32));
        }

        @Override // androidx.compose.ui.layout.I
        public final int V(AbstractC1155a abstractC1155a) {
            return Integer.MIN_VALUE;
        }

        @Override // androidx.compose.ui.layout.Y
        public final void q0(long j, float f10, Ia.l<? super androidx.compose.ui.graphics.U, p293xa.r> lVar) {
        }
    }
}
