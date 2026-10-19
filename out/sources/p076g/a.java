package p076g;

import android.content.Context;
import android.content.Intent;
import java.io.Serializable;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ActivityResultContract.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class a<I, O> {

    /* JADX INFO: renamed from: g.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActivityResultContract.kt */
    public static final class C0368a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Serializable f35080a;

        public C0368a(Serializable serializable) {
            this.f35080a = serializable;
        }
    }

    public abstract Intent createIntent(Context context, I i10);

    public C0368a<O> getSynchronousResult(Context context, I i10) {
        i.e(context, "context");
        return null;
    }

    public abstract O parseResult(int i10, Intent intent);
}
