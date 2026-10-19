package La;

import java.util.Random;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: PlatformRandom.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends La.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f4476d = new a();

    /* JADX INFO: compiled from: PlatformRandom.kt */
    public static final class a extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        public final Random initialValue() {
            return new Random();
        }
    }

    @Override // La.a
    public final Random h() {
        Random random = this.f4476d.get();
        i.d(random, "get(...)");
        return random;
    }
}
