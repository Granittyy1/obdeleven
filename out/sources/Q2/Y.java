package Q2;

import android.net.Uri;
import android.os.Build;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: WorkTypeConverters.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Y {
    public static final LinkedHashSet a(byte[] bytes) throws IOException {
        kotlin.jvm.internal.i.e(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i10 = objectInputStream.readInt();
                    for (int i11 = 0; i11 < i10; i11++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z10 = objectInputStream.readBoolean();
                        kotlin.jvm.internal.i.d(uri, "uri");
                        linkedHashSet.add(new androidx.work.c.a(z10, uri));
                    }
                    p293xa.r rVar = p293xa.r.f47939a;
                    p241t7.b.n(objectInputStream, null);
                    p293xa.r rVar2 = p293xa.r.f47939a;
                    p241t7.b.n(byteArrayInputStream, null);
                    return linkedHashSet;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        p241t7.b.n(objectInputStream, th);
                        throw th2;
                    }
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                p241t7.b.n(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    public static final BackoffPolicy b(int i10) {
        if (i10 == 0) {
            return BackoffPolicy.f20287b;
        }
        if (i10 == 1) {
            return BackoffPolicy.f20288c;
        }
        throw new IllegalArgumentException(J4.i.c(i10, "Could not convert ", " to BackoffPolicy"));
    }

    public static final NetworkType c(int i10) {
        if (i10 == 0) {
            return NetworkType.f20296b;
        }
        if (i10 == 1) {
            return NetworkType.f20297c;
        }
        if (i10 == 2) {
            return NetworkType.f20298d;
        }
        if (i10 == 3) {
            return NetworkType.f20299e;
        }
        if (i10 == 4) {
            return NetworkType.f20300f;
        }
        if (Build.VERSION.SDK_INT < 30 || i10 != 5) {
            throw new IllegalArgumentException(J4.i.c(i10, "Could not convert ", " to NetworkType"));
        }
        return NetworkType.f20301g;
    }

    public static final OutOfQuotaPolicy d(int i10) {
        if (i10 == 0) {
            return OutOfQuotaPolicy.f20303b;
        }
        if (i10 == 1) {
            return OutOfQuotaPolicy.f20304c;
        }
        throw new IllegalArgumentException(J4.i.c(i10, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static final WorkInfo$State e(int i10) {
        if (i10 == 0) {
            return WorkInfo$State.f20306b;
        }
        if (i10 == 1) {
            return WorkInfo$State.f20307c;
        }
        if (i10 == 2) {
            return WorkInfo$State.f20308d;
        }
        if (i10 == 3) {
            return WorkInfo$State.f20309e;
        }
        if (i10 == 4) {
            return WorkInfo$State.f20310f;
        }
        if (i10 == 5) {
            return WorkInfo$State.f20311g;
        }
        throw new IllegalArgumentException(J4.i.c(i10, "Could not convert ", " to State"));
    }

    public static final int f(WorkInfo$State state) {
        kotlin.jvm.internal.i.e(state, "state");
        int iOrdinal = state.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal == 2) {
            return 2;
        }
        if (iOrdinal == 3) {
            return 3;
        }
        if (iOrdinal == 4) {
            return 4;
        }
        if (iOrdinal == 5) {
            return 5;
        }
        throw new NoWhenBranchMatchedException();
    }
}
