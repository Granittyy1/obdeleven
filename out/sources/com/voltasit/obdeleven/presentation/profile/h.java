package com.voltasit.obdeleven.presentation.profile;

import android.os.Bundle;
import android.view.View;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.ui.dialogs.C2174v;
import com.voltasit.obdeleven.ui.dialogs.Y;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32913c;

    public /* synthetic */ h(int i10, Object obj) {
        this.f32912b = i10;
        this.f32913c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f32912b) {
            case 0:
                androidx.appcompat.app.e dialog = (androidx.appcompat.app.e) this.f32913c;
                kotlin.jvm.internal.i.e(dialog, "$dialog");
                dialog.dismiss();
                break;
            case 1:
                C2174v c2174v = (C2174v) this.f32913c;
                c2174v.w(c2174v.f34048y.isEmpty() ? "InputDialog" : c2174v.f34048y, DialogCallback.CallbackType.f31101b, new Bundle());
                break;
            case 2:
                Y y10 = (Y) this.f32913c;
                y10.getClass();
                y10.w("OBDIILiveDataChartDialog", DialogCallback.CallbackType.f31101b, new Bundle());
                break;
            default:
                k9.e.a aVar = (k9.e.a) this.f32913c;
                int adapterPosition = aVar.getAdapterPosition();
                if (adapterPosition >= 0) {
                    p135k9.e eVar = aVar.f42908c;
                    eVar.f42901f.remove(eVar.f42900e.remove(adapterPosition));
                    eVar.notifyItemRemoved(adapterPosition);
                    if (eVar.f42901f.size() == 1) {
                        eVar.notifyDataSetChanged();
                    }
                }
                break;
        }
    }
}
