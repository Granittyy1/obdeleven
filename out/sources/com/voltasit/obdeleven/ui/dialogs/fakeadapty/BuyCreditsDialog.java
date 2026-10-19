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
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: BuyCreditsDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class BuyCreditsDialog extends DialogInterfaceOnCancelListenerC1342g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List<C0706h> f33938r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Lambda f33939s;

    /* JADX WARN: Multi-variable type inference failed */
    public BuyCreditsDialog(List<C0706h> creditProducts, l<? super C0706h, r> lVar) {
        i.e(creditProducts, "creditProducts");
        this.f33938r = creditProducts;
        this.f33939s = (Lambda) lVar;
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
        composeView.setContent(new ComposableLambdaImpl(true, -387774682, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.dialogs.fakeadapty.BuyCreditsDialog$onCreateDialog$1$composeView$1$1
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
                    final BuyCreditsDialog buyCreditsDialog = this.this$0;
                    final Dialog dialog2 = dialog;
                    MaterialThemeKt.a(null, null, null, androidx.compose.runtime.internal.a.b(1383556818, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.dialogs.fakeadapty.BuyCreditsDialog$onCreateDialog$1$composeView$1$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Type inference failed for: r5v5, types: [Ia.l, kotlin.jvm.internal.Lambda] */
                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f3, Integer num2) {
                            InterfaceC1084f interfaceC1084f4 = interfaceC1084f3;
                            if ((num2.intValue() & 11) == 2 && interfaceC1084f4.s()) {
                                interfaceC1084f4.w();
                            } else {
                                BuyCreditsDialog buyCreditsDialog2 = buyCreditsDialog;
                                List<C0706h> list = buyCreditsDialog2.f33938r;
                                final Dialog dialog3 = dialog2;
                                a.a(list, buyCreditsDialog2.f33939s, new Ia.a<r>() { // from class: com.voltasit.obdeleven.ui.dialogs.fakeadapty.BuyCreditsDialog.onCreateDialog.1.composeView.1.1.1.1
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
