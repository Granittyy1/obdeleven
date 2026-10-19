package I4;

import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3888c;

    public /* synthetic */ q(int i10, Object obj) {
        this.f3887b = i10;
        this.f3888c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3887b) {
            case 0:
                s sVar = (s) this.f3888c;
                sVar.getClass();
                sVar.f3893d.b(new r(sVar));
                break;
            case 1:
                X8.s sVar2 = (X8.s) this.f3888c;
                sVar2.w();
                new com.voltasit.obdeleven.presentation.dialogs.f().J(sVar2);
                break;
            case 2:
                ((FirebaseMessaging) this.f3888c).lambda$new$2();
                break;
            default:
                ((CarouselLayoutManager) this.f3888c).a1();
                break;
        }
    }
}
