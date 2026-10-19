package io.intercom.android.sdk.ui.component;

import androidx.compose.foundation.C0937i;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.graphics.H;
import com.google.android.gms.internal.measurement.C1787c0;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: compiled from: IntercomButton.kt */
/* JADX INFO: loaded from: classes.dex */
public final class IntercomButton {
    public static final int $stable = 0;
    public static final IntercomButton INSTANCE = new IntercomButton();

    /* JADX INFO: compiled from: IntercomButton.kt */
    public static final class Style {
        public static final int $stable = 0;
        private final long backgroundColor;
        private final C0937i border;
        private final long contentColor;

        public /* synthetic */ Style(long j, long j10, C0937i c0937i, kotlin.jvm.internal.e eVar) {
            this(j, j10, c0937i);
        }

        /* JADX INFO: renamed from: copy-jxsXWHM$default, reason: not valid java name */
        public static /* synthetic */ Style m524copyjxsXWHM$default(Style style, long j, long j10, C0937i c0937i, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j = style.backgroundColor;
            }
            long j11 = j;
            if ((i10 & 2) != 0) {
                j10 = style.contentColor;
            }
            long j12 = j10;
            if ((i10 & 4) != 0) {
                c0937i = style.border;
            }
            return style.m527copyjxsXWHM(j11, j12, c0937i);
        }

        /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name */
        public final long m525component10d7_KjU() {
            return this.backgroundColor;
        }

        /* JADX INFO: renamed from: component2-0d7_KjU, reason: not valid java name */
        public final long m526component20d7_KjU() {
            return this.contentColor;
        }

        public final C0937i component3() {
            return this.border;
        }

        /* JADX INFO: renamed from: copy-jxsXWHM, reason: not valid java name */
        public final Style m527copyjxsXWHM(long j, long j10, C0937i border) {
            kotlin.jvm.internal.i.e(border, "border");
            return new Style(j, j10, border, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Style)) {
                return false;
            }
            Style style = (Style) obj;
            return H.c(this.backgroundColor, style.backgroundColor) && H.c(this.contentColor, style.contentColor) && kotlin.jvm.internal.i.a(this.border, style.border);
        }

        /* JADX INFO: renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
        public final long m528getBackgroundColor0d7_KjU() {
            return this.backgroundColor;
        }

        public final C0937i getBorder() {
            return this.border;
        }

        /* JADX INFO: renamed from: getContentColor-0d7_KjU, reason: not valid java name */
        public final long m529getContentColor0d7_KjU() {
            return this.contentColor;
        }

        public int hashCode() {
            long j = this.backgroundColor;
            int i10 = H.f13505m;
            return this.border.hashCode() + C4.b.c(this.contentColor, Long.hashCode(j) * 31, 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Style(backgroundColor=");
            C4.v.h(this.backgroundColor, ", contentColor=", sb2);
            C4.v.h(this.contentColor, ", border=", sb2);
            sb2.append(this.border);
            sb2.append(')');
            return sb2.toString();
        }

        private Style(long j, long j10, C0937i border) {
            kotlin.jvm.internal.i.e(border, "border");
            this.backgroundColor = j;
            this.contentColor = j10;
            this.border = border;
        }
    }

    private IntercomButton() {
    }

    /* JADX INFO: renamed from: outlinedStyle-Klgx-Pg, reason: not valid java name */
    public final Style m522outlinedStyleKlgxPg(long j, long j10, C0937i c0937i, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        interfaceC1084f.L(-1228695891);
        Style style = new Style((i11 & 1) != 0 ? IntercomTheme.INSTANCE.getColors(interfaceC1084f, 6).m621getBackground0d7_KjU() : j, (i11 & 2) != 0 ? IntercomTheme.INSTANCE.getColors(interfaceC1084f, 6).m645getPrimaryText0d7_KjU() : j10, (i11 & 4) != 0 ? C1787c0.a(1, IntercomTheme.INSTANCE.getColors(interfaceC1084f, 6).m623getBorder0d7_KjU()) : c0937i, null);
        interfaceC1084f.D();
        return style;
    }

    /* JADX INFO: renamed from: primaryStyle-Klgx-Pg, reason: not valid java name */
    public final Style m523primaryStyleKlgxPg(long j, long j10, C0937i c0937i, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        interfaceC1084f.L(-155594647);
        Style style = new Style((i11 & 1) != 0 ? IntercomTheme.INSTANCE.getColors(interfaceC1084f, 6).m621getBackground0d7_KjU() : j, (i11 & 2) != 0 ? IntercomTheme.INSTANCE.getColors(interfaceC1084f, 6).m645getPrimaryText0d7_KjU() : j10, (i11 & 4) != 0 ? C1787c0.a(1, IntercomTheme.INSTANCE.getColors(interfaceC1084f, 6).m623getBorder0d7_KjU()) : c0937i, null);
        interfaceC1084f.D();
        return style;
    }
}
