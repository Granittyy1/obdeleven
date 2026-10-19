package X5;

import B8.K0;
import android.app.Activity;
import android.view.View;
import androidx.media3.exoplayer.C1385c;
import com.google.android.gms.internal.measurement.M1;
import com.google.android.material.textfield.TextInputLayout;
import com.voltasit.obdeleven.presentation.garage.GarageFragment;
import io.intercom.android.sdk.NexusWrapper;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7233c;

    public /* synthetic */ C(int i10, Object obj) {
        this.f7232b = i10;
        this.f7233c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f7233c;
        switch (this.f7232b) {
            case 0:
                ((TextInputLayout) obj).f27576e.requestLayout();
                return;
            case 1:
                C1385c c1385c = (C1385c) obj;
                c1385c.f18319a.unregisterReceiver(c1385c.f18320b);
                return;
            case 2:
                GarageFragment this$0 = (GarageFragment) obj;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                if (this$0.isAdded()) {
                    K0 k10 = this$0.f32306s;
                    if (k10 != null) {
                        k10.f1738u.m0(0);
                        return;
                    } else {
                        kotlin.jvm.internal.i.m("binding");
                        throw null;
                    }
                }
                return;
            case 3:
                NexusWrapper.disconnect$lambda$1((NexusWrapper) obj);
                return;
            case 4:
                p143l4.d this$1 = (p143l4.d) obj;
                kotlin.jvm.internal.i.e(this$1, "this$0");
                WeakReference<Activity> weakReference = this$1.f44364b;
                try {
                    View viewH = H3.c.h(weakReference.get());
                    Activity activity = weakReference.get();
                    if (viewH != null && activity != null) {
                        for (View view : p143l4.b.a(viewH)) {
                            if (!M1.j(view)) {
                                String strD = p143l4.b.d(view);
                                if (strD.length() > 0 && strD.length() <= 300) {
                                    HashSet hashSet = p143l4.f.f44371f;
                                    String localClassName = activity.getLocalClassName();
                                    kotlin.jvm.internal.i.d(localClassName, "activity.localClassName");
                                    l4.f.a.a(view, viewH, localClassName);
                                }
                            }
                        }
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                p165n4.h.g((p165n4.h) obj);
                return;
        }
    }
}
