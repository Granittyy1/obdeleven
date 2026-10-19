package Da;

import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: JDK7PlatformImplementations.kt */
/* JADX INFO: loaded from: classes2.dex */
public class a extends Ca.a {

    /* JADX INFO: renamed from: Da.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: JDK7PlatformImplementations.kt */
    public static final class C0029a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Integer f2928a;

        static {
            Integer num;
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                num = obj instanceof Integer ? (Integer) obj : null;
            } catch (Throwable unused) {
            }
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            f2928a = num2;
        }
    }

    @Override // Ca.a
    public final void a(Throwable cause, Throwable exception) {
        i.e(cause, "cause");
        i.e(exception, "exception");
        Integer num = C0029a.f2928a;
        if (num == null || num.intValue() >= 19) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }
}
