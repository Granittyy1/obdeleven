package androidx.compose.ui.contentcapture;

import android.util.LongSparseArray;
import android.view.ViewGroup;
import androidx.fragment.app.y;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import io.intercom.android.sdk.overlay.OverlayPresenter;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13330d;

    public /* synthetic */ i(Object obj, int i10, Object obj2) {
        this.f13328b = i10;
        this.f13329c = obj;
        this.f13330d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f13330d;
        Object obj2 = this.f13329c;
        switch (this.f13328b) {
            case 0:
                AndroidContentCaptureManager.a.a((AndroidContentCaptureManager) obj2, (LongSparseArray) obj);
                break;
            case 1:
                OnlineControlUnitListFragment this$0 = (OnlineControlUnitListFragment) obj2;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                Map<Short, com.obdeleven.service.model.f> gateways = (Map) obj;
                kotlin.jvm.internal.i.e(gateways, "$gateways");
                com.voltasit.obdeleven.presentation.controlunitlist.online.b bVar = new com.voltasit.obdeleven.presentation.controlunitlist.online.b(this$0.V());
                p158m9.b bVar2 = new p158m9.b();
                bVar2.f44651w = gateways;
                bVar2.f44652x = bVar;
                bVar2.f44648t = this$0.getFragmentManager();
                bVar2.setTargetFragment(this$0, 0);
                if (!(bVar2.getTargetFragment() instanceof BaseFragment) || !((BaseFragment) bVar2.getTargetFragment()).f34089i) {
                    y yVar = bVar2.f44648t;
                    if (yVar != null) {
                        bVar2.v(yVar, "GatewayListCodingDialog");
                        break;
                    }
                } else {
                    p279w9.b bVar3 = Application.f29634b;
                    P8.c.a(5, "GatewayListCodingDialog", "Target fragment's onSaveInstanceState() called. Ignoring show operation", Arrays.copyOf(new Object[0], 0));
                    break;
                }
                break;
            case 2:
                ((OverlayPresenter) obj2).lambda$onStateChange$4((ViewGroup) obj);
                break;
            default:
                p314z7.f fVar = (p314z7.f) obj2;
                fVar.getClass();
                p314z7.b bVar4 = (p314z7.b) obj;
                fVar.d(bVar4.f48907a, bVar4.f48908b);
                break;
        }
    }
}
