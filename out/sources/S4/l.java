package S4;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import com.braze.Constants;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends e5.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GoogleApiAvailability f5550b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(GoogleApiAvailability googleApiAvailability, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f5550b = googleApiAvailability;
        this.f5549a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        int i10 = com.google.android.gms.common.a.f25298a;
        GoogleApiAvailability googleApiAvailability = this.f5550b;
        Context context = this.f5549a;
        int iB = googleApiAvailability.b(context, i10);
        AtomicBoolean atomicBoolean = C0764f.f5539a;
        if (iB == 1 || iB == 2 || iB == 3 || iB == 9) {
            Intent intentA = googleApiAvailability.a(context, Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, iB);
            googleApiAvailability.f(context, iB, intentA == null ? null : PendingIntent.getActivity(context, 0, intentA, 201326592));
        }
    }
}
