package coil;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import coil.util.k;
import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22710c;

    public /* synthetic */ c(int i10, Object obj) {
        this.f22709b = i10;
        this.f22710c = obj;
    }

    @Override // Ia.a
    public final Object invoke() {
        int i10;
        int largeMemoryClass;
        Object obj = this.f22710c;
        switch (this.f22709b) {
            case 0:
                Context context = ((f.a) obj).f22959a;
                Bitmap.Config[] configArr = k.f23160a;
                double d10 = 0.2d;
                try {
                    Object objB = p0.a.b.b(context, ActivityManager.class);
                    i.b(objB);
                    if (((ActivityManager) objB).isLowRamDevice()) {
                        d10 = 0.15d;
                    }
                } catch (Exception unused) {
                }
                X2.f fVar = new X2.f();
                if (d10 > 0.0d) {
                    Bitmap.Config[] configArr2 = k.f23160a;
                    try {
                        Object objB2 = p0.a.b.b(context, ActivityManager.class);
                        i.b(objB2);
                        ActivityManager activityManager = (ActivityManager) objB2;
                        largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                    } catch (Exception unused2) {
                        largeMemoryClass = 256;
                    }
                    double d11 = d10 * ((double) largeMemoryClass);
                    double d12 = 1024;
                    i10 = (int) (d11 * d12 * d12);
                    break;
                } else {
                    i10 = 0;
                }
                return new X2.d(i10 > 0 ? new X2.e(i10, fVar) : new X2.a(fVar), fVar);
            default:
                return ConversationScreenKt.ConversationScreen$lambda$35((ConversationViewModel) obj);
        }
    }
}
