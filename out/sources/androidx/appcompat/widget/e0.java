package androidx.appcompat.widget;

import androidx.work.CoroutineWorker;
import io.intercom.android.sdk.blocks.views.VideoPreviewView;
import java.util.Iterator;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8944c;

    public /* synthetic */ e0(int i10, Object obj) {
        this.f8943b = i10;
        this.f8944c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8943b) {
            case 0:
                ((Toolbar) this.f8944c).invalidateMenu();
                break;
            case 1:
                Iterator<androidx.fragment.app.y.p> it = ((androidx.fragment.app.y) this.f8944c).f17687o.iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                }
                break;
            case 2:
                CoroutineWorker._init_$lambda$0((CoroutineWorker) this.f8944c);
                break;
            case 3:
                com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.q qVar = (com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.q) this.f8944c;
                if (!qVar.y()) {
                    qVar.f31839J.setRefreshing(false);
                    qVar.U(true);
                    break;
                }
                break;
            default:
                ((VideoPreviewView) this.f8944c).lambda$showFailedImage$0();
                break;
        }
    }
}
