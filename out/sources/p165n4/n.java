package p165n4;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.facebook.login.m;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: PlatformServiceClient.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f44921a;

    public n(m mVar) {
        this.f44921a = mVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        i.e(message, "message");
        m mVar = this.f44921a;
        mVar.getClass();
        if (message.what == mVar.f25157h) {
            Bundle data = message.getData();
            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                mVar.a(null);
            } else {
                mVar.a(data);
            }
            try {
                mVar.f25151b.unbindService(mVar);
            } catch (IllegalArgumentException unused) {
            }
        }
    }
}
