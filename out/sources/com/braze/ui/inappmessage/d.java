package com.braze.ui.inappmessage;

import android.os.Bundle;
import android.view.View;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.ui.dialogs.T;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24424c;

    public /* synthetic */ d(int i10, Object obj) {
        this.f24423b = i10;
        this.f24424c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f24423b) {
            case 0:
                DefaultInAppMessageViewWrapper.createClickListener$lambda$1((DefaultInAppMessageViewWrapper) this.f24424c, view);
                break;
            default:
                T t8 = (T) this.f24424c;
                if (t8.f33845u.containsKey("key_neutral_text")) {
                    Bundle bundle = new Bundle();
                    Bundle bundle2 = t8.f33844t;
                    if (bundle2 != null && !bundle2.isEmpty()) {
                        bundle.putBundle("key_bundle", t8.f33844t);
                    }
                    bundle.putInt("key_selected_item", t8.f33846v.f36830d);
                    t8.w(t8.f33843s.isEmpty() ? "ItemListSingleChoiceDialog" : t8.f33843s, DialogCallback.CallbackType.f31103d, bundle);
                }
                break;
        }
    }
}
