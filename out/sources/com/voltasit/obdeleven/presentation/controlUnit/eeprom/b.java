package com.voltasit.obdeleven.presentation.controlUnit.eeprom;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.C2171t0;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.voltasit.obdeleven.presentation.dialogs.e f31561c;

    public /* synthetic */ b(com.voltasit.obdeleven.presentation.dialogs.e eVar, int i10) {
        this.f31560b = i10;
        this.f31561c = eVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f31560b) {
            case 0:
                ((e) this.f31561c).y();
                break;
            default:
                C2171t0 c2171t0 = (C2171t0) this.f31561c;
                MainActivity mainActivityZ = c2171t0.z();
                Intent intent = new Intent();
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", mainActivityZ.getPackageName(), null));
                c2171t0.startActivity(intent);
                break;
        }
    }
}
