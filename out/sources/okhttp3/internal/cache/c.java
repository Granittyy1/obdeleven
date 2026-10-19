package okhttp3.internal.cache;

import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import kotlin.jvm.internal.i;
import okhttp3.u;
import okhttp3.z;

/* JADX INFO: compiled from: CacheStrategy.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f45437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f45438b;

    /* JADX INFO: compiled from: CacheStrategy.kt */
    public static final class a {
        /* JADX WARN: Code duplicated, block: B:24:0x0034  */
        public static boolean a(u request, z zVar) {
            i.e(request, "request");
            int i10 = zVar.f45683e;
            if (i10 != 200 && i10 != 410 && i10 != 414 && i10 != 501 && i10 != 203 && i10 != 204) {
                if (i10 == 307) {
                    if (z.c("Expires", zVar) == null && zVar.b().f45339c == -1 && !zVar.b().f45342f && !zVar.b().f45341e) {
                        return false;
                    }
                } else if (i10 != 308 && i10 != 404 && i10 != 405) {
                    switch (i10) {
                        case CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS /* 300 */:
                        case 301:
                            break;
                        case 302:
                            if (z.c("Expires", zVar) == null) {
                                return false;
                            }
                            break;
                        default:
                            return false;
                    }
                }
            }
            return (zVar.b().f45338b || request.a().f45338b) ? false : true;
        }
    }

    public c(u uVar, z zVar) {
        this.f45437a = uVar;
        this.f45438b = zVar;
    }
}
