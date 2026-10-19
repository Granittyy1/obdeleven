package androidx.navigation.compose;

import androidx.compose.animation.InterfaceC0900c;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.X;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import com.google.android.gms.internal.measurement.Y;
import java.util.List;
import java.util.ListIterator;
import p141l2.C2749t;

/* JADX INFO: compiled from: NavHost.kt */
/* JADX INFO: loaded from: classes.dex */
public final class O implements Ia.r<InterfaceC0900c, C2749t, InterfaceC1084f, Integer, p293xa.r> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SeekableTransitionState<C2749t> f19142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2749t f19143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SaveableStateHolderImpl f19144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ X<Boolean> f19145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ N0<List<C2749t>> f19146f;

    public O(SeekableTransitionState seekableTransitionState, C2749t c2749t, SaveableStateHolderImpl saveableStateHolderImpl, X x10, N0 n10) {
        this.f19142b = seekableTransitionState;
        this.f19143c = c2749t;
        this.f19144d = saveableStateHolderImpl;
        this.f19145e = x10;
        this.f19146f = n10;
    }

    @Override // Ia.r
    public final p293xa.r invoke(InterfaceC0900c interfaceC0900c, C2749t c2749t, InterfaceC1084f interfaceC1084f, Integer num) {
        C2749t c2749tPrevious;
        InterfaceC0900c interfaceC0900c2 = interfaceC0900c;
        C2749t c2749t2 = c2749t;
        InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
        num.intValue();
        boolean zA = kotlin.jvm.internal.i.a(this.f19142b.f9406c.getValue(), this.f19143c);
        if (!this.f19145e.getValue().booleanValue() && !zA) {
            List<C2749t> value = this.f19146f.getValue();
            ListIterator<C2749t> listIterator = value.listIterator(value.size());
            do {
                if (!listIterator.hasPrevious()) {
                    c2749tPrevious = null;
                    break;
                }
                c2749tPrevious = listIterator.previous();
            } while (!kotlin.jvm.internal.i.a(c2749t2, c2749tPrevious));
            c2749t2 = c2749tPrevious;
        }
        if (c2749t2 == null) {
            interfaceC1084f2.L(105930796);
        } else {
            interfaceC1084f2.L(-1520603531);
            Y.c(c2749t2, this.f19144d, androidx.compose.runtime.internal.a.b(-1263531443, new N(c2749t2, interfaceC0900c2), interfaceC1084f2), interfaceC1084f2, 384);
        }
        interfaceC1084f2.D();
        return p293xa.r.f47939a;
    }
}
