package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import androidx.compose.runtime.AbstractC1094k;
import com.voltasit.obdeleven.R;
import java.util.LinkedHashMap;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.C2688e;

/* JADX INFO: compiled from: WindowRecomposer.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f15061a = new LinkedHashMap();

    public static final kotlinx.coroutines.flow.A a(Context context) {
        kotlinx.coroutines.flow.A a10;
        LinkedHashMap linkedHashMap = f15061a;
        synchronized (linkedHashMap) {
            try {
                Object objQ = linkedHashMap.get(context);
                if (objQ == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    BufferedChannel bufferedChannelA = kotlinx.coroutines.channels.g.a(-1, 6, null);
                    objQ = C2688e.q(new kotlinx.coroutines.flow.t(new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(contentResolver, uriFor, new k1(bufferedChannelA, p271w0.f.a(Looper.getMainLooper())), bufferedChannelA, context, null)), kotlinx.coroutines.B.b(), kotlinx.coroutines.flow.z.a.a(3, 0L), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, objQ);
                }
                a10 = (kotlinx.coroutines.flow.A) objQ;
            } catch (Throwable th) {
                throw th;
            }
        }
        return a10;
    }

    public static final AbstractC1094k b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof AbstractC1094k) {
            return (AbstractC1094k) tag;
        }
        return null;
    }
}
