package com.voltasit.obdeleven.ui.dialogs;

import android.os.Bundle;
import android.view.View;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;

/* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC2163p implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f34000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f34001c;

    public /* synthetic */ ViewOnClickListenerC2163p(int i10, Object obj) {
        this.f34000b = i10;
        this.f34001c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f34000b) {
            case 0:
                r rVar = (r) this.f34001c;
                String string = rVar.f34015t.f2168r.getEditText().getText().toString();
                String string2 = rVar.f34015t.f2169s.getEditText().getText().toString();
                rVar.f34015t.f2168r.setError("");
                rVar.f34015t.f2169s.setError("");
                if (string.length() != 6) {
                    rVar.f34015t.f2168r.setError(rVar.getString(R.string.device_pin_length));
                } else if (!string.equals(string2)) {
                    rVar.f34015t.f2169s.setError(rVar.getString(R.string.device_pin_not_match));
                } else {
                    rVar.w("ChangeDevicePasswordDialog", DialogCallback.CallbackType.f31102c, C4.v.d("key_new_pass", string));
                }
                break;
            case 1:
                T t8 = (T) this.f34001c;
                if (t8.f33845u.containsKey("key_negative_text")) {
                    Bundle bundle = new Bundle();
                    Bundle bundle2 = t8.f33844t;
                    if (bundle2 != null && !bundle2.isEmpty()) {
                        bundle.putBundle("key_bundle", t8.f33844t);
                    }
                    bundle.putInt("key_selected_item", t8.f33846v.f36830d);
                    t8.w(t8.f33843s.isEmpty() ? "ItemListSingleChoiceDialog" : t8.f33843s, DialogCallback.CallbackType.f31101b, bundle);
                    t8.y();
                    break;
                }
                break;
            case 2:
                ((C2183z0) this.f34001c).y();
                break;
            default:
                p128k2.j jVar = (p128k2.j) this.f34001c;
                jVar.g();
                if (view.getId() == R.id.exo_overflow_show) {
                    jVar.f41513q.start();
                } else if (view.getId() == R.id.exo_overflow_hide) {
                    jVar.f41514r.start();
                }
                break;
        }
    }
}
