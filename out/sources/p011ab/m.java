package p011ab;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: SerialKinds.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class m {

    /* JADX INFO: compiled from: SerialKinds.kt */
    public static final class a extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f8122a = new a();
    }

    /* JADX INFO: compiled from: SerialKinds.kt */
    public static final class b extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f8123a = new b();
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        String strA = l.a(getClass()).a();
        i.b(strA);
        return strA;
    }
}
