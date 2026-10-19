package androidx.fragment.app;

import android.webkit.WebView;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.utils.bluetooth.BluetoothConnectionHelper;
import java.util.ArrayList;
import p033c7.C1508v;

/* JADX INFO: renamed from: androidx.fragment.app.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1341f implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17595c;

    public /* synthetic */ RunnableC1341f(int i10, Object obj) {
        this.f17594b = i10;
        this.f17595c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17594b) {
            case 0:
                J.c(4, (ArrayList) this.f17595c);
                break;
            case 1:
                p030c4.c this$0 = (p030c4.c) this.f17595c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                this$0.a();
                break;
            case 2:
                C1508v c1508v = (C1508v) this.f17595c;
                boolean z10 = c1508v.f22509c;
                c1508v.f22509c = !(z10 && c1508v.f22510d) && z10;
                break;
            case 3:
                InAppMessageHtmlBaseView.setupDirectionalNavigation$lambda$1((WebView) this.f17595c);
                break;
            case 4:
                p220r9.P.b(((BluetoothConnectionHelper) this.f17595c).f34294a, R.string.common_unable_connect_server_error);
                break;
            default:
                ((n4.i.a) this.f17595c).a();
                break;
        }
    }
}
