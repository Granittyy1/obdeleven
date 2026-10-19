package T5;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.utils.bluetooth.BluetoothConnectionHelper;
import p220r9.P;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6034c;

    public /* synthetic */ h(int i10, Object obj) {
        this.f6033b = i10;
        this.f6034c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6033b) {
            case 0:
                SideSheetBehavior.d dVar = (SideSheetBehavior.d) this.f6034c;
                dVar.f27380b = false;
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                L0.c cVar = sideSheetBehavior.j;
                if (cVar != null && cVar.g()) {
                    dVar.a(dVar.f27379a);
                } else if (sideSheetBehavior.f27361i == 2) {
                    sideSheetBehavior.x(dVar.f27379a);
                }
                break;
            case 1:
                ((Ia.a) this.f6034c).invoke();
                break;
            case 2:
                ((Fragment) this.f6034c).lambda$performCreateView$0();
                break;
            case 3:
                ((View) this.f6034c).requestFocus();
                break;
            case 4:
                P.b(((BluetoothConnectionHelper) this.f6034c).f34294a, R.string.common_device_not_authorized);
                break;
            default:
                DefaultAudioSink defaultAudioSink = (DefaultAudioSink) this.f6034c;
                if (defaultAudioSink.f18241h0 >= 300000) {
                    androidx.media3.exoplayer.audio.c.this.f18310e1 = true;
                    defaultAudioSink.f18241h0 = 0L;
                }
                break;
        }
    }
}
