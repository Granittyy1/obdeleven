package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.InterfaceC1175v;
import androidx.compose.ui.layout.Y;
import com.braze.support.BrazeLogger;

/* JADX INFO: compiled from: TextFieldScroll.kt */
/* JADX INFO: loaded from: classes.dex */
public final class VerticalScrollLayoutModifier implements InterfaceC1175v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextFieldScrollerPosition f11243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.compose.ui.text.input.D f11245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ia.a<A> f11246e;

    public VerticalScrollLayoutModifier(TextFieldScrollerPosition textFieldScrollerPosition, int i10, androidx.compose.ui.text.input.D d10, Ia.a<A> aVar) {
        this.f11243b = textFieldScrollerPosition;
        this.f11244c = i10;
        this.f11245d = d10;
        this.f11246e = aVar;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1175v
    public final androidx.compose.ui.layout.F B(final androidx.compose.ui.layout.H h8, androidx.compose.ui.layout.D d10, long j) {
        final Y yQ = d10.Q(p013b0.a.a(j, 0, 0, 0, BrazeLogger.SUPPRESS, 7));
        final int iMin = Math.min(yQ.f14221c, p013b0.a.g(j));
        return h8.y1(yQ.f14220b, iMin, kotlin.collections.y.p(), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.text.VerticalScrollLayoutModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Y.a aVar) {
                Y.a aVar2 = aVar;
                androidx.compose.ui.layout.H h10 = h8;
                VerticalScrollLayoutModifier verticalScrollLayoutModifier = this;
                int i10 = verticalScrollLayoutModifier.f11244c;
                A aInvoke = verticalScrollLayoutModifier.f11246e.invoke();
                this.f11243b.a(Orientation.f9957b, Fa.d.a(h10, i10, verticalScrollLayoutModifier.f11245d, aInvoke != null ? aInvoke.f11055a : null, false, yQ.f14220b), iMin, yQ.f14221c);
                Y.a.g(aVar2, yQ, 0, Math.round(-this.f11243b.f11226a.j()));
                return p293xa.r.f47939a;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerticalScrollLayoutModifier)) {
            return false;
        }
        VerticalScrollLayoutModifier verticalScrollLayoutModifier = (VerticalScrollLayoutModifier) obj;
        return kotlin.jvm.internal.i.a(this.f11243b, verticalScrollLayoutModifier.f11243b) && this.f11244c == verticalScrollLayoutModifier.f11244c && kotlin.jvm.internal.i.a(this.f11245d, verticalScrollLayoutModifier.f11245d) && kotlin.jvm.internal.i.a(this.f11246e, verticalScrollLayoutModifier.f11246e);
    }

    public final int hashCode() {
        return this.f11246e.hashCode() + ((this.f11245d.hashCode() + p005a4.q.b(this.f11244c, this.f11243b.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f11243b + ", cursorOffset=" + this.f11244c + ", transformedText=" + this.f11245d + ", textLayoutResultProvider=" + this.f11246e + ')';
    }
}
