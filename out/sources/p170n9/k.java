package p170n9;

import V8.j;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.models.Nrc;
import com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.a;
import com.voltasit.obdeleven.ui.dialogs.B;
import com.voltasit.parse.model.AdaptationType;
import kotlin.jvm.internal.i;
import kotlin.text.l;
import p121j8.c;

/* JADX INFO: compiled from: OfflineControlUnitAdaptationFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends a implements View.OnLongClickListener {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public c f45018L;

    @Override // com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.a, com.voltasit.obdeleven.ui.module.BaseFragment
    public final View B(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(inflater, "inflater");
        View viewB = super.B(inflater, viewGroup, bundle);
        Z().setFocusable(false);
        Z().setLongClickable(false);
        Z().setClickable(false);
        Y().setFocusable(false);
        Y().setClickable(false);
        Y().setLongClickable(false);
        if (this.f31670D == AdaptationType.LONG_ADAPTATION) {
            X().setText("ASCII");
        }
        return viewB;
    }

    @Override // com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.a
    public final void c0() {
        SwipeRefreshLayout swipeRefreshLayout = this.f31679o;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(true);
        }
        W().setEnabled(false);
        ControlUnit controlUnit = this.f31668B;
        i.b(controlUnit);
        controlUnit.f29320b.fetchInBackground().continueWith(new j(7, this));
    }

    @Override // com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.a
    public final void e0() {
        if (this.f45018L != null) {
            new B(q(), this.f45018L, 4).b();
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "OfflineControlUnitAdaptationFragment";
    }

    @Override // com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.a, android.view.View.OnClickListener
    public final void onClick(View v10) {
        i.e(v10, "v");
        switch (v10.getId()) {
            case R.id.controlUnitAdaptationFragment_channelLayout /* 2131362198 */:
                U();
                break;
            case R.id.controlUnitAdaptationFragment_hexAscii /* 2131362202 */:
                Y().setText("");
                Z().setError("");
                if (!i.a(b0().getText(), getText(R.string.common_not_available_offline)) && !i.a(b0().getText(), getText(R.string.common_not_available))) {
                    Nrc.a aVar = Nrc.f30496b;
                    String hex = b0().getText().toString();
                    aVar.getClass();
                    i.e(hex, "hex");
                    Integer numZ = l.z(16, hex);
                    Nrc nrc = null;
                    if (numZ != null) {
                        int iIntValue = numZ.intValue();
                        for (Nrc nrc2 : Nrc.f30497c) {
                            if (nrc2.a() == iIntValue) {
                                nrc = nrc2;
                            }
                        }
                    }
                    if (nrc == null) {
                        g0();
                        break;
                    }
                }
                break;
            case R.id.controlUnitAdaptationFragment_next /* 2131362209 */:
                if (!W7.c.e()) {
                    if (Integer.parseInt(V().getText().toString()) >= 99) {
                        ControlUnit controlUnit = this.f31668B;
                        i.b(controlUnit);
                        if (controlUnit.f29327i == ApplicationProtocol.f29262b || Integer.parseInt(V().getText().toString()) >= 255) {
                        }
                    }
                    this.f31667A = Integer.parseInt(V().getText().toString()) + 1;
                    c0();
                }
                break;
            case R.id.controlUnitAdaptationFragment_prev /* 2131362210 */:
                if (!W7.c.e() && Integer.parseInt(V().getText().toString()) >= 1) {
                    this.f31667A = Integer.parseInt(V().getText().toString()) - 1;
                    c0();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        i.e(view, "view");
        return false;
    }
}
