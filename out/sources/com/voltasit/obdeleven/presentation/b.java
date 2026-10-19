package com.voltasit.obdeleven.presentation;

import Ia.l;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.ActivityC1347l;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import com.voltasit.obdeleven.ui.dialogs.T;
import kotlin.jvm.internal.i;
import p073f9.g;
import p097h9.q;
import p097h9.r;
import p110i9.t;
import p220r9.y;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31323c;

    public /* synthetic */ b(int i10, Object obj) {
        this.f31322b = i10;
        this.f31323c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Exception {
        switch (this.f31322b) {
            case 0:
                l tmp0 = (l) this.f31323c;
                i.e(tmp0, "$tmp0");
                tmp0.invoke(view);
                break;
            case 1:
                T t8 = (T) this.f31323c;
                t8.getClass();
                Bundle bundle = new Bundle();
                Bundle bundle2 = t8.f33844t;
                if (bundle2 != null && !bundle2.isEmpty()) {
                    bundle.putBundle("key_bundle", t8.f33844t);
                }
                bundle.putInt("key_selected_item", t8.f33846v.f36830d);
                t tVar = t8.f33846v;
                bundle.putString("key_selected_item_string", String.valueOf(tVar.f36779a.get(tVar.f36830d)));
                t8.w(t8.f33843s.isEmpty() ? "ItemListSingleChoiceDialog" : t8.f33843s, DialogCallback.CallbackType.f31102c, bundle);
                t8.y();
                break;
            case 2:
                ((g) this.f31323c).P();
                break;
            default:
                r rVar = (r) this.f31323c;
                C2134a0.b(rVar.getContext(), R.string.common_loading);
                y yVar = rVar.f36232r;
                q qVar = new q(rVar);
                yVar.f46506c = "cover.jpg";
                yVar.f46507d = qVar;
                ActivityC1347l activityC1347l = yVar.f46504a;
                try {
                    yVar.f46505b.startActivityForResult(new Intent("android.intent.action.GET_CONTENT").setType("image/*"), 9162);
                } catch (ActivityNotFoundException unused) {
                    Toast.makeText(activityC1347l.getApplicationContext(), R.string.crop__pick_error, 0).show();
                }
                break;
        }
    }
}
