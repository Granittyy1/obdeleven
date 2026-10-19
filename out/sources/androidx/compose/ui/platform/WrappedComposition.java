package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.C1100n;
import androidx.compose.runtime.C1101n0;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1092j;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;
import com.voltasit.obdeleven.R;
import java.util.Set;

/* JADX INFO: compiled from: Wrapper.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class WrappedComposition implements InterfaceC1092j, androidx.lifecycle.r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AndroidComposeView f15008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1100n f15009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Lifecycle f15011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> f15012f = ComposableSingletons$Wrapper_androidKt.f14836a;

    public WrappedComposition(AndroidComposeView androidComposeView, C1100n c1100n) {
        this.f15008b = androidComposeView;
        this.f15009c = c1100n;
    }

    @Override // androidx.compose.runtime.InterfaceC1092j
    public final void dispose() {
        if (!this.f15010d) {
            this.f15010d = true;
            this.f15008b.getView().setTag(R.id.wrapped_composition_tag, null);
            Lifecycle lifecycle = this.f15011e;
            if (lifecycle != null) {
                lifecycle.c(this);
            }
        }
        this.f15009c.dispose();
    }

    @Override // androidx.lifecycle.r
    public final void h(InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            dispose();
        } else {
            if (event != Lifecycle.Event.ON_CREATE || this.f15010d) {
                return;
            }
            w(this.f15012f);
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1092j
    public final void w(final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar) {
        this.f15008b.setOnViewTreeOwnersAvailable(new Ia.l<AndroidComposeView.b, p293xa.r>() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(AndroidComposeView.b bVar) {
                AndroidComposeView.b bVar2 = bVar;
                if (!this.this$0.f15010d) {
                    Lifecycle lifecycle = bVar2.f14724a.getLifecycle();
                    WrappedComposition wrappedComposition = this.this$0;
                    wrappedComposition.f15012f = pVar;
                    if (wrappedComposition.f15011e == null) {
                        wrappedComposition.f15011e = lifecycle;
                        lifecycle.a(wrappedComposition);
                    } else if (lifecycle.b().compareTo(Lifecycle.State.f17751d) >= 0) {
                        final WrappedComposition wrappedComposition2 = this.this$0;
                        C1100n c1100n = wrappedComposition2.f15009c;
                        final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                        c1100n.w(new ComposableLambdaImpl(true, -2000640158, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                                InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                                int iIntValue = num.intValue();
                                boolean z10 = true;
                                if (interfaceC1084f2.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    Object tag = wrappedComposition2.f15008b.getTag(R.id.inspection_slot_table_set);
                                    if (!(tag instanceof Set) || ((tag instanceof Ja.a) && !(tag instanceof Ja.e))) {
                                        z10 = false;
                                    }
                                    Set set = z10 ? (Set) tag : null;
                                    if (set == null) {
                                        Object parent = wrappedComposition2.f15008b.getParent();
                                        View view = parent instanceof View ? (View) parent : null;
                                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                                        set = (!(tag2 instanceof Set) || ((tag2 instanceof Ja.a) && !(tag2 instanceof Ja.e))) ? null : (Set) tag2;
                                    }
                                    if (set != null) {
                                        set.add(interfaceC1084f2.j());
                                        interfaceC1084f2.a();
                                    }
                                    WrappedComposition wrappedComposition3 = wrappedComposition2;
                                    AndroidComposeView androidComposeView = wrappedComposition3.f15008b;
                                    boolean zK = interfaceC1084f2.k(wrappedComposition3);
                                    WrappedComposition wrappedComposition4 = wrappedComposition2;
                                    Object objF = interfaceC1084f2.f();
                                    InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                                    if (zK || objF == c0153a) {
                                        objF = new WrappedComposition$setContent$1$1$1$1(wrappedComposition4, null);
                                        interfaceC1084f2.E(objF);
                                    }
                                    androidx.compose.runtime.E.d((Ia.p) objF, interfaceC1084f2, androidComposeView);
                                    WrappedComposition wrappedComposition5 = wrappedComposition2;
                                    AndroidComposeView androidComposeView2 = wrappedComposition5.f15008b;
                                    boolean zK2 = interfaceC1084f2.k(wrappedComposition5);
                                    WrappedComposition wrappedComposition6 = wrappedComposition2;
                                    Object objF2 = interfaceC1084f2.f();
                                    if (zK2 || objF2 == c0153a) {
                                        objF2 = new WrappedComposition$setContent$1$1$2$1(wrappedComposition6, null);
                                        interfaceC1084f2.E(objF2);
                                    }
                                    androidx.compose.runtime.E.d((Ia.p) objF2, interfaceC1084f2, androidComposeView2);
                                    C1101n0 c1101n0B = InspectionTablesKt.f13244a.b(set);
                                    final WrappedComposition wrappedComposition7 = wrappedComposition2;
                                    final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar3 = pVar2;
                                    CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(-1193460702, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.ui.platform.WrappedComposition.setContent.1.1.3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // Ia.p
                                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num2) {
                                            InterfaceC1084f interfaceC1084f4 = interfaceC1084f3;
                                            int iIntValue2 = num2.intValue();
                                            if (interfaceC1084f4.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                AndroidCompositionLocals_androidKt.a(wrappedComposition7.f15008b, pVar3, interfaceC1084f4, 0);
                                            } else {
                                                interfaceC1084f4.w();
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f2), interfaceC1084f2, 56);
                                } else {
                                    interfaceC1084f2.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }));
                    }
                }
                return p293xa.r.f47939a;
            }
        });
    }
}
