package coil;

import android.content.Context;
import coil.util.j;
import coil.util.s;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: ImageLoader.kt */
/* JADX INFO: loaded from: classes.dex */
public interface f {

    /* JADX INFO: compiled from: ImageLoader.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f22959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public coil.request.b f22960b = j.f23159a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public coil.a f22961c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final s f22962d = new s();

        public a(Context context) {
            this.f22959a = context.getApplicationContext();
        }
    }

    coil.request.b a();

    coil.request.d b(coil.request.g gVar);

    Object c(coil.request.g gVar, SuspendLambda suspendLambda);
}
