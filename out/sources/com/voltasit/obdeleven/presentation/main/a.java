package com.voltasit.obdeleven.presentation.main;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.google.android.material.textfield.TextInputEditText;
import com.voltasit.obdeleven.ui.dialogs.C2133a;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements DialogInterface.OnKeyListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.voltasit.obdeleven.presentation.dialogs.e f32622c;

    public /* synthetic */ a(com.voltasit.obdeleven.presentation.dialogs.e eVar, int i10) {
        this.f32621b = i10;
        this.f32622c = eVar;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        switch (this.f32621b) {
            case 0:
                b bVar = (b) this.f32622c;
                if (i10 != 4) {
                    bVar.getClass();
                } else {
                    bVar.y();
                }
                break;
            default:
                C2133a c2133a = (C2133a) this.f32622c;
                if (i10 != 4) {
                    c2133a.getClass();
                } else {
                    TextInputEditText textInputEditText = c2133a.f33881s;
                    if (textInputEditText != null) {
                        textInputEditText.setCursorVisible(false);
                    }
                    c2133a.y();
                }
                break;
        }
        return false;
    }
}
