package com.braze.ui.widget;

import android.app.NotificationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import com.braze.models.cards.TextAnnouncementCard;
import com.google.android.material.textfield.TextInputLayout;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.C;
import com.voltasit.obdeleven.ui.dialogs.C2133a;
import java.util.List;
import kotlin.jvm.internal.i;
import p109i8.e;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24456d;

    public /* synthetic */ c(Object obj, int i10, Object obj2) {
        this.f24454b = i10;
        this.f24455c = obj;
        this.f24456d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f24456d;
        Object obj2 = this.f24455c;
        switch (this.f24454b) {
            case 0:
                ((TextAnnouncementCardView) obj2).lambda$onSetCard$0((TextAnnouncementCard) obj, view);
                break;
            case 1:
                com.voltasit.obdeleven.presentation.main.c this$0 = (com.voltasit.obdeleven.presentation.main.c) obj2;
                i.e(this$0, "this$0");
                e controlUnit = (e) obj;
                i.e(controlUnit, "$controlUnit");
                this$0.f32625b.invoke(controlUnit);
                break;
            case 2:
                C2133a c2133a = (C2133a) obj2;
                c2133a.getClass();
                Bundle bundle = new Bundle();
                if (c2133a.f33881s.getText().toString().length() >= 17) {
                    bundle.putString("vehicle_vin", c2133a.f33881s.getText().toString());
                    c2133a.w("AddVehicleDialog", DialogCallback.CallbackType.f31102c, bundle);
                    c2133a.y();
                } else {
                    ((TextInputLayout) obj).setError(c2133a.f33881s.getText().toString().length() + "/17");
                }
                break;
            default:
                C c10 = (C) obj2;
                MainActivity mainActivityZ = c10.z();
                List<String> list = com.voltasit.obdeleven.a.f29638c;
                com.voltasit.obdeleven.a.C0320a.a(mainActivityZ).j("showDeviceAlert", !((CheckBox) obj).isChecked());
                ((NotificationManager) c10.z().getSystemService("notification")).cancel(1);
                if (c10.f33767t) {
                    c10.z().finish();
                }
                c10.y();
                break;
        }
    }
}
