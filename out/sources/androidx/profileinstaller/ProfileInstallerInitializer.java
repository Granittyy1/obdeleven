package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.media3.exoplayer.RunnableC1384b;
import com.braze.Constants;
import com.braze.models.inappmessage.InAppMessageBase;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements p309z2.b<a> {

    public static class a {
    }

    @Override // p309z2.b
    public final List<Class<? extends p309z2.b<?>>> a() {
        return Collections.emptyList();
    }

    @Override // p309z2.b
    public final a b(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: q2.d
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                this.f46019b.getClass();
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC1384b(3, applicationContext), new Random().nextInt(Math.max(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, 1)) + InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS);
            }
        });
        return new a();
    }
}
