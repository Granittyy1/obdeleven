package com.voltasit.obdeleven.presentation;

import Ia.p;
import M0.h;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.material.C1034j;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.material.V;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.lifecycle.InterfaceC1376t;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: BaseComposeFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseComposeFragment extends BaseFragment<h> {
    public abstract void O(InterfaceC1084f interfaceC1084f, int i10);

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(inflater, "inflater");
        super.onCreateView(inflater, viewGroup, bundle);
        Context contextRequireContext = requireContext();
        i.d(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, R.style.Root, 2);
        InterfaceC1376t viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        composeView.setViewCompositionStrategy(new ViewCompositionStrategy.a(viewLifecycleOwner));
        composeView.setContent(new ComposableLambdaImpl(true, -1334284665, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.BaseComposeFragment$onCreateView$view$1$1
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
                    final BaseComposeFragment baseComposeFragment = this.this$0;
                    MaterialThemeKt.a(c1034j, v10, null, androidx.compose.runtime.internal.a.b(998268507, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.BaseComposeFragment$onCreateView$view$1$1.1
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f3, Integer num2) {
                            InterfaceC1084f interfaceC1084f4 = interfaceC1084f3;
                            if ((num2.intValue() & 11) == 2 && interfaceC1084f4.s()) {
                                interfaceC1084f4.w();
                            } else {
                                baseComposeFragment.O(interfaceC1084f4, 0);
                            }
                            return r.f47939a;
                        }
                    }, interfaceC1084f2), interfaceC1084f2, 3120, 4);
                }
                return r.f47939a;
            }
        }));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        TypedValue typedValue = new TypedValue();
        if (requireActivity().getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true)) {
            marginLayoutParams.setMargins(0, TypedValue.complexToDimensionPixelSize(typedValue.data, composeView.getResources().getDisplayMetrics()), 0, 0);
            composeView.setLayoutParams(marginLayoutParams);
        }
        return composeView;
    }
}
