package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.InterfaceC1175v;
import androidx.compose.ui.layout.Y;
import androidx.compose.ui.unit.LayoutDirection;
import com.braze.support.BrazeLogger;

/* JADX INFO: compiled from: TextFieldScroll.kt */
/* JADX INFO: loaded from: classes.dex */
public final class HorizontalScrollLayoutModifier implements InterfaceC1175v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextFieldScrollerPosition f11121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.compose.ui.text.input.D f11123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ia.a<A> f11124e;

    public HorizontalScrollLayoutModifier(TextFieldScrollerPosition textFieldScrollerPosition, int i10, androidx.compose.ui.text.input.D d10, Ia.a<A> aVar) {
        this.f11121b = textFieldScrollerPosition;
        this.f11122c = i10;
        this.f11123d = d10;
        this.f11124e = aVar;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1175v
    public final androidx.compose.ui.layout.F B(final androidx.compose.ui.layout.H h8, androidx.compose.ui.layout.D d10, long j) {
        final Y yQ = d10.Q(d10.J(p013b0.a.g(j)) < p013b0.a.h(j) ? j : p013b0.a.a(j, 0, BrazeLogger.SUPPRESS, 0, 0, 13));
        final int iMin = Math.min(yQ.f14220b, p013b0.a.h(j));
        return h8.y1(iMin, yQ.f14221c, kotlin.collections.y.p(), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.text.HorizontalScrollLayoutModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Y.a aVar) {
                Y.a aVar2 = aVar;
                androidx.compose.ui.layout.H h10 = h8;
                HorizontalScrollLayoutModifier horizontalScrollLayoutModifier = this;
                int i10 = horizontalScrollLayoutModifier.f11122c;
                A aInvoke = horizontalScrollLayoutModifier.f11124e.invoke();
                this.f11121b.a(Orientation.f9958c, Fa.d.a(h10, i10, horizontalScrollLayoutModifier.f11123d, aInvoke != null ? aInvoke.f11055a : null, h8.getLayoutDirection() == LayoutDirection.f15718c, yQ.f14220b), iMin, yQ.f14220b);
                Y.a.g(aVar2, yQ, Math.round(-this.f11121b.f11226a.j()), 0);
                return p293xa.r.f47939a;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HorizontalScrollLayoutModifier)) {
            return false;
        }
        HorizontalScrollLayoutModifier horizontalScrollLayoutModifier = (HorizontalScrollLayoutModifier) obj;
        return kotlin.jvm.internal.i.a(this.f11121b, horizontalScrollLayoutModifier.f11121b) && this.f11122c == horizontalScrollLayoutModifier.f11122c && kotlin.jvm.internal.i.a(this.f11123d, horizontalScrollLayoutModifier.f11123d) && kotlin.jvm.internal.i.a(this.f11124e, horizontalScrollLayoutModifier.f11124e);
    }

    public final int hashCode() {
        return this.f11124e.hashCode() + ((this.f11123d.hashCode() + p005a4.q.b(this.f11122c, this.f11121b.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f11121b + ", cursorOffset=" + this.f11122c + ", transformedText=" + this.f11123d + ", textLayoutResultProvider=" + this.f11124e + ')';
    }
}
