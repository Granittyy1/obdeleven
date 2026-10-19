package com.voltasit.obdeleven.presentation;

import B8.M0;
import Ia.l;
import Ia.p;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.material.C1034j;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.material.V;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.core.view.O;
import androidx.core.view.Z;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g;
import com.voltasit.obdeleven.R;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: BaseFullScreenDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseFullScreenDialog extends DialogInterfaceOnCancelListenerC1342g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public M0 f31206r;

    public static /* synthetic */ void B(BaseFullScreenDialog baseFullScreenDialog, Integer num, l lVar, int i10) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        baseFullScreenDialog.A(num, (i10 & 2) != 0, lVar);
    }

    public final void A(Integer num, boolean z10, l<? super View, r> onClickListener) {
        i.e(onClickListener, "onClickListener");
        M0 m0X = x();
        m0X.f1755s.setNavigationOnClickListener(new b(0, onClickListener));
        if (z10) {
            x().f1755s.setNavigationIcon(R.drawable.baseline_arrow_back_24);
        } else {
            x().f1755s.setNavigationIcon(R.drawable.baseline_close_24);
        }
        if (num == null) {
            x().f1755s.setTitle("");
            return;
        }
        M0 m0X2 = x();
        m0X2.f1755s.setTitle(getString(num.intValue()));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        t();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(inflater, "inflater");
        LayoutInflater layoutInflater = getLayoutInflater();
        int i10 = M0.f1753t;
        M0 m7 = (M0) M0.e.a(layoutInflater, R.layout.full_screen_dialog, viewGroup, false, null);
        i.d(m7, "inflate(...)");
        this.f31206r = m7;
        View view = x().f4488d;
        i.d(view, "getRoot(...)");
        C4.b bVar = new C4.b(10);
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        O.d.u(view, bVar);
        M0 m0X = x();
        m0X.f1755s.setTitleTextColor(p0.a.b.a(requireContext(), R.color.white));
        M0 m0X2 = x();
        ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed disposeOnViewTreeLifecycleDestroyed = ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f14973a;
        ComposeView composeView = m0X2.f1754r;
        composeView.setViewCompositionStrategy(disposeOnViewTreeLifecycleDestroyed);
        composeView.setContent(new ComposableLambdaImpl(true, 1982633011, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.BaseFullScreenDialog$onCreateView$1$1
            {
                super(2);
            }

            @Override // Ia.p
            public final r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                if ((num.intValue() & 11) == 2 && interfaceC1084f2.s()) {
                    interfaceC1084f2.w();
                } else {
                    C1034j c1034j = e.f32277b;
                    V v10 = e.f32276a;
                    final BaseFullScreenDialog baseFullScreenDialog = this.this$0;
                    MaterialThemeKt.a(c1034j, v10, null, androidx.compose.runtime.internal.a.b(-2080503073, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.BaseFullScreenDialog$onCreateView$1$1.1
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f3, Integer num2) {
                            InterfaceC1084f interfaceC1084f4 = interfaceC1084f3;
                            if ((num2.intValue() & 11) == 2 && interfaceC1084f4.s()) {
                                interfaceC1084f4.w();
                            } else {
                                baseFullScreenDialog.w(interfaceC1084f4, 8);
                            }
                            return r.f47939a;
                        }
                    }, interfaceC1084f2), interfaceC1084f2, 3120, 4);
                }
                return r.f47939a;
            }
        }));
        z();
        View view2 = x().f4488d;
        i.d(view2, "getRoot(...)");
        return view2;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Dialog dialog = this.f17606m;
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
            }
            Window window2 = dialog.getWindow();
            if (window2 != null) {
                window2.setWindowAnimations(R.style.AppTheme_Slide);
            }
        }
    }

    public abstract void w(InterfaceC1084f interfaceC1084f, int i10);

    public final M0 x() {
        M0 m7 = this.f31206r;
        if (m7 != null) {
            return m7;
        }
        i.m("binding");
        throw null;
    }

    public final void y(final Ia.a<r> aVar) {
        Dialog dialog = this.f17606m;
        if (dialog != null) {
            dialog.setOnKeyListener(new DialogInterface.OnKeyListener(aVar) { // from class: com.voltasit.obdeleven.presentation.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Lambda f31371b;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.f31371b = (Lambda) aVar;
                }

                /* JADX WARN: Type inference failed for: r2v1, types: [Ia.a, kotlin.jvm.internal.Lambda] */
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                    ?? r10 = this.f31371b;
                    if (i10 != 4) {
                        return false;
                    }
                    if (keyEvent.getAction() != 1) {
                        return true;
                    }
                    r10.invoke();
                    return true;
                }
            });
        }
    }

    public void z() {
    }
}
