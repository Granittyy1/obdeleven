package p045d6;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import p191p5.h;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends ResultReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f34571b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Handler handler, h hVar) {
        super(handler);
        this.f34571b = hVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        this.f34571b.d(null);
    }
}
