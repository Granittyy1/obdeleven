package androidx.appcompat.widget;

import com.google.firebase.messaging.FirebaseMessaging;
import com.voltasit.obdeleven.presentation.main.MainFragment;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8936c;

    public /* synthetic */ d0(int i10, Object obj) {
        this.f8935b = i10;
        this.f8936c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8935b) {
            case 0:
                ((Toolbar) this.f8936c).collapseActionView();
                break;
            case 1:
                ((FirebaseMessaging) this.f8936c).lambda$new$4();
                break;
            default:
                MainFragment this$0 = (MainFragment) this.f8936c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                this$0.S(true);
                break;
        }
    }
}
