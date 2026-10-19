package com.voltasit.obdeleven.presentation.vehicleInfo;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.OBDIICu;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.dialogs.backup.MultiBackupDialog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Lambda;
import p220r9.E;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f33509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f33510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f33511e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ h(ImageView imageView, String str, Ia.a aVar) {
        this.f33508b = 0;
        this.f33509c = imageView;
        this.f33510d = str;
        this.f33511e = (Lambda) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, xa.g] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33508b) {
            case 0:
                ImageView carImage = (ImageView) this.f33509c;
                kotlin.jvm.internal.i.e(carImage, "$carImage");
                ?? r10 = (Lambda) this.f33511e;
                com.bumptech.glide.d<Drawable> dVarM = com.bumptech.glide.b.d(carImage).m((String) this.f33510d);
                dVarM.y(new com.voltasit.obdeleven.presentation.notification.a((Ia.a) r10));
                dVarM.x(carImage);
                break;
            case 1:
                OBDIICu oBDIICu = (OBDIICu) this.f33509c;
                i8.i.a aVar = (i8.i.a) this.f33510d;
                ArrayList arrayList = (ArrayList) this.f33511e;
                if (oBDIICu.f29388G) {
                    aVar.l(arrayList);
                }
                break;
            default:
                E e10 = (E) this.f33509c;
                if (e10.f46410n != 0) {
                    int i10 = e10.f46411o + 1;
                    e10.f46411o = i10;
                    com.voltasit.obdeleven.presentation.dialogs.backup.e eVar = (com.voltasit.obdeleven.presentation.dialogs.backup.e) this.f33510d;
                    ControlUnit controlUnit = (ControlUnit) this.f33511e;
                    kotlin.jvm.internal.i.e(controlUnit, "controlUnit");
                    MultiBackupDialog multiBackupDialog = eVar.f32186a;
                    ((com.voltasit.obdeleven.presentation.dialogs.backup.h) multiBackupDialog.f32175E.getValue()).f32190o.g("FULL_BACKUP", "cu_backup_count");
                    if (multiBackupDialog.isAdded()) {
                        multiBackupDialog.f33984s.f2114E.setProgress(i10);
                        multiBackupDialog.f33984s.f2116G.setText(multiBackupDialog.getString(R.string.common_control_units));
                        multiBackupDialog.f33984s.f2115F.setText(String.format("%s %s", Arrays.copyOf(new Object[]{controlUnit.t(), controlUnit.getName()}, 2)));
                        TextView textView = multiBackupDialog.f33984s.f2127w;
                        Locale locale = Locale.US;
                        Integer numValueOf = Integer.valueOf(i10);
                        List<? extends ControlUnit> list = multiBackupDialog.f32177z;
                        kotlin.jvm.internal.i.b(list);
                        textView.setText(String.format(locale, "%d/%d", Arrays.copyOf(new Object[]{numValueOf, Integer.valueOf(list.size())}, 2)));
                    }
                    e10.f34213d = 0.0d;
                    eVar.a(0.0d);
                }
                break;
        }
    }

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i10) {
        this.f33508b = i10;
        this.f33509c = obj;
        this.f33510d = obj2;
        this.f33511e = obj3;
    }
}
