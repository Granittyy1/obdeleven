package com.voltasit.obdeleven.presentation.vagpromo;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.core.view.O;
import androidx.core.view.Z;
import androidx.core.view.b0;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.oca.f;
import java.util.WeakHashMap;
import kotlin.jvm.internal.i;
import p005a4.q;
import p100i.n;
import p293xa.r;

/* JADX INFO: compiled from: VagProRedirectPromoDialogFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends n {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Ia.a<r> f33366r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Ia.a<r> f33367s;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.dialog_vag_pro_redirect_promo, viewGroup, false);
        i.d(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = this.f17606m;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        b0.a(window, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        q qVar = new q();
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        O.d.u(view, qVar);
        O.c.c(view);
        ((TextView) view.findViewById(R.id.vagProPromo_title)).setText(R.string.vag_pro_redirect_promo_title);
        ((TextView) view.findViewById(R.id.vagProPromo_message)).setText(R.string.vag_pro_redirect_promo_subtitle);
        ((ImageButton) view.findViewById(R.id.vagProPromo_close)).setOnClickListener(new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.vagpromo.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                c this$0 = this.f33363b;
                i.e(this$0, "this$0");
                Ia.a<r> aVar = this$0.f33367s;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        });
        ((Button) view.findViewById(R.id.vagProPromo_switchApp)).setText(R.string.vag_pro_redirect_switch_app);
        ((Button) view.findViewById(R.id.vagProPromo_switchApp)).setOnClickListener(new f(this, 1));
        ((Button) view.findViewById(R.id.vagProPromo_notNow)).setText(R.string.vag_pro_redirect_not_now);
        ((Button) view.findViewById(R.id.vagProPromo_notNow)).setOnClickListener(new b(0, this));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final int q() {
        return R.style.AppTheme_FullScreenDialog;
    }
}
