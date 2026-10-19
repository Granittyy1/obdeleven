package androidx.activity;

import android.os.Bundle;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.dialogs.backup.MultiBackupDialog;
import com.voltasit.obdeleven.presentation.vehicle.VehicleBaseFragment;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8248c;

    public /* synthetic */ p(int i10, Object obj) {
        this.f8247b = i10;
        this.f8248c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xa.g] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8247b) {
            case 0:
                q.a((q) this.f8248c);
                break;
            case 1:
                ((Lambda) this.f8248c).invoke();
                break;
            case 2:
                VehicleBaseFragment this$0 = (VehicleBaseFragment) this.f8248c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                J8.a analyticsRepository = (J8.a) this$0.f33373q.getValue();
                kotlin.jvm.internal.i.e(analyticsRepository, "analyticsRepository");
                Bundle bundle = new Bundle();
                bundle.putInt("key_title", R.string.common_full_backup);
                MultiBackupDialog multiBackupDialog = new MultiBackupDialog(analyticsRepository);
                multiBackupDialog.setArguments(bundle);
                multiBackupDialog.f32261r = this$0.getFragmentManager();
                multiBackupDialog.setTargetFragment(this$0, 0);
                multiBackupDialog.f32171A = null;
                multiBackupDialog.f32174D = null;
                this$0.f33371o = multiBackupDialog;
                multiBackupDialog.A();
                break;
            default:
                ((androidx.media3.exoplayer.source.k) this.f8248c).y();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ p(Ia.a aVar) {
        this.f8247b = 1;
        this.f8248c = (Lambda) aVar;
    }
}
