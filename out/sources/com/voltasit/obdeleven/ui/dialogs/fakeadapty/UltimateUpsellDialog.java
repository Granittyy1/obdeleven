package com.voltasit.obdeleven.ui.dialogs.fakeadapty;

import G8.C0706h;
import Ia.l;
import Ia.p;
import android.R;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g;
import java.util.List;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: UltimateUpsellDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class UltimateUpsellDialog extends DialogInterfaceOnCancelListenerC1342g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List<C0706h> f33946r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l<C0706h, r> f33947s;

    /* JADX WARN: Multi-variable type inference failed */
    public UltimateUpsellDialog(List<C0706h> creditProducts, l<? super C0706h, r> lVar) {
        i.e(creditProducts, "creditProducts");
        this.f33946r = creditProducts;
        this.f33947s = lVar;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        final Dialog dialog = new Dialog(requireContext(), R.style.Theme.NoTitleBar);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawableResource(R.color.transparent);
            window.getDecorView().setPadding(0, 0, 0, 0);
        }
        Context contextRequireContext = requireContext();
        i.d(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6);
        composeView.setContent(new ComposableLambdaImpl(true, -52569498, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.dialogs.fakeadapty.UltimateUpsellDialog$onCreateDialog$1$composeView$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // Ia.p
            public final r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                if ((num.intValue() & 11) == 2 && interfaceC1084f2.s()) {
                    interfaceC1084f2.w();
                } else {
                    final UltimateUpsellDialog ultimateUpsellDialog = this.this$0;
                    final Dialog dialog2 = dialog;
                    MaterialThemeKt.a(null, null, null, androidx.compose.runtime.internal.a.b(-1784820206, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.dialogs.fakeadapty.UltimateUpsellDialog$onCreateDialog$1$composeView$1$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f3, Integer num2) {
                            InterfaceC1084f interfaceC1084f4 = interfaceC1084f3;
                            if ((num2.intValue() & 11) == 2 && interfaceC1084f4.s()) {
                                interfaceC1084f4.w();
                            } else {
                                UltimateUpsellDialog ultimateUpsellDialog2 = ultimateUpsellDialog;
                                List<C0706h> list = ultimateUpsellDialog2.f33946r;
                                final Dialog dialog3 = dialog2;
                                UltimateUpsellDialogKt.a(list, ultimateUpsellDialog2.f33947s, new Ia.a<r>() { // from class: com.voltasit.obdeleven.ui.dialogs.fakeadapty.UltimateUpsellDialog.onCreateDialog.1.composeView.1.1.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final r invoke() {
                                        dialog3.dismiss();
                                        return r.f47939a;
                                    }
                                }, interfaceC1084f4, 8);
                            }
                            return r.f47939a;
                        }
                    }, interfaceC1084f2), interfaceC1084f2, 3072, 7);
                }
                return r.f47939a;
            }
        }));
        dialog.setContentView(composeView);
        return dialog;
    }
}
