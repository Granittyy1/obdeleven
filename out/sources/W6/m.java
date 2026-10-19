package W6;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.GlideException;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks;
import java.util.Objects;
import p033c7.C1506t;

/* JADX INFO: compiled from: GlideErrorListener.java */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements T3.c<Drawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p083g7.h f7024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FirebaseInAppMessagingDisplayCallbacks f7025b;

    public m(p083g7.h hVar, FirebaseInAppMessagingDisplayCallbacks firebaseInAppMessagingDisplayCallbacks) {
        this.f7024a = hVar;
        this.f7025b = firebaseInAppMessagingDisplayCallbacks;
    }

    @Override // T3.c
    public final void b(Object obj) {
        ((Drawable) obj).toString();
        H3.c.j();
    }

    @Override // T3.c
    public final void c(GlideException glideException) {
        FirebaseInAppMessagingDisplayCallbacks firebaseInAppMessagingDisplayCallbacks;
        glideException.getMessage();
        Objects.toString(glideException.getCause());
        H3.c.j();
        if (this.f7024a == null || (firebaseInAppMessagingDisplayCallbacks = this.f7025b) == null) {
            return;
        }
        if (glideException.getLocalizedMessage().contains("Failed to decode")) {
            ((C1506t) firebaseInAppMessagingDisplayCallbacks).a(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason.f28161e);
        } else {
            ((C1506t) firebaseInAppMessagingDisplayCallbacks).a(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason.f28158b);
        }
    }
}
