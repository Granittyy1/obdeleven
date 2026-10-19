package p050db;

import Ya.b;
import Ya.k;

/* JADX INFO: compiled from: JsonElement.kt */
/* JADX INFO: loaded from: classes2.dex */
@k(with = C.class)
public abstract class B extends h {
    public static final a Companion = new a();

    /* JADX INFO: compiled from: JsonElement.kt */
    public static final class a {
        public final b<B> serializer() {
            return C.f34639a;
        }
    }

    public abstract String e();

    public String toString() {
        return e();
    }
}
