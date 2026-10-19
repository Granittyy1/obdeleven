package io.intercom.android.sdk.ui.component;

import androidx.compose.foundation.C0937i;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.l0;
import com.google.android.gms.internal.measurement.C1787c0;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: compiled from: IntercomCard.kt */
/* JADX INFO: loaded from: classes.dex */
public final class IntercomCardStyle {
    public static final int $stable = 0;
    public static final IntercomCardStyle INSTANCE = new IntercomCardStyle();

    /* JADX INFO: compiled from: IntercomCard.kt */
    public static final class Style {
        public static final int $stable = 0;
        private final long backgroundColor;
        private final C0937i border;
        private final long contentColor;
        private final float elevation;
        private final H shadowColor;
        private final l0 shape;

        public /* synthetic */ Style(l0 l0Var, long j, long j10, float f10, C0937i c0937i, H h8, kotlin.jvm.internal.e eVar) {
            this(l0Var, j, j10, f10, c0937i, h8);
        }

        public final l0 component1() {
            return this.shape;
        }

        /* JADX INFO: renamed from: component2-0d7_KjU, reason: not valid java name */
        public final long m533component20d7_KjU() {
            return this.backgroundColor;
        }

        /* JADX INFO: renamed from: component3-0d7_KjU, reason: not valid java name */
        public final long m534component30d7_KjU() {
            return this.contentColor;
        }

        /* JADX INFO: renamed from: component4-D9Ej5fM, reason: not valid java name */
        public final float m535component4D9Ej5fM() {
            return this.elevation;
        }

        public final C0937i component5() {
            return this.border;
        }

        /* JADX INFO: renamed from: component6-QN2ZGVo, reason: not valid java name */
        public final H m536component6QN2ZGVo() {
            return this.shadowColor;
        }

        /* JADX INFO: renamed from: copy-UBuVVS8, reason: not valid java name */
        public final Style m537copyUBuVVS8(l0 shape, long j, long j10, float f10, C0937i border, H h8) {
            kotlin.jvm.internal.i.e(shape, "shape");
            kotlin.jvm.internal.i.e(border, "border");
            return new Style(shape, j, j10, f10, border, h8, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Style)) {
                return false;
            }
            Style style = (Style) obj;
            return kotlin.jvm.internal.i.a(this.shape, style.shape) && H.c(this.backgroundColor, style.backgroundColor) && H.c(this.contentColor, style.contentColor) && p013b0.f.a(this.elevation, style.elevation) && kotlin.jvm.internal.i.a(this.border, style.border) && kotlin.jvm.internal.i.a(this.shadowColor, style.shadowColor);
        }

        /* JADX INFO: renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
        public final long m538getBackgroundColor0d7_KjU() {
            return this.backgroundColor;
        }

        public final C0937i getBorder() {
            return this.border;
        }

        /* JADX INFO: renamed from: getContentColor-0d7_KjU, reason: not valid java name */
        public final long m539getContentColor0d7_KjU() {
            return this.contentColor;
        }

        /* JADX INFO: renamed from: getElevation-D9Ej5fM, reason: not valid java name */
        public final float m540getElevationD9Ej5fM() {
            return this.elevation;
        }

        /* JADX INFO: renamed from: getShadowColor-QN2ZGVo, reason: not valid java name */
        public final H m541getShadowColorQN2ZGVo() {
            return this.shadowColor;
        }

        public final l0 getShape() {
            return this.shape;
        }

        public int hashCode() {
            int iHashCode = this.shape.hashCode() * 31;
            long j = this.backgroundColor;
            int i10 = H.f13505m;
            int iHashCode2 = (this.border.hashCode() + O.a.d(this.elevation, C4.b.c(this.contentColor, C4.b.c(j, iHashCode, 31), 31), 31)) * 31;
            H h8 = this.shadowColor;
            return iHashCode2 + (h8 == null ? 0 : Long.hashCode(h8.f13506a));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Style(shape=");
            sb2.append(this.shape);
            sb2.append(", backgroundColor=");
            C4.v.h(this.backgroundColor, ", contentColor=", sb2);
            C4.v.h(this.contentColor, ", elevation=", sb2);
            sb2.append((Object) p013b0.f.b(this.elevation));
            sb2.append(", border=");
            sb2.append(this.border);
            sb2.append(", shadowColor=");
            sb2.append(this.shadowColor);
            sb2.append(')');
            return sb2.toString();
        }

        private Style(l0 shape, long j, long j10, float f10, C0937i border, H h8) {
            kotlin.jvm.internal.i.e(shape, "shape");
            kotlin.jvm.internal.i.e(border, "border");
            this.shape = shape;
            this.backgroundColor = j;
            this.contentColor = j10;
            this.elevation = f10;
            this.border = border;
            this.shadowColor = h8;
        }
    }

    private IntercomCardStyle() {
    }

    /* JADX INFO: renamed from: conversationCardStyle-PEIptTM, reason: not valid java name */
    public final Style m530conversationCardStylePEIptTM(l0 l0Var, long j, long j10, float f10, C0937i c0937i, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        interfaceC1084f.L(-1707188824);
        Style style = new Style((i11 & 1) != 0 ? p270w.g.b(20) : l0Var, (i11 & 2) != 0 ? IntercomTheme.INSTANCE.getColors(interfaceC1084f, 6).m621getBackground0d7_KjU() : j, (i11 & 4) != 0 ? IntercomTheme.INSTANCE.getColors(interfaceC1084f, 6).m645getPrimaryText0d7_KjU() : j10, (i11 & 8) != 0 ? 0 : f10, (i11 & 16) != 0 ? C1787c0.a(1, IntercomTheme.INSTANCE.getColors(interfaceC1084f, 6).m623getBorder0d7_KjU()) : c0937i, null, null);
        interfaceC1084f.D();
        return style;
    }

    /* JADX INFO: renamed from: defaultStyle-qUnfpCA, reason: not valid java name */
    public final Style m531defaultStyleqUnfpCA(l0 l0Var, long j, long j10, float f10, C0937i c0937i, long j11, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        interfaceC1084f.L(-952876659);
        Style style = new Style((i11 & 1) != 0 ? IntercomTheme.INSTANCE.getShapes(interfaceC1084f, 6).f12431c : l0Var, (i11 & 2) != 0 ? IntercomTheme.INSTANCE.getColors(interfaceC1084f, 6).m621getBackground0d7_KjU() : j, (i11 & 4) != 0 ? IntercomTheme.INSTANCE.getColors(interfaceC1084f, 6).m645getPrimaryText0d7_KjU() : j10, (i11 & 8) != 0 ? 6 : f10, (i11 & 16) != 0 ? C1787c0.a(1, H.b(0.9f, IntercomTheme.INSTANCE.getColors(interfaceC1084f, 6).m623getBorder0d7_KjU())) : c0937i, new H((i11 & 32) != 0 ? IntercomTheme.INSTANCE.getColors(interfaceC1084f, 6).m647getShadow0d7_KjU() : j11), null);
        interfaceC1084f.D();
        return style;
    }
}
