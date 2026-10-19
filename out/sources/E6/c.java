package E6;

import A1.F;
import A6.f0;
import C4.w;
import C4.x;
import android.content.Context;
import android.content.IntentFilter;
import android.database.SQLException;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import androidx.media3.exoplayer.source.k;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;
import com.facebook.login.t;
import com.google.android.datatransport.Priority;
import j1.o.c;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.i;
import p114j1.o;
import p311z4.g;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3097d;

    public /* synthetic */ c(Object obj, int i10, Object obj2) {
        this.f3095b = i10;
        this.f3096c = obj;
        this.f3097d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3095b) {
            case 0:
                d dVar = (d) this.f3096c;
                dVar.getClass();
                try {
                    g<f0> gVar = dVar.f3105h;
                    Priority priority = Priority.f25233d;
                    if (gVar instanceof w) {
                        x.a().f2410d.a(((w) gVar).f2401a.d(priority), 1);
                    } else if (Log.isLoggable("TRuntime.".concat("ForcedSender"), 5)) {
                        String.format("Expected instance of `TransportImpl`, got `%s`.", gVar);
                    }
                    break;
                } catch (SQLException unused) {
                }
                ((CountDownLatch) this.f3097d).countDown();
                break;
            case 1:
                DefaultInAppMessageViewWrapper.ViewOnLayoutChangeListenerC16892.onLayoutChange$lambda$0((DefaultInAppMessageViewWrapper) this.f3096c, (ViewGroup) this.f3097d);
                break;
            case 2:
                t this$0 = (t) this.f3096c;
                i.e(this$0, "this$0");
                Bundle bundle = (Bundle) this.f3097d;
                i.e(bundle, "$bundle");
                this$0.f25176b.a(bundle, "fb_mobile_login_heartbeat");
                break;
            case 3:
                o oVar = (o) this.f3096c;
                oVar.getClass();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                ((Context) this.f3097d).registerReceiver(oVar.new c(), intentFilter);
                break;
            case 4:
                androidx.media3.ui.d.a((androidx.media3.ui.d) this.f3096c, (Bitmap) this.f3097d);
                break;
            default:
                ((k) this.f3096c).C((F) this.f3097d);
                break;
        }
    }
}
