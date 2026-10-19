package p090h1;

import O8.a;
import android.content.Context;
import android.media.AudioManager;
import androidx.media3.exoplayer.K;
import coil.util.t;
import com.voltasit.obdeleven.utils.AbstractControlUnitBackupUtil;
import p114j1.A;
import p175o1.j;
import p175o1.k;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f35729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f35730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f35731d;

    public /* synthetic */ c(Object obj, int i10, Object obj2) {
        this.f35729b = i10;
        this.f35730c = obj;
        this.f35731d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f35731d;
        Object obj2 = this.f35730c;
        switch (this.f35729b) {
            case 0:
                d.f35732a = (AudioManager) ((Context) obj2).getSystemService("audio");
                ((t) obj).d();
                break;
            case 1:
                j jVar = (j) obj2;
                jVar.getClass();
                int i10 = A.f40996a;
                K.this.f18039s.r((k) obj);
                break;
            default:
                AbstractControlUnitBackupUtil abstractControlUnitBackupUtil = (AbstractControlUnitBackupUtil) obj2;
                if (abstractControlUnitBackupUtil.f34212c != 0.0d) {
                    double d10 = abstractControlUnitBackupUtil.f34213d + abstractControlUnitBackupUtil.f34214e;
                    abstractControlUnitBackupUtil.f34213d = d10;
                    ((a) obj).a(d10);
                }
                break;
        }
    }
}
