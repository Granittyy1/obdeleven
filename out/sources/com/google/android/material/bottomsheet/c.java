package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import com.google.android.material.bottomsheet.b.a;
import com.voltasit.obdeleven.R;
import p100i.n;

/* JADX INFO: compiled from: BottomSheetDialogFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class c extends n {
    @Override // p100i.n, androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        Context context = getContext();
        int i10 = this.f17601g;
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            i10 = context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
        }
        b bVar = new b(context, i10);
        bVar.f26830k = true;
        bVar.f26831l = true;
        bVar.f26836q = bVar.new a();
        bVar.d().v(1);
        bVar.f26834o = bVar.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
        return bVar;
    }
}
