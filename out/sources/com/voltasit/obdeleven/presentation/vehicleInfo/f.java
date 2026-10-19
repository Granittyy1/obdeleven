package com.voltasit.obdeleven.presentation.vehicleInfo;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;
import androidx.fragment.app.ActivityC1347l;
import com.parse.ParseFile;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import java.io.File;
import kotlin.jvm.internal.Lambda;
import p220r9.y;
import p255u9.E;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements PopupMenu.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f33499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f33500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImageView f33501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MainActivity f33502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Lambda f33503e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ f(y yVar, E e10, ImageView imageView, MainActivity mainActivity, Ia.a aVar) {
        this.f33499a = yVar;
        this.f33500b = e10;
        this.f33501c = imageView;
        this.f33502d = mainActivity;
        this.f33503e = (Lambda) aVar;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem item) throws Exception {
        y imageCropHelper = this.f33499a;
        final E vehicleDb = this.f33500b;
        final ImageView carImage = this.f33501c;
        final MainActivity mainActivity = this.f33502d;
        final ?? r10 = this.f33503e;
        kotlin.jvm.internal.i.e(imageCropHelper, "$imageCropHelper");
        kotlin.jvm.internal.i.e(vehicleDb, "$vehicleDb");
        kotlin.jvm.internal.i.e(carImage, "$carImage");
        kotlin.jvm.internal.i.e(item, "item");
        int itemId = item.getItemId();
        if (itemId == R.id.change) {
            y.b bVar = new y.b(carImage, vehicleDb, mainActivity, r10) { // from class: com.voltasit.obdeleven.presentation.vehicleInfo.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ ImageView f33504a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ E f33505b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ MainActivity f33506c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ Lambda f33507d;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.f33507d = (Lambda) r10;
                }

                /* JADX WARN: Type inference failed for: r6v0, types: [Ia.a, kotlin.jvm.internal.Lambda] */
                @Override // r9.y.a
                public final void b(File file) {
                    ImageView carImage2 = this.f33504a;
                    kotlin.jvm.internal.i.e(carImage2, "$carImage");
                    E vehicleDb2 = this.f33505b;
                    kotlin.jvm.internal.i.e(vehicleDb2, "$vehicleDb");
                    MainActivity mainActivity2 = this.f33506c;
                    ?? r11 = this.f33507d;
                    C2134a0.b(carImage2.getContext(), R.string.common_loading);
                    Task.callInBackground(new l(new ParseFile(file), vehicleDb2, E.a(), mainActivity2, carImage2, r11));
                }
            };
            imageCropHelper.f46506c = "vehicle.jpg";
            imageCropHelper.f46507d = bVar;
            ActivityC1347l activityC1347l = imageCropHelper.f46504a;
            try {
                imageCropHelper.f46505b.startActivityForResult(new Intent("android.intent.action.GET_CONTENT").setType("image/*"), 9162);
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(activityC1347l.getApplicationContext(), R.string.crop__pick_error, 0).show();
            }
        } else {
            if (itemId != R.id.restore) {
                return false;
            }
            C2134a0.b(imageCropHelper.f46505b.getContext(), R.string.common_loading);
            p279w9.b bVar2 = Application.f29634b;
            synchronized (bVar2) {
                bVar2.f47824a.remove("VEHICLE_LIST");
            }
            Task.callInBackground(new i(vehicleDb, E.a(), mainActivity, carImage, r10));
        }
        Application.f29634b.d();
        return true;
    }
}
